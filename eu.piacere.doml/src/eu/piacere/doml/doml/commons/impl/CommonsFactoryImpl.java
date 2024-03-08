/**
 */
package eu.piacere.doml.doml.commons.impl;

import eu.piacere.doml.doml.commons.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonsFactoryImpl extends EFactoryImpl implements CommonsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonsFactory init() {
		try {
			CommonsFactory theCommonsFactory = (CommonsFactory)EPackage.Registry.INSTANCE.getEFactory(CommonsPackage.eNS_URI);
			if (theCommonsFactory != null) {
				return theCommonsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommonsPackage.DOML_MODEL: return createDOMLModel();
			case CommonsPackage.LIST_PROPERTY: return createListProperty();
			case CommonsPackage.IPROPERTY: return createIProperty();
			case CommonsPackage.SPROPERTY: return createSProperty();
			case CommonsPackage.FPROPERTY: return createFProperty();
			case CommonsPackage.BPROPERTY: return createBProperty();
			case CommonsPackage.CONFIGURATION: return createConfiguration();
			case CommonsPackage.DEPLOYMENT: return createDeployment();
			case CommonsPackage.REQUIREMENT: return createRequirement();
			case CommonsPackage.RANGED_REQUIREMENT: return createRangedRequirement();
			case CommonsPackage.ENUMERATED_REQUIREMENT: return createEnumeratedRequirement();
			case CommonsPackage.DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT: return createDeploymentToNodeTypeRequirement();
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT: return createDeploymentToNodeWithPropertyRequirement();
			case CommonsPackage.DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT: return createDeploymentToSpecificNodeRequirement();
			case CommonsPackage.KEY_PAIR: return createKeyPair();
			case CommonsPackage.USER_PASS: return createUserPass();
			case CommonsPackage.SOURCE: return createSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DOMLModel createDOMLModel() {
		DOMLModelImpl domlModel = new DOMLModelImpl();
		return domlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListProperty createListProperty() {
		ListPropertyImpl listProperty = new ListPropertyImpl();
		return listProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IProperty createIProperty() {
		IPropertyImpl iProperty = new IPropertyImpl();
		return iProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SProperty createSProperty() {
		SPropertyImpl sProperty = new SPropertyImpl();
		return sProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FProperty createFProperty() {
		FPropertyImpl fProperty = new FPropertyImpl();
		return fProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BProperty createBProperty() {
		BPropertyImpl bProperty = new BPropertyImpl();
		return bProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangedRequirement createRangedRequirement() {
		RangedRequirementImpl rangedRequirement = new RangedRequirementImpl();
		return rangedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedRequirement createEnumeratedRequirement() {
		EnumeratedRequirementImpl enumeratedRequirement = new EnumeratedRequirementImpl();
		return enumeratedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentToNodeTypeRequirement createDeploymentToNodeTypeRequirement() {
		DeploymentToNodeTypeRequirementImpl deploymentToNodeTypeRequirement = new DeploymentToNodeTypeRequirementImpl();
		return deploymentToNodeTypeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentToNodeWithPropertyRequirement createDeploymentToNodeWithPropertyRequirement() {
		DeploymentToNodeWithPropertyRequirementImpl deploymentToNodeWithPropertyRequirement = new DeploymentToNodeWithPropertyRequirementImpl();
		return deploymentToNodeWithPropertyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentToSpecificNodeRequirement createDeploymentToSpecificNodeRequirement() {
		DeploymentToSpecificNodeRequirementImpl deploymentToSpecificNodeRequirement = new DeploymentToSpecificNodeRequirementImpl();
		return deploymentToSpecificNodeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyPair createKeyPair() {
		KeyPairImpl keyPair = new KeyPairImpl();
		return keyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPass createUserPass() {
		UserPassImpl userPass = new UserPassImpl();
		return userPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonsPackage getCommonsPackage() {
		return (CommonsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonsPackage getPackage() {
		return CommonsPackage.eINSTANCE;
	}

} //CommonsFactoryImpl
