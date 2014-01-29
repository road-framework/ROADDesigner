package au.edu.swin.ict.road.designer.smc.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import au.edu.swin.ict.road.designer.smc.Player;
import au.edu.swin.ict.road.designer.smc.PlayerBinding;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.diagram.edit.policies.SmcBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PlayerBindingReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public PlayerBindingReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PlayerBinding) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Role && newEnd instanceof Role)) {
			return false;
		}
		Player target = getLink().getPlayer();
		if (!(getLink().eContainer() instanceof au.edu.swin.ict.road.designer.smc.SMC)) {
			return false;
		}
		au.edu.swin.ict.road.designer.smc.SMC container = (au.edu.swin.ict.road.designer.smc.SMC) getLink()
				.eContainer();
		return SmcBaseItemSemanticEditPolicy.LinkConstraints
				.canExistPlayerBinding_4004(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Player && newEnd instanceof Player)) {
			return false;
		}
		Role source = getLink().getRole();
		if (!(getLink().eContainer() instanceof au.edu.swin.ict.road.designer.smc.SMC)) {
			return false;
		}
		au.edu.swin.ict.road.designer.smc.SMC container = (au.edu.swin.ict.road.designer.smc.SMC) getLink()
				.eContainer();
		return SmcBaseItemSemanticEditPolicy.LinkConstraints
				.canExistPlayerBinding_4004(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setRole(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setPlayer(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected PlayerBinding getLink() {
		return (PlayerBinding) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Role getOldSource() {
		return (Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Role getNewSource() {
		return (Role) newEnd;
	}

	/**
	 * @generated
	 */
	protected Player getOldTarget() {
		return (Player) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Player getNewTarget() {
		return (Player) newEnd;
	}
}
