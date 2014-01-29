package au.edu.swin.ict.road.designer.smc.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.ContractRoleAIDCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.ContractRoleAIDReorientCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.ContractRoleBIDCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.ContractRoleBIDReorientCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLink2CreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLink2ReorientCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLinkCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLinkReorientCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractRoleAIDEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractRoleBIDEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLink2EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLinkEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry;
import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;

/**
 * @generated
 */
public class ContractItemSemanticEditPolicy extends
		SmcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContractItemSemanticEditPolicy() {
		super(SmcElementTypes.Contract_3002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (SmcVisualIDRegistry.getVisualID(outgoingLink) == ContractRoleAIDEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SmcVisualIDRegistry.getVisualID(outgoingLink) == ContractRoleBIDEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SmcVisualIDRegistry.getVisualID(outgoingLink) == FactLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SmcVisualIDRegistry.getVisualID(outgoingLink) == FactLink2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SmcElementTypes.ContractRoleAID_4001 == req.getElementType()) {
			return getGEFWrapper(new ContractRoleAIDCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (SmcElementTypes.ContractRoleBID_4002 == req.getElementType()) {
			return getGEFWrapper(new ContractRoleBIDCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (SmcElementTypes.FactLink_4003 == req.getElementType()) {
			return getGEFWrapper(new FactLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (SmcElementTypes.FactLink_4006 == req.getElementType()) {
			return getGEFWrapper(new FactLink2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SmcElementTypes.ContractRoleAID_4001 == req.getElementType()) {
			return null;
		}
		if (SmcElementTypes.ContractRoleBID_4002 == req.getElementType()) {
			return null;
		}
		if (SmcElementTypes.FactLink_4003 == req.getElementType()) {
			return null;
		}
		if (SmcElementTypes.FactLink_4006 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case FactLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new FactLinkReorientCommand(req));
		case FactLink2EditPart.VISUAL_ID:
			return getGEFWrapper(new FactLink2ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ContractRoleAIDEditPart.VISUAL_ID:
			return getGEFWrapper(new ContractRoleAIDReorientCommand(req));
		case ContractRoleBIDEditPart.VISUAL_ID:
			return getGEFWrapper(new ContractRoleBIDReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
