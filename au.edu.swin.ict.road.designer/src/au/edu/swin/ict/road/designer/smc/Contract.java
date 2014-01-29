/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getName <em>Name</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getType <em>Type</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getRuleFile <em>Rule File</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getRoleAID <em>Role AID</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getRoleBID <em>Role BID</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getDescription <em>Description</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getState <em>State</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Contract#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends FactAccessor {
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getId <em>Id</em>}' attribute.
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Rule File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule File</em>' attribute.
	 * @see #setRuleFile(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_RuleFile()
	 * @model
	 * @generated
	 */
	String getRuleFile();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getRuleFile <em>Rule File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule File</em>' attribute.
	 * @see #getRuleFile()
	 * @generated
	 */
	void setRuleFile(String value);

	/**
	 * Returns the value of the '<em><b>Role AID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role AID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role AID</em>' reference.
	 * @see #setRoleAID(Role)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_RoleAID()
	 * @model
	 * @generated
	 */
	Role getRoleAID();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getRoleAID <em>Role AID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role AID</em>' reference.
	 * @see #getRoleAID()
	 * @generated
	 */
	void setRoleAID(Role value);

	/**
	 * Returns the value of the '<em><b>Role BID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role BID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role BID</em>' reference.
	 * @see #setRoleBID(Role)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_RoleBID()
	 * @model
	 * @generated
	 */
	Role getRoleBID();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getRoleBID <em>Role BID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role BID</em>' reference.
	 * @see #getRoleBID()
	 * @generated
	 */
	void setRoleBID(Role value);

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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Contract#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getContract_Term()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getTerm();

} // Contract
