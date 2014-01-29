/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.OutMsg#getDeliveryType <em>Delivery Type</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.OutMsg#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.OutMsg#isIsResponse <em>Is Response</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.OutMsg#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getOutMsg()
 * @model
 * @generated
 */
public interface OutMsg extends EObject {
	/**
	 * Returns the value of the '<em><b>Delivery Type</b></em>' attribute.
	 * The literals are from the enumeration {@link au.edu.swin.ict.road.designer.smc.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Type</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.MessageType
	 * @see #setDeliveryType(MessageType)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getOutMsg_DeliveryType()
	 * @model
	 * @generated
	 */
	MessageType getDeliveryType();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.OutMsg#getDeliveryType <em>Delivery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Type</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.MessageType
	 * @see #getDeliveryType()
	 * @generated
	 */
	void setDeliveryType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' attribute.
	 * @see #setTransformation(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getOutMsg_Transformation()
	 * @model
	 * @generated
	 */
	String getTransformation();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.OutMsg#getTransformation <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' attribute.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(String value);

	/**
	 * Returns the value of the '<em><b>Is Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Response</em>' attribute.
	 * @see #setIsResponse(boolean)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getOutMsg_IsResponse()
	 * @model
	 * @generated
	 */
	boolean isIsResponse();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.OutMsg#isIsResponse <em>Is Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Response</em>' attribute.
	 * @see #isIsResponse()
	 * @generated
	 */
	void setIsResponse(boolean value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getOutMsg_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.OutMsg#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // OutMsg
