/**
 */
package eu.piacere.doml.doml.commons.impl;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement;

import eu.piacere.doml.doml.infrastructure.InfrastructureElement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment To Specific Node Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DeploymentToSpecificNodeRequirementImpl#getValidElements <em>Valid Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentToSpecificNodeRequirementImpl extends DeploymentRequirementImpl implements DeploymentToSpecificNodeRequirement {
	/**
	 * The cached value of the '{@link #getValidElements() <em>Valid Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureElement> validElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentToSpecificNodeRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfrastructureElement> getValidElements() {
		if (validElements == null) {
			validElements = new EObjectResolvingEList<InfrastructureElement>(InfrastructureElement.class, this, CommonsPackage.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS);
		}
		return validElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonsPackage.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS:
				return getValidElements();
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
			case CommonsPackage.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS:
				getValidElements().clear();
				getValidElements().addAll((Collection<? extends InfrastructureElement>)newValue);
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
			case CommonsPackage.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS:
				getValidElements().clear();
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
			case CommonsPackage.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS:
				return validElements != null && !validElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentToSpecificNodeRequirementImpl
