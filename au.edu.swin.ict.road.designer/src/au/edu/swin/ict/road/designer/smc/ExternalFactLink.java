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
 * A representation of the model object '<em><b>External Fact Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getName <em>Name</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#isOnChange <em>On Change</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getAcquisitionRegime <em>Acquisition Regime</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getProvisionRegime <em>Provision Regime</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getExternalFactLink()
 * @model
 * @generated
 */
public interface ExternalFactLink extends EObject {
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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getExternalFactLink_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Change</em>' attribute.
	 * @see #setOnChange(boolean)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getExternalFactLink_OnChange()
	 * @model
	 * @generated
	 */
	boolean isOnChange();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#isOnChange <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Change</em>' attribute.
	 * @see #isOnChange()
	 * @generated
	 */
	void setOnChange(boolean value);

	/**
	 * Returns the value of the '<em><b>Acquisition Regime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquisition Regime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquisition Regime</em>' containment reference.
	 * @see #setAcquisitionRegime(AcquisitionRegime)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getExternalFactLink_AcquisitionRegime()
	 * @model containment="true"
	 * @generated
	 */
	AcquisitionRegime getAcquisitionRegime();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getAcquisitionRegime <em>Acquisition Regime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquisition Regime</em>' containment reference.
	 * @see #getAcquisitionRegime()
	 * @generated
	 */
	void setAcquisitionRegime(AcquisitionRegime value);

	/**
	 * Returns the value of the '<em><b>Provision Regime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provision Regime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provision Regime</em>' containment reference.
	 * @see #setProvisionRegime(ProvisionRegime)
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getExternalFactLink_ProvisionRegime()
	 * @model containment="true"
	 * @generated
	 */
	ProvisionRegime getProvisionRegime();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getProvisionRegime <em>Provision Regime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provision Regime</em>' containment reference.
	 * @see #getProvisionRegime()
	 * @generated
	 */
	void setProvisionRegime(ProvisionRegime value);

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
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getExternalFactLink_Fact()
	 * @model required="true"
	 * @generated
	 */
	Fact getFact();

	/**
	 * Sets the value of the '{@link au.edu.swin.ict.road.designer.smc.ExternalFactLink#getFact <em>Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(Fact value);

} // ExternalFactLink
