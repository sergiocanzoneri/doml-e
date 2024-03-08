/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.ListProperty#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getListProperty()
 * @model
 * @generated
 */
public interface ListProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getListProperty_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getValues();

} // ListProperty
