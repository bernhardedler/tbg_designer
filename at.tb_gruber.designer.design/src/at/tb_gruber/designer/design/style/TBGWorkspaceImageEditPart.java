package at.tb_gruber.designer.design.style;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.diagram.ui.business.internal.edit.helpers.LabelAlignmentHelper;
import org.eclipse.sirius.diagram.ui.edit.internal.part.DiagramContainerEditPartOperation;
import org.eclipse.sirius.diagram.ui.edit.internal.part.DiagramNodeEditPartOperation;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.IWorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.ViewNodeFigure;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.SiriusWrapLabel;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.LabelStyle;

import at.tb_gruber.designer.model.impl.AnlageImpl;

public class TBGWorkspaceImageEditPart extends WorkspaceImageEditPart {

	public TBGWorkspaceImageEditPart(View view) {
		super(view);
	}

	/**
	 * react to model changes from the properties view
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		refreshVisuals();
		super.notifyChanged(notification);
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart#refreshVisuals()
	 */
	@Override
	protected void refreshVisuals() {
		IWorkspaceImageFigure figure = this.getPrimaryShape();
		EObject element = this.resolveSemanticElement();
		if (element instanceof WorkspaceImage && figure != null) {
			WorkspaceImage bundledImage = (WorkspaceImage) element;
			// Check if the figure is the right one (SVGWorkspaceImageFigure for
			// SVG format, WorkspaceImageFigure for others kinds).
			if (DiagramContainerEditPartOperation.needFigureChange(bundledImage, figure)) {
				// Replace the wrong IWorkspaceImageFigure kind by the new one.
				getFigure().remove(figure);
				IFigure shape = createNodeShape();
				getFigure().add(shape);
				contentPane = setupContentPane(shape);
			} else {
				// Refresh the right IWorkspaceImageFigure kind
				figure.refreshFigure(bundledImage);
			}
			DiagramNodeEditPartOperation.refreshFigure(this);
//			DiagramElementEditPartOperation
			AnlageImpl anlage = (AnlageImpl) ((DNodeSpec) bundledImage.eContainer()).getSemanticElements().get(0);
			String labelText = anlage.getName();
			refreshLabelAlignment(((GraphicalEditPart) getParent()).getContentPane(),
					bundledImage, labelText);
			((GraphicalEditPart) this.getParent()).setLayoutConstraint(this, this.getFigure(),
					new Rectangle(0, 0, figure.getPreferredSize().width, figure.getPreferredSize().height));
		}
	}

	/**
	 * Refresh the draw2d label alignment.
	 * 
	 * @param figure the primary shape of the edit-part.
	 * @param style  the {@link LabelStyle}.
	 */
	public static void refreshLabelAlignment(final IFigure figure, final LabelStyle style, String labelText) {
		if (style != null) {
			LabelAlignment alignment = style.getLabelAlignment();
			if (figure instanceof ViewNodeFigure) {
				SiriusWrapLabel nodeLabel = ((ViewNodeFigure) figure).getNodeLabel();
				if (nodeLabel != null) {
					nodeLabel.setText("haha");
					nodeLabel.setLabelAlignment(LabelAlignmentHelper.getAsPositionConstant(alignment));
					nodeLabel.setTextAlignment(LabelAlignmentHelper.getAsPositionConstant(alignment));
					nodeLabel.setTextWrapAlignment(LabelAlignmentHelper.getAsPositionConstant(alignment));
				}
			} else if (figure != null) {
				LayoutManager layoutManager = figure.getLayoutManager();
				if (layoutManager instanceof ConstrainedToolbarLayout) {
					ConstrainedToolbarLayout ctl = (ConstrainedToolbarLayout) layoutManager;
					ctl.setMinorAlignment(LabelAlignmentHelper.getAsCTLMinorAlignment(alignment));
				}
			}
		}
	}

}
