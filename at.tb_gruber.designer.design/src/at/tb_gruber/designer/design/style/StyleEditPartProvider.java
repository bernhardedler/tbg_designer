package at.tb_gruber.designer.design.style;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.CustomStyle;
import org.eclipse.sirius.diagram.DEdge;

public class StyleEditPartProvider extends AbstractEditPartProvider {

	public StyleEditPartProvider() {
		super();
	}

	@Override
	protected Class getNodeEditPartClass(View view) {
		if (view.getElement() instanceof CustomStyle) {
			CustomStyle customStyle = (CustomStyle) view.getElement();
			if (customStyle.getId().equals(AnlageStyleEditPart.ID)) {
				return AnlageStyleEditPart.class;
			}
//		} else if (view.getElement() instanceof DNodeContainerImpl) {
//			return ObjektStyleEditPart.class;
		}
		return super.getNodeEditPartClass(view);
	}

	@Override
	protected Class getEdgeEditPartClass(View view) {
		if (view.getElement() instanceof DEdge) {
			return VerbindungStyleEditPart.class;
		}
		return super.getEdgeEditPartClass(view);
	}
}
