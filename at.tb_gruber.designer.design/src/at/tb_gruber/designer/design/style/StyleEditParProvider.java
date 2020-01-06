package at.tb_gruber.designer.design.style;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.CustomStyle;

public class StyleEditParProvider extends AbstractEditPartProvider {
	
    public StyleEditParProvider() {
        super();
    }
    
    @Override
    protected Class getNodeEditPartClass(View view) {
        if (view.getElement() instanceof CustomStyle) {
            CustomStyle customStyle = (CustomStyle) view.getElement();
            if (customStyle.getId().equals(AnlageStyleEditPart.ID)) {
                return AnlageStyleEditPart.class;
            }
        }
        return super.getNodeEditPartClass(view);
    }
}
