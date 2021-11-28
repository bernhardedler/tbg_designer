package at.tb_gruber.designer.design.style;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.util.StringUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.diagram.ui.part.SiriusVisualIDRegistry;

import at.tb_gruber.designer.design.style.edge.TBGEdgeBeginNameEditPart;
import at.tb_gruber.designer.design.style.edge.TBGEdgeEditPart;
import at.tb_gruber.designer.design.style.edge.TBGEdgeEndNameEditPart;
import at.tb_gruber.designer.design.style.edge.TBGEdgeNameEditPart;
import at.tb_gruber.designer.design.style.plankopf.PlankopfEditPart;

public class TBGEditPartProvider extends AbstractEditPartProvider {

	@Override
	protected Class getNodeEditPartClass(View view) {
		if (SiriusVisualIDRegistry.getVisualID(view) == DNodeContainerEditPart.VISUAL_ID) {
			return PlankopfEditPart.class;
		}
		return super.getNodeEditPartClass(view);
	}

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			CreateGraphicEditPartOperation cge = (CreateGraphicEditPartOperation) operation;
			if (StringUtil.isValidPositiveInteger(cge.getCachingKey())) {
				int key = Integer.valueOf(cge.getCachingKey());
				if (key == DEdgeEditPart.VISUAL_ID || key == DEdgeBeginNameEditPart.VISUAL_ID
						|| key == DEdgeNameEditPart.VISUAL_ID || key == DEdgeEndNameEditPart.VISUAL_ID) {
					return true;
				}
			}
		}
		return super.provides(operation);
	}

	@Override
	public IGraphicalEditPart createGraphicEditPart(View view) {
		switch (SiriusVisualIDRegistry.getVisualID(view)) {
		case DEdgeEditPart.VISUAL_ID:
			return new TBGEdgeEditPart(view);
		case DEdgeBeginNameEditPart.VISUAL_ID:
			return new TBGEdgeBeginNameEditPart(view);
		case DEdgeNameEditPart.VISUAL_ID:
			return new TBGEdgeNameEditPart(view);
		case DEdgeEndNameEditPart.VISUAL_ID:
			return new TBGEdgeEndNameEditPart(view);
		default:
			return super.createGraphicEditPart(view);
		}

	}

}
