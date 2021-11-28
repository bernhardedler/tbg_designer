package at.tb_gruber.designer.design.style;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.SiriusWrapLabel;

import at.tb_gruber.designer.design.style.TBGEdgeEditPart.TBGViewEdgeFigure.TBGEdgeLabel;

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

}
