/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerImage#getGeneratedContainers <em>Generated Containers</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerImage()
 * @model
 * @generated
 */
public interface ContainerImage extends ComputingNodeGenerator {
	/**
	 * Returns the value of the '<em><b>Generated Containers</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Container}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.Container#getGeneratedFrom <em>Generated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Containers</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerImage_GeneratedContainers()
	 * @see eu.piacere.doml.doml.infrastructure.Container#getGeneratedFrom
	 * @model opposite="generatedFrom"
	 * @generated
	 */
	EList<Container> getGeneratedContainers();

} // ContainerImage
