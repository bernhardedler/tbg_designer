package at.tb_gruber.designer.ide;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;

public class CustomProjectSupport {
	/**
	 * For this marvelous project we need to: - create the default Eclipse project -
	 * add the custom project nature - create the folder structure
	 *
	 * @param projectName
	 * @param location
	 * @param natureId
	 * @return
	 * @throws IOException 
	 * @throws CoreException 
	 */
	public static IProject createProject(String projectName, URI location) throws IOException, CoreException {
		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);

		IProject project = createBaseProject(projectName, location);
		try {
			addNatures(project);
		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}
		project.refreshLocal(IResource.DEPTH_ONE, null);
		return project;
	}

	/**
	 * Just do the basics: create a basic project.
	 *
	 * @param location
	 * @param projectName
	 */
	private static IProject createBaseProject(String projectName, URI location) {
		// it is acceptable to use the ResourcesPlugin class
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
			if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}

			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
				if (!newProject.isOpen()) {
					newProject.open(null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return newProject;
	}

	private static void addRequiredFilesToProjectStructure(IProject newProject) throws IOException {
		IPath location = newProject.getLocation();

		IPath modelFileURI = location.addTrailingSeparator().append(newProject.getName() + ".model");
		File modelFile = modelFileURI.toFile();
		if (!modelFile.exists()) {
			modelFile.createNewFile();
			String newFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
					+ "<tbg:Bahnhof xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:tbg=\"http://www.tb-gruber.at/model\" name=\""
					+ newProject.getName() + "\">\r\n" + "</tbg:Bahnhof>\r\n";
			FileOutputStream outputStream = new FileOutputStream(modelFile);
		    byte[] strToBytes = newFileContent.getBytes();
		    outputStream.write(strToBytes);
		    outputStream.close();
		}
		
		IPath airdFileURI = location.addTrailingSeparator().append("representations.aird");
		File airdFile = airdFileURI.toFile();
		if (!airdFile.exists()) {
			airdFile.createNewFile();
			String newFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
					"<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:description=\"http://www.eclipse.org/sirius/description/1.1.0\" xmlns:description_1=\"http://www.eclipse.org/sirius/diagram/description/1.1.0\" xmlns:diagram=\"http://www.eclipse.org/sirius/diagram/1.1.0\" xmlns:notation=\"http://www.eclipse.org/gmf/runtime/1.0.2/notation\" xmlns:tbg=\"http://www.tb-gruber.at/model\" xmlns:viewpoint=\"http://www.eclipse.org/sirius/1.1.0\" xsi:schemaLocation=\"http://www.eclipse.org/sirius/description/1.1.0 http://www.eclipse.org/sirius/1.1.0#//description http://www.eclipse.org/sirius/diagram/description/1.1.0 http://www.eclipse.org/sirius/diagram/1.1.0#//description\">\r\n" + 
					"  <viewpoint:DAnalysis uid=\"_6WQAcCl8Eeqxvp6F0MXXUA\" selectedViews=\"_DK5F4Cl9Eeqxvp6F0MXXUA\" version=\"14.3.0.201909031200\">\r\n" + 
					"    <semanticResources>" + modelFile.getName() + "</semanticResources>\r\n" + 
					"    <ownedViews xmi:type=\"viewpoint:DView\" uid=\"_DK5F4Cl9Eeqxvp6F0MXXUA\">\r\n" + 
					"      <viewpoint xmi:type=\"description:Viewpoint\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']\"/>\r\n" + 
					"      <ownedRepresentationDescriptors xmi:type=\"viewpoint:DRepresentationDescriptor\" uid=\"_DL1hECl9Eeqxvp6F0MXXUA\" name=\"Anlagendiagramm\" repPath=\"#_DLI9gCl9Eeqxvp6F0MXXUA\" changeId=\"09bb9941-84a8-4485-b4e1-f543f43c3f00\">\r\n" + 
					"        <description xmi:type=\"description_1:DiagramDescription\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagendiagramm']\"/>\r\n" + 
					"        <target xmi:type=\"tbg:Bahnhof\" href=\"" + modelFile.getName() + "#/\"/>\r\n" + 
					"      </ownedRepresentationDescriptors>\r\n" + 
					"    </ownedViews>\r\n" + 
					"  </viewpoint:DAnalysis>\r\n" + 
					"  <diagram:DSemanticDiagram uid=\"_DLI9gCl9Eeqxvp6F0MXXUA\">\r\n" + 
					"    <ownedAnnotationEntries xmi:type=\"description:AnnotationEntry\" uid=\"_DLxPoCl9Eeqxvp6F0MXXUA\" source=\"DANNOTATION_CUSTOMIZATION_KEY\">\r\n" + 
					"      <data xmi:type=\"diagram:ComputedStyleDescriptionRegistry\" uid=\"_DLxPoSl9Eeqxvp6F0MXXUA\"/>\r\n" + 
					"    </ownedAnnotationEntries>\r\n" + 
					"    <ownedAnnotationEntries xmi:type=\"description:AnnotationEntry\" uid=\"_DMN7kCl9Eeqxvp6F0MXXUA\" source=\"GMF_DIAGRAMS\">\r\n" + 
					"      <data xmi:type=\"notation:Diagram\" xmi:id=\"_DMN7kSl9Eeqxvp6F0MXXUA\" type=\"Sirius\" element=\"_DLI9gCl9Eeqxvp6F0MXXUA\" measurementUnit=\"Pixel\">\r\n" + 
					"        <styles xmi:type=\"notation:DiagramStyle\" xmi:id=\"_DMN7kil9Eeqxvp6F0MXXUA\"/>\r\n" + 
					"      </data>\r\n" + 
					"    </ownedAnnotationEntries>\r\n" + 
					"    <description xmi:type=\"description_1:DiagramDescription\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagendiagramm']\"/>\r\n" + 
					"    <filterVariableHistory xmi:type=\"diagram:FilterVariableHistory\" uid=\"_DLUjsCl9Eeqxvp6F0MXXUA\"/>\r\n" + 
					"    <activatedLayers xmi:type=\"description_1:Layer\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagendiagramm']/@defaultLayer\"/>\r\n" + 
					"    <target xmi:type=\"tbg:Bahnhof\" href=\"" + modelFile.getName() + "#/\"/>\r\n" + 
					"  </diagram:DSemanticDiagram>\r\n" + 
					"</xmi:XMI>\r\n" + 
					"";
			FileOutputStream outputStream = new FileOutputStream(airdFile);
		    byte[] strToBytes = newFileContent.getBytes();
		    outputStream.write(strToBytes);
		    outputStream.close();
		}
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
		
		addRequiredFilesToProjectStructure(project);
	}

}