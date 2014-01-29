package au.edu.swin.ict.road.designer.smc.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.System;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractNameEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ExternalFactLinkEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLink2EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLinkEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.PlayerBindingEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.PlayerEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.RoleEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SMCEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SMCNameEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SMCSMCCompartmentEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SystemEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabel2EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabel3EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabelEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.expressions.SmcAbstractExpression;
import au.edu.swin.ict.road.designer.smc.diagram.expressions.SmcOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SmcVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "au.edu.swin.ict.road.designer.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static SmcAbstractExpression FactLink_4003_Constraint;
	/**
	 * @generated
	 */
	private static SmcAbstractExpression FactLink_4006_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemEditPart.MODEL_ID.equals(view.getType())) {
				return SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SmcDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SmcPackage.eINSTANCE.getSystem().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((System) domainElement)) {
			return SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SMCSMCCompartmentEditPart.VISUAL_ID:
			if (SmcPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (SmcPackage.eINSTANCE.getContract().isSuperTypeOf(
					domainElement.eClass())) {
				return ContractEditPart.VISUAL_ID;
			}
			if (SmcPackage.eINSTANCE.getFact().isSuperTypeOf(
					domainElement.eClass())) {
				return FactEditPart.VISUAL_ID;
			}
			break;
		case SystemEditPart.VISUAL_ID:
			if (SmcPackage.eINSTANCE.getSMC().isSuperTypeOf(
					domainElement.eClass())) {
				return SMCEditPart.VISUAL_ID;
			}
			if (SmcPackage.eINSTANCE.getPlayer().isSuperTypeOf(
					domainElement.eClass())) {
				return PlayerEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SMCEditPart.VISUAL_ID:
			if (SMCNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SMCSMCCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlayerEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractEditPart.VISUAL_ID:
			if (ContractNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FactEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SMCSMCCompartmentEditPart.VISUAL_ID:
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemEditPart.VISUAL_ID:
			if (SMCEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlayerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SmcPackage.eINSTANCE.getFactLink().isSuperTypeOf(
				domainElement.eClass())
				&& isFactLink_4003((FactLink) domainElement)) {
			return FactLinkEditPart.VISUAL_ID;
		}
		if (SmcPackage.eINSTANCE.getFactLink().isSuperTypeOf(
				domainElement.eClass())
				&& isFactLink_4006((FactLink) domainElement)) {
			return FactLink2EditPart.VISUAL_ID;
		}
		if (SmcPackage.eINSTANCE.getPlayerBinding().isSuperTypeOf(
				domainElement.eClass())) {
			return PlayerBindingEditPart.VISUAL_ID;
		}
		if (SmcPackage.eINSTANCE.getExternalFactLink().isSuperTypeOf(
				domainElement.eClass())) {
			return ExternalFactLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(System element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isFactLink_4003(FactLink domainElement) {
		if (FactLink_4003_Constraint == null) { // lazy initialization
			FactLink_4003_Constraint = SmcOCLFactory.getExpression(
					"self.MonitorFact", SmcPackage.eINSTANCE.getFactLink()); //$NON-NLS-1$
		}
		Object result = FactLink_4003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFactLink_4006(FactLink domainElement) {
		if (FactLink_4006_Constraint == null) { // lazy initialization
			FactLink_4006_Constraint = SmcOCLFactory.getExpression(
					"not self.MonitorFact", SmcPackage.eINSTANCE.getFactLink()); //$NON-NLS-1$
		}
		Object result = FactLink_4006_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
