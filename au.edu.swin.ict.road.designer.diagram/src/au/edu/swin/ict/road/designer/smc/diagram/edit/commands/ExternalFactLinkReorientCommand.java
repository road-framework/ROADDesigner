package au.edu.swin.ict.road.designer.smc.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.diagram.edit.policies.SmcBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExternalFactLinkReorientCommand extends EditElementCommand {

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
	public ExternalFactLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ExternalFactLink) {
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
		Fact target = getLink().getFact();
		return SmcBaseItemSemanticEditPolicy.LinkConstraints
				.canExistExternalFactLink_4005(getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Fact && newEnd instanceof Fact)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Role)) {
			return false;
		}
		Role source = (Role) getLink().eContainer();
		return SmcBaseItemSemanticEditPolicy.LinkConstraints
				.canExistExternalFactLink_4005(source, getNewTarget());
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
		getOldSource().getExternalFactLink().remove(getLink());
		getNewSource().getExternalFactLink().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setFact(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ExternalFactLink getLink() {
		return (ExternalFactLink) getElementToEdit();
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
	protected Fact getOldTarget() {
		return (Fact) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Fact getNewTarget() {
		return (Fact) newEnd;
	}
}
