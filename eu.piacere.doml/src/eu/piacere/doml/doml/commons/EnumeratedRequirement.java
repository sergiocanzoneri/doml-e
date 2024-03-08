/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.EnumeratedRequirement#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getEnumeratedRequirement()
 * @model
 * @generated
 */
public interface EnumeratedRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getEnumeratedRequirement_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

} // EnumeratedRequirement
