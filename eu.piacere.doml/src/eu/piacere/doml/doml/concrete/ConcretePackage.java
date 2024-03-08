/**
 */
package eu.piacere.doml.doml.concrete;

import eu.piacere.doml.doml.commons.CommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.concrete.ConcreteFactory
 * @model kind="package"
 * @generated
 */
public interface ConcretePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concrete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.piacere-project.eu/doml/concrete";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concrete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretePackage eINSTANCE = eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.ConcreteInfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.ConcreteInfrastructureImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getConcreteInfrastructure()
	 * @generated
	 */
	int CONCRETE_INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_INFRASTRUCTURE__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_INFRASTRUCTURE__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_INFRASTRUCTURE__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_INFRASTRUCTURE__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_INFRASTRUCTURE__PROVIDERS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_INFRASTRUCTURE_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl <em>Runtime Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getRuntimeProvider()
	 * @generated
	 */
	int RUNTIME_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__RESOURCES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__VMS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vm Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__VM_IMAGES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__CONTAINER_IMAGES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__NETWORKS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Storages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__STORAGES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Faas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__FAAS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Auto Scaling Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER__AUTO_SCALING_GROUPS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Runtime Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROVIDER_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getConcreteElement()
	 * @generated
	 */
	int CONCRETE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__RESOURCE_NAME = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__CONFIGURATION_SCRIPT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__PREEXISTING = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__REFS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.GenericResourceImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getGenericResource()
	 * @generated
	 */
	int GENERIC_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__TYPE = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.VirtualMachineImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Vm type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VM_TYPE = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.VMImageImpl <em>VM Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.VMImageImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getVMImage()
	 * @generated
	 */
	int VM_IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Image name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__IMAGE_NAME = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VM Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.ContainerImageImpl <em>Container Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.ContainerImageImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getContainerImage()
	 * @generated
	 */
	int CONTAINER_IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.ExecutionEnvironmentImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getExecutionEnvironment()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Instance type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__INSTANCE_TYPE = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Storage type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__STORAGE_TYPE = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.NetworkImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PROTOCOL = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ADDRESS_RANGE = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNETS = CONCRETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.SubnetImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NAME = NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__DESCRIPTION = NETWORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ANNOTATIONS = NETWORK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CONTRIBUTES_TO = NETWORK__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__RESOURCE_NAME = NETWORK__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CONFIGURATION_SCRIPT = NETWORK__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__PREEXISTING = NETWORK__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__REFS = NETWORK__REFS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__PROTOCOL = NETWORK__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Address Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ADDRESS_RANGE = NETWORK__ADDRESS_RANGE;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__SUBNETS = NETWORK__SUBNETS;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__MAPS = NETWORK__MAPS;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = NETWORK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.StorageImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.FunctionAsAServiceImpl <em>Function As AService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.FunctionAsAServiceImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getFunctionAsAService()
	 * @generated
	 */
	int FUNCTION_AS_ASERVICE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function As AService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.AutoScalingGroupImpl <em>Auto Scaling Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.AutoScalingGroupImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getAutoScalingGroup()
	 * @generated
	 */
	int AUTO_SCALING_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Vm type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__VM_TYPE = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__MAPS = CONCRETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Auto Scaling Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.concrete.impl.ExtConcreteElementImpl <em>Ext Concrete Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.concrete.impl.ExtConcreteElementImpl
	 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getExtConcreteElement()
	 * @generated
	 */
	int EXT_CONCRETE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__NAME = CONCRETE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__DESCRIPTION = CONCRETE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__ANNOTATIONS = CONCRETE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__CONTRIBUTES_TO = CONCRETE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__RESOURCE_NAME = CONCRETE_ELEMENT__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__CONFIGURATION_SCRIPT = CONCRETE_ELEMENT__CONFIGURATION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Preexisting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__PREEXISTING = CONCRETE_ELEMENT__PREEXISTING;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__REFS = CONCRETE_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT__METACLASS_NAME = CONCRETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ext Concrete Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONCRETE_ELEMENT_FEATURE_COUNT = CONCRETE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.ConcreteInfrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see eu.piacere.doml.doml.concrete.ConcreteInfrastructure
	 * @generated
	 */
	EClass getConcreteInfrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.ConcreteInfrastructure#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see eu.piacere.doml.doml.concrete.ConcreteInfrastructure#getProviders()
	 * @see #getConcreteInfrastructure()
	 * @generated
	 */
	EReference getConcreteInfrastructure_Providers();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.RuntimeProvider <em>Runtime Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Provider</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider
	 * @generated
	 */
	EClass getRuntimeProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getResources()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getVms <em>Vms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vms</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getVms()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_Vms();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getExecutionEnvironments <em>Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Environments</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getExecutionEnvironments()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_ExecutionEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getVmImages <em>Vm Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Images</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getVmImages()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_VmImages();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getContainerImages <em>Container Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Images</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getContainerImages()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_ContainerImages();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getNetworks()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getStorages <em>Storages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storages</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getStorages()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_Storages();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getFaas <em>Faas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faas</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getFaas()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_Faas();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getAutoScalingGroups <em>Auto Scaling Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auto Scaling Groups</em>'.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider#getAutoScalingGroups()
	 * @see #getRuntimeProvider()
	 * @generated
	 */
	EReference getRuntimeProvider_AutoScalingGroups();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.ConcreteElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see eu.piacere.doml.doml.concrete.ConcreteElement
	 * @generated
	 */
	EClass getConcreteElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.ConcreteElement#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see eu.piacere.doml.doml.concrete.ConcreteElement#getResourceName()
	 * @see #getConcreteElement()
	 * @generated
	 */
	EAttribute getConcreteElement_ResourceName();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.ConcreteElement#getConfigurationScript <em>Configuration Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Script</em>'.
	 * @see eu.piacere.doml.doml.concrete.ConcreteElement#getConfigurationScript()
	 * @see #getConcreteElement()
	 * @generated
	 */
	EAttribute getConcreteElement_ConfigurationScript();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.ConcreteElement#getPreexisting <em>Preexisting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preexisting</em>'.
	 * @see eu.piacere.doml.doml.concrete.ConcreteElement#getPreexisting()
	 * @see #getConcreteElement()
	 * @generated
	 */
	EAttribute getConcreteElement_Preexisting();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.concrete.ConcreteElement#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refs</em>'.
	 * @see eu.piacere.doml.doml.concrete.ConcreteElement#getRefs()
	 * @see #getConcreteElement()
	 * @generated
	 */
	EReference getConcreteElement_Refs();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.GenericResource <em>Generic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Resource</em>'.
	 * @see eu.piacere.doml.doml.concrete.GenericResource
	 * @generated
	 */
	EClass getGenericResource();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.GenericResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.piacere.doml.doml.concrete.GenericResource#getType()
	 * @see #getGenericResource()
	 * @generated
	 */
	EAttribute getGenericResource_Type();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see eu.piacere.doml.doml.concrete.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.VirtualMachine#getVm_type <em>Vm type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm type</em>'.
	 * @see eu.piacere.doml.doml.concrete.VirtualMachine#getVm_type()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Vm_type();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.VirtualMachine#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.VirtualMachine#getMaps()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.VMImage <em>VM Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Image</em>'.
	 * @see eu.piacere.doml.doml.concrete.VMImage
	 * @generated
	 */
	EClass getVMImage();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.VMImage#getImage_name <em>Image name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image name</em>'.
	 * @see eu.piacere.doml.doml.concrete.VMImage#getImage_name()
	 * @see #getVMImage()
	 * @generated
	 */
	EAttribute getVMImage_Image_name();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.VMImage#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.VMImage#getMaps()
	 * @see #getVMImage()
	 * @generated
	 */
	EReference getVMImage_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.ContainerImage <em>Container Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Image</em>'.
	 * @see eu.piacere.doml.doml.concrete.ContainerImage
	 * @generated
	 */
	EClass getContainerImage();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.ContainerImage#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.ContainerImage#getMaps()
	 * @see #getContainerImage()
	 * @generated
	 */
	EReference getContainerImage_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment</em>'.
	 * @see eu.piacere.doml.doml.concrete.ExecutionEnvironment
	 * @generated
	 */
	EClass getExecutionEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getInstance_type <em>Instance type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance type</em>'.
	 * @see eu.piacere.doml.doml.concrete.ExecutionEnvironment#getInstance_type()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EAttribute getExecutionEnvironment_Instance_type();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getStorage_type <em>Storage type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage type</em>'.
	 * @see eu.piacere.doml.doml.concrete.ExecutionEnvironment#getStorage_type()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EAttribute getExecutionEnvironment_Storage_type();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.ExecutionEnvironment#getMaps()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see eu.piacere.doml.doml.concrete.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.Network#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see eu.piacere.doml.doml.concrete.Network#getProtocol()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.Network#getAddressRange <em>Address Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Range</em>'.
	 * @see eu.piacere.doml.doml.concrete.Network#getAddressRange()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_AddressRange();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.concrete.Network#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnets</em>'.
	 * @see eu.piacere.doml.doml.concrete.Network#getSubnets()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Subnets();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.Network#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.Network#getMaps()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see eu.piacere.doml.doml.concrete.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see eu.piacere.doml.doml.concrete.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.Storage#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.Storage#getMaps()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.FunctionAsAService <em>Function As AService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function As AService</em>'.
	 * @see eu.piacere.doml.doml.concrete.FunctionAsAService
	 * @generated
	 */
	EClass getFunctionAsAService();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.FunctionAsAService#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.FunctionAsAService#getMaps()
	 * @see #getFunctionAsAService()
	 * @generated
	 */
	EReference getFunctionAsAService_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.AutoScalingGroup <em>Auto Scaling Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Scaling Group</em>'.
	 * @see eu.piacere.doml.doml.concrete.AutoScalingGroup
	 * @generated
	 */
	EClass getAutoScalingGroup();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.concrete.AutoScalingGroup#getVm_type <em>Vm type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm type</em>'.
	 * @see eu.piacere.doml.doml.concrete.AutoScalingGroup#getVm_type()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EAttribute getAutoScalingGroup_Vm_type();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.concrete.AutoScalingGroup#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see eu.piacere.doml.doml.concrete.AutoScalingGroup#getMaps()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EReference getAutoScalingGroup_Maps();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.concrete.ExtConcreteElement <em>Ext Concrete Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext Concrete Element</em>'.
	 * @see eu.piacere.doml.doml.concrete.ExtConcreteElement
	 * @generated
	 */
	EClass getExtConcreteElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConcreteFactory getConcreteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.ConcreteInfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.ConcreteInfrastructureImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getConcreteInfrastructure()
		 * @generated
		 */
		EClass CONCRETE_INFRASTRUCTURE = eINSTANCE.getConcreteInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_INFRASTRUCTURE__PROVIDERS = eINSTANCE.getConcreteInfrastructure_Providers();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl <em>Runtime Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getRuntimeProvider()
		 * @generated
		 */
		EClass RUNTIME_PROVIDER = eINSTANCE.getRuntimeProvider();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__RESOURCES = eINSTANCE.getRuntimeProvider_Resources();

		/**
		 * The meta object literal for the '<em><b>Vms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__VMS = eINSTANCE.getRuntimeProvider_Vms();

		/**
		 * The meta object literal for the '<em><b>Execution Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS = eINSTANCE.getRuntimeProvider_ExecutionEnvironments();

		/**
		 * The meta object literal for the '<em><b>Vm Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__VM_IMAGES = eINSTANCE.getRuntimeProvider_VmImages();

		/**
		 * The meta object literal for the '<em><b>Container Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__CONTAINER_IMAGES = eINSTANCE.getRuntimeProvider_ContainerImages();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__NETWORKS = eINSTANCE.getRuntimeProvider_Networks();

		/**
		 * The meta object literal for the '<em><b>Storages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__STORAGES = eINSTANCE.getRuntimeProvider_Storages();

		/**
		 * The meta object literal for the '<em><b>Faas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__FAAS = eINSTANCE.getRuntimeProvider_Faas();

		/**
		 * The meta object literal for the '<em><b>Auto Scaling Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROVIDER__AUTO_SCALING_GROUPS = eINSTANCE.getRuntimeProvider_AutoScalingGroups();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getConcreteElement()
		 * @generated
		 */
		EClass CONCRETE_ELEMENT = eINSTANCE.getConcreteElement();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_ELEMENT__RESOURCE_NAME = eINSTANCE.getConcreteElement_ResourceName();

		/**
		 * The meta object literal for the '<em><b>Configuration Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_ELEMENT__CONFIGURATION_SCRIPT = eINSTANCE.getConcreteElement_ConfigurationScript();

		/**
		 * The meta object literal for the '<em><b>Preexisting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_ELEMENT__PREEXISTING = eINSTANCE.getConcreteElement_Preexisting();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_ELEMENT__REFS = eINSTANCE.getConcreteElement_Refs();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.GenericResourceImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getGenericResource()
		 * @generated
		 */
		EClass GENERIC_RESOURCE = eINSTANCE.getGenericResource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_RESOURCE__TYPE = eINSTANCE.getGenericResource_Type();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.VirtualMachineImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Vm type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__VM_TYPE = eINSTANCE.getVirtualMachine_Vm_type();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__MAPS = eINSTANCE.getVirtualMachine_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.VMImageImpl <em>VM Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.VMImageImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getVMImage()
		 * @generated
		 */
		EClass VM_IMAGE = eINSTANCE.getVMImage();

		/**
		 * The meta object literal for the '<em><b>Image name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_IMAGE__IMAGE_NAME = eINSTANCE.getVMImage_Image_name();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE__MAPS = eINSTANCE.getVMImage_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.ContainerImageImpl <em>Container Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.ContainerImageImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getContainerImage()
		 * @generated
		 */
		EClass CONTAINER_IMAGE = eINSTANCE.getContainerImage();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_IMAGE__MAPS = eINSTANCE.getContainerImage_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.ExecutionEnvironmentImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getExecutionEnvironment()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Instance type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENVIRONMENT__INSTANCE_TYPE = eINSTANCE.getExecutionEnvironment_Instance_type();

		/**
		 * The meta object literal for the '<em><b>Storage type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENVIRONMENT__STORAGE_TYPE = eINSTANCE.getExecutionEnvironment_Storage_type();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__MAPS = eINSTANCE.getExecutionEnvironment_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.NetworkImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PROTOCOL = eINSTANCE.getNetwork_Protocol();

		/**
		 * The meta object literal for the '<em><b>Address Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__ADDRESS_RANGE = eINSTANCE.getNetwork_AddressRange();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__SUBNETS = eINSTANCE.getNetwork_Subnets();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__MAPS = eINSTANCE.getNetwork_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.SubnetImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.StorageImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__MAPS = eINSTANCE.getStorage_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.FunctionAsAServiceImpl <em>Function As AService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.FunctionAsAServiceImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getFunctionAsAService()
		 * @generated
		 */
		EClass FUNCTION_AS_ASERVICE = eINSTANCE.getFunctionAsAService();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_AS_ASERVICE__MAPS = eINSTANCE.getFunctionAsAService_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.AutoScalingGroupImpl <em>Auto Scaling Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.AutoScalingGroupImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getAutoScalingGroup()
		 * @generated
		 */
		EClass AUTO_SCALING_GROUP = eINSTANCE.getAutoScalingGroup();

		/**
		 * The meta object literal for the '<em><b>Vm type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_SCALING_GROUP__VM_TYPE = eINSTANCE.getAutoScalingGroup_Vm_type();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_SCALING_GROUP__MAPS = eINSTANCE.getAutoScalingGroup_Maps();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.concrete.impl.ExtConcreteElementImpl <em>Ext Concrete Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.concrete.impl.ExtConcreteElementImpl
		 * @see eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl#getExtConcreteElement()
		 * @generated
		 */
		EClass EXT_CONCRETE_ELEMENT = eINSTANCE.getExtConcreteElement();

	}

} //ConcretePackage
