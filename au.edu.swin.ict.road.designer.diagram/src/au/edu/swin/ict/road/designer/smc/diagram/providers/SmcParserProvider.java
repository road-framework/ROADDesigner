package au.edu.swin.ict.road.designer.smc.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.ContractNameEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.SMCNameEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabel2EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabel3EditPart;
import au.edu.swin.ict.road.designer.smc.diagram.edit.parts.WrappingLabelEditPart;
import au.edu.swin.ict.road.designer.smc.diagram.parsers.MessageFormatParser;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry;

/**
 * @generated
 */
public class SmcParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser sMCName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSMCName_5003Parser() {
		if (sMCName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SmcPackage.eINSTANCE
					.getPlayer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sMCName_5003Parser = parser;
		}
		return sMCName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser playerName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPlayerName_5004Parser() {
		if (playerName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SmcPackage.eINSTANCE
					.getPlayer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			playerName_5004Parser = parser;
		}
		return playerName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleId_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRoleId_5001Parser() {
		if (roleId_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SmcPackage.eINSTANCE
					.getRole_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleId_5001Parser = parser;
		}
		return roleId_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser contractName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getContractName_5005Parser() {
		if (contractName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SmcPackage.eINSTANCE
					.getContract_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractName_5005Parser = parser;
		}
		return contractName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser factName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getFactName_5002Parser() {
		if (factName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SmcPackage.eINSTANCE
					.getFact_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			factName_5002Parser = parser;
		}
		return factName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SMCNameEditPart.VISUAL_ID:
			return getSMCName_5003Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getPlayerName_5004Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getRoleId_5001Parser();
		case ContractNameEditPart.VISUAL_ID:
			return getContractName_5005Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getFactName_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SmcVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SmcVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SmcElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
