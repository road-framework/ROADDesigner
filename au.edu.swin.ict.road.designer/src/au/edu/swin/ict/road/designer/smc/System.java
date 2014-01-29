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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.System#getSmc <em>Smc</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.System#getPlayer <em>Player</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.System#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Smc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smc</em>' containment reference.
	 * @see #setSmc(SMC)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSystem_Smc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SMC getSmc();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.System#getSmc <em>Smc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smc</em>' containment reference.
	 * @see #getSmc()
	 * @generated
	 */
	void setSmc(SMC value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSystem_Player()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayer();

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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // System
