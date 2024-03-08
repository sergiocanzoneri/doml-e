/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Container#getGeneratedFrom <em>Generated From</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Container#getHostConfigs <em>Host Configs</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Container#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Container#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Container#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends ComputingNode {
	/**
	 * Returns the value of the '<em><b>Generated From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.ContainerImage#getGeneratedContainers <em>Generated Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated From</em>' reference.
	 * @see #setGeneratedFrom(ContainerImage)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainer_GeneratedFrom()
	 * @see eu.piacere.doml.doml.infrastructure.ContainerImage#getGeneratedContainers
	 * @model opposite="generatedContainers"
	 * @generated
	 */
	ContainerImage getGeneratedFrom();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Container#getGeneratedFrom <em>Generated From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated From</em>' reference.
	 * @see #getGeneratedFrom()
	 * @generated
	 */
	void setGeneratedFrom(ContainerImage value);

	/**
	 * Returns the value of the '<em><b>Host Configs</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Configs</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainer_HostConfigs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerHostConfig> getHostConfigs();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ContainerNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainer_Networks()
	 * @model
	 * @generated
	 */
	EList<ContainerNetwork> getNetworks();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ContainerVolume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainer_Volumes()
	 * @model
	 * @generated
	 */
	EList<ContainerVolume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainer_DependsOn()
	 * @model
	 * @generated
	 */
	EList<Container> getDependsOn();

} // Container
