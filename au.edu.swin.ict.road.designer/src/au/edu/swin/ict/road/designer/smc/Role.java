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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Role#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Role#getName <em>Name</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Role#getDescription <em>Description</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Role#getTask <em>Task</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Role#getExternalFactLink <em>External Fact Link</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.Role#getManagementResponsibilities <em>Management Responsibilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends FactAccessor {
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getRole_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Role#getId <em>Id</em>}' attribute.
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getRole_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Role#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getRole_Task()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>External Fact Link</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.ExternalFactLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Fact Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Fact Link</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getRole_ExternalFactLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalFactLink> getExternalFactLink();

	/**
	 * Returns the value of the '<em><b>Management Responsibilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Management Responsibilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Responsibilities</em>' attribute.
	 * @see #setManagementResponsibilities(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getRole_ManagementResponsibilities()
	 * @model
	 * @generated
	 */
	String getManagementResponsibilities();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.Role#getManagementResponsibilities <em>Management Responsibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Responsibilities</em>' attribute.
	 * @see #getManagementResponsibilities()
	 * @generated
	 */
	void setManagementResponsibilities(String value);

} // Role
