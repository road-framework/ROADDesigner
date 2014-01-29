package au.edu.swin.ict.road.designer.smc.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import au.edu.swin.ict.road.designer.smc.SmcPackage;
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
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SystemEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcDiagramEditorPlugin;

/**
 * @generated
 */
public class SmcElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private SmcElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType System_1000 = getElementType("au.edu.swin.ict.road.designer.diagram.System_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SMC_2001 = getElementType("au.edu.swin.ict.road.designer.diagram.SMC_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Player_2002 = getElementType("au.edu.swin.ict.road.designer.diagram.Player_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_3001 = getElementType("au.edu.swin.ict.road.designer.diagram.Role_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Contract_3002 = getElementType("au.edu.swin.ict.road.designer.diagram.Contract_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fact_3003 = getElementType("au.edu.swin.ict.road.designer.diagram.Fact_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContractRoleAID_4001 = getElementType("au.edu.swin.ict.road.designer.diagram.ContractRoleAID_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContractRoleBID_4002 = getElementType("au.edu.swin.ict.road.designer.diagram.ContractRoleBID_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FactLink_4003 = getElementType("au.edu.swin.ict.road.designer.diagram.FactLink_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FactLink_4006 = getElementType("au.edu.swin.ict.road.designer.diagram.FactLink_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PlayerBinding_4004 = getElementType("au.edu.swin.ict.road.designer.diagram.PlayerBinding_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExternalFactLink_4005 = getElementType("au.edu.swin.ict.road.designer.diagram.ExternalFactLink_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return SmcDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(System_1000, SmcPackage.eINSTANCE.getSystem());

			elements.put(SMC_2001, SmcPackage.eINSTANCE.getSMC());

			elements.put(Player_2002, SmcPackage.eINSTANCE.getPlayer());

			elements.put(Role_3001, SmcPackage.eINSTANCE.getRole());

			elements.put(Contract_3002, SmcPackage.eINSTANCE.getContract());

			elements.put(Fact_3003, SmcPackage.eINSTANCE.getFact());

			elements.put(ContractRoleAID_4001, SmcPackage.eINSTANCE
					.getContract_RoleAID());

			elements.put(ContractRoleBID_4002, SmcPackage.eINSTANCE
					.getContract_RoleBID());

			elements.put(FactLink_4003, SmcPackage.eINSTANCE.getFactLink());

			elements.put(FactLink_4006, SmcPackage.eINSTANCE.getFactLink());

			elements.put(PlayerBinding_4004, SmcPackage.eINSTANCE
					.getPlayerBinding());

			elements.put(ExternalFactLink_4005, SmcPackage.eINSTANCE
					.getExternalFactLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(System_1000);
			KNOWN_ELEMENT_TYPES.add(SMC_2001);
			KNOWN_ELEMENT_TYPES.add(Player_2002);
			KNOWN_ELEMENT_TYPES.add(Role_3001);
			KNOWN_ELEMENT_TYPES.add(Contract_3002);
			KNOWN_ELEMENT_TYPES.add(Fact_3003);
			KNOWN_ELEMENT_TYPES.add(ContractRoleAID_4001);
			KNOWN_ELEMENT_TYPES.add(ContractRoleBID_4002);
			KNOWN_ELEMENT_TYPES.add(FactLink_4003);
			KNOWN_ELEMENT_TYPES.add(FactLink_4006);
			KNOWN_ELEMENT_TYPES.add(PlayerBinding_4004);
			KNOWN_ELEMENT_TYPES.add(ExternalFactLink_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return System_1000;
		case SMCEditPart.VISUAL_ID:
			return SMC_2001;
		case PlayerEditPart.VISUAL_ID:
			return Player_2002;
		case RoleEditPart.VISUAL_ID:
			return Role_3001;
		case ContractEditPart.VISUAL_ID:
			return Contract_3002;
		case FactEditPart.VISUAL_ID:
			return Fact_3003;
		case ContractRoleAIDEditPart.VISUAL_ID:
			return ContractRoleAID_4001;
		case ContractRoleBIDEditPart.VISUAL_ID:
			return ContractRoleBID_4002;
		case FactLinkEditPart.VISUAL_ID:
			return FactLink_4003;
		case FactLink2EditPart.VISUAL_ID:
			return FactLink_4006;
		case PlayerBindingEditPart.VISUAL_ID:
			return PlayerBinding_4004;
		case ExternalFactLinkEditPart.VISUAL_ID:
			return ExternalFactLink_4005;
		}
		return null;
	}

}
