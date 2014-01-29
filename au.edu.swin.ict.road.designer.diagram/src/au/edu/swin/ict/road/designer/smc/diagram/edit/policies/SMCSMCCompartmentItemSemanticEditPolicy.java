package au.edu.swin.ict.road.designer.smc.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.ContractCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.RoleCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;

/**
 * @generated
 */
public class SMCSMCCompartmentItemSemanticEditPolicy extends
		SmcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SMCSMCCompartmentItemSemanticEditPolicy() {
		super(SmcElementTypes.SMC_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SmcElementTypes.Role_3001 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (SmcElementTypes.Contract_3002 == req.getElementType()) {
			return getGEFWrapper(new ContractCreateCommand(req));
		}
		if (SmcElementTypes.Fact_3003 == req.getElementType()) {
			return getGEFWrapper(new FactCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
