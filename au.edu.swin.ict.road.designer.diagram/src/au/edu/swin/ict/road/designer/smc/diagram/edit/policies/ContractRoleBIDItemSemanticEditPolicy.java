package au.edu.swin.ict.road.designer.smc.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;

/**
 * @generated
 */
public class ContractRoleBIDItemSemanticEditPolicy extends
		SmcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContractRoleBIDItemSemanticEditPolicy() {
		super(SmcElementTypes.ContractRoleBID_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
