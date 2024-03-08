/**
 */
package eu.piacere.doml.doml.commons.util;

import eu.piacere.doml.doml.commons.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.commons.CommonsPackage
 * @generated
 */
public class CommonsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonsSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommonsPackage.DOML_MODEL: {
				DOMLModel domlModel = (DOMLModel)theEObject;
				T result = caseDOMLModel(domlModel);
				if (result == null) result = caseDOMLElement(domlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.LIST_PROPERTY: {
				ListProperty listProperty = (ListProperty)theEObject;
				T result = caseListProperty(listProperty);
				if (result == null) result = caseProperty(listProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.IPROPERTY: {
				IProperty iProperty = (IProperty)theEObject;
				T result = caseIProperty(iProperty);
				if (result == null) result = caseProperty(iProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.SPROPERTY: {
				SProperty sProperty = (SProperty)theEObject;
				T result = caseSProperty(sProperty);
				if (result == null) result = caseProperty(sProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.FPROPERTY: {
				FProperty fProperty = (FProperty)theEObject;
				T result = caseFProperty(fProperty);
				if (result == null) result = caseProperty(fProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.BPROPERTY: {
				BProperty bProperty = (BProperty)theEObject;
				T result = caseBProperty(bProperty);
				if (result == null) result = caseProperty(bProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.EXTENSION_ELEMENT: {
				ExtensionElement extensionElement = (ExtensionElement)theEObject;
				T result = caseExtensionElement(extensionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.DOML_ELEMENT: {
				DOMLElement domlElement = (DOMLElement)theEObject;
				T result = caseDOMLElement(domlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseDOMLElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.DEPLOYABLE_ELEMENT: {
				DeployableElement deployableElement = (DeployableElement)theEObject;
				T result = caseDeployableElement(deployableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.RANGED_REQUIREMENT: {
				RangedRequirement rangedRequirement = (RangedRequirement)theEObject;
				T result = caseRangedRequirement(rangedRequirement);
				if (result == null) result = caseRequirement(rangedRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.ENUMERATED_REQUIREMENT: {
				EnumeratedRequirement enumeratedRequirement = (EnumeratedRequirement)theEObject;
				T result = caseEnumeratedRequirement(enumeratedRequirement);
				if (result == null) result = caseRequirement(enumeratedRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.DEPLOYMENT_REQUIREMENT: {
				DeploymentRequirement deploymentRequirement = (DeploymentRequirement)theEObject;
				T result = caseDeploymentRequirement(deploymentRequirement);
				if (result == null) result = caseRequirement(deploymentRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT: {
				DeploymentToNodeTypeRequirement deploymentToNodeTypeRequirement = (DeploymentToNodeTypeRequirement)theEObject;
				T result = caseDeploymentToNodeTypeRequirement(deploymentToNodeTypeRequirement);
				if (result == null) result = caseDeploymentRequirement(deploymentToNodeTypeRequirement);
				if (result == null) result = caseRequirement(deploymentToNodeTypeRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT: {
				DeploymentToNodeWithPropertyRequirement deploymentToNodeWithPropertyRequirement = (DeploymentToNodeWithPropertyRequirement)theEObject;
				T result = caseDeploymentToNodeWithPropertyRequirement(deploymentToNodeWithPropertyRequirement);
				if (result == null) result = caseDeploymentRequirement(deploymentToNodeWithPropertyRequirement);
				if (result == null) result = caseRequirement(deploymentToNodeWithPropertyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT: {
				DeploymentToSpecificNodeRequirement deploymentToSpecificNodeRequirement = (DeploymentToSpecificNodeRequirement)theEObject;
				T result = caseDeploymentToSpecificNodeRequirement(deploymentToSpecificNodeRequirement);
				if (result == null) result = caseDeploymentRequirement(deploymentToSpecificNodeRequirement);
				if (result == null) result = caseRequirement(deploymentToSpecificNodeRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.CREDENTIALS: {
				Credentials credentials = (Credentials)theEObject;
				T result = caseCredentials(credentials);
				if (result == null) result = caseDOMLElement(credentials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.KEY_PAIR: {
				KeyPair keyPair = (KeyPair)theEObject;
				T result = caseKeyPair(keyPair);
				if (result == null) result = caseCredentials(keyPair);
				if (result == null) result = caseDOMLElement(keyPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.USER_PASS: {
				UserPass userPass = (UserPass)theEObject;
				T result = caseUserPass(userPass);
				if (result == null) result = caseCredentials(userPass);
				if (result == null) result = caseDOMLElement(userPass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonsPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseDOMLElement(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOML Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOML Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMLModel(DOMLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListProperty(ListProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProperty(IProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSProperty(SProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFProperty(FProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBProperty(BProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionElement(ExtensionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMLElement(DOMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployableElement(DeployableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranged Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranged Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangedRequirement(RangedRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedRequirement(EnumeratedRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentRequirement(DeploymentRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment To Node Type Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment To Node Type Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentToNodeTypeRequirement(DeploymentToNodeTypeRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment To Node With Property Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment To Node With Property Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentToNodeWithPropertyRequirement(DeploymentToNodeWithPropertyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment To Specific Node Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment To Specific Node Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentToSpecificNodeRequirement(DeploymentToSpecificNodeRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credentials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCredentials(Credentials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyPair(KeyPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Pass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Pass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPass(UserPass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommonsSwitch
