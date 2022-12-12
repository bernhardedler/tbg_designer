package at.tb_gruber.designer.gmf.editpolicy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.requests.RequestConstants;
import org.eclipse.sirius.diagram.ui.tools.internal.edit.command.CommandFactory;

@Deprecated
public class TBGResetOriginPolicy extends AbstractEditPolicy {

	@Override
	public boolean understandsRequest(Request req) {
		return RequestConstants.REQ_RESET_ORIGIN.equals(req.getType());
	}

	@Override
	public Command getCommand(Request request) {
		if (understandsRequest(request)) {
			EditPart editPart = getHost();
			TBGResetOriginModelChangeOperation operation = null;
			if (editPart instanceof DiagramEditPart) {
				operation = new TBGResetOriginModelChangeOperation((DiagramEditPart) editPart);
			}
			if (operation != null) {
				ICommand command = CommandFactory.createICommand(((IGraphicalEditPart) editPart).getEditingDomain(),
						operation);
				return new ICommandProxy(command);
			}
		}
		return super.getCommand(request);
	}
}
