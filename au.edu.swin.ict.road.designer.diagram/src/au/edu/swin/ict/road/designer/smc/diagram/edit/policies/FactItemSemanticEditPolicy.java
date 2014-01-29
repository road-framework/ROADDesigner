package au.edu.swin.ict.road.designer.smc.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.ExternalFactLinkCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.ExternalFactLinkReorientCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLink2CreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLink2ReorientCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLinkCreateCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.commands.FactLinkReorientCommand;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ExternalFactLinkEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLink2EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLinkEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry;
import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;

/**
 * @generated
 */
public class FactItemSemanticEditPolicy extends SmcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FactItemSemanticEditPolicy() {
		super(SmcElementTypes.Fact_3003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (SmcVisualIDRegistry.getVisualID(incomingLink) == FactLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SmcVisualIDRegistry.getVisualID(incomingLink) == FactLink2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SmcVisualIDRegistry.getVisualID(incomingLink) == ExternalFactLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
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
		if (SmcElementTypes.FactLink_4003 == req.getElementType()) {
			return null;
		}
		if (SmcElementTypes.FactLink_4006 == req.getElementType()) {
			return null;
		}
		if (SmcElementTypes.ExternalFactLink_4005 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SmcElementTypes.FactLink_4003 == req.getElementType()) {
			return getGEFWrapper(new FactLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (SmcElementTypes.FactLink_4006 == req.getElementType()) {
			return getGEFWrapper(new FactLink2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (SmcElementTypes.ExternalFactLink_4005 == req.getElementType()) {
			return getGEFWrapper(new ExternalFactLinkCreateCommand(req, req
					.getSource(), req.getTarget()));
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
		case ExternalFactLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new ExternalFactLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
