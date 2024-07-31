package at.tb_gruber.designer.design.style;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.util.StringUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.diagram.ui.part.SiriusVisualIDRegistry;

import at.tb_gruber.designer.design.style.nodecontainer.TBGDNodeContainerEditPart;

@Deprecated
public class TBGEditPartProvider extends AbstractEditPartProvider {

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			CreateGraphicEditPartOperation cge = (CreateGraphicEditPartOperation) operation;
			if (StringUtil.isValidPositiveInteger(cge.getCachingKey())) {
				int key = Integer.valueOf(cge.getCachingKey());
//				if (key == DEdgeEditPart.VISUAL_ID || key == DEdgeBeginNameEditPart.VISUAL_ID
//						|| key == DEdgeNameEditPart.VISUAL_ID || key == DEdgeEndNameEditPart.VISUAL_ID
//						|| key == DNodeContainerEditPart.VISUAL_ID) {
//					return true;
//				}
				return key == DNodeContainerEditPart.VISUAL_ID;
			}
		}
		return super.provides(operation);
	}

	@Override
	public IGraphicalEditPart createGraphicEditPart(View view) {
		switch (SiriusVisualIDRegistry.getVisualID(view)) {
//		case DEdgeEditPart.VISUAL_ID:
//			return new TBGEdgeEditPart(view);
//		case DEdgeBeginNameEditPart.VISUAL_ID:
//			return new TBGEdgeBeginNameEditPart(view);
//		case DEdgeNameEditPart.VISUAL_ID:
//			return new TBGEdgeNameEditPart(view);
//		case DEdgeEndNameEditPart.VISUAL_ID:
//			return new TBGEdgeEndNameEditPart(view);
		case DNodeContainerEditPart.VISUAL_ID:
			return new TBGDNodeContainerEditPart(view);
		default:
			return super.createGraphicEditPart(view);
		}

	}

}
