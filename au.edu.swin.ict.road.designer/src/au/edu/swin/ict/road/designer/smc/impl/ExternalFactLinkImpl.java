/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.AcquisitionRegime;
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.ProvisionRegime;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Fact Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl#isOnChange <em>On Change</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl#getAcquisitionRegime <em>Acquisition Regime</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl#getProvisionRegime <em>Provision Regime</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ExternalFactLinkImpl#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalFactLinkImpl extends EObjectImpl implements ExternalFactLink {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnChange() <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnChange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_CHANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnChange() <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnChange()
	 * @generated
	 * @ordered
	 */
	protected boolean onChange = ON_CHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcquisitionRegime() <em>Acquisition Regime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionRegime()
	 * @generated
	 * @ordered
	 */
	protected AcquisitionRegime acquisitionRegime;

	/**
	 * The cached value of the '{@link #getProvisionRegime() <em>Provision Regime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionRegime()
	 * @generated
	 * @ordered
	 */
	protected ProvisionRegime provisionRegime;

	/**
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected Fact fact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalFactLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.EXTERNAL_FACT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.EXTERNAL_FACT_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnChange() {
		return onChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnChange(boolean newOnChange) {
		boolean oldOnChange = onChange;
		onChange = newOnChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.EXTERNAL_FACT_LINK__ON_CHANGE, oldOnChange, onChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquisitionRegime getAcquisitionRegime() {
		return acquisitionRegime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcquisitionRegime(AcquisitionRegime newAcquisitionRegime, NotificationChain msgs) {
		AcquisitionRegime oldAcquisitionRegime = acquisitionRegime;
		acquisitionRegime = newAcquisitionRegime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME, oldAcquisitionRegime, newAcquisitionRegime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcquisitionRegime(AcquisitionRegime newAcquisitionRegime) {
		if (newAcquisitionRegime != acquisitionRegime) {
			NotificationChain msgs = null;
			if (acquisitionRegime != null)
				msgs = ((InternalEObject)acquisitionRegime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME, null, msgs);
			if (newAcquisitionRegime != null)
				msgs = ((InternalEObject)newAcquisitionRegime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME, null, msgs);
			msgs = basicSetAcquisitionRegime(newAcquisitionRegime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME, newAcquisitionRegime, newAcquisitionRegime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvisionRegime getProvisionRegime() {
		return provisionRegime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvisionRegime(ProvisionRegime newProvisionRegime, NotificationChain msgs) {
		ProvisionRegime oldProvisionRegime = provisionRegime;
		provisionRegime = newProvisionRegime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME, oldProvisionRegime, newProvisionRegime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvisionRegime(ProvisionRegime newProvisionRegime) {
		if (newProvisionRegime != provisionRegime) {
			NotificationChain msgs = null;
			if (provisionRegime != null)
				msgs = ((InternalEObject)provisionRegime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME, null, msgs);
			if (newProvisionRegime != null)
				msgs = ((InternalEObject)newProvisionRegime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME, null, msgs);
			msgs = basicSetProvisionRegime(newProvisionRegime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME, newProvisionRegime, newProvisionRegime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact getFact() {
		if (fact != null && fact.eIsProxy()) {
			InternalEObject oldFact = (InternalEObject)fact;
			fact = (Fact)eResolveProxy(oldFact);
			if (fact != oldFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.EXTERNAL_FACT_LINK__FACT, oldFact, fact));
			}
		}
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact basicGetFact() {
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFact(Fact newFact) {
		Fact oldFact = fact;
		fact = newFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.EXTERNAL_FACT_LINK__FACT, oldFact, fact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME:
				return basicSetAcquisitionRegime(null, msgs);
			case SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME:
				return basicSetProvisionRegime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmcPackage.EXTERNAL_FACT_LINK__NAME:
				return getName();
			case SmcPackage.EXTERNAL_FACT_LINK__ON_CHANGE:
				return isOnChange();
			case SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME:
				return getAcquisitionRegime();
			case SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME:
				return getProvisionRegime();
			case SmcPackage.EXTERNAL_FACT_LINK__FACT:
				if (resolve) return getFact();
				return basicGetFact();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmcPackage.EXTERNAL_FACT_LINK__NAME:
				setName((String)newValue);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__ON_CHANGE:
				setOnChange((Boolean)newValue);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME:
				setAcquisitionRegime((AcquisitionRegime)newValue);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME:
				setProvisionRegime((ProvisionRegime)newValue);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__FACT:
				setFact((Fact)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmcPackage.EXTERNAL_FACT_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__ON_CHANGE:
				setOnChange(ON_CHANGE_EDEFAULT);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME:
				setAcquisitionRegime((AcquisitionRegime)null);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME:
				setProvisionRegime((ProvisionRegime)null);
				return;
			case SmcPackage.EXTERNAL_FACT_LINK__FACT:
				setFact((Fact)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmcPackage.EXTERNAL_FACT_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmcPackage.EXTERNAL_FACT_LINK__ON_CHANGE:
				return onChange != ON_CHANGE_EDEFAULT;
			case SmcPackage.EXTERNAL_FACT_LINK__ACQUISITION_REGIME:
				return acquisitionRegime != null;
			case SmcPackage.EXTERNAL_FACT_LINK__PROVISION_REGIME:
				return provisionRegime != null;
			case SmcPackage.EXTERNAL_FACT_LINK__FACT:
				return fact != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", OnChange: ");
		result.append(onChange);
		result.append(')');
		return result.toString();
	}

} //ExternalFactLinkImpl
