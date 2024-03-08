/**
 */
package eu.piacere.doml.doml.commons.impl;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment To Node Type Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeTypeRequirementImpl#getValidTypes <em>Valid Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentToNodeTypeRequirementImpl extends DeploymentRequirementImpl implements DeploymentToNodeTypeRequirement {
	/**
	 * The cached value of the '{@link #getValidTypes() <em>Valid Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> validTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentToNodeTypeRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValidTypes() {
		if (validTypes == null) {
			validTypes = new EDataTypeUniqueEList<String>(String.class, this, CommonsPackage.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES);
		}
		return validTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonsPackage.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES:
				return getValidTypes();
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
			case CommonsPackage.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES:
				getValidTypes().clear();
				getValidTypes().addAll((Collection<? extends String>)newValue);
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
			case CommonsPackage.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES:
				getValidTypes().clear();
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
			case CommonsPackage.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES:
				return validTypes != null && !validTypes.isEmpty();
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
		result.append(" (validTypes: ");
		result.append(validTypes);
		result.append(')');
		return result.toString();
	}

} //DeploymentToNodeTypeRequirementImpl
