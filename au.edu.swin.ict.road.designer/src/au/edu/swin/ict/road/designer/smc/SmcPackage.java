/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see au.edu.swin.ict.road.designer.smc.SmcFactory
 * @model kind="package"
 * @generated
 */
public interface SmcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smc/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmcPackage eINSTANCE = au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl.init();

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.PlayerImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__BINDING = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl <em>SMC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.SMCImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getSMC()
	 * @generated
	 */
	int SMC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__NAME = PLAYER__NAME;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__BINDING = PLAYER__BINDING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__ROLE = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__CONTRACT = PLAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__PROCESS_DEFINITION = PLAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behavior Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__BEHAVIOR_TERM = PLAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Player Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__PLAYER_BINDING = PLAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message Analyzer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__MESSAGE_ANALYZER = PLAYER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rules Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__RULES_DIR = PLAYER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Routing Rule File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__ROUTING_RULE_FILE = PLAYER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Composite Rule File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__COMPOSITE_RULE_FILE = PLAYER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Organizer Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__ORGANIZER_BINDING = PLAYER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__DESCRIPTION = PLAYER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC__FACT = PLAYER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>SMC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMC_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.FactAccessorImpl <em>Fact Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.FactAccessorImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getFactAccessor()
	 * @generated
	 */
	int FACT_ACCESSOR = 23;

	/**
	 * The feature id for the '<em><b>Fact Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ACCESSOR__FACT_LINK = 0;

	/**
	 * The number of structural features of the '<em>Fact Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_ACCESSOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.RoleImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Fact Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__FACT_LINK = FACT_ACCESSOR__FACT_LINK;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = FACT_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = FACT_ACCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = FACT_ACCESSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TASK = FACT_ACCESSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Fact Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EXTERNAL_FACT_LINK = FACT_ACCESSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Management Responsibilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MANAGEMENT_RESPONSIBILITIES = FACT_ACCESSOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = FACT_ACCESSOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.ContractImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 2;

	/**
	 * The feature id for the '<em><b>Fact Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__FACT_LINK = FACT_ACCESSOR__FACT_LINK;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ID = FACT_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = FACT_ACCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TYPE = FACT_ACCESSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__RULE_FILE = FACT_ACCESSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role AID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ROLE_AID = FACT_ACCESSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role BID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ROLE_BID = FACT_ACCESSOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DESCRIPTION = FACT_ACCESSOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ABSTRACT = FACT_ACCESSOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__STATE = FACT_ACCESSOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TERM = FACT_ACCESSOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = FACT_ACCESSOR_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getProcessDefinition()
	 * @generated
	 */
	int PROCESS_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__DESCR = 1;

	/**
	 * The feature id for the '<em><b>Co S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__CO_S = 2;

	/**
	 * The feature id for the '<em><b>Co T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__CO_T = 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Behavior Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__BEHAVIOR_TERM = 5;

	/**
	 * The number of structural features of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.BehaviorTermImpl <em>Behavior Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.BehaviorTermImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getBehaviorTerm()
	 * @generated
	 */
	int BEHAVIOR_TERM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TERM__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TERM__EXTENDS = 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TERM__IS_ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Task Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TERM__TASK_REF = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TERM__CONSTRAINT = 5;

	/**
	 * The number of structural features of the '<em>Behavior Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TERM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.PlayerBindingImpl <em>Player Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.PlayerBindingImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getPlayerBinding()
	 * @generated
	 */
	int PLAYER_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING__NAME = 1;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING__ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING__IMPLEMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING__PLAYER = 6;

	/**
	 * The number of structural features of the '<em>Player Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BINDING_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.MessageAnalyzerImpl <em>Message Analyzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.MessageAnalyzerImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getMessageAnalyzer()
	 * @generated
	 */
	int MESSAGE_ANALYZER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ANALYZER__ID = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ANALYZER__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Message Analyzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ANALYZER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl <em>External Fact Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getExternalFactLink()
	 * @generated
	 */
	int EXTERNAL_FACT_LINK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FACT_LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FACT_LINK__ON_CHANGE = 1;

	/**
	 * The feature id for the '<em><b>Acquisition Regime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FACT_LINK__ACQUISITION_REGIME = 2;

	/**
	 * The feature id for the '<em><b>Provision Regime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FACT_LINK__PROVISION_REGIME = 3;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FACT_LINK__FACT = 4;

	/**
	 * The number of structural features of the '<em>External Fact Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FACT_LINK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.AcquisitionRegimeImpl <em>Acquisition Regime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.AcquisitionRegimeImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getAcquisitionRegime()
	 * @generated
	 */
	int ACQUISITION_REGIME = 8;

	/**
	 * The feature id for the '<em><b>Sync Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION_REGIME__SYNC_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION_REGIME__MODE = 1;

	/**
	 * The number of structural features of the '<em>Acquisition Regime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION_REGIME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.ProvisionRegimeImpl <em>Provision Regime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.ProvisionRegimeImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getProvisionRegime()
	 * @generated
	 */
	int PROVISION_REGIME = 9;

	/**
	 * The feature id for the '<em><b>Sync Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISION_REGIME__SYNC_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISION_REGIME__MODE = 1;

	/**
	 * The number of structural features of the '<em>Provision Regime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISION_REGIME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.TaskImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Msg Analyser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MSG_ANALYSER = 1;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IN = 2;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUT = 3;

	/**
	 * The feature id for the '<em><b>Is Msg Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_MSG_DRIVEN = 4;

	/**
	 * The feature id for the '<em><b>Result Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESULT_MSG = 5;

	/**
	 * The feature id for the '<em><b>Src Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SRC_MSG = 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.InMsgImpl <em>In Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.InMsgImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getInMsg()
	 * @generated
	 */
	int IN_MSG = 11;

	/**
	 * The feature id for the '<em><b>Is Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MSG__IS_RESPONSE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MSG__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>In Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MSG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.ParameterImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl <em>Result Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getResultMsg()
	 * @generated
	 */
	int RESULT_MSG = 13;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_MSG__TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Contract Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_MSG__CONTRACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_MSG__TERM_ID = 2;

	/**
	 * The feature id for the '<em><b>Is Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_MSG__IS_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Fact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_MSG__FACT_ID = 4;

	/**
	 * The number of structural features of the '<em>Result Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_MSG_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl <em>Out Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getOutMsg()
	 * @generated
	 */
	int OUT_MSG = 14;

	/**
	 * The feature id for the '<em><b>Delivery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MSG__DELIVERY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MSG__TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Is Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MSG__IS_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MSG__OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Out Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MSG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.TermImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Deontic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DEONTIC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DIRECTION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OPERATION = 6;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.OperationImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETER = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.ConstraintImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ENABLED = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Soft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SOFT = 4;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl <em>Task Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getTaskRef()
	 * @generated
	 */
	int TASK_REF = 18;

	/**
	 * The feature id for the '<em><b>Pre EP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF__PRE_EP = 0;

	/**
	 * The feature id for the '<em><b>Post EP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF__POST_EP = 1;

	/**
	 * The feature id for the '<em><b>Performance Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF__PERFORMANCE_VAL = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF__TASK = 3;

	/**
	 * The number of structural features of the '<em>Task Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.FactImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getFact()
	 * @generated
	 */
	int FACT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.SystemImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 20;

	/**
	 * The feature id for the '<em><b>Smc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SMC = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.FactLinkImpl <em>Fact Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.FactLinkImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getFactLink()
	 * @generated
	 */
	int FACT_LINK = 22;

	/**
	 * The feature id for the '<em><b>Monitor Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_LINK__MONITOR_FACT = 0;

	/**
	 * The feature id for the '<em><b>Provide Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_LINK__PROVIDE_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_LINK__FACT = 2;

	/**
	 * The number of structural features of the '<em>Fact Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.impl.SrcMsgImpl <em>Src Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.impl.SrcMsgImpl
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getSrcMsg()
	 * @generated
	 */
	int SRC_MSG = 24;

	/**
	 * The feature id for the '<em><b>Contract Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MSG__CONTRACT_ID = 0;

	/**
	 * The feature id for the '<em><b>Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MSG__TERM_ID = 1;

	/**
	 * The feature id for the '<em><b>Is Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MSG__IS_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Fact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MSG__FACT_ID = 3;

	/**
	 * The number of structural features of the '<em>Src Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_MSG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.MessageType
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 25;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.DeonticType <em>Deontic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.DeonticType
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getDeonticType()
	 * @generated
	 */
	int DEONTIC_TYPE = 26;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.DirectionType
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 27;

	/**
	 * The meta object id for the '{@link au.edu.swin.ict.road.designer.smc.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.edu.swin.ict.road.designer.smc.Mode
	 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 28;


	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.SMC <em>SMC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMC</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC
	 * @generated
	 */
	EClass getSMC();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.SMC#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getRole()
	 * @see #getSMC()
	 * @generated
	 */
	EReference getSMC_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.SMC#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contract</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getContract()
	 * @see #getSMC()
	 * @generated
	 */
	EReference getSMC_Contract();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.SMC#getProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Definition</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getProcessDefinition()
	 * @see #getSMC()
	 * @generated
	 */
	EReference getSMC_ProcessDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.SMC#getBehaviorTerm <em>Behavior Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Term</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getBehaviorTerm()
	 * @see #getSMC()
	 * @generated
	 */
	EReference getSMC_BehaviorTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.SMC#getPlayerBinding <em>Player Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player Binding</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getPlayerBinding()
	 * @see #getSMC()
	 * @generated
	 */
	EReference getSMC_PlayerBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.SMC#getMessageAnalyzer <em>Message Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Analyzer</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getMessageAnalyzer()
	 * @see #getSMC()
	 * @generated
	 */
	EReference getSMC_MessageAnalyzer();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SMC#getRulesDir <em>Rules Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rules Dir</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getRulesDir()
	 * @see #getSMC()
	 * @generated
	 */
	EAttribute getSMC_RulesDir();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SMC#getRoutingRuleFile <em>Routing Rule File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Rule File</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getRoutingRuleFile()
	 * @see #getSMC()
	 * @generated
	 */
	EAttribute getSMC_RoutingRuleFile();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SMC#getCompositeRuleFile <em>Composite Rule File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Rule File</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getCompositeRuleFile()
	 * @see #getSMC()
	 * @generated
	 */
	EAttribute getSMC_CompositeRuleFile();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SMC#getOrganizerBinding <em>Organizer Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizer Binding</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getOrganizerBinding()
	 * @see #getSMC()
	 * @generated
	 */
	EAttribute getSMC_OrganizerBinding();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SMC#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getDescription()
	 * @see #getSMC()
	 * @generated
	 */
	EAttribute getSMC_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.SMC#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SMC#getFact()
	 * @see #getSMC()
	 * @generated
	 */
	EReference getSMC_Fact();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.Role#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Role#getTask()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.Role#getExternalFactLink <em>External Fact Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Fact Link</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Role#getExternalFactLink()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ExternalFactLink();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Role#getManagementResponsibilities <em>Management Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management Responsibilities</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Role#getManagementResponsibilities()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_ManagementResponsibilities();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Contract#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getId()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Contract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getName()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Name();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Contract#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getType()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Type();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Contract#getRuleFile <em>Rule File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule File</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getRuleFile()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_RuleFile();

	/**
	 * Returns the meta object for the reference '{@link au.edu.swin.ict.road.designer.smc.Contract#getRoleAID <em>Role AID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role AID</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getRoleAID()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_RoleAID();

	/**
	 * Returns the meta object for the reference '{@link au.edu.swin.ict.road.designer.smc.Contract#getRoleBID <em>Role BID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role BID</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getRoleBID()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_RoleBID();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Contract#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getDescription()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Description();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Contract#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#isAbstract()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Contract#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getState()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_State();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.Contract#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Contract#getTerm()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Term();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definition</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition
	 * @generated
	 */
	EClass getProcessDefinition();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition#getId()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition#getDescr()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_Descr();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoS <em>Co S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Co S</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoS()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_CoS();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoT <em>Co T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Co T</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoT()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_CoT();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition#getConstraint()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getBehaviorTerm <em>Behavior Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavior Term</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition#getBehaviorTerm()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_BehaviorTerm();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm <em>Behavior Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Term</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm
	 * @generated
	 */
	EClass getBehaviorTerm();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm#getId()
	 * @see #getBehaviorTerm()
	 * @generated
	 */
	EAttribute getBehaviorTerm_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtension()
	 * @see #getBehaviorTerm()
	 * @generated
	 */
	EAttribute getBehaviorTerm_Extension();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtends()
	 * @see #getBehaviorTerm()
	 * @generated
	 */
	EAttribute getBehaviorTerm_Extends();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm#isIsAbstract()
	 * @see #getBehaviorTerm()
	 * @generated
	 */
	EAttribute getBehaviorTerm_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getTaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Ref</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm#getTaskRef()
	 * @see #getBehaviorTerm()
	 * @generated
	 */
	EReference getBehaviorTerm_TaskRef();

	/**
	 * Returns the meta object for the reference list '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm#getConstraint()
	 * @see #getBehaviorTerm()
	 * @generated
	 */
	EReference getBehaviorTerm_Constraint();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding <em>Player Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Binding</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding
	 * @generated
	 */
	EClass getPlayerBinding();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding#getId()
	 * @see #getPlayerBinding()
	 * @generated
	 */
	EAttribute getPlayerBinding_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding#getName()
	 * @see #getPlayerBinding()
	 * @generated
	 */
	EAttribute getPlayerBinding_Name();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding#getEndpoint()
	 * @see #getPlayerBinding()
	 * @generated
	 */
	EAttribute getPlayerBinding_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding#getImplementation()
	 * @see #getPlayerBinding()
	 * @generated
	 */
	EAttribute getPlayerBinding_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding#getDescription()
	 * @see #getPlayerBinding()
	 * @generated
	 */
	EAttribute getPlayerBinding_Description();

	/**
	 * Returns the meta object for the reference '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding#getRole()
	 * @see #getPlayerBinding()
	 * @generated
	 */
	EReference getPlayerBinding_Role();

	/**
	 * Returns the meta object for the reference '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding#getPlayer()
	 * @see #getPlayerBinding()
	 * @generated
	 */
	EReference getPlayerBinding_Player();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.MessageAnalyzer <em>Message Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Analyzer</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.MessageAnalyzer
	 * @generated
	 */
	EClass getMessageAnalyzer();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.MessageAnalyzer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.MessageAnalyzer#getId()
	 * @see #getMessageAnalyzer()
	 * @generated
	 */
	EAttribute getMessageAnalyzer_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.MessageAnalyzer#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.MessageAnalyzer#getClass_()
	 * @see #getMessageAnalyzer()
	 * @generated
	 */
	EAttribute getMessageAnalyzer_Class();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink <em>External Fact Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Fact Link</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ExternalFactLink
	 * @generated
	 */
	EClass getExternalFactLink();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ExternalFactLink#getName()
	 * @see #getExternalFactLink()
	 * @generated
	 */
	EAttribute getExternalFactLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#isOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ExternalFactLink#isOnChange()
	 * @see #getExternalFactLink()
	 * @generated
	 */
	EAttribute getExternalFactLink_OnChange();

	/**
	 * Returns the meta object for the containment reference '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getAcquisitionRegime <em>Acquisition Regime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acquisition Regime</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ExternalFactLink#getAcquisitionRegime()
	 * @see #getExternalFactLink()
	 * @generated
	 */
	EReference getExternalFactLink_AcquisitionRegime();

	/**
	 * Returns the meta object for the containment reference '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getProvisionRegime <em>Provision Regime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provision Regime</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ExternalFactLink#getProvisionRegime()
	 * @see #getExternalFactLink()
	 * @generated
	 */
	EReference getExternalFactLink_ProvisionRegime();

	/**
	 * Returns the meta object for the reference '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ExternalFactLink#getFact()
	 * @see #getExternalFactLink()
	 * @generated
	 */
	EReference getExternalFactLink_Fact();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime <em>Acquisition Regime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquisition Regime</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.AcquisitionRegime
	 * @generated
	 */
	EClass getAcquisitionRegime();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getSyncInterval <em>Sync Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Interval</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getSyncInterval()
	 * @see #getAcquisitionRegime()
	 * @generated
	 */
	EAttribute getAcquisitionRegime_SyncInterval();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getMode()
	 * @see #getAcquisitionRegime()
	 * @generated
	 */
	EAttribute getAcquisitionRegime_Mode();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.ProvisionRegime <em>Provision Regime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provision Regime</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProvisionRegime
	 * @generated
	 */
	EClass getProvisionRegime();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ProvisionRegime#getSyncInterval <em>Sync Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Interval</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProvisionRegime#getSyncInterval()
	 * @see #getProvisionRegime()
	 * @generated
	 */
	EAttribute getProvisionRegime_SyncInterval();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ProvisionRegime#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ProvisionRegime#getMode()
	 * @see #getProvisionRegime()
	 * @generated
	 */
	EAttribute getProvisionRegime_Mode();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Task#getMsgAnalyser <em>Msg Analyser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg Analyser</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task#getMsgAnalyser()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MsgAnalyser();

	/**
	 * Returns the meta object for the containment reference '{@link au.edu.swin.ict.road.designer.smc.Task#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task#getIn()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_In();

	/**
	 * Returns the meta object for the containment reference '{@link au.edu.swin.ict.road.designer.smc.Task#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task#getOut()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Out();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Task#isIsMsgDriven <em>Is Msg Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Msg Driven</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task#isIsMsgDriven()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsMsgDriven();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.Task#getResultMsg <em>Result Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Msg</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task#getResultMsg()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ResultMsg();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.Task#getSrcMsg <em>Src Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Src Msg</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Task#getSrcMsg()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_SrcMsg();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.InMsg <em>In Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Msg</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.InMsg
	 * @generated
	 */
	EClass getInMsg();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.InMsg#isIsResponse <em>Is Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Response</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.InMsg#isIsResponse()
	 * @see #getInMsg()
	 * @generated
	 */
	EAttribute getInMsg_IsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link au.edu.swin.ict.road.designer.smc.InMsg#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.InMsg#getOperation()
	 * @see #getInMsg()
	 * @generated
	 */
	EReference getInMsg_Operation();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.ResultMsg <em>Result Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Msg</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ResultMsg
	 * @generated
	 */
	EClass getResultMsg();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ResultMsg#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ResultMsg#getTransformation()
	 * @see #getResultMsg()
	 * @generated
	 */
	EAttribute getResultMsg_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ResultMsg#getContractId <em>Contract Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ResultMsg#getContractId()
	 * @see #getResultMsg()
	 * @generated
	 */
	EAttribute getResultMsg_ContractId();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ResultMsg#getTermId <em>Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ResultMsg#getTermId()
	 * @see #getResultMsg()
	 * @generated
	 */
	EAttribute getResultMsg_TermId();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ResultMsg#isIsResponse <em>Is Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Response</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ResultMsg#isIsResponse()
	 * @see #getResultMsg()
	 * @generated
	 */
	EAttribute getResultMsg_IsResponse();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.ResultMsg#getFactId <em>Fact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.ResultMsg#getFactId()
	 * @see #getResultMsg()
	 * @generated
	 */
	EAttribute getResultMsg_FactId();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.OutMsg <em>Out Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Msg</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.OutMsg
	 * @generated
	 */
	EClass getOutMsg();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.OutMsg#getDeliveryType <em>Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.OutMsg#getDeliveryType()
	 * @see #getOutMsg()
	 * @generated
	 */
	EAttribute getOutMsg_DeliveryType();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.OutMsg#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.OutMsg#getTransformation()
	 * @see #getOutMsg()
	 * @generated
	 */
	EAttribute getOutMsg_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.OutMsg#isIsResponse <em>Is Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Response</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.OutMsg#isIsResponse()
	 * @see #getOutMsg()
	 * @generated
	 */
	EAttribute getOutMsg_IsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link au.edu.swin.ict.road.designer.smc.OutMsg#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.OutMsg#getOperation()
	 * @see #getOutMsg()
	 * @generated
	 */
	EReference getOutMsg_Operation();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Term#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term#getId()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Term#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term#getName()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Name();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Term#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term#getMessageType()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Term#getDeonticType <em>Deontic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deontic Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term#getDeonticType()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_DeonticType();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Term#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term#getDirection()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Direction();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Term#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term#getDescription()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.Term#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Term#getOperation()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Operation();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Operation#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Operation#getReturn()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Return();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.Operation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Operation#getParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameter();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Constraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Constraint#getId()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Constraint#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Constraint#isEnabled()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Constraint#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Constraint#getLanguage()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Language();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Constraint#isSoft <em>Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Constraint#isSoft()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Soft();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.TaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ref</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.TaskRef
	 * @generated
	 */
	EClass getTaskRef();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPreEP <em>Pre EP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre EP</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.TaskRef#getPreEP()
	 * @see #getTaskRef()
	 * @generated
	 */
	EAttribute getTaskRef_PreEP();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPostEP <em>Post EP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post EP</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.TaskRef#getPostEP()
	 * @see #getTaskRef()
	 * @generated
	 */
	EAttribute getTaskRef_PostEP();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPerformanceVal <em>Performance Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Val</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.TaskRef#getPerformanceVal()
	 * @see #getTaskRef()
	 * @generated
	 */
	EAttribute getTaskRef_PerformanceVal();

	/**
	 * Returns the meta object for the reference '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.TaskRef#getTask()
	 * @see #getTaskRef()
	 * @generated
	 */
	EReference getTaskRef_Task();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Fact
	 * @generated
	 */
	EClass getFact();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Fact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Fact#getName()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Name();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Fact#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Fact#getSource()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Source();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Fact#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Fact#getIdentifier()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Identifier();

	/**
	 * Returns the meta object for the attribute list '{@link au.edu.swin.ict.road.designer.smc.Fact#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Fact#getAttribute()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Attribute();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link au.edu.swin.ict.road.designer.smc.System#getSmc <em>Smc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Smc</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.System#getSmc()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Smc();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.System#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.System#getPlayer()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Player();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the reference list '{@link au.edu.swin.ict.road.designer.smc.Player#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Player#getBinding()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Binding();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.FactLink <em>Fact Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Link</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.FactLink
	 * @generated
	 */
	EClass getFactLink();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.FactLink#isMonitorFact <em>Monitor Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Fact</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.FactLink#isMonitorFact()
	 * @see #getFactLink()
	 * @generated
	 */
	EAttribute getFactLink_MonitorFact();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.FactLink#isProvideContext <em>Provide Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provide Context</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.FactLink#isProvideContext()
	 * @see #getFactLink()
	 * @generated
	 */
	EAttribute getFactLink_ProvideContext();

	/**
	 * Returns the meta object for the reference '{@link au.edu.swin.ict.road.designer.smc.FactLink#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.FactLink#getFact()
	 * @see #getFactLink()
	 * @generated
	 */
	EReference getFactLink_Fact();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.FactAccessor <em>Fact Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Accessor</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.FactAccessor
	 * @generated
	 */
	EClass getFactAccessor();

	/**
	 * Returns the meta object for the containment reference list '{@link au.edu.swin.ict.road.designer.smc.FactAccessor#getFactLink <em>Fact Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact Link</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.FactAccessor#getFactLink()
	 * @see #getFactAccessor()
	 * @generated
	 */
	EReference getFactAccessor_FactLink();

	/**
	 * Returns the meta object for class '{@link au.edu.swin.ict.road.designer.smc.SrcMsg <em>Src Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Msg</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SrcMsg
	 * @generated
	 */
	EClass getSrcMsg();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getContractId <em>Contract Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SrcMsg#getContractId()
	 * @see #getSrcMsg()
	 * @generated
	 */
	EAttribute getSrcMsg_ContractId();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getTermId <em>Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SrcMsg#getTermId()
	 * @see #getSrcMsg()
	 * @generated
	 */
	EAttribute getSrcMsg_TermId();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#isIsResponse <em>Is Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Response</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SrcMsg#isIsResponse()
	 * @see #getSrcMsg()
	 * @generated
	 */
	EAttribute getSrcMsg_IsResponse();

	/**
	 * Returns the meta object for the attribute '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getFactId <em>Fact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Id</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.SrcMsg#getFactId()
	 * @see #getSrcMsg()
	 * @generated
	 */
	EAttribute getSrcMsg_FactId();

	/**
	 * Returns the meta object for enum '{@link au.edu.swin.ict.road.designer.smc.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the meta object for enum '{@link au.edu.swin.ict.road.designer.smc.DeonticType <em>Deontic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deontic Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.DeonticType
	 * @generated
	 */
	EEnum getDeonticType();

	/**
	 * Returns the meta object for enum '{@link au.edu.swin.ict.road.designer.smc.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link au.edu.swin.ict.road.designer.smc.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see au.edu.swin.ict.road.designer.smc.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmcFactory getSmcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl <em>SMC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.SMCImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getSMC()
		 * @generated
		 */
		EClass SMC = eINSTANCE.getSMC();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMC__ROLE = eINSTANCE.getSMC_Role();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMC__CONTRACT = eINSTANCE.getSMC_Contract();

		/**
		 * The meta object literal for the '<em><b>Process Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMC__PROCESS_DEFINITION = eINSTANCE.getSMC_ProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Behavior Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMC__BEHAVIOR_TERM = eINSTANCE.getSMC_BehaviorTerm();

		/**
		 * The meta object literal for the '<em><b>Player Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMC__PLAYER_BINDING = eINSTANCE.getSMC_PlayerBinding();

		/**
		 * The meta object literal for the '<em><b>Message Analyzer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMC__MESSAGE_ANALYZER = eINSTANCE.getSMC_MessageAnalyzer();

		/**
		 * The meta object literal for the '<em><b>Rules Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMC__RULES_DIR = eINSTANCE.getSMC_RulesDir();

		/**
		 * The meta object literal for the '<em><b>Routing Rule File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMC__ROUTING_RULE_FILE = eINSTANCE.getSMC_RoutingRuleFile();

		/**
		 * The meta object literal for the '<em><b>Composite Rule File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMC__COMPOSITE_RULE_FILE = eINSTANCE.getSMC_CompositeRuleFile();

		/**
		 * The meta object literal for the '<em><b>Organizer Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMC__ORGANIZER_BINDING = eINSTANCE.getSMC_OrganizerBinding();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMC__DESCRIPTION = eINSTANCE.getSMC_Description();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMC__FACT = eINSTANCE.getSMC_Fact();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.RoleImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID = eINSTANCE.getRole_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__TASK = eINSTANCE.getRole_Task();

		/**
		 * The meta object literal for the '<em><b>External Fact Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__EXTERNAL_FACT_LINK = eINSTANCE.getRole_ExternalFactLink();

		/**
		 * The meta object literal for the '<em><b>Management Responsibilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__MANAGEMENT_RESPONSIBILITIES = eINSTANCE.getRole_ManagementResponsibilities();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.ContractImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__ID = eINSTANCE.getContract_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__NAME = eINSTANCE.getContract_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__TYPE = eINSTANCE.getContract_Type();

		/**
		 * The meta object literal for the '<em><b>Rule File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__RULE_FILE = eINSTANCE.getContract_RuleFile();

		/**
		 * The meta object literal for the '<em><b>Role AID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__ROLE_AID = eINSTANCE.getContract_RoleAID();

		/**
		 * The meta object literal for the '<em><b>Role BID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__ROLE_BID = eINSTANCE.getContract_RoleBID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__DESCRIPTION = eINSTANCE.getContract_Description();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__ABSTRACT = eINSTANCE.getContract_Abstract();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__STATE = eINSTANCE.getContract_State();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__TERM = eINSTANCE.getContract_Term();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getProcessDefinition()
		 * @generated
		 */
		EClass PROCESS_DEFINITION = eINSTANCE.getProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__ID = eINSTANCE.getProcessDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__DESCR = eINSTANCE.getProcessDefinition_Descr();

		/**
		 * The meta object literal for the '<em><b>Co S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__CO_S = eINSTANCE.getProcessDefinition_CoS();

		/**
		 * The meta object literal for the '<em><b>Co T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__CO_T = eINSTANCE.getProcessDefinition_CoT();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__CONSTRAINT = eINSTANCE.getProcessDefinition_Constraint();

		/**
		 * The meta object literal for the '<em><b>Behavior Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__BEHAVIOR_TERM = eINSTANCE.getProcessDefinition_BehaviorTerm();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.BehaviorTermImpl <em>Behavior Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.BehaviorTermImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getBehaviorTerm()
		 * @generated
		 */
		EClass BEHAVIOR_TERM = eINSTANCE.getBehaviorTerm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TERM__ID = eINSTANCE.getBehaviorTerm_Id();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TERM__EXTENSION = eINSTANCE.getBehaviorTerm_Extension();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TERM__EXTENDS = eINSTANCE.getBehaviorTerm_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TERM__IS_ABSTRACT = eINSTANCE.getBehaviorTerm_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Task Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TERM__TASK_REF = eINSTANCE.getBehaviorTerm_TaskRef();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TERM__CONSTRAINT = eINSTANCE.getBehaviorTerm_Constraint();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.PlayerBindingImpl <em>Player Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.PlayerBindingImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getPlayerBinding()
		 * @generated
		 */
		EClass PLAYER_BINDING = eINSTANCE.getPlayerBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_BINDING__ID = eINSTANCE.getPlayerBinding_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_BINDING__NAME = eINSTANCE.getPlayerBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_BINDING__ENDPOINT = eINSTANCE.getPlayerBinding_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_BINDING__IMPLEMENTATION = eINSTANCE.getPlayerBinding_Implementation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_BINDING__DESCRIPTION = eINSTANCE.getPlayerBinding_Description();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_BINDING__ROLE = eINSTANCE.getPlayerBinding_Role();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_BINDING__PLAYER = eINSTANCE.getPlayerBinding_Player();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.MessageAnalyzerImpl <em>Message Analyzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.MessageAnalyzerImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getMessageAnalyzer()
		 * @generated
		 */
		EClass MESSAGE_ANALYZER = eINSTANCE.getMessageAnalyzer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_ANALYZER__ID = eINSTANCE.getMessageAnalyzer_Id();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_ANALYZER__CLASS = eINSTANCE.getMessageAnalyzer_Class();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl <em>External Fact Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getExternalFactLink()
		 * @generated
		 */
		EClass EXTERNAL_FACT_LINK = eINSTANCE.getExternalFactLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FACT_LINK__NAME = eINSTANCE.getExternalFactLink_Name();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FACT_LINK__ON_CHANGE = eINSTANCE.getExternalFactLink_OnChange();

		/**
		 * The meta object literal for the '<em><b>Acquisition Regime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FACT_LINK__ACQUISITION_REGIME = eINSTANCE.getExternalFactLink_AcquisitionRegime();

		/**
		 * The meta object literal for the '<em><b>Provision Regime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FACT_LINK__PROVISION_REGIME = eINSTANCE.getExternalFactLink_ProvisionRegime();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FACT_LINK__FACT = eINSTANCE.getExternalFactLink_Fact();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.AcquisitionRegimeImpl <em>Acquisition Regime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.AcquisitionRegimeImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getAcquisitionRegime()
		 * @generated
		 */
		EClass ACQUISITION_REGIME = eINSTANCE.getAcquisitionRegime();

		/**
		 * The meta object literal for the '<em><b>Sync Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUISITION_REGIME__SYNC_INTERVAL = eINSTANCE.getAcquisitionRegime_SyncInterval();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUISITION_REGIME__MODE = eINSTANCE.getAcquisitionRegime_Mode();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.ProvisionRegimeImpl <em>Provision Regime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.ProvisionRegimeImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getProvisionRegime()
		 * @generated
		 */
		EClass PROVISION_REGIME = eINSTANCE.getProvisionRegime();

		/**
		 * The meta object literal for the '<em><b>Sync Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVISION_REGIME__SYNC_INTERVAL = eINSTANCE.getProvisionRegime_SyncInterval();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVISION_REGIME__MODE = eINSTANCE.getProvisionRegime_Mode();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.TaskImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Msg Analyser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MSG_ANALYSER = eINSTANCE.getTask_MsgAnalyser();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IN = eINSTANCE.getTask_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUT = eINSTANCE.getTask_Out();

		/**
		 * The meta object literal for the '<em><b>Is Msg Driven</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_MSG_DRIVEN = eINSTANCE.getTask_IsMsgDriven();

		/**
		 * The meta object literal for the '<em><b>Result Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RESULT_MSG = eINSTANCE.getTask_ResultMsg();

		/**
		 * The meta object literal for the '<em><b>Src Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SRC_MSG = eINSTANCE.getTask_SrcMsg();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.InMsgImpl <em>In Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.InMsgImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getInMsg()
		 * @generated
		 */
		EClass IN_MSG = eINSTANCE.getInMsg();

		/**
		 * The meta object literal for the '<em><b>Is Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_MSG__IS_RESPONSE = eINSTANCE.getInMsg_IsResponse();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_MSG__OPERATION = eINSTANCE.getInMsg_Operation();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.ParameterImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl <em>Result Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getResultMsg()
		 * @generated
		 */
		EClass RESULT_MSG = eINSTANCE.getResultMsg();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_MSG__TRANSFORMATION = eINSTANCE.getResultMsg_Transformation();

		/**
		 * The meta object literal for the '<em><b>Contract Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_MSG__CONTRACT_ID = eINSTANCE.getResultMsg_ContractId();

		/**
		 * The meta object literal for the '<em><b>Term Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_MSG__TERM_ID = eINSTANCE.getResultMsg_TermId();

		/**
		 * The meta object literal for the '<em><b>Is Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_MSG__IS_RESPONSE = eINSTANCE.getResultMsg_IsResponse();

		/**
		 * The meta object literal for the '<em><b>Fact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_MSG__FACT_ID = eINSTANCE.getResultMsg_FactId();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl <em>Out Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getOutMsg()
		 * @generated
		 */
		EClass OUT_MSG = eINSTANCE.getOutMsg();

		/**
		 * The meta object literal for the '<em><b>Delivery Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_MSG__DELIVERY_TYPE = eINSTANCE.getOutMsg_DeliveryType();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_MSG__TRANSFORMATION = eINSTANCE.getOutMsg_Transformation();

		/**
		 * The meta object literal for the '<em><b>Is Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_MSG__IS_RESPONSE = eINSTANCE.getOutMsg_IsResponse();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_MSG__OPERATION = eINSTANCE.getOutMsg_Operation();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.TermImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__ID = eINSTANCE.getTerm_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__NAME = eINSTANCE.getTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__MESSAGE_TYPE = eINSTANCE.getTerm_MessageType();

		/**
		 * The meta object literal for the '<em><b>Deontic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__DEONTIC_TYPE = eINSTANCE.getTerm_DeonticType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__DIRECTION = eINSTANCE.getTerm_Direction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__DESCRIPTION = eINSTANCE.getTerm_Description();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__OPERATION = eINSTANCE.getTerm_Operation();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.OperationImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN = eINSTANCE.getOperation_Return();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETER = eINSTANCE.getOperation_Parameter();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.ConstraintImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__ID = eINSTANCE.getConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__ENABLED = eINSTANCE.getConstraint_Enabled();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__LANGUAGE = eINSTANCE.getConstraint_Language();

		/**
		 * The meta object literal for the '<em><b>Soft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__SOFT = eINSTANCE.getConstraint_Soft();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl <em>Task Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getTaskRef()
		 * @generated
		 */
		EClass TASK_REF = eINSTANCE.getTaskRef();

		/**
		 * The meta object literal for the '<em><b>Pre EP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_REF__PRE_EP = eINSTANCE.getTaskRef_PreEP();

		/**
		 * The meta object literal for the '<em><b>Post EP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_REF__POST_EP = eINSTANCE.getTaskRef_PostEP();

		/**
		 * The meta object literal for the '<em><b>Performance Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_REF__PERFORMANCE_VAL = eINSTANCE.getTaskRef_PerformanceVal();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REF__TASK = eINSTANCE.getTaskRef_Task();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.FactImpl <em>Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.FactImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getFact()
		 * @generated
		 */
		EClass FACT = eINSTANCE.getFact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__NAME = eINSTANCE.getFact_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__SOURCE = eINSTANCE.getFact_Source();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__IDENTIFIER = eINSTANCE.getFact_Identifier();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__ATTRIBUTE = eINSTANCE.getFact_Attribute();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.SystemImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Smc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SMC = eINSTANCE.getSystem_Smc();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PLAYER = eINSTANCE.getSystem_Player();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.PlayerImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__BINDING = eINSTANCE.getPlayer_Binding();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.FactLinkImpl <em>Fact Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.FactLinkImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getFactLink()
		 * @generated
		 */
		EClass FACT_LINK = eINSTANCE.getFactLink();

		/**
		 * The meta object literal for the '<em><b>Monitor Fact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_LINK__MONITOR_FACT = eINSTANCE.getFactLink_MonitorFact();

		/**
		 * The meta object literal for the '<em><b>Provide Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_LINK__PROVIDE_CONTEXT = eINSTANCE.getFactLink_ProvideContext();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_LINK__FACT = eINSTANCE.getFactLink_Fact();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.FactAccessorImpl <em>Fact Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.FactAccessorImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getFactAccessor()
		 * @generated
		 */
		EClass FACT_ACCESSOR = eINSTANCE.getFactAccessor();

		/**
		 * The meta object literal for the '<em><b>Fact Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_ACCESSOR__FACT_LINK = eINSTANCE.getFactAccessor_FactLink();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.impl.SrcMsgImpl <em>Src Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.impl.SrcMsgImpl
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getSrcMsg()
		 * @generated
		 */
		EClass SRC_MSG = eINSTANCE.getSrcMsg();

		/**
		 * The meta object literal for the '<em><b>Contract Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_MSG__CONTRACT_ID = eINSTANCE.getSrcMsg_ContractId();

		/**
		 * The meta object literal for the '<em><b>Term Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_MSG__TERM_ID = eINSTANCE.getSrcMsg_TermId();

		/**
		 * The meta object literal for the '<em><b>Is Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_MSG__IS_RESPONSE = eINSTANCE.getSrcMsg_IsResponse();

		/**
		 * The meta object literal for the '<em><b>Fact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_MSG__FACT_ID = eINSTANCE.getSrcMsg_FactId();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.MessageType <em>Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.MessageType
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getMessageType()
		 * @generated
		 */
		EEnum MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.DeonticType <em>Deontic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.DeonticType
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getDeonticType()
		 * @generated
		 */
		EEnum DEONTIC_TYPE = eINSTANCE.getDeonticType();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.DirectionType
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link au.edu.swin.ict.road.designer.smc.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.edu.swin.ict.road.designer.smc.Mode
		 * @see au.edu.swin.ict.road.designer.smc.impl.SmcPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

	}

} //SmcPackage
