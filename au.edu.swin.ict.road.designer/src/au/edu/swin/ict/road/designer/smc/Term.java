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
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Term#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Term#getName <em>Name</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Term#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Term#getDeonticType <em>Deontic Type</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Term#getDirection <em>Direction</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Term#getDescription <em>Description</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Term#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Term#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Term#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * The literals are from the enumeration {@link au.edu.swin.ict.road.designer.smc.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.MessageType
	 * @see #setMessageType(MessageType)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm_MessageType()
	 * @model
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Term#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.MessageType
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Deontic Type</b></em>' attribute.
	 * The literals are from the enumeration {@link au.edu.swin.ict.road.designer.smc.DeonticType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deontic Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deontic Type</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.DeonticType
	 * @see #setDeonticType(DeonticType)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm_DeonticType()
	 * @model
	 * @generated
	 */
	DeonticType getDeonticType();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Term#getDeonticType <em>Deontic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deontic Type</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.DeonticType
	 * @see #getDeonticType()
	 * @generated
	 */
	void setDeonticType(DeonticType value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link au.edu.swin.ict.road.designer.smc.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm_Direction()
	 * @model
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Term#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Term#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTerm_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

} // Term
