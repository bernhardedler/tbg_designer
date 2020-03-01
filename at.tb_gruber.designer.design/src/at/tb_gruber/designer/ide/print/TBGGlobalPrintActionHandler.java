package at.tb_gruber.designer.ide.print;

import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.diagram.ui.printing.internal.util.SWTDiagramPrinter;
import org.eclipse.gmf.runtime.diagram.ui.printing.providers.DiagramWithPrintGlobalActionHandler;
import org.eclipse.ui.IEditorPart;

public class TBGGlobalPrintActionHandler extends DiagramWithPrintGlobalActionHandler {

	/**
	 * @param cntxt
	 */
	protected void doPrint(IGlobalActionContext cntxt) {
		TBGPrintActionHelper.doRun((IEditorPart) cntxt.getActivePart(),
				new SWTDiagramPrinter(getPreferencesHint((IEditorPart) cntxt.getActivePart()), getMapMode(cntxt)));
	}
	
}
