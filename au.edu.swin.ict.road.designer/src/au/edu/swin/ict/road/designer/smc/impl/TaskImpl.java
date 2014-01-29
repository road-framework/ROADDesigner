/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.InMsg;
import au.edu.swin.ict.road.designer.smc.OutMsg;
import au.edu.swin.ict.road.designer.smc.ResultMsg;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.SrcMsg;
import au.edu.swin.ict.road.designer.smc.Task;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl#getMsgAnalyser <em>Msg Analyser</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl#getIn <em>In</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl#getOut <em>Out</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl#isIsMsgDriven <em>Is Msg Driven</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl#getResultMsg <em>Result Msg</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.TaskImpl#getSrcMsg <em>Src Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
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
	 * The default value of the '{@link #getMsgAnalyser() <em>Msg Analyser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgAnalyser()
	 * @generated
	 * @ordered
	 */
	protected static final String MSG_ANALYSER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMsgAnalyser() <em>Msg Analyser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgAnalyser()
	 * @generated
	 * @ordered
	 */
	protected String msgAnalyser = MSG_ANALYSER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected InMsg in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected OutMsg out;

	/**
	 * The default value of the '{@link #isIsMsgDriven() <em>Is Msg Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMsgDriven()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MSG_DRIVEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMsgDriven() <em>Is Msg Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMsgDriven()
	 * @generated
	 * @ordered
	 */
	protected boolean isMsgDriven = IS_MSG_DRIVEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultMsg() <em>Result Msg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMsg()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultMsg> resultMsg;

	/**
	 * The cached value of the '{@link #getSrcMsg() <em>Src Msg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcMsg()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcMsg> srcMsg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMsgAnalyser() {
		return msgAnalyser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgAnalyser(String newMsgAnalyser) {
		String oldMsgAnalyser = msgAnalyser;
		msgAnalyser = newMsgAnalyser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK__MSG_ANALYSER, oldMsgAnalyser, msgAnalyser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMsg getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(InMsg newIn, NotificationChain msgs) {
		InMsg oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmcPackage.TASK__IN, oldIn, newIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(InMsg newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmcPackage.TASK__IN, null, msgs);
			if (newIn != null)
				msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmcPackage.TASK__IN, null, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMsg getOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOut(OutMsg newOut, NotificationChain msgs) {
		OutMsg oldOut = out;
		out = newOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmcPackage.TASK__OUT, oldOut, newOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(OutMsg newOut) {
		if (newOut != out) {
			NotificationChain msgs = null;
			if (out != null)
				msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmcPackage.TASK__OUT, null, msgs);
			if (newOut != null)
				msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmcPackage.TASK__OUT, null, msgs);
			msgs = basicSetOut(newOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK__OUT, newOut, newOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMsgDriven() {
		return isMsgDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMsgDriven(boolean newIsMsgDriven) {
		boolean oldIsMsgDriven = isMsgDriven;
		isMsgDriven = newIsMsgDriven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.TASK__IS_MSG_DRIVEN, oldIsMsgDriven, isMsgDriven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultMsg> getResultMsg() {
		if (resultMsg == null) {
			resultMsg = new EObjectContainmentEList<ResultMsg>(ResultMsg.class, this, SmcPackage.TASK__RESULT_MSG);
		}
		return resultMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcMsg> getSrcMsg() {
		if (srcMsg == null) {
			srcMsg = new EObjectContainmentEList<SrcMsg>(SrcMsg.class, this, SmcPackage.TASK__SRC_MSG);
		}
		return srcMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmcPackage.TASK__IN:
				return basicSetIn(null, msgs);
			case SmcPackage.TASK__OUT:
				return basicSetOut(null, msgs);
			case SmcPackage.TASK__RESULT_MSG:
				return ((InternalEList<?>)getResultMsg()).basicRemove(otherEnd, msgs);
			case SmcPackage.TASK__SRC_MSG:
				return ((InternalEList<?>)getSrcMsg()).basicRemove(otherEnd, msgs);
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
			case SmcPackage.TASK__ID:
				return getId();
			case SmcPackage.TASK__MSG_ANALYSER:
				return getMsgAnalyser();
			case SmcPackage.TASK__IN:
				return getIn();
			case SmcPackage.TASK__OUT:
				return getOut();
			case SmcPackage.TASK__IS_MSG_DRIVEN:
				return isIsMsgDriven();
			case SmcPackage.TASK__RESULT_MSG:
				return getResultMsg();
			case SmcPackage.TASK__SRC_MSG:
				return getSrcMsg();
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
			case SmcPackage.TASK__ID:
				setId((String)newValue);
				return;
			case SmcPackage.TASK__MSG_ANALYSER:
				setMsgAnalyser((String)newValue);
				return;
			case SmcPackage.TASK__IN:
				setIn((InMsg)newValue);
				return;
			case SmcPackage.TASK__OUT:
				setOut((OutMsg)newValue);
				return;
			case SmcPackage.TASK__IS_MSG_DRIVEN:
				setIsMsgDriven((Boolean)newValue);
				return;
			case SmcPackage.TASK__RESULT_MSG:
				getResultMsg().clear();
				getResultMsg().addAll((Collection<? extends ResultMsg>)newValue);
				return;
			case SmcPackage.TASK__SRC_MSG:
				getSrcMsg().clear();
				getSrcMsg().addAll((Collection<? extends SrcMsg>)newValue);
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
			case SmcPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case SmcPackage.TASK__MSG_ANALYSER:
				setMsgAnalyser(MSG_ANALYSER_EDEFAULT);
				return;
			case SmcPackage.TASK__IN:
				setIn((InMsg)null);
				return;
			case SmcPackage.TASK__OUT:
				setOut((OutMsg)null);
				return;
			case SmcPackage.TASK__IS_MSG_DRIVEN:
				setIsMsgDriven(IS_MSG_DRIVEN_EDEFAULT);
				return;
			case SmcPackage.TASK__RESULT_MSG:
				getResultMsg().clear();
				return;
			case SmcPackage.TASK__SRC_MSG:
				getSrcMsg().clear();
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
			case SmcPackage.TASK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SmcPackage.TASK__MSG_ANALYSER:
				return MSG_ANALYSER_EDEFAULT == null ? msgAnalyser != null : !MSG_ANALYSER_EDEFAULT.equals(msgAnalyser);
			case SmcPackage.TASK__IN:
				return in != null;
			case SmcPackage.TASK__OUT:
				return out != null;
			case SmcPackage.TASK__IS_MSG_DRIVEN:
				return isMsgDriven != IS_MSG_DRIVEN_EDEFAULT;
			case SmcPackage.TASK__RESULT_MSG:
				return resultMsg != null && !resultMsg.isEmpty();
			case SmcPackage.TASK__SRC_MSG:
				return srcMsg != null && !srcMsg.isEmpty();
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
		result.append(", msgAnalyser: ");
		result.append(msgAnalyser);
		result.append(", isMsgDriven: ");
		result.append(isMsgDriven);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
