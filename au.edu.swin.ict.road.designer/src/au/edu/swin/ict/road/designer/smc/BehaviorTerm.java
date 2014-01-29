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
 * A representation of the model object '<em><b>Behavior Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtension <em>Extension</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtends <em>Extends</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getTaskRef <em>Task Ref</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getBehaviorTerm()
 * @model
 * @generated
 */
public interface BehaviorTerm extends EObject {
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getBehaviorTerm_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getBehaviorTerm_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getBehaviorTerm_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getBehaviorTerm_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.BehaviorTerm#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Task Ref</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.TaskRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Ref</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getBehaviorTerm_TaskRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskRef> getTaskRef();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getBehaviorTerm_Constraint()
	 * @model
	 * @generated
	 */
	EList<Constraint> getConstraint();

} // BehaviorTerm
