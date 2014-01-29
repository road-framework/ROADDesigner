/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.AcquisitionRegime;
import au.edu.swin.ict.road.designer.smc.BehaviorTerm;
import au.edu.swin.ict.road.designer.smc.Constraint;
import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.DeonticType;
import au.edu.swin.ict.road.designer.smc.DirectionType;
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.FactAccessor;
import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.InMsg;
import au.edu.swin.ict.road.designer.smc.MessageAnalyzer;
import au.edu.swin.ict.road.designer.smc.MessageType;
import au.edu.swin.ict.road.designer.smc.Mode;
import au.edu.swin.ict.road.designer.smc.Operation;
import au.edu.swin.ict.road.designer.smc.OutMsg;
import au.edu.swin.ict.road.designer.smc.Parameter;
import au.edu.swin.ict.road.designer.smc.Player;
import au.edu.swin.ict.road.designer.smc.PlayerBinding;
import au.edu.swin.ict.road.designer.smc.ProcessDefinition;
import au.edu.swin.ict.road.designer.smc.ProvisionRegime;
import au.edu.swin.ict.road.designer.smc.ResultMsg;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.SMC;
import au.edu.swin.ict.road.designer.smc.SmcFactory;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.SrcMsg;
import au.edu.swin.ict.road.designer.smc.Task;
import au.edu.swin.ict.road.designer.smc.TaskRef;
import au.edu.swin.ict.road.designer.smc.Term;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmcFactoryImpl extends EFactoryImpl implements SmcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmcFactory init() {
		try {
			SmcFactory theSmcFactory = (SmcFactory)EPackage.Registry.INSTANCE.getEFactory("http://smc/1.0"); 
			if (theSmcFactory != null) {
				return theSmcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmcPackage.SMC: return createSMC();
			case SmcPackage.ROLE: return createRole();
			case SmcPackage.CONTRACT: return createContract();
			case SmcPackage.PROCESS_DEFINITION: return createProcessDefinition();
			case SmcPackage.BEHAVIOR_TERM: return createBehaviorTerm();
			case SmcPackage.PLAYER_BINDING: return createPlayerBinding();
			case SmcPackage.MESSAGE_ANALYZER: return createMessageAnalyzer();
			case SmcPackage.EXTERNAL_FACT_LINK: return createExternalFactLink();
			case SmcPackage.ACQUISITION_REGIME: return createAcquisitionRegime();
			case SmcPackage.PROVISION_REGIME: return createProvisionRegime();
			case SmcPackage.TASK: return createTask();
			case SmcPackage.IN_MSG: return createInMsg();
			case SmcPackage.PARAMETER: return createParameter();
			case SmcPackage.RESULT_MSG: return createResultMsg();
			case SmcPackage.OUT_MSG: return createOutMsg();
			case SmcPackage.TERM: return createTerm();
			case SmcPackage.OPERATION: return createOperation();
			case SmcPackage.CONSTRAINT: return createConstraint();
			case SmcPackage.TASK_REF: return createTaskRef();
			case SmcPackage.FACT: return createFact();
			case SmcPackage.SYSTEM: return createSystem();
			case SmcPackage.PLAYER: return createPlayer();
			case SmcPackage.FACT_LINK: return createFactLink();
			case SmcPackage.FACT_ACCESSOR: return createFactAccessor();
			case SmcPackage.SRC_MSG: return createSrcMsg();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmcPackage.MESSAGE_TYPE:
				return createMessageTypeFromString(eDataType, initialValue);
			case SmcPackage.DEONTIC_TYPE:
				return createDeonticTypeFromString(eDataType, initialValue);
			case SmcPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case SmcPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmcPackage.MESSAGE_TYPE:
				return convertMessageTypeToString(eDataType, instanceValue);
			case SmcPackage.DEONTIC_TYPE:
				return convertDeonticTypeToString(eDataType, instanceValue);
			case SmcPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case SmcPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMC createSMC() {
		SMCImpl smc = new SMCImpl();
		return smc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinition createProcessDefinition() {
		ProcessDefinitionImpl processDefinition = new ProcessDefinitionImpl();
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTerm createBehaviorTerm() {
		BehaviorTermImpl behaviorTerm = new BehaviorTermImpl();
		return behaviorTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerBinding createPlayerBinding() {
		PlayerBindingImpl playerBinding = new PlayerBindingImpl();
		return playerBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageAnalyzer createMessageAnalyzer() {
		MessageAnalyzerImpl messageAnalyzer = new MessageAnalyzerImpl();
		return messageAnalyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFactLink createExternalFactLink() {
		ExternalFactLinkImpl externalFactLink = new ExternalFactLinkImpl();
		return externalFactLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquisitionRegime createAcquisitionRegime() {
		AcquisitionRegimeImpl acquisitionRegime = new AcquisitionRegimeImpl();
		return acquisitionRegime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvisionRegime createProvisionRegime() {
		ProvisionRegimeImpl provisionRegime = new ProvisionRegimeImpl();
		return provisionRegime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMsg createInMsg() {
		InMsgImpl inMsg = new InMsgImpl();
		return inMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultMsg createResultMsg() {
		ResultMsgImpl resultMsg = new ResultMsgImpl();
		return resultMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMsg createOutMsg() {
		OutMsgImpl outMsg = new OutMsgImpl();
		return outMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRef createTaskRef() {
		TaskRefImpl taskRef = new TaskRefImpl();
		return taskRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact createFact() {
		FactImpl fact = new FactImpl();
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public au.edu.swin.ict.road.designer.smc.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactLink createFactLink() {
		FactLinkImpl factLink = new FactLinkImpl();
		return factLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactAccessor createFactAccessor() {
		FactAccessorImpl factAccessor = new FactAccessorImpl();
		return factAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcMsg createSrcMsg() {
		SrcMsgImpl srcMsg = new SrcMsgImpl();
		return srcMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeFromString(EDataType eDataType, String initialValue) {
		MessageType result = MessageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeonticType createDeonticTypeFromString(EDataType eDataType, String initialValue) {
		DeonticType result = DeonticType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeonticTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmcPackage getSmcPackage() {
		return (SmcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmcPackage getPackage() {
		return SmcPackage.eINSTANCE;
	}

} //SmcFactoryImpl
