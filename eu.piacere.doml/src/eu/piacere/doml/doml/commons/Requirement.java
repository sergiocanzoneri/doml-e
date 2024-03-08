/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.Requirement#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.Requirement#getPredicatesOn <em>Predicates On</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRequirement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Requirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRequirement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRequirement_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Requirement#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Predicates On</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.DOMLElement}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.commons.DOMLElement#getContributesTo <em>Contributes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates On</em>' reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRequirement_PredicatesOn()
	 * @see eu.piacere.doml.doml.commons.DOMLElement#getContributesTo
	 * @model opposite="contributesTo"
	 * @generated
	 */
	EList<DOMLElement> getPredicatesOn();

} // Requirement
