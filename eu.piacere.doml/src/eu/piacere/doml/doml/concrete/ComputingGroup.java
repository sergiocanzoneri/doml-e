/**
 */
package eu.piacere.doml.doml.concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.ComputingGroup#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getComputingGroup()
 * @model
 * @generated
 */
public interface ComputingGroup extends ConcreteElement {
	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference.
	 * @see #setMaps(eu.piacere.doml.doml.infrastructure.ComputingGroup)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getComputingGroup_Maps()
	 * @model
	 * @generated
	 */
	eu.piacere.doml.doml.infrastructure.ComputingGroup getMaps();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ComputingGroup#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(eu.piacere.doml.doml.infrastructure.ComputingGroup value);

} // ComputingGroup
