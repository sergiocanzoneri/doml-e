/**
 */
package eu.piacere.doml.doml.optimization;

import eu.piacere.doml.doml.commons.Configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationSolution#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationSolution#getDecisions <em>Decisions</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationSolution()
 * @model
 * @generated
 */
public interface OptimizationSolution extends Configuration {
	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference.
	 * @see #setObjectives(ObjectiveValue)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationSolution_Objectives()
	 * @model containment="true"
	 * @generated
	 */
	ObjectiveValue getObjectives();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.OptimizationSolution#getObjectives <em>Objectives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectives</em>' containment reference.
	 * @see #getObjectives()
	 * @generated
	 */
	void setObjectives(ObjectiveValue value);

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' attribute list.
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationSolution_Decisions()
	 * @model
	 * @generated
	 */
	EList<String> getDecisions();

} // OptimizationSolution
