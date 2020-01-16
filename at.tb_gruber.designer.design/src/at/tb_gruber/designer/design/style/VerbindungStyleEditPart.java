package at.tb_gruber.designer.design.style;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.impl.DEdgeImpl;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;

import at.tb_gruber.designer.model.Verbindung;

public class VerbindungStyleEditPart extends AbstractDiagramEdgeEditPart implements IStyleEditPart {

	public VerbindungStyleEditPart(View view) {
		super(view);
	}

	@Override
	public void notifyChanged(Notification notification) {
		setColorForSpannung(resolveVerbindung());
		super.notifyChanged(notification);
	}

	private void setColorForSpannung(Verbindung verbindung) {

	}

	private Verbindung resolveVerbindung() {
		EObject resolve = this.resolveSemanticElement();
		EObject eObject = ((DEdgeImpl) resolve).getSemanticElements().get(0);
		return (Verbindung) eObject;
	}

	/**
	 * @was-generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DEdgeNameEditPart) {
			((DEdgeNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureViewEdgeNameFigure());
			return true;
		}
		if (childEditPart instanceof DEdgeEndNameEditPart) {
			((DEdgeEndNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureViewEndEdgeNameFigure());
			return true;
		}
		if (childEditPart instanceof DEdgeBeginNameEditPart) {
			((DEdgeBeginNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureViewBeginEdgeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @was-generated
	 */
	public AbstractDiagramEdgeEditPart.ViewEdgeFigure getPrimaryShape() {
		return (AbstractDiagramEdgeEditPart.ViewEdgeFigure) getFigure();
	}

	/**
	 * @was-generated
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}
}
