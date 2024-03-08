/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerVolume#getContainerVolumeName <em>Container Volume Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerVolume#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerVolume()
 * @model
 * @generated
 */
public interface ContainerVolume extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Container Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Volume Name</em>' attribute.
	 * @see #setContainerVolumeName(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerVolume_ContainerVolumeName()
	 * @model
	 * @generated
	 */
	String getContainerVolumeName();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ContainerVolume#getContainerVolumeName <em>Container Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Volume Name</em>' attribute.
	 * @see #getContainerVolumeName()
	 * @generated
	 */
	void setContainerVolumeName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerVolume_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ContainerVolume#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ContainerVolume
