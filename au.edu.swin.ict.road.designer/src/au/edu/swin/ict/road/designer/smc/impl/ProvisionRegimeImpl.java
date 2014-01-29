/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.Mode;
import au.edu.swin.ict.road.designer.smc.ProvisionRegime;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provision Regime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProvisionRegimeImpl#getSyncInterval <em>Sync Interval</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.ProvisionRegimeImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvisionRegimeImpl extends EObjectImpl implements ProvisionRegime {
	/**
	 * The default value of the '{@link #getSyncInterval() <em>Sync Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int SYNC_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSyncInterval() <em>Sync Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncInterval()
	 * @generated
	 * @ordered
	 */
	protected int syncInterval = SYNC_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final Mode MODE_EDEFAULT = Mode.ACTIVE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Mode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvisionRegimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.PROVISION_REGIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSyncInterval() {
		return syncInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncInterval(int newSyncInterval) {
		int oldSyncInterval = syncInterval;
		syncInterval = newSyncInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PROVISION_REGIME__SYNC_INTERVAL, oldSyncInterval, syncInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		Mode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PROVISION_REGIME__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmcPackage.PROVISION_REGIME__SYNC_INTERVAL:
				return getSyncInterval();
			case SmcPackage.PROVISION_REGIME__MODE:
				return getMode();
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
			case SmcPackage.PROVISION_REGIME__SYNC_INTERVAL:
				setSyncInterval((Integer)newValue);
				return;
			case SmcPackage.PROVISION_REGIME__MODE:
				setMode((Mode)newValue);
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
			case SmcPackage.PROVISION_REGIME__SYNC_INTERVAL:
				setSyncInterval(SYNC_INTERVAL_EDEFAULT);
				return;
			case SmcPackage.PROVISION_REGIME__MODE:
				setMode(MODE_EDEFAULT);
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
			case SmcPackage.PROVISION_REGIME__SYNC_INTERVAL:
				return syncInterval != SYNC_INTERVAL_EDEFAULT;
			case SmcPackage.PROVISION_REGIME__MODE:
				return mode != MODE_EDEFAULT;
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
		result.append(" (SyncInterval: ");
		result.append(syncInterval);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //ProvisionRegimeImpl
