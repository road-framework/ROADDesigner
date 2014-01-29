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
 * A representation of the model object '<em><b>Acquisition Regime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getSyncInterval <em>Sync Interval</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getAcquisitionRegime()
 * @model
 * @generated
 */
public interface AcquisitionRegime extends EObject {
	/**
	 * Returns the value of the '<em><b>Sync Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Interval</em>' attribute.
	 * @see #setSyncInterval(int)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getAcquisitionRegime_SyncInterval()
	 * @model required="true"
	 * @generated
	 */
	int getSyncInterval();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getSyncInterval <em>Sync Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Interval</em>' attribute.
	 * @see #getSyncInterval()
	 * @generated
	 */
	void setSyncInterval(int value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link au.edu.swin.ict.road.designer.smc.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.Mode
	 * @see #setMode(Mode)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getAcquisitionRegime_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see au.edu.swin.ict.road.designer.smc.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

} // AcquisitionRegime
