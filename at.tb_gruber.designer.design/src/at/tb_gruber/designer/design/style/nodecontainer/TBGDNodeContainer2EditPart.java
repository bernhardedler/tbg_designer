package at.tb_gruber.designer.design.style.nodecontainer;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainer2EditPart;

public class TBGDNodeContainer2EditPart extends DNodeContainer2EditPart {

	public TBGDNodeContainer2EditPart(View view) {
		super(view);
	}

    /* Schlagschatten entfernen */
    @Override
    public boolean isShadowBorderNeeded() {
    	return false;
    }

}
