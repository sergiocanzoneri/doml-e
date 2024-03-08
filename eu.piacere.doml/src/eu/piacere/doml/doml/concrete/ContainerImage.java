/**
 */
package eu.piacere.doml.doml.concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.ContainerImage#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getContainerImage()
 * @model
 * @generated
 */
public interface ContainerImage extends ConcreteElement {
	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference.
	 * @see #setMaps(eu.piacere.doml.doml.infrastructure.ContainerImage)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getContainerImage_Maps()
	 * @model
	 * @generated
	 */
	eu.piacere.doml.doml.infrastructure.ContainerImage getMaps();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ContainerImage#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(eu.piacere.doml.doml.infrastructure.ContainerImage value);

} // ContainerImage
