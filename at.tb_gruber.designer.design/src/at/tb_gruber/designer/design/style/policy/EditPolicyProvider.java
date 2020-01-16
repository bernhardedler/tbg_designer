package at.tb_gruber.designer.design.style.policy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.editpolicy.EditPolicyService;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartmentEditPart;

import at.tb_gruber.designer.design.style.AnlageStyleEditPart;

public class EditPolicyProvider implements IEditPolicyProvider {

	@Override
	public void createEditPolicies(EditPart editPart) {
		if (editPart instanceof DNodeContainerViewNodeContainerCompartmentEditPart) {
			editPart.removeEditPolicy(EditPolicy.LAYOUT_ROLE);
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new FixedSizeEditPolicy());
		}
	}

	@Override
	public void addProviderChangeListener(IProviderChangeListener listener) {
		EditPolicyService.getInstance().addProviderChangeListener(listener);
	}

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			return true;
		}
		return false;
	}

	@Override
	public void removeProviderChangeListener(IProviderChangeListener listener) {
		EditPolicyService.getInstance().removeProviderChangeListener(listener);
	}

}
