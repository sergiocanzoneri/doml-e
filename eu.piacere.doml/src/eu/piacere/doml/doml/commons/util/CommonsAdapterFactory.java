/**
 */
package eu.piacere.doml.doml.commons.util;

import eu.piacere.doml.doml.commons.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.commons.CommonsPackage
 * @generated
 */
public class CommonsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommonsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonsSwitch<Adapter> modelSwitch =
		new CommonsSwitch<Adapter>() {
			@Override
			public Adapter caseDOMLModel(DOMLModel object) {
				return createDOMLModelAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseListProperty(ListProperty object) {
				return createListPropertyAdapter();
			}
			@Override
			public Adapter caseIProperty(IProperty object) {
				return createIPropertyAdapter();
			}
			@Override
			public Adapter caseSProperty(SProperty object) {
				return createSPropertyAdapter();
			}
			@Override
			public Adapter caseFProperty(FProperty object) {
				return createFPropertyAdapter();
			}
			@Override
			public Adapter caseBProperty(BProperty object) {
				return createBPropertyAdapter();
			}
			@Override
			public Adapter caseExtensionElement(ExtensionElement object) {
				return createExtensionElementAdapter();
			}
			@Override
			public Adapter caseDOMLElement(DOMLElement object) {
				return createDOMLElementAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseDeployableElement(DeployableElement object) {
				return createDeployableElementAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseRangedRequirement(RangedRequirement object) {
				return createRangedRequirementAdapter();
			}
			@Override
			public Adapter caseEnumeratedRequirement(EnumeratedRequirement object) {
				return createEnumeratedRequirementAdapter();
			}
			@Override
			public Adapter caseDeploymentRequirement(DeploymentRequirement object) {
				return createDeploymentRequirementAdapter();
			}
			@Override
			public Adapter caseDeploymentToNodeTypeRequirement(DeploymentToNodeTypeRequirement object) {
				return createDeploymentToNodeTypeRequirementAdapter();
			}
			@Override
			public Adapter caseDeploymentToNodeWithPropertyRequirement(DeploymentToNodeWithPropertyRequirement object) {
				return createDeploymentToNodeWithPropertyRequirementAdapter();
			}
			@Override
			public Adapter caseDeploymentToSpecificNodeRequirement(DeploymentToSpecificNodeRequirement object) {
				return createDeploymentToSpecificNodeRequirementAdapter();
			}
			@Override
			public Adapter caseCredentials(Credentials object) {
				return createCredentialsAdapter();
			}
			@Override
			public Adapter caseKeyPair(KeyPair object) {
				return createKeyPairAdapter();
			}
			@Override
			public Adapter caseUserPass(UserPass object) {
				return createUserPassAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DOMLModel <em>DOML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DOMLModel
	 * @generated
	 */
	public Adapter createDOMLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.ListProperty <em>List Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.ListProperty
	 * @generated
	 */
	public Adapter createListPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.IProperty <em>IProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.IProperty
	 * @generated
	 */
	public Adapter createIPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.SProperty <em>SProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.SProperty
	 * @generated
	 */
	public Adapter createSPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.FProperty <em>FProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.FProperty
	 * @generated
	 */
	public Adapter createFPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.BProperty <em>BProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.BProperty
	 * @generated
	 */
	public Adapter createBPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.ExtensionElement <em>Extension Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.ExtensionElement
	 * @generated
	 */
	public Adapter createExtensionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DOMLElement <em>DOML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DOMLElement
	 * @generated
	 */
	public Adapter createDOMLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DeployableElement <em>Deployable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DeployableElement
	 * @generated
	 */
	public Adapter createDeployableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.RangedRequirement <em>Ranged Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.RangedRequirement
	 * @generated
	 */
	public Adapter createRangedRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.EnumeratedRequirement <em>Enumerated Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.EnumeratedRequirement
	 * @generated
	 */
	public Adapter createEnumeratedRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DeploymentRequirement <em>Deployment Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DeploymentRequirement
	 * @generated
	 */
	public Adapter createDeploymentRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement <em>Deployment To Node Type Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement
	 * @generated
	 */
	public Adapter createDeploymentToNodeTypeRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement <em>Deployment To Node With Property Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement
	 * @generated
	 */
	public Adapter createDeploymentToNodeWithPropertyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement <em>Deployment To Specific Node Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement
	 * @generated
	 */
	public Adapter createDeploymentToSpecificNodeRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.Credentials
	 * @generated
	 */
	public Adapter createCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.KeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.KeyPair
	 * @generated
	 */
	public Adapter createKeyPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.UserPass <em>User Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.UserPass
	 * @generated
	 */
	public Adapter createUserPassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommonsAdapterFactory
