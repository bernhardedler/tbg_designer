package at.tb_gruber.designer.gmf.editpolicy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDDiagramEditPart;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.LaunchBehaviorToolEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.RefreshSiriusElementEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.RevealElementsEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.RevealSelectedElementsEditPolicy;
import org.eclipse.sirius.diagram.ui.tools.api.policy.CompoundEditPolicy;

public class TBGEditPolicyProvider implements IEditPolicyProvider {

	@Override
	public void addProviderChangeListener(IProviderChangeListener listener) {
	}

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			CreateEditPoliciesOperation cepo = (CreateEditPoliciesOperation) operation;
			if (cepo.getEditPart() instanceof AbstractDDiagramEditPart) {
				return true;
			}			
		}
		return false;
	}

	@Override
	public void removeProviderChangeListener(IProviderChangeListener listener) {

	}

	/**
	 * @see org.eclipse.sirius.diagram.ui.internal.edit.parts.DDiagramEditPart.createDefaultEditPolicies()
	 * TBGResetOriginPolicy eingebracht, COMPONENT_ROLE entfernt, sonst greift ResetOriginEditPolicy
	 */
	@Override
	public void createEditPolicies(EditPart editPart) {
        final CompoundEditPolicy compoundEditPolicy = new CompoundEditPolicy();
		compoundEditPolicy.addEditPolicy(new RefreshSiriusElementEditPolicy());
        compoundEditPolicy.addEditPolicy(new RevealElementsEditPolicy());
        compoundEditPolicy.addEditPolicy(new RevealSelectedElementsEditPolicy());
        compoundEditPolicy.addEditPolicy(new LaunchBehaviorToolEditPolicy());
        compoundEditPolicy.addEditPolicy(new TBGResetOriginPolicy());
        if (editPart.getEditPolicy(EditPolicy.COMPONENT_ROLE) != null) {
            editPart.removeEditPolicy(EditPolicy.COMPONENT_ROLE);
        }
        editPart.installEditPolicy(EditPolicy.COMPONENT_ROLE, compoundEditPolicy);
	}

}
