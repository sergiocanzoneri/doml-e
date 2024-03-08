/**
 */
package eu.piacere.doml.doml.optimization;

import eu.piacere.doml.doml.commons.DOMLElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationObjective#getKind <em>Kind</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationObjective#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationObjective()
 * @model abstract="true"
 * @generated
 */
public interface OptimizationObjective extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Max"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationObjective_Kind()
	 * @model default="Max" required="true"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.OptimizationObjective#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationObjective_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.OptimizationObjective#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

} // OptimizationObjective
