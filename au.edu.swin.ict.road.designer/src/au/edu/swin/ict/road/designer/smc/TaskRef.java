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
 * A representation of the model object '<em><b>Task Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPreEP <em>Pre EP</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPostEP <em>Post EP</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPerformanceVal <em>Performance Val</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.TaskRef#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTaskRef()
 * @model
 * @generated
 */
public interface TaskRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre EP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre EP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre EP</em>' attribute.
	 * @see #setPreEP(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTaskRef_PreEP()
	 * @model
	 * @generated
	 */
	String getPreEP();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPreEP <em>Pre EP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre EP</em>' attribute.
	 * @see #getPreEP()
	 * @generated
	 */
	void setPreEP(String value);

	/**
	 * Returns the value of the '<em><b>Post EP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post EP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post EP</em>' attribute.
	 * @see #setPostEP(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTaskRef_PostEP()
	 * @model
	 * @generated
	 */
	String getPostEP();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPostEP <em>Post EP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post EP</em>' attribute.
	 * @see #getPostEP()
	 * @generated
	 */
	void setPostEP(String value);

	/**
	 * Returns the value of the '<em><b>Performance Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Val</em>' attribute.
	 * @see #setPerformanceVal(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTaskRef_PerformanceVal()
	 * @model
	 * @generated
	 */
	String getPerformanceVal();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getPerformanceVal <em>Performance Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Val</em>' attribute.
	 * @see #getPerformanceVal()
	 * @generated
	 */
	void setPerformanceVal(String value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getTaskRef_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.TaskRef#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // TaskRef
