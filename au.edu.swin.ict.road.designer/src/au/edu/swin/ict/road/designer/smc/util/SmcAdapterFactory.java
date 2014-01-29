/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.util;

import au.edu.swin.ict.road.designer.smc.AcquisitionRegime;
import au.edu.swin.ict.road.designer.smc.BehaviorTerm;
import au.edu.swin.ict.road.designer.smc.Constraint;
import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.FactAccessor;
import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.InMsg;
import au.edu.swin.ict.road.designer.smc.MessageAnalyzer;
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
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.SrcMsg;
import au.edu.swin.ict.road.designer.smc.Task;
import au.edu.swin.ict.road.designer.smc.TaskRef;
import au.edu.swin.ict.road.designer.smc.Term;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage
 * @generated
 */
public class SmcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmcSwitch<Adapter> modelSwitch =
		new SmcSwitch<Adapter>() {
			@Override
			public Adapter caseSMC(SMC object) {
				return createSMCAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseProcessDefinition(ProcessDefinition object) {
				return createProcessDefinitionAdapter();
			}
			@Override
			public Adapter caseBehaviorTerm(BehaviorTerm object) {
				return createBehaviorTermAdapter();
			}
			@Override
			public Adapter casePlayerBinding(PlayerBinding object) {
				return createPlayerBindingAdapter();
			}
			@Override
			public Adapter caseMessageAnalyzer(MessageAnalyzer object) {
				return createMessageAnalyzerAdapter();
			}
			@Override
			public Adapter caseExternalFactLink(ExternalFactLink object) {
				return createExternalFactLinkAdapter();
			}
			@Override
			public Adapter caseAcquisitionRegime(AcquisitionRegime object) {
				return createAcquisitionRegimeAdapter();
			}
			@Override
			public Adapter caseProvisionRegime(ProvisionRegime object) {
				return createProvisionRegimeAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseInMsg(InMsg object) {
				return createInMsgAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseResultMsg(ResultMsg object) {
				return createResultMsgAdapter();
			}
			@Override
			public Adapter caseOutMsg(OutMsg object) {
				return createOutMsgAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseTaskRef(TaskRef object) {
				return createTaskRefAdapter();
			}
			@Override
			public Adapter caseFact(Fact object) {
				return createFactAdapter();
			}
			@Override
			public Adapter caseSystem(au.edu.swin.ict.road.designer.smc.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseFactLink(FactLink object) {
				return createFactLinkAdapter();
			}
			@Override
			public Adapter caseFactAccessor(FactAccessor object) {
				return createFactAccessorAdapter();
			}
			@Override
			public Adapter caseSrcMsg(SrcMsg object) {
				return createSrcMsgAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.SMC <em>SMC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.SMC
	 * @generated
	 */
	public Adapter createSMCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.ProcessDefinition
	 * @generated
	 */
	public Adapter createProcessDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm <em>Behavior Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.BehaviorTerm
	 * @generated
	 */
	public Adapter createBehaviorTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.PlayerBinding <em>Player Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.PlayerBinding
	 * @generated
	 */
	public Adapter createPlayerBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.MessageAnalyzer <em>Message Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.MessageAnalyzer
	 * @generated
	 */
	public Adapter createMessageAnalyzerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink <em>External Fact Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.ExternalFactLink
	 * @generated
	 */
	public Adapter createExternalFactLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime <em>Acquisition Regime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.AcquisitionRegime
	 * @generated
	 */
	public Adapter createAcquisitionRegimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.ProvisionRegime <em>Provision Regime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.ProvisionRegime
	 * @generated
	 */
	public Adapter createProvisionRegimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.InMsg <em>In Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.InMsg
	 * @generated
	 */
	public Adapter createInMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.ResultMsg <em>Result Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.ResultMsg
	 * @generated
	 */
	public Adapter createResultMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.OutMsg <em>Out Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.OutMsg
	 * @generated
	 */
	public Adapter createOutMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.TaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.TaskRef
	 * @generated
	 */
	public Adapter createTaskRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Fact
	 * @generated
	 */
	public Adapter createFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.FactLink <em>Fact Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.FactLink
	 * @generated
	 */
	public Adapter createFactLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.FactAccessor <em>Fact Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.FactAccessor
	 * @generated
	 */
	public Adapter createFactAccessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.edu.swin.ict.road.designer.smc.SrcMsg <em>Src Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.edu.swin.ict.road.designer.smc.SrcMsg
	 * @generated
	 */
	public Adapter createSrcMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SmcAdapterFactory
