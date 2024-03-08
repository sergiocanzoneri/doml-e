/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.concrete.ConcreteInfrastructure;
import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.RuntimeProvider;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ConcreteInfrastructureImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteInfrastructureImpl extends DOMLElementImpl implements ConcreteInfrastructure {
	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeProvider> providers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.CONCRETE_INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RuntimeProvider> getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentEList<RuntimeProvider>(RuntimeProvider.class, this, ConcretePackage.CONCRETE_INFRASTRUCTURE__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.CONCRETE_INFRASTRUCTURE__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
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
			case ConcretePackage.CONCRETE_INFRASTRUCTURE__PROVIDERS:
				return getProviders();
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
			case ConcretePackage.CONCRETE_INFRASTRUCTURE__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends RuntimeProvider>)newValue);
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
			case ConcretePackage.CONCRETE_INFRASTRUCTURE__PROVIDERS:
				getProviders().clear();
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
			case ConcretePackage.CONCRETE_INFRASTRUCTURE__PROVIDERS:
				return providers != null && !providers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConcreteInfrastructureImpl
