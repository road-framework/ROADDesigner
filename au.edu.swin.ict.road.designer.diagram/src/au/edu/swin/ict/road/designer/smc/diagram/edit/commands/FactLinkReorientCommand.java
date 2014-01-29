package au.edu.swin.ict.road.designer.smc.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.FactAccessor;
import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.diagram.edit.policies.SmcBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class FactLinkReorientCommand extends EditElementCommand {

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
	public FactLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof FactLink) {
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
		if (!(oldEnd instanceof FactAccessor && newEnd instanceof FactAccessor)) {
			return false;
		}
		Fact target = getLink().getFact();
		return SmcBaseItemSemanticEditPolicy.LinkConstraints
				.canExistFactLink_4003(getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Fact && newEnd instanceof Fact)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof FactAccessor)) {
			return false;
		}
		FactAccessor source = (FactAccessor) getLink().eContainer();
		return SmcBaseItemSemanticEditPolicy.LinkConstraints
				.canExistFactLink_4003(source, getNewTarget());
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
		getOldSource().getFactLink().remove(getLink());
		getNewSource().getFactLink().add(getLink());
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
	protected FactLink getLink() {
		return (FactLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected FactAccessor getOldSource() {
		return (FactAccessor) oldEnd;
	}

	/**
	 * @generated
	 */
	protected FactAccessor getNewSource() {
		return (FactAccessor) newEnd;
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
