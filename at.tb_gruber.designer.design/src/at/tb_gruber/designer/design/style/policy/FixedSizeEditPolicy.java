package at.tb_gruber.designer.design.style.policy;

import javax.print.attribute.standard.DocumentName;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.AirXYLayoutEditPolicy;
import org.eclipse.sirius.diagram.ui.internal.operation.ShiftEdgeIdentityAnchorOperation;
import org.eclipse.sirius.diagram.ui.tools.api.command.DoNothingCommand;
import org.eclipse.sirius.diagram.ui.tools.internal.edit.command.CommandFactory;


/**
 * Beschreibt das Verhalten der Nodes in einem Container, @see {@link EditPolicyProvider#createEditPolicies(EditPart)}
 * @author bernh
 *
 */
public class FixedSizeEditPolicy extends AirXYLayoutEditPolicy {

	/**
	 * Wenn der Request ein Resize-Request ist, nichts tun
	 * Move des Knotens bleibt erlaubt
	 */
	@Override
	protected Command getResizeChildrenCommand(ChangeBoundsRequest request) {
		if (isResize(request)) {
			return DoNothingCommand.INSTANCE;
		}
		Command superCommand = super.getResizeChildrenCommand(request);
		EditPart host = getHost();
		if (host instanceof IGraphicalEditPart) {
			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) host).getEditingDomain();
			CompositeTransactionalCommand ctc = new CompositeTransactionalCommand(editingDomain,
					superCommand.getLabel());
			ctc.add(new CommandProxy(superCommand));

			ShiftEdgeIdentityAnchorOperation operation = new ShiftEdgeIdentityAnchorOperation(request);
			ICommand command = CommandFactory.createICommand(editingDomain, operation);
			ctc.add(command);
			return new ICommandProxy(ctc);
		}
		return superCommand;
	}

	private boolean isResize(ChangeBoundsRequest request) {
		return request.getSizeDelta().height != 0 || request.getSizeDelta().width != 0;
	}
}
