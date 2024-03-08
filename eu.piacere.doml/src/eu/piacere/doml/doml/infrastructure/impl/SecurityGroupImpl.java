/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;
import eu.piacere.doml.doml.infrastructure.Rule;
import eu.piacere.doml.doml.infrastructure.SecurityGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.SecurityGroupImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.SecurityGroupImpl#getIfaces <em>Ifaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGroupImpl extends DOMLElementImpl implements SecurityGroup {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getIfaces() <em>Ifaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkInterface> ifaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.SECURITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, InfrastructurePackage.SECURITY_GROUP__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NetworkInterface> getIfaces() {
		if (ifaces == null) {
			ifaces = new EObjectWithInverseResolvingEList.ManyInverse<NetworkInterface>(NetworkInterface.class, this, InfrastructurePackage.SECURITY_GROUP__IFACES, InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED);
		}
		return ifaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.SECURITY_GROUP__IFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIfaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.SECURITY_GROUP__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.SECURITY_GROUP__IFACES:
				return ((InternalEList<?>)getIfaces()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.SECURITY_GROUP__RULES:
				return getRules();
			case InfrastructurePackage.SECURITY_GROUP__IFACES:
				return getIfaces();
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
			case InfrastructurePackage.SECURITY_GROUP__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case InfrastructurePackage.SECURITY_GROUP__IFACES:
				getIfaces().clear();
				getIfaces().addAll((Collection<? extends NetworkInterface>)newValue);
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
			case InfrastructurePackage.SECURITY_GROUP__RULES:
				getRules().clear();
				return;
			case InfrastructurePackage.SECURITY_GROUP__IFACES:
				getIfaces().clear();
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
			case InfrastructurePackage.SECURITY_GROUP__RULES:
				return rules != null && !rules.isEmpty();
			case InfrastructurePackage.SECURITY_GROUP__IFACES:
				return ifaces != null && !ifaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityGroupImpl
