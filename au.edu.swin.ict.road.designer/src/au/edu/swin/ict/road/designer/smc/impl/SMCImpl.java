/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.BehaviorTerm;
import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.MessageAnalyzer;
import au.edu.swin.ict.road.designer.smc.PlayerBinding;
import au.edu.swin.ict.road.designer.smc.ProcessDefinition;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.SMC;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getRole <em>Role</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getBehaviorTerm <em>Behavior Term</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getPlayerBinding <em>Player Binding</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getMessageAnalyzer <em>Message Analyzer</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getRulesDir <em>Rules Dir</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getRoutingRuleFile <em>Routing Rule File</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getCompositeRuleFile <em>Composite Rule File</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getOrganizerBinding <em>Organizer Binding</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.SMCImpl#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMCImpl extends PlayerImpl implements SMC {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contract;

	/**
	 * The cached value of the '{@link #getProcessDefinition() <em>Process Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessDefinition> processDefinition;

	/**
	 * The cached value of the '{@link #getBehaviorTerm() <em>Behavior Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTerm> behaviorTerm;

	/**
	 * The cached value of the '{@link #getPlayerBinding() <em>Player Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerBinding> playerBinding;

	/**
	 * The cached value of the '{@link #getMessageAnalyzer() <em>Message Analyzer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageAnalyzer()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageAnalyzer> messageAnalyzer;

	/**
	 * The default value of the '{@link #getRulesDir() <em>Rules Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesDir()
	 * @generated
	 * @ordered
	 */
	protected static final String RULES_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRulesDir() <em>Rules Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesDir()
	 * @generated
	 * @ordered
	 */
	protected String rulesDir = RULES_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingRuleFile() <em>Routing Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingRuleFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_RULE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingRuleFile() <em>Routing Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingRuleFile()
	 * @generated
	 * @ordered
	 */
	protected String routingRuleFile = ROUTING_RULE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompositeRuleFile() <em>Composite Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeRuleFile()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPOSITE_RULE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompositeRuleFile() <em>Composite Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeRuleFile()
	 * @generated
	 * @ordered
	 */
	protected String compositeRuleFile = COMPOSITE_RULE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizerBinding() <em>Organizer Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizerBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZER_BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizerBinding() <em>Organizer Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizerBinding()
	 * @generated
	 * @ordered
	 */
	protected String organizerBinding = ORGANIZER_BINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected EList<Fact> fact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.SMC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, SmcPackage.SMC__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Contract>(Contract.class, this, SmcPackage.SMC__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinition> getProcessDefinition() {
		if (processDefinition == null) {
			processDefinition = new EObjectContainmentEList<ProcessDefinition>(ProcessDefinition.class, this, SmcPackage.SMC__PROCESS_DEFINITION);
		}
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTerm> getBehaviorTerm() {
		if (behaviorTerm == null) {
			behaviorTerm = new EObjectContainmentEList<BehaviorTerm>(BehaviorTerm.class, this, SmcPackage.SMC__BEHAVIOR_TERM);
		}
		return behaviorTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlayerBinding> getPlayerBinding() {
		if (playerBinding == null) {
			playerBinding = new EObjectContainmentEList<PlayerBinding>(PlayerBinding.class, this, SmcPackage.SMC__PLAYER_BINDING);
		}
		return playerBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageAnalyzer> getMessageAnalyzer() {
		if (messageAnalyzer == null) {
			messageAnalyzer = new EObjectContainmentEList<MessageAnalyzer>(MessageAnalyzer.class, this, SmcPackage.SMC__MESSAGE_ANALYZER);
		}
		return messageAnalyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRulesDir() {
		return rulesDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulesDir(String newRulesDir) {
		String oldRulesDir = rulesDir;
		rulesDir = newRulesDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.SMC__RULES_DIR, oldRulesDir, rulesDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoutingRuleFile() {
		return routingRuleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingRuleFile(String newRoutingRuleFile) {
		String oldRoutingRuleFile = routingRuleFile;
		routingRuleFile = newRoutingRuleFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.SMC__ROUTING_RULE_FILE, oldRoutingRuleFile, routingRuleFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompositeRuleFile() {
		return compositeRuleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeRuleFile(String newCompositeRuleFile) {
		String oldCompositeRuleFile = compositeRuleFile;
		compositeRuleFile = newCompositeRuleFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.SMC__COMPOSITE_RULE_FILE, oldCompositeRuleFile, compositeRuleFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizerBinding() {
		return organizerBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizerBinding(String newOrganizerBinding) {
		String oldOrganizerBinding = organizerBinding;
		organizerBinding = newOrganizerBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.SMC__ORGANIZER_BINDING, oldOrganizerBinding, organizerBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.SMC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fact> getFact() {
		if (fact == null) {
			fact = new EObjectContainmentEList<Fact>(Fact.class, this, SmcPackage.SMC__FACT);
		}
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmcPackage.SMC__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case SmcPackage.SMC__CONTRACT:
				return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
			case SmcPackage.SMC__PROCESS_DEFINITION:
				return ((InternalEList<?>)getProcessDefinition()).basicRemove(otherEnd, msgs);
			case SmcPackage.SMC__BEHAVIOR_TERM:
				return ((InternalEList<?>)getBehaviorTerm()).basicRemove(otherEnd, msgs);
			case SmcPackage.SMC__PLAYER_BINDING:
				return ((InternalEList<?>)getPlayerBinding()).basicRemove(otherEnd, msgs);
			case SmcPackage.SMC__MESSAGE_ANALYZER:
				return ((InternalEList<?>)getMessageAnalyzer()).basicRemove(otherEnd, msgs);
			case SmcPackage.SMC__FACT:
				return ((InternalEList<?>)getFact()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmcPackage.SMC__ROLE:
				return getRole();
			case SmcPackage.SMC__CONTRACT:
				return getContract();
			case SmcPackage.SMC__PROCESS_DEFINITION:
				return getProcessDefinition();
			case SmcPackage.SMC__BEHAVIOR_TERM:
				return getBehaviorTerm();
			case SmcPackage.SMC__PLAYER_BINDING:
				return getPlayerBinding();
			case SmcPackage.SMC__MESSAGE_ANALYZER:
				return getMessageAnalyzer();
			case SmcPackage.SMC__RULES_DIR:
				return getRulesDir();
			case SmcPackage.SMC__ROUTING_RULE_FILE:
				return getRoutingRuleFile();
			case SmcPackage.SMC__COMPOSITE_RULE_FILE:
				return getCompositeRuleFile();
			case SmcPackage.SMC__ORGANIZER_BINDING:
				return getOrganizerBinding();
			case SmcPackage.SMC__DESCRIPTION:
				return getDescription();
			case SmcPackage.SMC__FACT:
				return getFact();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmcPackage.SMC__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case SmcPackage.SMC__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Contract>)newValue);
				return;
			case SmcPackage.SMC__PROCESS_DEFINITION:
				getProcessDefinition().clear();
				getProcessDefinition().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case SmcPackage.SMC__BEHAVIOR_TERM:
				getBehaviorTerm().clear();
				getBehaviorTerm().addAll((Collection<? extends BehaviorTerm>)newValue);
				return;
			case SmcPackage.SMC__PLAYER_BINDING:
				getPlayerBinding().clear();
				getPlayerBinding().addAll((Collection<? extends PlayerBinding>)newValue);
				return;
			case SmcPackage.SMC__MESSAGE_ANALYZER:
				getMessageAnalyzer().clear();
				getMessageAnalyzer().addAll((Collection<? extends MessageAnalyzer>)newValue);
				return;
			case SmcPackage.SMC__RULES_DIR:
				setRulesDir((String)newValue);
				return;
			case SmcPackage.SMC__ROUTING_RULE_FILE:
				setRoutingRuleFile((String)newValue);
				return;
			case SmcPackage.SMC__COMPOSITE_RULE_FILE:
				setCompositeRuleFile((String)newValue);
				return;
			case SmcPackage.SMC__ORGANIZER_BINDING:
				setOrganizerBinding((String)newValue);
				return;
			case SmcPackage.SMC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SmcPackage.SMC__FACT:
				getFact().clear();
				getFact().addAll((Collection<? extends Fact>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmcPackage.SMC__ROLE:
				getRole().clear();
				return;
			case SmcPackage.SMC__CONTRACT:
				getContract().clear();
				return;
			case SmcPackage.SMC__PROCESS_DEFINITION:
				getProcessDefinition().clear();
				return;
			case SmcPackage.SMC__BEHAVIOR_TERM:
				getBehaviorTerm().clear();
				return;
			case SmcPackage.SMC__PLAYER_BINDING:
				getPlayerBinding().clear();
				return;
			case SmcPackage.SMC__MESSAGE_ANALYZER:
				getMessageAnalyzer().clear();
				return;
			case SmcPackage.SMC__RULES_DIR:
				setRulesDir(RULES_DIR_EDEFAULT);
				return;
			case SmcPackage.SMC__ROUTING_RULE_FILE:
				setRoutingRuleFile(ROUTING_RULE_FILE_EDEFAULT);
				return;
			case SmcPackage.SMC__COMPOSITE_RULE_FILE:
				setCompositeRuleFile(COMPOSITE_RULE_FILE_EDEFAULT);
				return;
			case SmcPackage.SMC__ORGANIZER_BINDING:
				setOrganizerBinding(ORGANIZER_BINDING_EDEFAULT);
				return;
			case SmcPackage.SMC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SmcPackage.SMC__FACT:
				getFact().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmcPackage.SMC__ROLE:
				return role != null && !role.isEmpty();
			case SmcPackage.SMC__CONTRACT:
				return contract != null && !contract.isEmpty();
			case SmcPackage.SMC__PROCESS_DEFINITION:
				return processDefinition != null && !processDefinition.isEmpty();
			case SmcPackage.SMC__BEHAVIOR_TERM:
				return behaviorTerm != null && !behaviorTerm.isEmpty();
			case SmcPackage.SMC__PLAYER_BINDING:
				return playerBinding != null && !playerBinding.isEmpty();
			case SmcPackage.SMC__MESSAGE_ANALYZER:
				return messageAnalyzer != null && !messageAnalyzer.isEmpty();
			case SmcPackage.SMC__RULES_DIR:
				return RULES_DIR_EDEFAULT == null ? rulesDir != null : !RULES_DIR_EDEFAULT.equals(rulesDir);
			case SmcPackage.SMC__ROUTING_RULE_FILE:
				return ROUTING_RULE_FILE_EDEFAULT == null ? routingRuleFile != null : !ROUTING_RULE_FILE_EDEFAULT.equals(routingRuleFile);
			case SmcPackage.SMC__COMPOSITE_RULE_FILE:
				return COMPOSITE_RULE_FILE_EDEFAULT == null ? compositeRuleFile != null : !COMPOSITE_RULE_FILE_EDEFAULT.equals(compositeRuleFile);
			case SmcPackage.SMC__ORGANIZER_BINDING:
				return ORGANIZER_BINDING_EDEFAULT == null ? organizerBinding != null : !ORGANIZER_BINDING_EDEFAULT.equals(organizerBinding);
			case SmcPackage.SMC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SmcPackage.SMC__FACT:
				return fact != null && !fact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rulesDir: ");
		result.append(rulesDir);
		result.append(", routingRuleFile: ");
		result.append(routingRuleFile);
		result.append(", compositeRuleFile: ");
		result.append(compositeRuleFile);
		result.append(", OrganizerBinding: ");
		result.append(organizerBinding);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SMCImpl
