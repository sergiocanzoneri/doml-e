/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Node Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getUri <em>Uri</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNodeGenerator()
 * @model abstract="true"
 * @generated
 */
public interface ComputingNodeGenerator extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNodeGenerator_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.piacere.doml.doml.infrastructure.GeneratorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.GeneratorKind
	 * @see #setKind(GeneratorKind)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNodeGenerator_Kind()
	 * @model
	 * @generated
	 */
	GeneratorKind getKind();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.GeneratorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(GeneratorKind value);

} // ComputingNodeGenerator
