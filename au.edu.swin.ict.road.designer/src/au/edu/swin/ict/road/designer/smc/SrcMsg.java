/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getContractId <em>Contract Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getTermId <em>Term Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SrcMsg#isIsResponse <em>Is Response</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getFactId <em>Fact Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSrcMsg()
 * @model
 * @generated
 */
public interface SrcMsg extends EObject {
	/**
	 * Returns the value of the '<em><b>Contract Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Id</em>' attribute.
	 * @see #setContractId(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSrcMsg_ContractId()
	 * @model
	 * @generated
	 */
	String getContractId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getContractId <em>Contract Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Id</em>' attribute.
	 * @see #getContractId()
	 * @generated
	 */
	void setContractId(String value);

	/**
	 * Returns the value of the '<em><b>Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Id</em>' attribute.
	 * @see #setTermId(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSrcMsg_TermId()
	 * @model
	 * @generated
	 */
	String getTermId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getTermId <em>Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Id</em>' attribute.
	 * @see #getTermId()
	 * @generated
	 */
	void setTermId(String value);

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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSrcMsg_IsResponse()
	 * @model
	 * @generated
	 */
	boolean isIsResponse();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#isIsResponse <em>Is Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Response</em>' attribute.
	 * @see #isIsResponse()
	 * @generated
	 */
	void setIsResponse(boolean value);

	/**
	 * Returns the value of the '<em><b>Fact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Id</em>' attribute.
	 * @see #setFactId(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSrcMsg_FactId()
	 * @model
	 * @generated
	 */
	String getFactId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.SrcMsg#getFactId <em>Fact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Id</em>' attribute.
	 * @see #getFactId()
	 * @generated
	 */
	void setFactId(String value);

} // SrcMsg
