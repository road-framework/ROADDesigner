/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.ResultMsg;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl#getContractId <em>Contract Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl#getTermId <em>Term Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl#isIsResponse <em>Is Response</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ResultMsgImpl#getFactId <em>Fact Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultMsgImpl extends EObjectImpl implements ResultMsg {
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
	 * The default value of the '{@link #getContractId() <em>Contract Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContractId() <em>Contract Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractId()
	 * @generated
	 * @ordered
	 */
	protected String contractId = CONTRACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermId() <em>Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermId()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermId() <em>Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermId()
	 * @generated
	 * @ordered
	 */
	protected String termId = TERM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getFactId() <em>Fact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactId() <em>Fact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactId()
	 * @generated
	 * @ordered
	 */
	protected String factId = FACT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.RESULT_MSG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.RESULT_MSG__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContractId() {
		return contractId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractId(String newContractId) {
		String oldContractId = contractId;
		contractId = newContractId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.RESULT_MSG__CONTRACT_ID, oldContractId, contractId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermId() {
		return termId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermId(String newTermId) {
		String oldTermId = termId;
		termId = newTermId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.RESULT_MSG__TERM_ID, oldTermId, termId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.RESULT_MSG__IS_RESPONSE, oldIsResponse, isResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactId() {
		return factId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactId(String newFactId) {
		String oldFactId = factId;
		factId = newFactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.RESULT_MSG__FACT_ID, oldFactId, factId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmcPackage.RESULT_MSG__TRANSFORMATION:
				return getTransformation();
			case SmcPackage.RESULT_MSG__CONTRACT_ID:
				return getContractId();
			case SmcPackage.RESULT_MSG__TERM_ID:
				return getTermId();
			case SmcPackage.RESULT_MSG__IS_RESPONSE:
				return isIsResponse();
			case SmcPackage.RESULT_MSG__FACT_ID:
				return getFactId();
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
			case SmcPackage.RESULT_MSG__TRANSFORMATION:
				setTransformation((String)newValue);
				return;
			case SmcPackage.RESULT_MSG__CONTRACT_ID:
				setContractId((String)newValue);
				return;
			case SmcPackage.RESULT_MSG__TERM_ID:
				setTermId((String)newValue);
				return;
			case SmcPackage.RESULT_MSG__IS_RESPONSE:
				setIsResponse((Boolean)newValue);
				return;
			case SmcPackage.RESULT_MSG__FACT_ID:
				setFactId((String)newValue);
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
			case SmcPackage.RESULT_MSG__TRANSFORMATION:
				setTransformation(TRANSFORMATION_EDEFAULT);
				return;
			case SmcPackage.RESULT_MSG__CONTRACT_ID:
				setContractId(CONTRACT_ID_EDEFAULT);
				return;
			case SmcPackage.RESULT_MSG__TERM_ID:
				setTermId(TERM_ID_EDEFAULT);
				return;
			case SmcPackage.RESULT_MSG__IS_RESPONSE:
				setIsResponse(IS_RESPONSE_EDEFAULT);
				return;
			case SmcPackage.RESULT_MSG__FACT_ID:
				setFactId(FACT_ID_EDEFAULT);
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
			case SmcPackage.RESULT_MSG__TRANSFORMATION:
				return TRANSFORMATION_EDEFAULT == null ? transformation != null : !TRANSFORMATION_EDEFAULT.equals(transformation);
			case SmcPackage.RESULT_MSG__CONTRACT_ID:
				return CONTRACT_ID_EDEFAULT == null ? contractId != null : !CONTRACT_ID_EDEFAULT.equals(contractId);
			case SmcPackage.RESULT_MSG__TERM_ID:
				return TERM_ID_EDEFAULT == null ? termId != null : !TERM_ID_EDEFAULT.equals(termId);
			case SmcPackage.RESULT_MSG__IS_RESPONSE:
				return isResponse != IS_RESPONSE_EDEFAULT;
			case SmcPackage.RESULT_MSG__FACT_ID:
				return FACT_ID_EDEFAULT == null ? factId != null : !FACT_ID_EDEFAULT.equals(factId);
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
		result.append(" (transformation: ");
		result.append(transformation);
		result.append(", contractId: ");
		result.append(contractId);
		result.append(", termId: ");
		result.append(termId);
		result.append(", isResponse: ");
		result.append(isResponse);
		result.append(", factId: ");
		result.append(factId);
		result.append(')');
		return result.toString();
	}

} //ResultMsgImpl
