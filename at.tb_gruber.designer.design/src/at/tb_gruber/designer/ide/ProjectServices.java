package at.tb_gruber.designer.ide;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.impl.ModelFactoryImpl;

public class ProjectServices {
	public static final String TBG_VP = "TBGDesigner";

	private URI representationsURI;
	private Session session;
	private Bahnhof bhf;

	public void createProject(IProgressMonitor monitor, IProject project) {
		try {
			project.create(monitor);
			project.open(monitor);
		} catch (CoreException e) {
			System.out.println("ERROR: Open project failed");
			e.printStackTrace();
		}

		String modelPath = '/' + project.getName(); // $NON-NLS-1$
		representationsURI = URI.createPlatformResourceURI(modelPath + "/representations.aird", true);
		session = createAird(project, representationsURI, monitor);
		final String semanticModelPath = getSemanticModelPath(session, project.getName());
		initSemanticModel(session, semanticModelPath, monitor, project.getName());

		final String[] viewpointsToActivate = { TBG_VP };
		enableViewpoints(session, viewpointsToActivate);
		try {
			addNatures(project);
		} catch (IOException | CoreException e) {
			System.out.println("ERROR: Open project failed");
			e.printStackTrace();
		}
		openProject(project.getLocation());
	}

	public static void addNatures(IProject project) throws CoreException, IOException {
		List<String> naturesToBeAdded = Arrays.asList(ProjectNature.NATURE_ID,
				"org.eclipse.sirius.nature.modelingproject");

		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + naturesToBeAdded.size()];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		for (int i = 0; i < naturesToBeAdded.size(); i++) {
			newNatures[natures.length + i] = naturesToBeAdded.get(i);
		}
		// validate the natures
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus status = workspace.validateNatureSet(newNatures);
		// only apply new nature, if the status is ok
		if (status.getCode() == IStatus.OK) {
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		}
	}

	private Session createAird(IProject project, URI representationsURI, IProgressMonitor monitor) {
		final Session session;
		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		if (modelingProject.some()) {
			session = modelingProject.get().getSession();
		} else {
			Session tempSession = null;
			SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
					representationsURI, monitor);
			try {
				sessionCreationOperation.execute();
				tempSession = sessionCreationOperation.getCreatedSession();
			} catch (CoreException e) {
				System.out.println("ERROR: Create representations file failed");
				e.printStackTrace();
			}
			if (tempSession != null) {
				session = tempSession;
			} else {
				session = null;
			}
		}
		return session;
	}

	public void openProject(final IPath projectPath) {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					closeOpenedEditors();
					openEditor();
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}

	public boolean openEditor() throws PartInitException {
		Optional<EObject> anOpt = session.getSessionResource().getContents().stream()
				.filter(eo -> eo instanceof DAnalysis).findFirst();
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (anOpt.isPresent()) {
			DAnalysis root = (DAnalysis) anOpt.get();
			DView dView = root.getOwnedViews().get(0);
			DRepresentationDescriptor rep = dView.getOwnedRepresentationDescriptors().get(0);
			URI repDescURI = Optional.ofNullable(rep).map(repDesc -> EcoreUtil.getURI(repDesc)).orElse(null);
			final SessionEditorInput editorInput = new SessionEditorInput(representationsURI, repDescURI,
					"Versorgungsschema", session);
			return null != page.openEditor(editorInput, DDiagramEditor.EDITOR_ID);
		}
		return false;

	}

	private String getSemanticModelPath(final Session session, String projectName) {
		Resource aird = (Resource) session.getAllSessionResources().toArray()[0];
		String airdUri = aird.getURI().toPlatformString(true);
		final String semanticModelPath = airdUri.substring(0, airdUri.lastIndexOf("/") + 1) + projectName + ".model";
		return semanticModelPath;
	}

	private void initSemanticModel(final Session session, final String semanticModelPath,
			final IProgressMonitor monitor, String projectName) {
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					protected void doExecute() {

						final URI semanticModelURI = URI.createPlatformResourceURI(semanticModelPath, true);
						Resource res = new ResourceSetImpl().createResource(semanticModelURI);

						ModelFactoryImpl factory = new ModelFactoryImpl();
						bhf = factory.createBahnhof();
						bhf.setName(projectName);
						res.getContents().add(bhf);

						try {
							Map<Object, Object> options = new HashMap<Object, Object>();
							options.put(XMLResource.OPTION_ENCODING, "UTF-8"); // für umlaute in .model datei beim
																				// drucken
							res.save(options);
						} catch (IOException e) {
							System.out.println("ERROR: Init semantic model failed");
							e.printStackTrace();
						}

						session.addSemanticResource(semanticModelURI, monitor);
						session.save(monitor);
					}
				});
	}

	public static void enableViewpoints(final Session session, final String... viewpointsToActivate) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							ViewpointSelectionCallback callback = new ViewpointSelectionCallback();
							for (Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()) {
								for (String viewpoint : viewpointsToActivate) {
									if (viewpoint.equals(vp.getName()))
										callback.selectViewpoint(vp, session, new NullProgressMonitor());
								}
							}
						}
					});
		}
	}

	public void closeOpenedEditors() {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					IWorkbenchPage page = window.getActivePage();
					for (IEditorReference editorRef : page.getEditorReferences()) {
						IEditorPart editor = editorRef.getEditor(false);
						editor.doSave(new NullProgressMonitor());
						DialectUIManager.INSTANCE.closeEditor(editor, false);
					}
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		});
	}
}