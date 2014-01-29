/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.Task;
import au.edu.swin.ict.road.designer.smc.TaskRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl#getPreEP <em>Pre EP</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl#getPostEP <em>Post EP</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl#getPerformanceVal <em>Performance Val</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskRefImpl#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskRefImpl extends EObjectImpl implements TaskRef {
	/**
	 * The default value of the '{@link #getPreEP() <em>Pre EP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreEP()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_EP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreEP() <em>Pre EP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreEP()
	 * @generated
	 * @ordered
	 */
	protected String preEP = PRE_EP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostEP() <em>Post EP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostEP()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_EP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostEP() <em>Post EP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostEP()
	 * @generated
	 * @ordered
	 */
	protected String postEP = POST_EP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceVal() <em>Performance Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceVal()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceVal() <em>Performance Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceVal()
	 * @generated
	 * @ordered
	 */
	protected String performanceVal = PERFORMANCE_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.TASK_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreEP() {
		return preEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreEP(String newPreEP) {
		String oldPreEP = preEP;
		preEP = newPreEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK_REF__PRE_EP, oldPreEP, preEP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostEP() {
		return postEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostEP(String newPostEP) {
		String oldPostEP = postEP;
		postEP = newPostEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK_REF__POST_EP, oldPostEP, postEP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceVal() {
		return performanceVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceVal(String newPerformanceVal) {
		String oldPerformanceVal = performanceVal;
		performanceVal = newPerformanceVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK_REF__PERFORMANCE_VAL, oldPerformanceVal, performanceVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.TASK_REF__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK_REF__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmcPackage.TASK_REF__PRE_EP:
				return getPreEP();
			case SmcPackage.TASK_REF__POST_EP:
				return getPostEP();
			case SmcPackage.TASK_REF__PERFORMANCE_VAL:
				return getPerformanceVal();
			case SmcPackage.TASK_REF__TASK:
				if (resolve) return getTask();
				return basicGetTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmcPackage.TASK_REF__PRE_EP:
				setPreEP((String)newValue);
				return;
			case SmcPackage.TASK_REF__POST_EP:
				setPostEP((String)newValue);
				return;
			case SmcPackage.TASK_REF__PERFORMANCE_VAL:
				setPerformanceVal((String)newValue);
				return;
			case SmcPackage.TASK_REF__TASK:
				setTask((Task)newValue);
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
			case SmcPackage.TASK_REF__PRE_EP:
				setPreEP(PRE_EP_EDEFAULT);
				return;
			case SmcPackage.TASK_REF__POST_EP:
				setPostEP(POST_EP_EDEFAULT);
				return;
			case SmcPackage.TASK_REF__PERFORMANCE_VAL:
				setPerformanceVal(PERFORMANCE_VAL_EDEFAULT);
				return;
			case SmcPackage.TASK_REF__TASK:
				setTask((Task)null);
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
			case SmcPackage.TASK_REF__PRE_EP:
				return PRE_EP_EDEFAULT == null ? preEP != null : !PRE_EP_EDEFAULT.equals(preEP);
			case SmcPackage.TASK_REF__POST_EP:
				return POST_EP_EDEFAULT == null ? postEP != null : !POST_EP_EDEFAULT.equals(postEP);
			case SmcPackage.TASK_REF__PERFORMANCE_VAL:
				return PERFORMANCE_VAL_EDEFAULT == null ? performanceVal != null : !PERFORMANCE_VAL_EDEFAULT.equals(performanceVal);
			case SmcPackage.TASK_REF__TASK:
				return task != null;
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
		result.append(" (preEP: ");
		result.append(preEP);
		result.append(", postEP: ");
		result.append(postEP);
		result.append(", performanceVal: ");
		result.append(performanceVal);
		result.append(')');
		return result.toString();
	}

} //TaskRefImpl
