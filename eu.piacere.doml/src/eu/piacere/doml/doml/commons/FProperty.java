/**
 */
package eu.piacere.doml.doml.commons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FProperty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.FProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getFProperty()
 * @model
 * @generated
 */
public interface FProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Float)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getFProperty_Value()
	 * @model
	 * @generated
	 */
	Float getValue();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.FProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Float value);

} // FProperty
