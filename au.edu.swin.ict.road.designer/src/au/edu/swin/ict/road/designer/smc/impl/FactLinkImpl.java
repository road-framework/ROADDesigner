/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.impl;

import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.FactLinkImpl#isMonitorFact <em>Monitor Fact</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.FactLinkImpl#isProvideContext <em>Provide Context</em>}</li>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.impl.FactLinkImpl#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactLinkImpl extends EObjectImpl implements FactLink {
	/**
	 * The default value of the '{@link #isMonitorFact() <em>Monitor Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorFact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITOR_FACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorFact() <em>Monitor Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorFact()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorFact = MONITOR_FACT_EDEFAULT;

	/**
	 * Change default value to be the opposite value of monitorFact
	 * The default value of the '{@link #isProvideContext() <em>Provide Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvideContext()
	 * @generated NOT
	 * @ordered
	 */
	protected static final boolean PROVIDE_CONTEXT_EDEFAULT = !MONITOR_FACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #isProvideContext() <em>Provide Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvideContext()
	 * @generated
	 * @ordered
	 */
	protected boolean provideContext = PROVIDE_CONTEXT_EDEFAULT;

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
	protected FactLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmcPackage.Literals.FACT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorFact() {
		return monitorFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * set provideContext to the opposite value
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setMonitorFact(boolean newMonitorFact) {
		setDirection(newMonitorFact, !newMonitorFact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvideContext() {
		return provideContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * set monitorFact to the opposite value
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProvideContext(boolean newProvideContext) {
		setDirection(!newProvideContext, newProvideContext);
	}

	/**
	 * @generated NOT
	 */
	public void setDirection(boolean newMonitorFact, boolean newProvideContext) {
		/* monitorFact */
		boolean oldMonitorFact = monitorFact;
		monitorFact = newMonitorFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.FACT_LINK__MONITOR_FACT, oldMonitorFact, monitorFact));

		/* provideContext */
		boolean oldProvideContext = provideContext;
		provideContext = newProvideContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.FACT_LINK__PROVIDE_CONTEXT, oldProvideContext, provideContext));
		
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.FACT_LINK__FACT, oldFact, fact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.FACT_LINK__FACT, oldFact, fact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmcPackage.FACT_LINK__MONITOR_FACT:
				return isMonitorFact();
			case SmcPackage.FACT_LINK__PROVIDE_CONTEXT:
				return isProvideContext();
			case SmcPackage.FACT_LINK__FACT:
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
			case SmcPackage.FACT_LINK__MONITOR_FACT:
				setMonitorFact((Boolean)newValue);
				return;
			case SmcPackage.FACT_LINK__PROVIDE_CONTEXT:
				setProvideContext((Boolean)newValue);
				return;
			case SmcPackage.FACT_LINK__FACT:
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
			case SmcPackage.FACT_LINK__MONITOR_FACT:
				setMonitorFact(MONITOR_FACT_EDEFAULT);
				return;
			case SmcPackage.FACT_LINK__PROVIDE_CONTEXT:
				setProvideContext(PROVIDE_CONTEXT_EDEFAULT);
				return;
			case SmcPackage.FACT_LINK__FACT:
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
			case SmcPackage.FACT_LINK__MONITOR_FACT:
				return monitorFact != MONITOR_FACT_EDEFAULT;
			case SmcPackage.FACT_LINK__PROVIDE_CONTEXT:
				return provideContext != PROVIDE_CONTEXT_EDEFAULT;
			case SmcPackage.FACT_LINK__FACT:
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
		result.append(" (MonitorFact: ");
		result.append(monitorFact);
		result.append(", ProvideContext: ");
		result.append(provideContext);
		result.append(')');
		return result.toString();
	}

} //FactLinkImpl
