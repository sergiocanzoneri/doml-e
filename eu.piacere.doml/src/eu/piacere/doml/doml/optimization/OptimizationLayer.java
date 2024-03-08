/**
 */
package eu.piacere.doml.doml.optimization;

import eu.piacere.doml.doml.commons.Configuration;
import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.Requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getStartingHint <em>Starting Hint</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getNonfunctionalRequirements <em>Nonfunctional Requirements</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationLayer()
 * @model
 * @generated
 */
public interface OptimizationLayer extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Starting Hint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Hint</em>' reference.
	 * @see #setStartingHint(Configuration)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationLayer_StartingHint()
	 * @model
	 * @generated
	 */
	Configuration getStartingHint();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getStartingHint <em>Starting Hint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Hint</em>' reference.
	 * @see #getStartingHint()
	 * @generated
	 */
	void setStartingHint(Configuration value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.optimization.OptimizationSolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationLayer_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptimizationSolution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.optimization.OptimizationObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationLayer_Objectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptimizationObjective> getObjectives();

	/**
	 * Returns the value of the '<em><b>Nonfunctional Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonfunctional Requirements</em>' containment reference list.
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationLayer_NonfunctionalRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getNonfunctionalRequirements();

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(Float)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getOptimizationLayer_Runtime()
	 * @model
	 * @generated
	 */
	Float getRuntime();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(Float value);

} // OptimizationLayer
