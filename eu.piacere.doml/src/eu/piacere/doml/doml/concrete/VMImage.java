/**
 */
package eu.piacere.doml.doml.concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.VMImage#getImage_name <em>Image name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.VMImage#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getVMImage()
 * @model
 * @generated
 */
public interface VMImage extends ConcreteElement {
	/**
	 * Returns the value of the '<em><b>Image name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image name</em>' attribute.
	 * @see #setImage_name(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getVMImage_Image_name()
	 * @model
	 * @generated
	 */
	String getImage_name();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.VMImage#getImage_name <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image name</em>' attribute.
	 * @see #getImage_name()
	 * @generated
	 */
	void setImage_name(String value);

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference.
	 * @see #setMaps(eu.piacere.doml.doml.infrastructure.VMImage)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getVMImage_Maps()
	 * @model
	 * @generated
	 */
	eu.piacere.doml.doml.infrastructure.VMImage getMaps();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.VMImage#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(eu.piacere.doml.doml.infrastructure.VMImage value);

} // VMImage
