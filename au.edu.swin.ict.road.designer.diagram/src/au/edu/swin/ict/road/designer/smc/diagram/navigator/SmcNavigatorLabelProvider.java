package au.edu.swin.ict.road.designer.smc.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.PlayerBinding;
import au.edu.swin.ict.road.designer.smc.System;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractNameEditPart;
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
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SMCNameEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SystemEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabel2EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabel3EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabelEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcDiagramEditorPlugin;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry;
import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;
import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcParserProvider;

/**
 * @generated
 */
public class SmcNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SmcDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SmcDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SmcNavigatorItem
				&& !isOwnView(((SmcNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SmcNavigatorGroup) {
			SmcNavigatorGroup group = (SmcNavigatorGroup) element;
			return SmcDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SmcNavigatorItem) {
			SmcNavigatorItem navigatorItem = (SmcNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SmcVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://smc/1.0?System", SmcElementTypes.System_1000); //$NON-NLS-1$
		case SMCEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://smc/1.0?SMC", SmcElementTypes.SMC_2001); //$NON-NLS-1$
		case PlayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://smc/1.0?Player", SmcElementTypes.Player_2002); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://smc/1.0?Role", SmcElementTypes.Role_3001); //$NON-NLS-1$
		case ContractEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://smc/1.0?Contract", SmcElementTypes.Contract_3002); //$NON-NLS-1$
		case FactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://smc/1.0?Fact", SmcElementTypes.Fact_3003); //$NON-NLS-1$
		case ContractRoleAIDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://smc/1.0?Contract?RoleAID", SmcElementTypes.ContractRoleAID_4001); //$NON-NLS-1$
		case ContractRoleBIDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://smc/1.0?Contract?RoleBID", SmcElementTypes.ContractRoleBID_4002); //$NON-NLS-1$
		case FactLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://smc/1.0?FactLink", SmcElementTypes.FactLink_4003); //$NON-NLS-1$
		case FactLink2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://smc/1.0?FactLink", SmcElementTypes.FactLink_4006); //$NON-NLS-1$
		case PlayerBindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://smc/1.0?PlayerBinding", SmcElementTypes.PlayerBinding_4004); //$NON-NLS-1$
		case ExternalFactLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://smc/1.0?ExternalFactLink", SmcElementTypes.ExternalFactLink_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SmcDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SmcElementTypes.isKnownElementType(elementType)) {
			image = SmcElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SmcNavigatorGroup) {
			SmcNavigatorGroup group = (SmcNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SmcNavigatorItem) {
			SmcNavigatorItem navigatorItem = (SmcNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SmcVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case SMCEditPart.VISUAL_ID:
			return getSMC_2001Text(view);
		case PlayerEditPart.VISUAL_ID:
			return getPlayer_2002Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3001Text(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_3002Text(view);
		case FactEditPart.VISUAL_ID:
			return getFact_3003Text(view);
		case ContractRoleAIDEditPart.VISUAL_ID:
			return getContractRoleAID_4001Text(view);
		case ContractRoleBIDEditPart.VISUAL_ID:
			return getContractRoleBID_4002Text(view);
		case FactLinkEditPart.VISUAL_ID:
			return getFactLink_4003Text(view);
		case FactLink2EditPart.VISUAL_ID:
			return getFactLink_4006Text(view);
		case PlayerBindingEditPart.VISUAL_ID:
			return getPlayerBinding_4004Text(view);
		case ExternalFactLinkEditPart.VISUAL_ID:
			return getExternalFactLink_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		System domainModelElement = (System) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSMC_2001Text(View view) {
		IParser parser = SmcParserProvider.getParser(SmcElementTypes.SMC_2001,
				view.getElement() != null ? view.getElement() : view,
				SmcVisualIDRegistry.getType(SMCNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlayer_2002Text(View view) {
		IParser parser = SmcParserProvider.getParser(
				SmcElementTypes.Player_2002, view.getElement() != null ? view
						.getElement() : view, SmcVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_3001Text(View view) {
		IParser parser = SmcParserProvider.getParser(SmcElementTypes.Role_3001,
				view.getElement() != null ? view.getElement() : view,
				SmcVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContract_3002Text(View view) {
		IParser parser = SmcParserProvider.getParser(
				SmcElementTypes.Contract_3002, view.getElement() != null ? view
						.getElement() : view, SmcVisualIDRegistry
						.getType(ContractNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFact_3003Text(View view) {
		IParser parser = SmcParserProvider.getParser(SmcElementTypes.Fact_3003,
				view.getElement() != null ? view.getElement() : view,
				SmcVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContractRoleAID_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContractRoleBID_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFactLink_4003Text(View view) {
		FactLink domainModelElement = (FactLink) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMonitorFact());
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFactLink_4006Text(View view) {
		FactLink domainModelElement = (FactLink) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMonitorFact());
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlayerBinding_4004Text(View view) {
		PlayerBinding domainModelElement = (PlayerBinding) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalFactLink_4005Text(View view) {
		ExternalFactLink domainModelElement = (ExternalFactLink) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SmcDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SystemEditPart.MODEL_ID.equals(SmcVisualIDRegistry
				.getModelID(view));
	}

}
