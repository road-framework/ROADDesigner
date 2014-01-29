package au.edu.swin.ict.road.designer.smc.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;

/**
 * @generated
 */
public class FactLink2ItemSemanticEditPolicy extends
		SmcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FactLink2ItemSemanticEditPolicy() {
		super(SmcElementTypes.FactLink_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
