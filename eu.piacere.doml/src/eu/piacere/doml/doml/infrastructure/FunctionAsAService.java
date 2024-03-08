/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function As AService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.FunctionAsAService#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getFunctionAsAService()
 * @model
 * @generated
 */
public interface FunctionAsAService extends InfrastructureElement {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Float)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getFunctionAsAService_Cost()
	 * @model
	 * @generated
	 */
	Float getCost();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.FunctionAsAService#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Float value);

} // FunctionAsAService
