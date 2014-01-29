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
 * A representation of the model object '<em><b>Fact Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.FactLink#isMonitorFact <em>Monitor Fact</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.FactLink#isProvideContext <em>Provide Context</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.FactLink#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getFactLink()
 * @model
 * @generated
 */
public interface FactLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitor Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Fact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Fact</em>' attribute.
	 * @see #setMonitorFact(boolean)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getFactLink_MonitorFact()
	 * @model
	 * @generated
	 */
	boolean isMonitorFact();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.FactLink#isMonitorFact <em>Monitor Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Fact</em>' attribute.
	 * @see #isMonitorFact()
	 * @generated
	 */
	void setMonitorFact(boolean value);

	/**
	 * Returns the value of the '<em><b>Provide Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide Context</em>' attribute.
	 * @see #setProvideContext(boolean)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getFactLink_ProvideContext()
	 * @model
	 * @generated
	 */
	boolean isProvideContext();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.FactLink#isProvideContext <em>Provide Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provide Context</em>' attribute.
	 * @see #isProvideContext()
	 * @generated
	 */
	void setProvideContext(boolean value);

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' reference.
	 * @see #setFact(Fact)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getFactLink_Fact()
	 * @model required="true"
	 * @generated
	 */
	Fact getFact();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.FactLink#getFact <em>Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(Fact value);

} // FactLink
