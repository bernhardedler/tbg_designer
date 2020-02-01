package at.tb_gruber.designer.design.style;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.CustomStyle;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.WorkspaceImage;

/**
 * enable via
 * <extension point="org.eclipse.gmf.runtime.diagram.ui.editpartProviders">
 * <editpartProvider class=
 * "at.tb_gruber.designer.design.style.StyleEditPartProvider">
 * <Priority name="High"> </Priority> </editpartProvider> </extension>
 * 
 * @author bernh
 *
 */
public class StyleEditPartProvider extends AbstractEditPartProvider {

	public StyleEditPartProvider() {
		super();
	}

	@Override
	protected Class getNodeEditPartClass(View view) {
//		if (view instanceof WorkspaceImage) {
//			return TBGWorkspaceImageEditPart.class;
//		}
		if (view instanceof CustomStyle) {
			
		}
		return super.getNodeEditPartClass(view);
	}

	@Override
	protected Class getEdgeEditPartClass(View view) {
//		if (view.getElement() instanceof DEdge) {
//			return VerbindungStyleEditPart.class;
//		}
		return super.getEdgeEditPartClass(view);
	}

}
