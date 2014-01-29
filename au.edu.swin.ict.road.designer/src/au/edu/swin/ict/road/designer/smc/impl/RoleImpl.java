/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.Task;

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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl#getTask <em>Task</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl#getExternalFactLink <em>External Fact Link</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.RoleImpl#getManagementResponsibilities <em>Management Responsibilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends FactAccessorImpl implements Role {
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
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The cached value of the '{@link #getExternalFactLink() <em>External Fact Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFactLink()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalFactLink> externalFactLink;

	/**
	 * The default value of the '{@link #getManagementResponsibilities() <em>Management Responsibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGEMENT_RESPONSIBILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagementResponsibilities() <em>Management Responsibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected String managementResponsibilities = MANAGEMENT_RESPONSIBILITIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.ROLE__ID, oldId, id));
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.ROLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.ROLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this, SmcPackage.ROLE__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalFactLink> getExternalFactLink() {
		if (externalFactLink == null) {
			externalFactLink = new EObjectContainmentEList<ExternalFactLink>(ExternalFactLink.class, this, SmcPackage.ROLE__EXTERNAL_FACT_LINK);
		}
		return externalFactLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManagementResponsibilities() {
		return managementResponsibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementResponsibilities(String newManagementResponsibilities) {
		String oldManagementResponsibilities = managementResponsibilities;
		managementResponsibilities = newManagementResponsibilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.ROLE__MANAGEMENT_RESPONSIBILITIES, oldManagementResponsibilities, managementResponsibilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmcPackage.ROLE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case SmcPackage.ROLE__EXTERNAL_FACT_LINK:
				return ((InternalEList<?>)getExternalFactLink()).basicRemove(otherEnd, msgs);
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
			case SmcPackage.ROLE__ID:
				return getId();
			case SmcPackage.ROLE__NAME:
				return getName();
			case SmcPackage.ROLE__DESCRIPTION:
				return getDescription();
			case SmcPackage.ROLE__TASK:
				return getTask();
			case SmcPackage.ROLE__EXTERNAL_FACT_LINK:
				return getExternalFactLink();
			case SmcPackage.ROLE__MANAGEMENT_RESPONSIBILITIES:
				return getManagementResponsibilities();
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
			case SmcPackage.ROLE__ID:
				setId((String)newValue);
				return;
			case SmcPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case SmcPackage.ROLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SmcPackage.ROLE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
			case SmcPackage.ROLE__EXTERNAL_FACT_LINK:
				getExternalFactLink().clear();
				getExternalFactLink().addAll((Collection<? extends ExternalFactLink>)newValue);
				return;
			case SmcPackage.ROLE__MANAGEMENT_RESPONSIBILITIES:
				setManagementResponsibilities((String)newValue);
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
			case SmcPackage.ROLE__ID:
				setId(ID_EDEFAULT);
				return;
			case SmcPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmcPackage.ROLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SmcPackage.ROLE__TASK:
				getTask().clear();
				return;
			case SmcPackage.ROLE__EXTERNAL_FACT_LINK:
				getExternalFactLink().clear();
				return;
			case SmcPackage.ROLE__MANAGEMENT_RESPONSIBILITIES:
				setManagementResponsibilities(MANAGEMENT_RESPONSIBILITIES_EDEFAULT);
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
			case SmcPackage.ROLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SmcPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmcPackage.ROLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SmcPackage.ROLE__TASK:
				return task != null && !task.isEmpty();
			case SmcPackage.ROLE__EXTERNAL_FACT_LINK:
				return externalFactLink != null && !externalFactLink.isEmpty();
			case SmcPackage.ROLE__MANAGEMENT_RESPONSIBILITIES:
				return MANAGEMENT_RESPONSIBILITIES_EDEFAULT == null ? managementResponsibilities != null : !MANAGEMENT_RESPONSIBILITIES_EDEFAULT.equals(managementResponsibilities);
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
		result.append(", Description: ");
		result.append(description);
		result.append(", ManagementResponsibilities: ");
		result.append(managementResponsibilities);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
