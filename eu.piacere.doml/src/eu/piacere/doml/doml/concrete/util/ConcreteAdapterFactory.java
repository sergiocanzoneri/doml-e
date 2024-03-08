/**
 */
package eu.piacere.doml.doml.concrete.util;

import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.commons.ReferenceElement;
import eu.piacere.doml.doml.concrete.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.concrete.ConcretePackage
 * @generated
 */
public class ConcreteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConcretePackage.eINSTANCE;
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
	protected ConcreteSwitch<Adapter> modelSwitch =
		new ConcreteSwitch<Adapter>() {
			@Override
			public Adapter caseConcreteInfrastructure(ConcreteInfrastructure object) {
				return createConcreteInfrastructureAdapter();
			}
			@Override
			public Adapter caseRuntimeProvider(RuntimeProvider object) {
				return createRuntimeProviderAdapter();
			}
			@Override
			public Adapter caseConcreteElement(ConcreteElement object) {
				return createConcreteElementAdapter();
			}
			@Override
			public Adapter caseGenericResource(GenericResource object) {
				return createGenericResourceAdapter();
			}
			@Override
			public Adapter caseVirtualMachine(VirtualMachine object) {
				return createVirtualMachineAdapter();
			}
			@Override
			public Adapter caseVMImage(VMImage object) {
				return createVMImageAdapter();
			}
			@Override
			public Adapter caseContainerImage(ContainerImage object) {
				return createContainerImageAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironment(ExecutionEnvironment object) {
				return createExecutionEnvironmentAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseSubnet(Subnet object) {
				return createSubnetAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseFunctionAsAService(FunctionAsAService object) {
				return createFunctionAsAServiceAdapter();
			}
			@Override
			public Adapter caseAutoScalingGroup(AutoScalingGroup object) {
				return createAutoScalingGroupAdapter();
			}
			@Override
			public Adapter caseExtConcreteElement(ExtConcreteElement object) {
				return createExtConcreteElementAdapter();
			}
			@Override
			public Adapter caseDOMLElement(DOMLElement object) {
				return createDOMLElementAdapter();
			}
			@Override
			public Adapter caseExtensionElement(ExtensionElement object) {
				return createExtensionElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.ConcreteInfrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.ConcreteInfrastructure
	 * @generated
	 */
	public Adapter createConcreteInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.RuntimeProvider <em>Runtime Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.RuntimeProvider
	 * @generated
	 */
	public Adapter createRuntimeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.ConcreteElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.ConcreteElement
	 * @generated
	 */
	public Adapter createConcreteElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.GenericResource <em>Generic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.GenericResource
	 * @generated
	 */
	public Adapter createGenericResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.VirtualMachine
	 * @generated
	 */
	public Adapter createVirtualMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.VMImage <em>VM Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.VMImage
	 * @generated
	 */
	public Adapter createVMImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.ContainerImage <em>Container Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.ContainerImage
	 * @generated
	 */
	public Adapter createContainerImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.Subnet
	 * @generated
	 */
	public Adapter createSubnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.FunctionAsAService <em>Function As AService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.FunctionAsAService
	 * @generated
	 */
	public Adapter createFunctionAsAServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.AutoScalingGroup <em>Auto Scaling Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.AutoScalingGroup
	 * @generated
	 */
	public Adapter createAutoScalingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.concrete.ExtConcreteElement <em>Ext Concrete Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.concrete.ExtConcreteElement
	 * @generated
	 */
	public Adapter createExtConcreteElementAdapter() {
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

} //ConcreteAdapterFactory
