/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.VMImage#getGeneratedVMs <em>Generated VMs</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getVMImage()
 * @model
 * @generated
 */
public interface VMImage extends ComputingNodeGenerator {
	/**
	 * Returns the value of the '<em><b>Generated VMs</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.VirtualMachine}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getGeneratedFrom <em>Generated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated VMs</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getVMImage_GeneratedVMs()
	 * @see eu.piacere.doml.doml.infrastructure.VirtualMachine#getGeneratedFrom
	 * @model opposite="generatedFrom"
	 * @generated
	 */
	EList<VirtualMachine> getGeneratedVMs();

} // VMImage
