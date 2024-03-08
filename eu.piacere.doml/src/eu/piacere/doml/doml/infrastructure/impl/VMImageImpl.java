/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.VMImage;
import eu.piacere.doml.doml.infrastructure.VirtualMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.VMImageImpl#getGeneratedVMs <em>Generated VMs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMImageImpl extends ComputingNodeGeneratorImpl implements VMImage {
	/**
	 * The cached value of the '{@link #getGeneratedVMs() <em>Generated VMs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedVMs()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachine> generatedVMs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.VM_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualMachine> getGeneratedVMs() {
		if (generatedVMs == null) {
			generatedVMs = new EObjectWithInverseResolvingEList<VirtualMachine>(VirtualMachine.class, this, InfrastructurePackage.VM_IMAGE__GENERATED_VMS, InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM);
		}
		return generatedVMs;
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
			case InfrastructurePackage.VM_IMAGE__GENERATED_VMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratedVMs()).basicAdd(otherEnd, msgs);
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
			case InfrastructurePackage.VM_IMAGE__GENERATED_VMS:
				return ((InternalEList<?>)getGeneratedVMs()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.VM_IMAGE__GENERATED_VMS:
				return getGeneratedVMs();
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
			case InfrastructurePackage.VM_IMAGE__GENERATED_VMS:
				getGeneratedVMs().clear();
				getGeneratedVMs().addAll((Collection<? extends VirtualMachine>)newValue);
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
			case InfrastructurePackage.VM_IMAGE__GENERATED_VMS:
				getGeneratedVMs().clear();
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
			case InfrastructurePackage.VM_IMAGE__GENERATED_VMS:
				return generatedVMs != null && !generatedVMs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VMImageImpl
