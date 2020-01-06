package at.tb_gruber.designer.design.style;

import java.util.Optional;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.diagram.CustomStyle;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractNotSelectableShapeNodeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.AirStyleDefaultSizeNodeFigure;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import at.tb_gruber.designer.design.Activator;
import at.tb_gruber.designer.model.impl.AnlageImpl;

public class AnlageStyleEditPart extends AbstractNotSelectableShapeNodeEditPart implements IStyleEditPart {

	public static final String ID = "at.tb_gruber.designer.design.style.AnlageStyle";

	/**
	 * the content pane.
	 */
	protected IFigure contentPane;

	/**
	 * the primary shape.
	 */
	protected ImageFigure primaryShape;

	/**
	 * Create a new {@link ChangingImageEditPart}.
	 *
	 * @param view the view.
	 */
	public AnlageStyleEditPart(View view) {
		super(view);
		EObject resolveSemanticElement = resolveSemanticElement();
		AnlageImpl obj = ((AnlageImpl) ((DNode) resolveSemanticElement.eContainer()).getSemanticElements().get(0));
		Optional<EStructuralFeature> featureOptional = obj.eClass().getEAllStructuralFeatures().stream()
				.filter(feature -> "anlagenart".equals(feature.getName())).findFirst();
		if (featureOptional.isPresent()) {
			addListenerFilter("tbgValueChange", this, obj, featureOptional.get());
		}
		installEditPolicy(ComponentEditPolicy.REQ_RESIZE, new ComponentEditPolicy() {
			@Override
			public Command getCommand(Request request) {
				if (RequestConstants.REQ_RESIZE.equals(request.getType())) {
					return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
				}
				return super.getCommand(request);
			}
		});
	}

	public DragTracker getDragTracker(Request request) {
		return getParent().getDragTracker(request);
	}

	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new XYLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	private NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new AirStyleDefaultSizeNodeFigure(getMapMode().DPtoLP(40),
				getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Create the instance role figure.
	 *
	 * @return the created figure.
	 */
	protected ImageFigure createNodeShape() {
		return getPrimaryShape();
	}

	/**
	 * Return the instance role figure.
	 *
	 * @return the instance role figure.
	 */
	public ImageFigure getPrimaryShape() {
		if (primaryShape == null) {
			primaryShape = new ImageFigure();
		}
		return primaryShape;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects layout
	 * one may have set for generated figure.
	 *
	 * @param nodeShape instance of generated figure class
	 * @return the figure
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	protected void refreshVisuals() {
		CustomStyle customStyle = (CustomStyle) this.resolveSemanticElement();
		if (customStyle.eContainer() instanceof DNode) {
			try {
				EObject eObject = ((DNode) customStyle.eContainer()).getSemanticElements().get(0);
				AnlageImpl anlage = (AnlageImpl) eObject;

				String imagePath = null;
				switch (anlage.getAnlagenart().getValue()) {
				case at.tb_gruber.designer.model.anlagearttype.TRAFO_VALUE: {
					imagePath = getImageForTrafo(anlage);
					break;
				}
				case at.tb_gruber.designer.model.anlagearttype.VERSORGUNGSKNOTEN_VALUE:
				case at.tb_gruber.designer.model.anlagearttype.UEGS_ZAEHLPUNKT_VALUE:
				case at.tb_gruber.designer.model.anlagearttype.ENERGIETECHNIKANLAGE_VALUE:
				case at.tb_gruber.designer.model.anlagearttype.VK_ET_VALUE:
				default: {
					imagePath = getImageForStandardAnlage(anlage);
					break;
				}

				}

//				Optional<URL> locate = org.eclipse.jface.resource.ResourceLocator.locate(Activator.PLUGIN_ID,
//						"images/svg/" + imagePath + ".svg");
//				if (locate.isPresent()) {
//					Image flyWeightImage = SVGWorkspaceImageFigure.flyWeightImage("images/svg/" + imagePath + ".svg");
//					this.getPrimaryShape().setImage(flyWeightImage);
//				}
				ImageDescriptor imageDescriptorFromPlugin = AbstractUIPlugin
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "images/png/" + imagePath + ".png");
				Image image = imageDescriptorFromPlugin.createImage();
				getPrimaryShape().setImage(image);
				getFigure().setPreferredSize(new Dimension(200, 200));
				getFigure().repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		super.refreshVisuals();
	}

	private String getImageForStandardAnlage(AnlageImpl anlage) {
		return anlage.getAnlagenart().getValue() + "_" + anlage.getVersorgungsspannung().getValue();
	}

	private String getImageForTrafo(AnlageImpl anlage) {
		return getImageForStandardAnlage(anlage) + "_" + anlage.getTrafospannung().getValue();
	}

	protected void createDefaultEditPolicies() {
		// empty.
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		refreshVisuals();
	}
}
