package au.edu.swin.ict.road.designer.smc.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import au.edu.swin.ict.road.designer.smc.diagram.providers.SmcElementTypes;

/**
 * @generated
 */
public class SmcPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNode1Group());
		paletteRoot.add(createConnection2Group());
	}

	/**
	 * Creates "Node" palette tool group
	 * @generated
	 */
	private PaletteContainer createNode1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Node1Group_title);
		paletteContainer.setId("createNode1Group"); //$NON-NLS-1$
		paletteContainer.add(createSMC1CreationTool());
		paletteContainer.add(createRole2CreationTool());
		paletteContainer.add(createContract3CreationTool());
		paletteContainer.add(createFact4CreationTool());
		paletteContainer.add(createPlayer5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connection" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnection2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connection2Group_title);
		paletteContainer.setId("createConnection2Group"); //$NON-NLS-1$
		paletteContainer.add(createContractRoleA1CreationTool());
		paletteContainer.add(createContractRoleB2CreationTool());
		paletteContainer.add(createPlayerBinding3CreationTool());
		paletteContainer.add(createFactLink4CreationTool());
		paletteContainer.add(createExternalFactLink5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSMC1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.SMC_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SMC1CreationTool_title,
				Messages.SMC1CreationTool_desc, types);
		entry.setId("createSMC1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.SMC_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.Role_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role2CreationTool_title,
				Messages.Role2CreationTool_desc, types);
		entry.setId("createRole2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.Role_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContract3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.Contract_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Contract3CreationTool_title,
				Messages.Contract3CreationTool_desc, types);
		entry.setId("createContract3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.Contract_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFact4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.Fact_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Fact4CreationTool_title,
				Messages.Fact4CreationTool_desc, types);
		entry.setId("createFact4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.Fact_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlayer5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.Player_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Player5CreationTool_title,
				Messages.Player5CreationTool_desc, types);
		entry.setId("createPlayer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.Player_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContractRoleA1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.ContractRoleAID_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ContractRoleA1CreationTool_title,
				Messages.ContractRoleA1CreationTool_desc, types);
		entry.setId("createContractRoleA1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(SmcDiagramEditorPlugin
						.findImageDescriptor("/au.edu.swin.ict.road.designer.edit/icons/full/obj16/ContractRole.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContractRoleB2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.ContractRoleBID_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ContractRoleB2CreationTool_title,
				Messages.ContractRoleB2CreationTool_desc, types);
		entry.setId("createContractRoleB2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(SmcDiagramEditorPlugin
						.findImageDescriptor("/au.edu.swin.ict.road.designer.edit/icons/full/obj16/ContractRole.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlayerBinding3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.PlayerBinding_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PlayerBinding3CreationTool_title,
				Messages.PlayerBinding3CreationTool_desc, types);
		entry.setId("createPlayerBinding3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.PlayerBinding_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFactLink4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(SmcElementTypes.FactLink_4003);
		types.add(SmcElementTypes.FactLink_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FactLink4CreationTool_title,
				Messages.FactLink4CreationTool_desc, types);
		entry.setId("createFactLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.FactLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalFactLink5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(SmcElementTypes.ExternalFactLink_4005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExternalFactLink5CreationTool_title,
				Messages.ExternalFactLink5CreationTool_desc, types);
		entry.setId("createExternalFactLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmcElementTypes
				.getImageDescriptor(SmcElementTypes.ExternalFactLink_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
