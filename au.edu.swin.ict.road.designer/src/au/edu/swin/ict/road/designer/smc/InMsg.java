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
 * A representation of the model object '<em><b>In Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.InMsg#isIsResponse <em>Is Response</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.InMsg#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getInMsg()
 * @model
 * @generated
 */
public interface InMsg extends EObject {
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getInMsg_IsResponse()
	 * @model
	 * @generated
	 */
	boolean isIsResponse();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.InMsg#isIsResponse <em>Is Response</em>}' attribute.
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getInMsg_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.InMsg#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // InMsg
