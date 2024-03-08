/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerGroup#getServices <em>Services</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerGroup#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerGroup#getVolumes <em>Volumes</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerGroup()
 * @model
 * @generated
 */
public interface ContainerGroup extends ComputingGroup {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerGroup_Services()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Container> getServices();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ContainerNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerGroup_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerNetwork> getNetworks();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ContainerVolume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerGroup_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerVolume> getVolumes();

} // ContainerGroup
