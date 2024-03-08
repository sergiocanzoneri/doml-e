/**
 */
package eu.piacere.doml.doml.application.impl;

import eu.piacere.doml.doml.application.ApplicationPackage;
import eu.piacere.doml.doml.application.SaaS;
import eu.piacere.doml.doml.application.SoftwareInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Saa S</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SaaSImpl#getLicenseCost <em>License Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SaaSImpl#getExposedInterfaces <em>Exposed Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaaSImpl extends ApplicationComponentImpl implements SaaS {
	/**
	 * The default value of the '{@link #getLicenseCost() <em>License Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseCost()
	 * @generated
	 * @ordered
	 */
	protected static final Float LICENSE_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseCost() <em>License Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseCost()
	 * @generated
	 * @ordered
	 */
	protected Float licenseCost = LICENSE_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExposedInterfaces() <em>Exposed Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareInterface> exposedInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaaSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SAA_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getLicenseCost() {
		return licenseCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicenseCost(Float newLicenseCost) {
		Float oldLicenseCost = licenseCost;
		licenseCost = newLicenseCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SAA_S__LICENSE_COST, oldLicenseCost, licenseCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SoftwareInterface> getExposedInterfaces() {
		if (exposedInterfaces == null) {
			exposedInterfaces = new EObjectContainmentEList<SoftwareInterface>(SoftwareInterface.class, this, ApplicationPackage.SAA_S__EXPOSED_INTERFACES);
		}
		return exposedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.SAA_S__EXPOSED_INTERFACES:
				return ((InternalEList<?>)getExposedInterfaces()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.SAA_S__LICENSE_COST:
				return getLicenseCost();
			case ApplicationPackage.SAA_S__EXPOSED_INTERFACES:
				return getExposedInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApplicationPackage.SAA_S__LICENSE_COST:
				setLicenseCost((Float)newValue);
				return;
			case ApplicationPackage.SAA_S__EXPOSED_INTERFACES:
				getExposedInterfaces().clear();
				getExposedInterfaces().addAll((Collection<? extends SoftwareInterface>)newValue);
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
			case ApplicationPackage.SAA_S__LICENSE_COST:
				setLicenseCost(LICENSE_COST_EDEFAULT);
				return;
			case ApplicationPackage.SAA_S__EXPOSED_INTERFACES:
				getExposedInterfaces().clear();
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
			case ApplicationPackage.SAA_S__LICENSE_COST:
				return LICENSE_COST_EDEFAULT == null ? licenseCost != null : !LICENSE_COST_EDEFAULT.equals(licenseCost);
			case ApplicationPackage.SAA_S__EXPOSED_INTERFACES:
				return exposedInterfaces != null && !exposedInterfaces.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (licenseCost: ");
		result.append(licenseCost);
		result.append(')');
		return result.toString();
	}

} //SaaSImpl
