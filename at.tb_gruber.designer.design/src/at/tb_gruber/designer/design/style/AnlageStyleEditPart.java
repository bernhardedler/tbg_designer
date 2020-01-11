package at.tb_gruber.designer.design.style;

import java.net.URL;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.CustomStyle;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.business.internal.query.WorkspaceImageQuery;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractNotSelectableShapeNodeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.layout.LayoutUtils;
import org.eclipse.sirius.diagram.ui.tools.internal.part.SiriusDiagramGraphicalViewer;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.AirStyleDefaultSizeNodeFigure;
import org.eclipse.sirius.viewpoint.description.style.StyleDescription;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import at.tb_gruber.designer.design.Activator;
import at.tb_gruber.designer.model.impl.AnlageImpl;

public class AnlageStyleEditPart extends AbstractNotSelectableShapeNodeEditPart implements IStyleEditPart {

	public static final String ID = "at.tb_gruber.designer.design.style.AnlageStyle";
	private static final boolean USE_SVG = false;
	private static final Dimension STANDARD_DIM = new Dimension(100, 100);
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
			addListenerFilter("tbgValueChangeAnlagenart", this, obj, featureOptional.get());
		}
		featureOptional = obj.eClass().getEAllStructuralFeatures().stream()
				.filter(feature -> "trafospannung".equals(feature.getName())).findFirst();
		if (featureOptional.isPresent()) {
			addListenerFilter("tbgValueChangeTrafospannung", this, obj, featureOptional.get());
		}
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
		Optional<Image> imageOpt = getImage();
		if (imageOpt.isPresent()) {
			Image image = imageOpt.get();
			getPrimaryShape().setImage(image);
		}
		super.refreshVisuals();
	}

	private Optional<Image> getImage() {
		if (USE_SVG) {
			Optional<ScalableImageFigure> svg = resolveSvg();
			if (svg.isPresent()) {
				ScalableImageFigure sh = svg.get();
				return Optional.of(sh.getImage());
			}
		} else {
			Optional<Image> png = resolvePng();
			if (png.isPresent()) {
				Image image = png.get();
				return Optional.of(image);
			}
		}
		return Optional.empty();
	}

	private String getImageForStandardAnlage(AnlageImpl anlage) {
		return anlage.getAnlagenart().getValue() + "_" + anlage.getVersorgungsspannung().getValue();
	}

	private String getImageForTrafo(AnlageImpl anlage) {
		return getImageForStandardAnlage(anlage) + "_" + anlage.getTrafospannung().getValue();
	}

	private Optional<String> getImageFragment() {
		CustomStyle customStyle = (CustomStyle) this.resolveSemanticElement();
		if (customStyle.eContainer() instanceof DNode) {
			try {
				EObject eObject = ((DNode) customStyle.eContainer()).getSemanticElements().get(0);
				AnlageImpl anlage = (AnlageImpl) eObject;

				String imagePath = null;
				if (anlage.getAnlagenart().getValue() == at.tb_gruber.designer.model.anlagearttype.TRAFO_VALUE) {
					imagePath = getImageForTrafo(anlage);
				} else {
					/*
					 * VERSORGUNGSKNOTEN_VALUE: UEGS_ZAEHLPUNKT_VALUE ENERGIETECHNIKANLAGE_VALUE
					 * VK_ET_VALUE
					 */
					imagePath = getImageForStandardAnlage(anlage);
				}

				return Optional.of(imagePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Optional.empty();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		refreshVisuals();
		super.notifyChanged(notification);
	}

	
	protected ScalableImageFigure createNodeShape(String anlagetype) {
		URL url = FileLocator.find(Activator.getDefault().getBundle(), new Path("images/svg/" + anlagetype + ".svg"),
				null);
		return new ScalableImageFigure(RenderedImageFactory.getInstance(url), true, true, true);
	}

	private ImageFigure resolveImage() {
		if (USE_SVG) {
			Optional<ScalableImageFigure> resolveSvg = resolveSvg();
			return resolveSvg.isPresent() ? resolveSvg.get() : new ImageFigure();
		} else {
			Optional<Image> resolvePng = resolvePng();
			return resolvePng.isPresent() ? new ImageFigure(resolvePng.get()) : new ImageFigure();
		}
	}

	private Optional<ScalableImageFigure> resolveSvg() {
		Optional<String> imageFragment = getImageFragment();
		if (imageFragment.isPresent()) {
			return Optional.of(createNodeShape(imageFragment.get()));
		}
		return Optional.empty();
	}

	private Optional<Image> resolvePng() {
		Optional<String> imageFragment = getImageFragment();
		if (imageFragment.isPresent()) {
			ImageDescriptor imageDescriptorFromPlugin = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
					"images/png/" + imageFragment.get() + ".png");
			Image image = imageDescriptorFromPlugin.createImage();
			return Optional.of(image);
		}
		return Optional.empty();
	}
}
