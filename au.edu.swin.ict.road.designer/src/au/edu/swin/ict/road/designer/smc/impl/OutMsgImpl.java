/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.MessageType;
import au.edu.swin.ict.road.designer.smc.Operation;
import au.edu.swin.ict.road.designer.smc.OutMsg;
import au.edu.swin.ict.road.designer.smc.Parameter;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl#getDeliveryType <em>Delivery Type</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl#isIsResponse <em>Is Response</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.OutMsgImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutMsgImpl extends EObjectImpl implements OutMsg {
	/**
	 * The default value of the '{@link #getDeliveryType() <em>Delivery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageType DELIVERY_TYPE_EDEFAULT = MessageType.PUSH;

	/**
	 * The cached value of the '{@link #getDeliveryType() <em>Delivery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryType()
	 * @generated
	 * @ordered
	 */
	protected MessageType deliveryType = DELIVERY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformation() <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected String transformation = TRANSFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsResponse() <em>Is Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResponse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESPONSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsResponse() <em>Is Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResponse()
	 * @generated
	 * @ordered
	 */
	protected boolean isResponse = IS_RESPONSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.OUT_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getDeliveryType() {
		return deliveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryType(MessageType newDeliveryType) {
		MessageType oldDeliveryType = deliveryType;
		deliveryType = newDeliveryType == null ? DELIVERY_TYPE_EDEFAULT : newDeliveryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.OUT_MSG__DELIVERY_TYPE, oldDeliveryType, deliveryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(String newTransformation) {
		String oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.OUT_MSG__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsResponse() {
		return isResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsResponse(boolean newIsResponse) {
		boolean oldIsResponse = isResponse;
		isResponse = newIsResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.OUT_MSG__IS_RESPONSE, oldIsResponse, isResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmcPackage.OUT_MSG__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmcPackage.OUT_MSG__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmcPackage.OUT_MSG__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.OUT_MSG__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmcPackage.OUT_MSG__OPERATION:
				return basicSetOperation(null, msgs);
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
			case SmcPackage.OUT_MSG__DELIVERY_TYPE:
				return getDeliveryType();
			case SmcPackage.OUT_MSG__TRANSFORMATION:
				return getTransformation();
			case SmcPackage.OUT_MSG__IS_RESPONSE:
				return isIsResponse();
			case SmcPackage.OUT_MSG__OPERATION:
				return getOperation();
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
			case SmcPackage.OUT_MSG__DELIVERY_TYPE:
				setDeliveryType((MessageType)newValue);
				return;
			case SmcPackage.OUT_MSG__TRANSFORMATION:
				setTransformation((String)newValue);
				return;
			case SmcPackage.OUT_MSG__IS_RESPONSE:
				setIsResponse((Boolean)newValue);
				return;
			case SmcPackage.OUT_MSG__OPERATION:
				setOperation((Operation)newValue);
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
			case SmcPackage.OUT_MSG__DELIVERY_TYPE:
				setDeliveryType(DELIVERY_TYPE_EDEFAULT);
				return;
			case SmcPackage.OUT_MSG__TRANSFORMATION:
				setTransformation(TRANSFORMATION_EDEFAULT);
				return;
			case SmcPackage.OUT_MSG__IS_RESPONSE:
				setIsResponse(IS_RESPONSE_EDEFAULT);
				return;
			case SmcPackage.OUT_MSG__OPERATION:
				setOperation((Operation)null);
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
			case SmcPackage.OUT_MSG__DELIVERY_TYPE:
				return deliveryType != DELIVERY_TYPE_EDEFAULT;
			case SmcPackage.OUT_MSG__TRANSFORMATION:
				return TRANSFORMATION_EDEFAULT == null ? transformation != null : !TRANSFORMATION_EDEFAULT.equals(transformation);
			case SmcPackage.OUT_MSG__IS_RESPONSE:
				return isResponse != IS_RESPONSE_EDEFAULT;
			case SmcPackage.OUT_MSG__OPERATION:
				return operation != null;
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
		result.append(" (deliveryType: ");
		result.append(deliveryType);
		result.append(", Transformation: ");
		result.append(transformation);
		result.append(", isResponse: ");
		result.append(isResponse);
		result.append(')');
		return result.toString();
	}

} //OutMsgImpl
