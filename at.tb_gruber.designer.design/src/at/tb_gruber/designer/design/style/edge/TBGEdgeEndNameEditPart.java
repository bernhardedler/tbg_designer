package at.tb_gruber.designer.design.style.edge;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.locator.EdgeLabelLocator;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.SiriusWrapLabel;

import at.tb_gruber.designer.design.style.edge.TBGEdgeEditPart.TBGViewEdgeFigure.TBGEdgeLabel;
import at.tb_gruber.designer.gmf.editpolicy.TBGDragEditPartsTracker;
import at.tb_gruber.designer.gmf.editpolicy.TBGResizableShapeLabelEditPolicy;

public class TBGEdgeEndNameEditPart extends DEdgeEndNameEditPart {

	public TBGEdgeEndNameEditPart(View view) {
		super(view);
	}

	public void setLabel(SiriusWrapLabel figure) {
		if (figure instanceof TBGEdgeLabel) {
			((TBGEdgeLabel) figure).setModel((View) getParent().getModel());
		}
		unregisterVisuals();
		setFigure(figure);
		defaultText = getLabelTextHelper(figure);
		registerVisuals();
		refreshVisuals();
	}

	@Override
	public void refreshBounds() {
		// The case of NonResizable is useless here for SiriusWrapLabel.
		handleResizableRefreshBounds();
	}

	/**
	 * Handles resizable label refresh bounds. "Override" to use a specific
	 * {@link EdgeLabelLocator}.
	 */
	private void handleResizableRefreshBounds() {
		int dx = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int dy = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		
		Rectangle rectangle = new Rectangle(dx, dy, width, height);
		if (getParent() instanceof AbstractConnectionEditPart) {
			((AbstractGraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(),
					new TBGEdgeLabelLocator(getFigure().getParent(), rectangle, getKeyPoint()));
		}
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
        installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new TBGResizableShapeLabelEditPolicy());
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return new TBGDragEditPartsTracker(this);
	}
}
