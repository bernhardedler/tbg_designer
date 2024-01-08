package at.tb_gruber.designer.design;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.WorkspaceViewerProperties;
import org.eclipse.gmf.runtime.diagram.ui.internal.ruler.DiagramRuler;
import org.eclipse.gmf.runtime.diagram.ui.internal.ruler.DiagramRulerProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.diagram.ui.edit.internal.part.DiagramElementEditPartOperation;
import org.eclipse.sirius.diagram.ui.tools.internal.edit.command.CommandFactory;
import org.eclipse.sirius.diagram.ui.tools.internal.editor.DDiagramEditorImpl;
import org.eclipse.sirius.diagram.ui.tools.internal.part.SiriusDiagramGraphicalViewer;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.BundleContext;

import at.tb_gruber.designer.gmf.editpolicy.TBGResetOriginModelChangeOperation;
import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.ide.preferences.TBGPreferencePage;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "at.tb_gruber.designer.design";

	// The shared instance
	private static Activator plugin;

	private static Set<Viewpoint> viewpoints;
	private static IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			TBGPreferencePage.PREFERENCE_SCOPE_IDENTIFIER);

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(
				ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/designer.odesign"));

		String dashLength = System.getProperty(TBGPreferencePage.DASH_LENGTH);
		try {
			if (dashLength != null && dashLength.matches("\\d+")) {
				float length = Integer.valueOf(dashLength).floatValue();

				Field field = DiagramElementEditPartOperation.class.getDeclaredField("DASH_STYLE");
				field.setAccessible(true);

				Field modifiersField = Field.class.getDeclaredField("modifiers");
				modifiersField.setAccessible(true);
				modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

				field.set(null, new float[] { length, length });
			}
		} catch (NumberFormatException e) {
			// do nothing
		}
		if (preferenceStore.getBoolean(TBGPreferencePage.DEBUG_LOG)) {
			CSVPropertyProvider.getInstance().debugAll();
		}

		if (preferenceStore.getBoolean(TBGPreferencePage.AUTO_RESET_ORIGIN)) {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			window.getPartService().addPartListener(new IPartListener() {

				@Override
				public void partActivated(IWorkbenchPart part) {
				}

				@Override
				public void partBroughtToTop(IWorkbenchPart part) {
				}

				@Override
				public void partClosed(IWorkbenchPart part) {
				}

				@Override
				public void partDeactivated(IWorkbenchPart part) {
				}

				@Override
				public void partOpened(IWorkbenchPart part) {
					double initialSpacing = 3.0; // 3 cm
					resetOriginIfSiriusEditor(part, initialSpacing);
				}

				/*
				 * @see
				 * org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor.initializeContents(
				 * EditPart)
				 */
				private void resetOriginIfSiriusEditor(IWorkbenchPart part, double spacing) {
					if (part instanceof DDiagramEditorImpl && "Versorgungsschema".equals(part.getTitle())) {
						DDiagramEditorImpl impl = (DDiagramEditorImpl) part;

						/* Vorbelegung Properties */
						EditPartViewer v = impl.getDiagramEditPart().getViewer();
						if (v instanceof SiriusDiagramGraphicalViewer) {
							SiriusDiagramGraphicalViewer viewer = (SiriusDiagramGraphicalViewer) v;
							var root = ((DiagramRootEditPart) impl.getDiagramEditPart().getRoot());
							/* Einheiten metrisch fixiert */
							DiagramRootEditPart rep = ((DiagramRootEditPart) viewer.getRootEditPart());
							int metric = RulerProvider.UNIT_CENTIMETERS;
							rep.getVerticalRuler().setUnit(metric);
							rep.getHorizontalRuler().setUnit(metric);

							/* refresh rulers */
							viewer.setProperty(RulerProvider.PROPERTY_RULER_VISIBILITY, Boolean.FALSE);
							viewer.setProperty(RulerProvider.PROPERTY_RULER_VISIBILITY, Boolean.TRUE);

							// Snap to Grid
							viewer.setProperty(SnapToGrid.PROPERTY_GRID_ENABLED, Boolean.TRUE);
							// Hide/Show Grid
							viewer.setProperty(SnapToGrid.PROPERTY_GRID_VISIBLE, Boolean.TRUE);
							// Grid Origin (always 0, 0)
							viewer.setProperty(SnapToGrid.PROPERTY_GRID_ORIGIN, new Point());
							// Grid Spacing
							root.setGridSpacing(spacing);
							/* Reset Origin auslösen */
							TBGResetOriginModelChangeOperation operation = new TBGResetOriginModelChangeOperation(
									(DiagramEditPart) impl.getDiagramEditPart());
							DiagramEditPart editPart = impl.getDiagramEditPart();
							RecordingCommand command = CommandFactory.createRecordingCommand(
									((IGraphicalEditPart) editPart).getEditingDomain(), operation);
							impl.getEditingDomain().getCommandStack().execute(command);
							
							viewer.addPropertyChangeListener(new PropertyChangeListener() {
								@Override
								public void propertyChange(PropertyChangeEvent evt) {
									if (evt.getPropertyName().equals(SnapToGrid.PROPERTY_GRID_SPACING)) {
										/* neues Spacing bereits gesetzt, nur Aktualisierung nötig */
										resetOriginIfSiriusEditor(part, root.getGridSpacing());
									}
								}
							});
						}
					}
				}
			});
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
