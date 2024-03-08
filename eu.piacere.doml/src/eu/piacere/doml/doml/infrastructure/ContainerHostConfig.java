/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.SProperty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Host Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getEnvironment_variables <em>Environment variables</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getHost <em>Host</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerHostConfig()
 * @model
 * @generated
 */
public interface ContainerHostConfig extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Environment variables</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.SProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment variables</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerHostConfig_Environment_variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<SProperty> getEnvironment_variables();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ComputingNode)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerHostConfig_Host()
	 * @model
	 * @generated
	 */
	ComputingNode getHost();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ComputingNode value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ContainerConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerHostConfig_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerConfig> getConfigurations();

} // ContainerHostConfig
