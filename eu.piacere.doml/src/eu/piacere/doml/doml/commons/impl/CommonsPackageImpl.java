/**
 */
package eu.piacere.doml.doml.commons.impl;

import eu.piacere.doml.doml.application.ApplicationPackage;

import eu.piacere.doml.doml.application.impl.ApplicationPackageImpl;

import eu.piacere.doml.doml.commons.BProperty;
import eu.piacere.doml.doml.commons.CommonsFactory;
import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.Configuration;
import eu.piacere.doml.doml.commons.Credentials;
import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.DOMLModel;
import eu.piacere.doml.doml.commons.DeployableElement;
import eu.piacere.doml.doml.commons.Deployment;
import eu.piacere.doml.doml.commons.DeploymentRequirement;
import eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement;
import eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement;
import eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement;
import eu.piacere.doml.doml.commons.EnumeratedRequirement;
import eu.piacere.doml.doml.commons.ExtensionElement;
import eu.piacere.doml.doml.commons.FProperty;
import eu.piacere.doml.doml.commons.IProperty;
import eu.piacere.doml.doml.commons.KeyPair;
import eu.piacere.doml.doml.commons.ListProperty;
import eu.piacere.doml.doml.commons.Property;
import eu.piacere.doml.doml.commons.RangedRequirement;
import eu.piacere.doml.doml.commons.ReferenceElement;
import eu.piacere.doml.doml.commons.Requirement;
import eu.piacere.doml.doml.commons.SProperty;
import eu.piacere.doml.doml.commons.Source;
import eu.piacere.doml.doml.commons.UserPass;

import eu.piacere.doml.doml.concrete.ConcretePackage;

import eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

import eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl;

import eu.piacere.doml.doml.optimization.OptimizationPackage;

import eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonsPackageImpl extends EPackageImpl implements CommonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentToNodeTypeRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentToNodeWithPropertyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentToSpecificNodeRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonsPackageImpl() {
		super(eNS_URI, CommonsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CommonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonsPackage init() {
		if (isInited) return (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommonsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommonsPackageImpl theCommonsPackage = registeredCommonsPackage instanceof CommonsPackageImpl ? (CommonsPackageImpl)registeredCommonsPackage : new CommonsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);
		ConcretePackageImpl theConcretePackage = (ConcretePackageImpl)(registeredPackage instanceof ConcretePackageImpl ? registeredPackage : ConcretePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptimizationPackage.eNS_URI);
		OptimizationPackageImpl theOptimizationPackage = (OptimizationPackageImpl)(registeredPackage instanceof OptimizationPackageImpl ? registeredPackage : OptimizationPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonsPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theConcretePackage.createPackageContents();
		theOptimizationPackage.createPackageContents();

		// Initialize created meta-data
		theCommonsPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theConcretePackage.initializePackageContents();
		theOptimizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonsPackage.eNS_URI, theCommonsPackage);
		return theCommonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDOMLModel() {
		return domlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDOMLModel_Version() {
		return (EAttribute)domlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_Application() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_Infrastructure() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_Concretizations() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_Optimization() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_Configurations() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_ActiveConfiguration() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_ActiveInfrastructure() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLModel_FunctionalRequirements() {
		return (EReference)domlModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListProperty() {
		return listPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListProperty_Values() {
		return (EReference)listPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIProperty() {
		return iPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIProperty_Value() {
		return (EAttribute)iPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSProperty() {
		return sPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSProperty_Value() {
		return (EAttribute)sPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFProperty() {
		return fPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFProperty_Value() {
		return (EAttribute)fPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBProperty() {
		return bPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBProperty_Value() {
		return (EAttribute)bPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionElement() {
		return extensionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionElement_MetaclassName() {
		return (EAttribute)extensionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDOMLElement() {
		return domlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDOMLElement_Name() {
		return (EAttribute)domlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDOMLElement_Description() {
		return (EAttribute)domlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLElement_Annotations() {
		return (EReference)domlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDOMLElement_ContributesTo() {
		return (EReference)domlElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Deployments() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployableElement() {
		return deployableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Component() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Node() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Name() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Description() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Property() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_PredicatesOn() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangedRequirement() {
		return rangedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangedRequirement_Min() {
		return (EAttribute)rangedRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangedRequirement_Max() {
		return (EAttribute)rangedRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeratedRequirement() {
		return enumeratedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeratedRequirement_Values() {
		return (EAttribute)enumeratedRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentRequirement() {
		return deploymentRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentToNodeTypeRequirement() {
		return deploymentToNodeTypeRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentToNodeTypeRequirement_ValidTypes() {
		return (EAttribute)deploymentToNodeTypeRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentToNodeWithPropertyRequirement() {
		return deploymentToNodeWithPropertyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentToNodeWithPropertyRequirement_Min() {
		return (EAttribute)deploymentToNodeWithPropertyRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentToNodeWithPropertyRequirement_Max() {
		return (EAttribute)deploymentToNodeWithPropertyRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentToNodeWithPropertyRequirement_Values() {
		return (EAttribute)deploymentToNodeWithPropertyRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentToSpecificNodeRequirement() {
		return deploymentToSpecificNodeRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeploymentToSpecificNodeRequirement_ValidElements() {
		return (EReference)deploymentToSpecificNodeRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCredentials() {
		return credentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyPair() {
		return keyPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyPair_User() {
		return (EAttribute)keyPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyPair_Key() {
		return (EAttribute)keyPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyPair_Algorithm() {
		return (EAttribute)keyPairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyPair_Bits() {
		return (EAttribute)keyPairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserPass() {
		return userPassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPass_Username() {
		return (EAttribute)userPassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPass_Password() {
		return (EAttribute)userPassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Entry() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Inventory() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Backend() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonsFactory getCommonsFactory() {
		return (CommonsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domlModelEClass = createEClass(DOML_MODEL);
		createEAttribute(domlModelEClass, DOML_MODEL__VERSION);
		createEReference(domlModelEClass, DOML_MODEL__APPLICATION);
		createEReference(domlModelEClass, DOML_MODEL__INFRASTRUCTURE);
		createEReference(domlModelEClass, DOML_MODEL__CONCRETIZATIONS);
		createEReference(domlModelEClass, DOML_MODEL__OPTIMIZATION);
		createEReference(domlModelEClass, DOML_MODEL__CONFIGURATIONS);
		createEReference(domlModelEClass, DOML_MODEL__ACTIVE_CONFIGURATION);
		createEReference(domlModelEClass, DOML_MODEL__ACTIVE_INFRASTRUCTURE);
		createEReference(domlModelEClass, DOML_MODEL__FUNCTIONAL_REQUIREMENTS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);

		listPropertyEClass = createEClass(LIST_PROPERTY);
		createEReference(listPropertyEClass, LIST_PROPERTY__VALUES);

		iPropertyEClass = createEClass(IPROPERTY);
		createEAttribute(iPropertyEClass, IPROPERTY__VALUE);

		sPropertyEClass = createEClass(SPROPERTY);
		createEAttribute(sPropertyEClass, SPROPERTY__VALUE);

		fPropertyEClass = createEClass(FPROPERTY);
		createEAttribute(fPropertyEClass, FPROPERTY__VALUE);

		bPropertyEClass = createEClass(BPROPERTY);
		createEAttribute(bPropertyEClass, BPROPERTY__VALUE);

		extensionElementEClass = createEClass(EXTENSION_ELEMENT);
		createEAttribute(extensionElementEClass, EXTENSION_ELEMENT__METACLASS_NAME);

		domlElementEClass = createEClass(DOML_ELEMENT);
		createEAttribute(domlElementEClass, DOML_ELEMENT__NAME);
		createEAttribute(domlElementEClass, DOML_ELEMENT__DESCRIPTION);
		createEReference(domlElementEClass, DOML_ELEMENT__ANNOTATIONS);
		createEReference(domlElementEClass, DOML_ELEMENT__CONTRIBUTES_TO);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__DEPLOYMENTS);

		deployableElementEClass = createEClass(DEPLOYABLE_ELEMENT);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__COMPONENT);
		createEReference(deploymentEClass, DEPLOYMENT__NODE);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);
		createEAttribute(requirementEClass, REQUIREMENT__PROPERTY);
		createEReference(requirementEClass, REQUIREMENT__PREDICATES_ON);

		rangedRequirementEClass = createEClass(RANGED_REQUIREMENT);
		createEAttribute(rangedRequirementEClass, RANGED_REQUIREMENT__MIN);
		createEAttribute(rangedRequirementEClass, RANGED_REQUIREMENT__MAX);

		enumeratedRequirementEClass = createEClass(ENUMERATED_REQUIREMENT);
		createEAttribute(enumeratedRequirementEClass, ENUMERATED_REQUIREMENT__VALUES);

		deploymentRequirementEClass = createEClass(DEPLOYMENT_REQUIREMENT);

		deploymentToNodeTypeRequirementEClass = createEClass(DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT);
		createEAttribute(deploymentToNodeTypeRequirementEClass, DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES);

		deploymentToNodeWithPropertyRequirementEClass = createEClass(DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT);
		createEAttribute(deploymentToNodeWithPropertyRequirementEClass, DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN);
		createEAttribute(deploymentToNodeWithPropertyRequirementEClass, DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX);
		createEAttribute(deploymentToNodeWithPropertyRequirementEClass, DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES);

		deploymentToSpecificNodeRequirementEClass = createEClass(DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT);
		createEReference(deploymentToSpecificNodeRequirementEClass, DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS);

		credentialsEClass = createEClass(CREDENTIALS);

		keyPairEClass = createEClass(KEY_PAIR);
		createEAttribute(keyPairEClass, KEY_PAIR__USER);
		createEAttribute(keyPairEClass, KEY_PAIR__KEY);
		createEAttribute(keyPairEClass, KEY_PAIR__ALGORITHM);
		createEAttribute(keyPairEClass, KEY_PAIR__BITS);

		userPassEClass = createEClass(USER_PASS);
		createEAttribute(userPassEClass, USER_PASS__USERNAME);
		createEAttribute(userPassEClass, USER_PASS__PASSWORD);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__ENTRY);
		createEAttribute(sourceEClass, SOURCE__INVENTORY);
		createEAttribute(sourceEClass, SOURCE__BACKEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		ConcretePackage theConcretePackage = (ConcretePackage)EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);
		OptimizationPackage theOptimizationPackage = (OptimizationPackage)EPackage.Registry.INSTANCE.getEPackage(OptimizationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domlModelEClass.getESuperTypes().add(this.getDOMLElement());
		listPropertyEClass.getESuperTypes().add(this.getProperty());
		iPropertyEClass.getESuperTypes().add(this.getProperty());
		sPropertyEClass.getESuperTypes().add(this.getProperty());
		fPropertyEClass.getESuperTypes().add(this.getProperty());
		bPropertyEClass.getESuperTypes().add(this.getProperty());
		configurationEClass.getESuperTypes().add(this.getDOMLElement());
		rangedRequirementEClass.getESuperTypes().add(this.getRequirement());
		enumeratedRequirementEClass.getESuperTypes().add(this.getRequirement());
		deploymentRequirementEClass.getESuperTypes().add(this.getRequirement());
		deploymentToNodeTypeRequirementEClass.getESuperTypes().add(this.getDeploymentRequirement());
		deploymentToNodeWithPropertyRequirementEClass.getESuperTypes().add(this.getDeploymentRequirement());
		deploymentToSpecificNodeRequirementEClass.getESuperTypes().add(this.getDeploymentRequirement());
		credentialsEClass.getESuperTypes().add(this.getDOMLElement());
		keyPairEClass.getESuperTypes().add(this.getCredentials());
		userPassEClass.getESuperTypes().add(this.getCredentials());
		sourceEClass.getESuperTypes().add(this.getDOMLElement());

		// Initialize classes and features; add operations and parameters
		initEClass(domlModelEClass, DOMLModel.class, "DOMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDOMLModel_Version(), ecorePackage.getEString(), "version", "3.1", 1, 1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_Application(), theApplicationPackage.getApplicationLayer(), null, "application", null, 0, 1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_Infrastructure(), theInfrastructurePackage.getInfrastructureLayer(), null, "infrastructure", null, 0, 1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_Concretizations(), theConcretePackage.getConcreteInfrastructure(), null, "concretizations", null, 0, -1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_Optimization(), theOptimizationPackage.getOptimizationLayer(), null, "optimization", null, 0, 1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_ActiveConfiguration(), this.getConfiguration(), null, "activeConfiguration", null, 0, 1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_ActiveInfrastructure(), theConcretePackage.getConcreteInfrastructure(), null, "activeInfrastructure", null, 0, 1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLModel_FunctionalRequirements(), this.getRequirement(), null, "functionalRequirements", null, 0, -1, DOMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listPropertyEClass, ListProperty.class, "ListProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListProperty_Values(), this.getProperty(), null, "values", null, 0, -1, ListProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iPropertyEClass, IProperty.class, "IProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIProperty_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sPropertyEClass, SProperty.class, "SProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, SProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fPropertyEClass, FProperty.class, "FProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFProperty_Value(), ecorePackage.getEFloatObject(), "value", null, 0, 1, FProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bPropertyEClass, BProperty.class, "BProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBProperty_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionElementEClass, ExtensionElement.class, "ExtensionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionElement_MetaclassName(), ecorePackage.getEString(), "metaclassName", null, 0, 1, ExtensionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domlElementEClass, DOMLElement.class, "DOMLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDOMLElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DOMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDOMLElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DOMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLElement_Annotations(), this.getProperty(), null, "annotations", null, 0, -1, DOMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOMLElement_ContributesTo(), this.getRequirement(), this.getRequirement_PredicatesOn(), "contributesTo", null, 0, -1, DOMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Deployments(), this.getDeployment(), null, "deployments", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployableElementEClass, DeployableElement.class, "DeployableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Component(), this.getDeployableElement(), null, "component", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Node(), theInfrastructurePackage.getInfrastructureElement(), null, "node", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Property(), ecorePackage.getEString(), "property", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_PredicatesOn(), this.getDOMLElement(), this.getDOMLElement_ContributesTo(), "predicatesOn", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangedRequirementEClass, RangedRequirement.class, "RangedRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangedRequirement_Min(), ecorePackage.getEFloatObject(), "min", null, 0, 1, RangedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangedRequirement_Max(), ecorePackage.getEFloatObject(), "max", null, 0, 1, RangedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedRequirementEClass, EnumeratedRequirement.class, "EnumeratedRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumeratedRequirement_Values(), ecorePackage.getEString(), "values", null, 0, -1, EnumeratedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentRequirementEClass, DeploymentRequirement.class, "DeploymentRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentToNodeTypeRequirementEClass, DeploymentToNodeTypeRequirement.class, "DeploymentToNodeTypeRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentToNodeTypeRequirement_ValidTypes(), ecorePackage.getEString(), "validTypes", null, 0, -1, DeploymentToNodeTypeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentToNodeWithPropertyRequirementEClass, DeploymentToNodeWithPropertyRequirement.class, "DeploymentToNodeWithPropertyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentToNodeWithPropertyRequirement_Min(), ecorePackage.getEFloatObject(), "min", null, 0, 1, DeploymentToNodeWithPropertyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentToNodeWithPropertyRequirement_Max(), ecorePackage.getEFloatObject(), "max", null, 0, 1, DeploymentToNodeWithPropertyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentToNodeWithPropertyRequirement_Values(), ecorePackage.getEString(), "values", null, 0, -1, DeploymentToNodeWithPropertyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentToSpecificNodeRequirementEClass, DeploymentToSpecificNodeRequirement.class, "DeploymentToSpecificNodeRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentToSpecificNodeRequirement_ValidElements(), theInfrastructurePackage.getInfrastructureElement(), null, "validElements", null, 0, -1, DeploymentToSpecificNodeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(credentialsEClass, Credentials.class, "Credentials", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyPairEClass, KeyPair.class, "KeyPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyPair_User(), ecorePackage.getEString(), "user", null, 0, 1, KeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPair_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPair_Algorithm(), ecorePackage.getEString(), "algorithm", null, 0, 1, KeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPair_Bits(), ecorePackage.getEIntegerObject(), "bits", null, 0, 1, KeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userPassEClass, UserPass.class, "UserPass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserPass_Username(), ecorePackage.getEString(), "username", null, 0, 1, UserPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPass_Password(), ecorePackage.getEString(), "password", null, 0, 1, UserPass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Entry(), ecorePackage.getEString(), "entry", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Inventory(), ecorePackage.getEString(), "inventory", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Backend(), ecorePackage.getEString(), "backend", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonsPackageImpl
