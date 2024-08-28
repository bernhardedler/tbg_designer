package at.tb_gruber.designer.design.style;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.util.StringUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainer2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartmentEditPart;
import org.eclipse.sirius.diagram.ui.part.SiriusVisualIDRegistry;

import at.tb_gruber.designer.design.style.nodecontainer.TBGDNodeContainer2EditPart;
import at.tb_gruber.designer.design.style.nodecontainer.TBGDNodeContainerEditPart;

@Deprecated
public class TBGEditPartProvider extends AbstractEditPartProvider {

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			CreateGraphicEditPartOperation cge = (CreateGraphicEditPartOperation) operation;
			if (StringUtil.isValidPositiveInteger(cge.getCachingKey())) {
				int key = Integer.valueOf(cge.getCachingKey());
				return key == DNodeContainerEditPart.VISUAL_ID || key == DNodeContainer2EditPart.VISUAL_ID ;
			}
		}
		return super.provides(operation);
	}

	@Override
	public IGraphicalEditPart createGraphicEditPart(View view) {
		switch (SiriusVisualIDRegistry.getVisualID(view)) {
		case DNodeContainerEditPart.VISUAL_ID: /* Gebäude */
			return new TBGDNodeContainerEditPart(view);
		case DNodeContainer2EditPart.VISUAL_ID: /* VerteilerContainer */
			return new TBGDNodeContainer2EditPart(view);
		default:
			return super.createGraphicEditPart(view);
		}

	}

}
