package au.edu.swin.ict.road.designer.smc.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.FactAccessor;
import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.Player;
import au.edu.swin.ict.road.designer.smc.PlayerBinding;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.System;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractRoleAIDEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractRoleBIDEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ExternalFactLinkEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLink2EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.FactLinkEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.PlayerBindingEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.PlayerEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.RoleEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SMCEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SMCSMCCompartmentEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SystemEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;

/**
 * @generated
 */
public class SmcDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (SmcVisualIDRegistry.getVisualID(view)) {
		case SMCSMCCompartmentEditPart.VISUAL_ID:
			return getSMCSMCCompartment_7001SemanticChildren(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSMCSMCCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		au.edu.swin.ict.road.designer.smc.SMC modelElement = (au.edu.swin.ict.road.designer.smc.SMC) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getRole().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = SmcVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new SmcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getContract().iterator(); it.hasNext();) {
			Contract childElement = (Contract) it.next();
			int visualID = SmcVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContractEditPart.VISUAL_ID) {
				result.add(new SmcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFact().iterator(); it.hasNext();) {
			Fact childElement = (Fact) it.next();
			int visualID = SmcVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FactEditPart.VISUAL_ID) {
				result.add(new SmcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSystem_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		System modelElement = (System) view.getElement();
		List result = new LinkedList();
		{
			au.edu.swin.ict.road.designer.smc.SMC childElement = modelElement
					.getSmc();
			int visualID = SmcVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SMCEditPart.VISUAL_ID) {
				result.add(new SmcNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getPlayer().iterator(); it.hasNext();) {
			Player childElement = (Player) it.next();
			int visualID = SmcVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PlayerEditPart.VISUAL_ID) {
				result.add(new SmcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (SmcVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case SMCEditPart.VISUAL_ID:
			return getSMC_2001ContainedLinks(view);
		case PlayerEditPart.VISUAL_ID:
			return getPlayer_2002ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3001ContainedLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_3002ContainedLinks(view);
		case FactEditPart.VISUAL_ID:
			return getFact_3003ContainedLinks(view);
		case FactLinkEditPart.VISUAL_ID:
			return getFactLink_4003ContainedLinks(view);
		case FactLink2EditPart.VISUAL_ID:
			return getFactLink_4006ContainedLinks(view);
		case PlayerBindingEditPart.VISUAL_ID:
			return getPlayerBinding_4004ContainedLinks(view);
		case ExternalFactLinkEditPart.VISUAL_ID:
			return getExternalFactLink_4005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (SmcVisualIDRegistry.getVisualID(view)) {
		case SMCEditPart.VISUAL_ID:
			return getSMC_2001IncomingLinks(view);
		case PlayerEditPart.VISUAL_ID:
			return getPlayer_2002IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3001IncomingLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_3002IncomingLinks(view);
		case FactEditPart.VISUAL_ID:
			return getFact_3003IncomingLinks(view);
		case FactLinkEditPart.VISUAL_ID:
			return getFactLink_4003IncomingLinks(view);
		case FactLink2EditPart.VISUAL_ID:
			return getFactLink_4006IncomingLinks(view);
		case PlayerBindingEditPart.VISUAL_ID:
			return getPlayerBinding_4004IncomingLinks(view);
		case ExternalFactLinkEditPart.VISUAL_ID:
			return getExternalFactLink_4005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (SmcVisualIDRegistry.getVisualID(view)) {
		case SMCEditPart.VISUAL_ID:
			return getSMC_2001OutgoingLinks(view);
		case PlayerEditPart.VISUAL_ID:
			return getPlayer_2002OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3001OutgoingLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_3002OutgoingLinks(view);
		case FactEditPart.VISUAL_ID:
			return getFact_3003OutgoingLinks(view);
		case FactLinkEditPart.VISUAL_ID:
			return getFactLink_4003OutgoingLinks(view);
		case FactLink2EditPart.VISUAL_ID:
			return getFactLink_4006OutgoingLinks(view);
		case PlayerBindingEditPart.VISUAL_ID:
			return getPlayerBinding_4004OutgoingLinks(view);
		case ExternalFactLinkEditPart.VISUAL_ID:
			return getExternalFactLink_4005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSystem_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSMC_2001ContainedLinks(View view) {
		au.edu.swin.ict.road.designer.smc.SMC modelElement = (au.edu.swin.ict.road.designer.smc.SMC) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_PlayerBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlayer_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_3001ContainedLinks(View view) {
		Role modelElement = (Role) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4006(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ExternalFactLink_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContract_3002ContainedLinks(View view) {
		Contract modelElement = (Contract) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Contract_RoleAID_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Contract_RoleBID_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFact_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFactLink_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFactLink_4006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlayerBinding_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExternalFactLink_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSMC_2001IncomingLinks(View view) {
		au.edu.swin.ict.road.designer.smc.SMC modelElement = (au.edu.swin.ict.road.designer.smc.SMC) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_PlayerBinding_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlayer_2002IncomingLinks(View view) {
		Player modelElement = (Player) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_PlayerBinding_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_3001IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Contract_RoleAID_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Contract_RoleBID_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContract_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFact_3003IncomingLinks(View view) {
		Fact modelElement = (Fact) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_FactLink_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_FactLink_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalFactLink_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFactLink_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFactLink_4006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlayerBinding_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExternalFactLink_4005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSMC_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlayer_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_3001OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_PlayerBinding_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ExternalFactLink_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContract_3002OutgoingLinks(View view) {
		Contract modelElement = (Contract) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Contract_RoleAID_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Contract_RoleBID_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_FactLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFact_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFactLink_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFactLink_4006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlayerBinding_4004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExternalFactLink_4005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_FactLink_4003(
			FactAccessor container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getFactLink().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FactLink) {
				continue;
			}
			FactLink link = (FactLink) linkObject;
			if (FactLinkEditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Fact dst = link.getFact();
			result.add(new SmcLinkDescriptor(container, dst, link,
					SmcElementTypes.FactLink_4003, FactLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_FactLink_4006(
			FactAccessor container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getFactLink().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FactLink) {
				continue;
			}
			FactLink link = (FactLink) linkObject;
			if (FactLink2EditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Fact dst = link.getFact();
			result
					.add(new SmcLinkDescriptor(container, dst, link,
							SmcElementTypes.FactLink_4006,
							FactLink2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_PlayerBinding_4004(
			au.edu.swin.ict.road.designer.smc.SMC container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getPlayerBinding().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PlayerBinding) {
				continue;
			}
			PlayerBinding link = (PlayerBinding) linkObject;
			if (PlayerBindingEditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Player dst = link.getPlayer();
			Role src = link.getRole();
			result.add(new SmcLinkDescriptor(src, dst, link,
					SmcElementTypes.PlayerBinding_4004,
					PlayerBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ExternalFactLink_4005(
			Role container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getExternalFactLink().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalFactLink) {
				continue;
			}
			ExternalFactLink link = (ExternalFactLink) linkObject;
			if (ExternalFactLinkEditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Fact dst = link.getFact();
			result.add(new SmcLinkDescriptor(container, dst, link,
					SmcElementTypes.ExternalFactLink_4005,
					ExternalFactLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Contract_RoleAID_4001(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == SmcPackage.eINSTANCE
					.getContract_RoleAID()) {
				result.add(new SmcLinkDescriptor(setting.getEObject(), target,
						SmcElementTypes.ContractRoleAID_4001,
						ContractRoleAIDEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Contract_RoleBID_4002(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == SmcPackage.eINSTANCE
					.getContract_RoleBID()) {
				result.add(new SmcLinkDescriptor(setting.getEObject(), target,
						SmcElementTypes.ContractRoleBID_4002,
						ContractRoleBIDEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_FactLink_4003(
			Fact target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != SmcPackage.eINSTANCE
					.getFactLink_Fact()
					|| false == setting.getEObject() instanceof FactLink) {
				continue;
			}
			FactLink link = (FactLink) setting.getEObject();
			if (FactLinkEditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof FactAccessor) {
				continue;
			}
			FactAccessor container = (FactAccessor) link.eContainer();
			result.add(new SmcLinkDescriptor(container, target, link,
					SmcElementTypes.FactLink_4003, FactLinkEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_FactLink_4006(
			Fact target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != SmcPackage.eINSTANCE
					.getFactLink_Fact()
					|| false == setting.getEObject() instanceof FactLink) {
				continue;
			}
			FactLink link = (FactLink) setting.getEObject();
			if (FactLink2EditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof FactAccessor) {
				continue;
			}
			FactAccessor container = (FactAccessor) link.eContainer();
			result
					.add(new SmcLinkDescriptor(container, target, link,
							SmcElementTypes.FactLink_4006,
							FactLink2EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_PlayerBinding_4004(
			Player target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != SmcPackage.eINSTANCE
					.getPlayerBinding_Player()
					|| false == setting.getEObject() instanceof PlayerBinding) {
				continue;
			}
			PlayerBinding link = (PlayerBinding) setting.getEObject();
			if (PlayerBindingEditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role src = link.getRole();
			result.add(new SmcLinkDescriptor(src, target, link,
					SmcElementTypes.PlayerBinding_4004,
					PlayerBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ExternalFactLink_4005(
			Fact target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != SmcPackage.eINSTANCE
					.getExternalFactLink_Fact()
					|| false == setting.getEObject() instanceof ExternalFactLink) {
				continue;
			}
			ExternalFactLink link = (ExternalFactLink) setting.getEObject();
			if (ExternalFactLinkEditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Role) {
				continue;
			}
			Role container = (Role) link.eContainer();
			result.add(new SmcLinkDescriptor(container, target, link,
					SmcElementTypes.ExternalFactLink_4005,
					ExternalFactLinkEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Contract_RoleAID_4001(
			Contract source) {
		Collection result = new LinkedList();
		Role destination = source.getRoleAID();
		if (destination == null) {
			return result;
		}
		result.add(new SmcLinkDescriptor(source, destination,
				SmcElementTypes.ContractRoleAID_4001,
				ContractRoleAIDEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Contract_RoleBID_4002(
			Contract source) {
		Collection result = new LinkedList();
		Role destination = source.getRoleBID();
		if (destination == null) {
			return result;
		}
		result.add(new SmcLinkDescriptor(source, destination,
				SmcElementTypes.ContractRoleBID_4002,
				ContractRoleBIDEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_PlayerBinding_4004(
			Role source) {
		au.edu.swin.ict.road.designer.smc.SMC container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof au.edu.swin.ict.road.designer.smc.SMC) {
				container = (au.edu.swin.ict.road.designer.smc.SMC) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getPlayerBinding().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PlayerBinding) {
				continue;
			}
			PlayerBinding link = (PlayerBinding) linkObject;
			if (PlayerBindingEditPart.VISUAL_ID != SmcVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Player dst = link.getPlayer();
			Role src = link.getRole();
			if (src != source) {
				continue;
			}
			result.add(new SmcLinkDescriptor(src, dst, link,
					SmcElementTypes.PlayerBinding_4004,
					PlayerBindingEditPart.VISUAL_ID));
		}
		return result;
	}

}
