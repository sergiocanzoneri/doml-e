/**
 */
package eu.piacere.doml.doml.application.impl;

import eu.piacere.doml.doml.application.ApplicationPackage;
import eu.piacere.doml.doml.application.SoftwareComponent;
import eu.piacere.doml.doml.application.SoftwareInterface;

import eu.piacere.doml.doml.commons.Source;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SoftwareComponentImpl#getIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SoftwareComponentImpl#getLicenseCost <em>License Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SoftwareComponentImpl#getExposedInterfaces <em>Exposed Interfaces</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SoftwareComponentImpl#getConsumedInterfaces <em>Consumed Interfaces</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SoftwareComponentImpl#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareComponentImpl extends ApplicationComponentImpl implements SoftwareComponent {
	/**
	 * The default value of the '{@link #getIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PERSISTENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPersistent = IS_PERSISTENT_EDEFAULT;

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
	 * The cached value of the '{@link #getConsumedInterfaces() <em>Consumed Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareInterface> consumedInterfaces;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Source src;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SOFTWARE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsPersistent() {
		return isPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPersistent(Boolean newIsPersistent) {
		Boolean oldIsPersistent = isPersistent;
		isPersistent = newIsPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOFTWARE_COMPONENT__IS_PERSISTENT, oldIsPersistent, isPersistent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOFTWARE_COMPONENT__LICENSE_COST, oldLicenseCost, licenseCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SoftwareInterface> getExposedInterfaces() {
		if (exposedInterfaces == null) {
			exposedInterfaces = new EObjectContainmentEList<SoftwareInterface>(SoftwareInterface.class, this, ApplicationPackage.SOFTWARE_COMPONENT__EXPOSED_INTERFACES);
		}
		return exposedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SoftwareInterface> getConsumedInterfaces() {
		if (consumedInterfaces == null) {
			consumedInterfaces = new EObjectResolvingEList<SoftwareInterface>(SoftwareInterface.class, this, ApplicationPackage.SOFTWARE_COMPONENT__CONSUMED_INTERFACES);
		}
		return consumedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Source newSrc, NotificationChain msgs) {
		Source oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOFTWARE_COMPONENT__SRC, oldSrc, newSrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(Source newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SOFTWARE_COMPONENT__SRC, null, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SOFTWARE_COMPONENT__SRC, null, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOFTWARE_COMPONENT__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.SOFTWARE_COMPONENT__EXPOSED_INTERFACES:
				return ((InternalEList<?>)getExposedInterfaces()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.SOFTWARE_COMPONENT__SRC:
				return basicSetSrc(null, msgs);
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
			case ApplicationPackage.SOFTWARE_COMPONENT__IS_PERSISTENT:
				return getIsPersistent();
			case ApplicationPackage.SOFTWARE_COMPONENT__LICENSE_COST:
				return getLicenseCost();
			case ApplicationPackage.SOFTWARE_COMPONENT__EXPOSED_INTERFACES:
				return getExposedInterfaces();
			case ApplicationPackage.SOFTWARE_COMPONENT__CONSUMED_INTERFACES:
				return getConsumedInterfaces();
			case ApplicationPackage.SOFTWARE_COMPONENT__SRC:
				return getSrc();
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
			case ApplicationPackage.SOFTWARE_COMPONENT__IS_PERSISTENT:
				setIsPersistent((Boolean)newValue);
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__LICENSE_COST:
				setLicenseCost((Float)newValue);
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__EXPOSED_INTERFACES:
				getExposedInterfaces().clear();
				getExposedInterfaces().addAll((Collection<? extends SoftwareInterface>)newValue);
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__CONSUMED_INTERFACES:
				getConsumedInterfaces().clear();
				getConsumedInterfaces().addAll((Collection<? extends SoftwareInterface>)newValue);
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__SRC:
				setSrc((Source)newValue);
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
			case ApplicationPackage.SOFTWARE_COMPONENT__IS_PERSISTENT:
				setIsPersistent(IS_PERSISTENT_EDEFAULT);
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__LICENSE_COST:
				setLicenseCost(LICENSE_COST_EDEFAULT);
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__EXPOSED_INTERFACES:
				getExposedInterfaces().clear();
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__CONSUMED_INTERFACES:
				getConsumedInterfaces().clear();
				return;
			case ApplicationPackage.SOFTWARE_COMPONENT__SRC:
				setSrc((Source)null);
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
			case ApplicationPackage.SOFTWARE_COMPONENT__IS_PERSISTENT:
				return IS_PERSISTENT_EDEFAULT == null ? isPersistent != null : !IS_PERSISTENT_EDEFAULT.equals(isPersistent);
			case ApplicationPackage.SOFTWARE_COMPONENT__LICENSE_COST:
				return LICENSE_COST_EDEFAULT == null ? licenseCost != null : !LICENSE_COST_EDEFAULT.equals(licenseCost);
			case ApplicationPackage.SOFTWARE_COMPONENT__EXPOSED_INTERFACES:
				return exposedInterfaces != null && !exposedInterfaces.isEmpty();
			case ApplicationPackage.SOFTWARE_COMPONENT__CONSUMED_INTERFACES:
				return consumedInterfaces != null && !consumedInterfaces.isEmpty();
			case ApplicationPackage.SOFTWARE_COMPONENT__SRC:
				return src != null;
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
		result.append(" (isPersistent: ");
		result.append(isPersistent);
		result.append(", licenseCost: ");
		result.append(licenseCost);
		result.append(')');
		return result.toString();
	}

} //SoftwareComponentImpl
