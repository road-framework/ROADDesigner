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
 * A representation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getId <em>Id</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getDescr <em>Descr</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoS <em>Co S</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoT <em>Co T</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getBehaviorTerm <em>Behavior Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getProcessDefinition()
 * @model
 * @generated
 */
public interface ProcessDefinition extends EObject {
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getProcessDefinition_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descr</em>' attribute.
	 * @see #setDescr(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getProcessDefinition_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getDescr <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr</em>' attribute.
	 * @see #getDescr()
	 * @generated
	 */
	void setDescr(String value);

	/**
	 * Returns the value of the '<em><b>Co S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Co S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co S</em>' attribute.
	 * @see #setCoS(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getProcessDefinition_CoS()
	 * @model
	 * @generated
	 */
	String getCoS();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoS <em>Co S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co S</em>' attribute.
	 * @see #getCoS()
	 * @generated
	 */
	void setCoS(String value);

	/**
	 * Returns the value of the '<em><b>Co T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Co T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co T</em>' attribute.
	 * @see #setCoT(String)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getProcessDefinition_CoT()
	 * @model
	 * @generated
	 */
	String getCoT();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ProcessDefinition#getCoT <em>Co T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co T</em>' attribute.
	 * @see #getCoT()
	 * @generated
	 */
	void setCoT(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getProcessDefinition_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Behavior Term</b></em>' reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.BehaviorTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Term</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Term</em>' reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getProcessDefinition_BehaviorTerm()
	 * @model
	 * @generated
	 */
	EList<BehaviorTerm> getBehaviorTerm();

} // ProcessDefinition
