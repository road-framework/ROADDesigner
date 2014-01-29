/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.Term;

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
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getType <em>Type</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getRuleFile <em>Rule File</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getRoleAID <em>Role AID</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getRoleBID <em>Role BID</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getState <em>State</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ContractImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractImpl extends FactAccessorImpl implements Contract {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleFile() <em>Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleFile()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleFile() <em>Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleFile()
	 * @generated
	 * @ordered
	 */
	protected String ruleFile = RULE_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoleAID() <em>Role AID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAID()
	 * @generated
	 * @ordered
	 */
	protected Role roleAID;

	/**
	 * The cached value of the '{@link #getRoleBID() <em>Role BID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleBID()
	 * @generated
	 * @ordered
	 */
	protected Role roleBID;

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
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> term;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Automatically assign the same value to id if it is not set yet.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__NAME, oldName, name));
		
		if (id==null || id.length()==0)
			id = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleFile() {
		return ruleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleFile(String newRuleFile) {
		String oldRuleFile = ruleFile;
		ruleFile = newRuleFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__RULE_FILE, oldRuleFile, ruleFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRoleAID() {
		if (roleAID != null && roleAID.eIsProxy()) {
			InternalEObject oldRoleAID = (InternalEObject)roleAID;
			roleAID = (Role)eResolveProxy(oldRoleAID);
			if (roleAID != oldRoleAID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.CONTRACT__ROLE_AID, oldRoleAID, roleAID));
			}
		}
		return roleAID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRoleAID() {
		return roleAID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleAID(Role newRoleAID) {
		Role oldRoleAID = roleAID;
		roleAID = newRoleAID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__ROLE_AID, oldRoleAID, roleAID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRoleBID() {
		if (roleBID != null && roleBID.eIsProxy()) {
			InternalEObject oldRoleBID = (InternalEObject)roleBID;
			roleBID = (Role)eResolveProxy(oldRoleBID);
			if (roleBID != oldRoleBID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.CONTRACT__ROLE_BID, oldRoleBID, roleBID));
			}
		}
		return roleBID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRoleBID() {
		return roleBID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleBID(Role newRoleBID) {
		Role oldRoleBID = roleBID;
		roleBID = newRoleBID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__ROLE_BID, oldRoleBID, roleBID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.CONTRACT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<Term>(Term.class, this, SmcPackage.CONTRACT__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmcPackage.CONTRACT__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
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
			case SmcPackage.CONTRACT__ID:
				return getId();
			case SmcPackage.CONTRACT__NAME:
				return getName();
			case SmcPackage.CONTRACT__TYPE:
				return getType();
			case SmcPackage.CONTRACT__RULE_FILE:
				return getRuleFile();
			case SmcPackage.CONTRACT__ROLE_AID:
				if (resolve) return getRoleAID();
				return basicGetRoleAID();
			case SmcPackage.CONTRACT__ROLE_BID:
				if (resolve) return getRoleBID();
				return basicGetRoleBID();
			case SmcPackage.CONTRACT__DESCRIPTION:
				return getDescription();
			case SmcPackage.CONTRACT__ABSTRACT:
				return isAbstract();
			case SmcPackage.CONTRACT__STATE:
				return getState();
			case SmcPackage.CONTRACT__TERM:
				return getTerm();
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
			case SmcPackage.CONTRACT__ID:
				setId((String)newValue);
				return;
			case SmcPackage.CONTRACT__NAME:
				setName((String)newValue);
				return;
			case SmcPackage.CONTRACT__TYPE:
				setType((String)newValue);
				return;
			case SmcPackage.CONTRACT__RULE_FILE:
				setRuleFile((String)newValue);
				return;
			case SmcPackage.CONTRACT__ROLE_AID:
				setRoleAID((Role)newValue);
				return;
			case SmcPackage.CONTRACT__ROLE_BID:
				setRoleBID((Role)newValue);
				return;
			case SmcPackage.CONTRACT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SmcPackage.CONTRACT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case SmcPackage.CONTRACT__STATE:
				setState((String)newValue);
				return;
			case SmcPackage.CONTRACT__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends Term>)newValue);
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
			case SmcPackage.CONTRACT__ID:
				setId(ID_EDEFAULT);
				return;
			case SmcPackage.CONTRACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmcPackage.CONTRACT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SmcPackage.CONTRACT__RULE_FILE:
				setRuleFile(RULE_FILE_EDEFAULT);
				return;
			case SmcPackage.CONTRACT__ROLE_AID:
				setRoleAID((Role)null);
				return;
			case SmcPackage.CONTRACT__ROLE_BID:
				setRoleBID((Role)null);
				return;
			case SmcPackage.CONTRACT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SmcPackage.CONTRACT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SmcPackage.CONTRACT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case SmcPackage.CONTRACT__TERM:
				getTerm().clear();
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
			case SmcPackage.CONTRACT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SmcPackage.CONTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmcPackage.CONTRACT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SmcPackage.CONTRACT__RULE_FILE:
				return RULE_FILE_EDEFAULT == null ? ruleFile != null : !RULE_FILE_EDEFAULT.equals(ruleFile);
			case SmcPackage.CONTRACT__ROLE_AID:
				return roleAID != null;
			case SmcPackage.CONTRACT__ROLE_BID:
				return roleBID != null;
			case SmcPackage.CONTRACT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SmcPackage.CONTRACT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SmcPackage.CONTRACT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case SmcPackage.CONTRACT__TERM:
				return term != null && !term.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", ruleFile: ");
		result.append(ruleFile);
		result.append(", Description: ");
		result.append(description);
		result.append(", Abstract: ");
		result.append(abstract_);
		result.append(", State: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ContractImpl
