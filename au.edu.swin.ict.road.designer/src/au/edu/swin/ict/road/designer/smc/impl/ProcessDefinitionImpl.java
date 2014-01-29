/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.BehaviorTerm;
import au.edu.swin.ict.road.designer.smc.Constraint;
import au.edu.swin.ict.road.designer.smc.ProcessDefinition;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl#getDescr <em>Descr</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl#getCoS <em>Co S</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl#getCoT <em>Co T</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProcessDefinitionImpl#getBehaviorTerm <em>Behavior Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessDefinitionImpl extends EObjectImpl implements ProcessDefinition {
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
	 * The default value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected String descr = DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoS() <em>Co S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoS()
	 * @generated
	 * @ordered
	 */
	protected static final String CO_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoS() <em>Co S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoS()
	 * @generated
	 * @ordered
	 */
	protected String coS = CO_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoT() <em>Co T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoT()
	 * @generated
	 * @ordered
	 */
	protected static final String CO_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoT() <em>Co T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoT()
	 * @generated
	 * @ordered
	 */
	protected String coT = CO_T_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getBehaviorTerm() <em>Behavior Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTerm> behaviorTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.PROCESS_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PROCESS_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescr() {
		return descr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescr(String newDescr) {
		String oldDescr = descr;
		descr = newDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PROCESS_DEFINITION__DESCR, oldDescr, descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoS() {
		return coS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoS(String newCoS) {
		String oldCoS = coS;
		coS = newCoS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PROCESS_DEFINITION__CO_S, oldCoS, coS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoT() {
		return coT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoT(String newCoT) {
		String oldCoT = coT;
		coT = newCoT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PROCESS_DEFINITION__CO_T, oldCoT, coT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, SmcPackage.PROCESS_DEFINITION__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTerm> getBehaviorTerm() {
		if (behaviorTerm == null) {
			behaviorTerm = new EObjectResolvingEList<BehaviorTerm>(BehaviorTerm.class, this, SmcPackage.PROCESS_DEFINITION__BEHAVIOR_TERM);
		}
		return behaviorTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmcPackage.PROCESS_DEFINITION__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
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
			case SmcPackage.PROCESS_DEFINITION__ID:
				return getId();
			case SmcPackage.PROCESS_DEFINITION__DESCR:
				return getDescr();
			case SmcPackage.PROCESS_DEFINITION__CO_S:
				return getCoS();
			case SmcPackage.PROCESS_DEFINITION__CO_T:
				return getCoT();
			case SmcPackage.PROCESS_DEFINITION__CONSTRAINT:
				return getConstraint();
			case SmcPackage.PROCESS_DEFINITION__BEHAVIOR_TERM:
				return getBehaviorTerm();
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
			case SmcPackage.PROCESS_DEFINITION__ID:
				setId((String)newValue);
				return;
			case SmcPackage.PROCESS_DEFINITION__DESCR:
				setDescr((String)newValue);
				return;
			case SmcPackage.PROCESS_DEFINITION__CO_S:
				setCoS((String)newValue);
				return;
			case SmcPackage.PROCESS_DEFINITION__CO_T:
				setCoT((String)newValue);
				return;
			case SmcPackage.PROCESS_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case SmcPackage.PROCESS_DEFINITION__BEHAVIOR_TERM:
				getBehaviorTerm().clear();
				getBehaviorTerm().addAll((Collection<? extends BehaviorTerm>)newValue);
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
			case SmcPackage.PROCESS_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case SmcPackage.PROCESS_DEFINITION__DESCR:
				setDescr(DESCR_EDEFAULT);
				return;
			case SmcPackage.PROCESS_DEFINITION__CO_S:
				setCoS(CO_S_EDEFAULT);
				return;
			case SmcPackage.PROCESS_DEFINITION__CO_T:
				setCoT(CO_T_EDEFAULT);
				return;
			case SmcPackage.PROCESS_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				return;
			case SmcPackage.PROCESS_DEFINITION__BEHAVIOR_TERM:
				getBehaviorTerm().clear();
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
			case SmcPackage.PROCESS_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SmcPackage.PROCESS_DEFINITION__DESCR:
				return DESCR_EDEFAULT == null ? descr != null : !DESCR_EDEFAULT.equals(descr);
			case SmcPackage.PROCESS_DEFINITION__CO_S:
				return CO_S_EDEFAULT == null ? coS != null : !CO_S_EDEFAULT.equals(coS);
			case SmcPackage.PROCESS_DEFINITION__CO_T:
				return CO_T_EDEFAULT == null ? coT != null : !CO_T_EDEFAULT.equals(coT);
			case SmcPackage.PROCESS_DEFINITION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case SmcPackage.PROCESS_DEFINITION__BEHAVIOR_TERM:
				return behaviorTerm != null && !behaviorTerm.isEmpty();
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
		result.append(", descr: ");
		result.append(descr);
		result.append(", CoS: ");
		result.append(coS);
		result.append(", CoT: ");
		result.append(coT);
		result.append(')');
		return result.toString();
	}

} //ProcessDefinitionImpl
