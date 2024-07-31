package at.tb_gruber.designer.design.style.nodecontainer;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;

public class TBGDNodeContainerEditPart extends DNodeContainerEditPart {

    public TBGDNodeContainerEditPart(View view) {
        super(view);
    }
    
    /* Schlagschatten entfernen */
    @Override
    public boolean isShadowBorderNeeded() {
    	return false;
    }
}
