/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Location#getRegion <em>Region</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Location#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getLocation_Region()
	 * @model required="true"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Location#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getLocation_Zone()
	 * @model
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Location#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

} // Location
