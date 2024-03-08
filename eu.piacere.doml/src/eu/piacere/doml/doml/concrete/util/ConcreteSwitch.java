/**
 */
package eu.piacere.doml.doml.concrete.util;

import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.commons.ReferenceElement;
import eu.piacere.doml.doml.concrete.*;

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
 * @see eu.piacere.doml.doml.concrete.ConcretePackage
 * @generated
 */
public class ConcreteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteSwitch() {
		if (modelPackage == null) {
			modelPackage = ConcretePackage.eINSTANCE;
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
			case ConcretePackage.CONCRETE_INFRASTRUCTURE: {
				ConcreteInfrastructure concreteInfrastructure = (ConcreteInfrastructure)theEObject;
				T result = caseConcreteInfrastructure(concreteInfrastructure);
				if (result == null) result = caseDOMLElement(concreteInfrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.RUNTIME_PROVIDER: {
				RuntimeProvider runtimeProvider = (RuntimeProvider)theEObject;
				T result = caseRuntimeProvider(runtimeProvider);
				if (result == null) result = caseDOMLElement(runtimeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.CONCRETE_ELEMENT: {
				ConcreteElement concreteElement = (ConcreteElement)theEObject;
				T result = caseConcreteElement(concreteElement);
				if (result == null) result = caseDOMLElement(concreteElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.GENERIC_RESOURCE: {
				GenericResource genericResource = (GenericResource)theEObject;
				T result = caseGenericResource(genericResource);
				if (result == null) result = caseConcreteElement(genericResource);
				if (result == null) result = caseDOMLElement(genericResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.VIRTUAL_MACHINE: {
				VirtualMachine virtualMachine = (VirtualMachine)theEObject;
				T result = caseVirtualMachine(virtualMachine);
				if (result == null) result = caseConcreteElement(virtualMachine);
				if (result == null) result = caseDOMLElement(virtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.VM_IMAGE: {
				VMImage vmImage = (VMImage)theEObject;
				T result = caseVMImage(vmImage);
				if (result == null) result = caseConcreteElement(vmImage);
				if (result == null) result = caseDOMLElement(vmImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.CONTAINER_IMAGE: {
				ContainerImage containerImage = (ContainerImage)theEObject;
				T result = caseContainerImage(containerImage);
				if (result == null) result = caseConcreteElement(containerImage);
				if (result == null) result = caseDOMLElement(containerImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.EXECUTION_ENVIRONMENT: {
				ExecutionEnvironment executionEnvironment = (ExecutionEnvironment)theEObject;
				T result = caseExecutionEnvironment(executionEnvironment);
				if (result == null) result = caseConcreteElement(executionEnvironment);
				if (result == null) result = caseDOMLElement(executionEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseConcreteElement(network);
				if (result == null) result = caseDOMLElement(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.SUBNET: {
				Subnet subnet = (Subnet)theEObject;
				T result = caseSubnet(subnet);
				if (result == null) result = caseNetwork(subnet);
				if (result == null) result = caseConcreteElement(subnet);
				if (result == null) result = caseDOMLElement(subnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseConcreteElement(storage);
				if (result == null) result = caseDOMLElement(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.FUNCTION_AS_ASERVICE: {
				FunctionAsAService functionAsAService = (FunctionAsAService)theEObject;
				T result = caseFunctionAsAService(functionAsAService);
				if (result == null) result = caseConcreteElement(functionAsAService);
				if (result == null) result = caseDOMLElement(functionAsAService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.AUTO_SCALING_GROUP: {
				AutoScalingGroup autoScalingGroup = (AutoScalingGroup)theEObject;
				T result = caseAutoScalingGroup(autoScalingGroup);
				if (result == null) result = caseConcreteElement(autoScalingGroup);
				if (result == null) result = caseDOMLElement(autoScalingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.EXT_CONCRETE_ELEMENT: {
				ExtConcreteElement extConcreteElement = (ExtConcreteElement)theEObject;
				T result = caseExtConcreteElement(extConcreteElement);
				if (result == null) result = caseConcreteElement(extConcreteElement);
				if (result == null) result = caseExtensionElement(extConcreteElement);
				if (result == null) result = caseDOMLElement(extConcreteElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteInfrastructure(ConcreteInfrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeProvider(RuntimeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteElement(ConcreteElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericResource(GenericResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachine(VirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMImage(VMImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerImage(ContainerImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnet(Subnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function As AService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function As AService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAsAService(FunctionAsAService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Scaling Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Scaling Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoScalingGroup(AutoScalingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ext Concrete Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ext Concrete Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtConcreteElement(ExtConcreteElement object) {
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

} //ConcreteSwitch
