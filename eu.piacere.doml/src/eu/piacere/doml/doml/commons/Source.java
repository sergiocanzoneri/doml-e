/**
 */
package eu.piacere.doml.doml.commons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.Source#getEntry <em>Entry</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.Source#getInventory <em>Inventory</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.Source#getBackend <em>Backend</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' attribute.
	 * @see #setEntry(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getSource_Entry()
	 * @model
	 * @generated
	 */
	String getEntry();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Source#getEntry <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' attribute.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(String value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' attribute.
	 * @see #setInventory(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getSource_Inventory()
	 * @model
	 * @generated
	 */
	String getInventory();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Source#getInventory <em>Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory</em>' attribute.
	 * @see #getInventory()
	 * @generated
	 */
	void setInventory(String value);

	/**
	 * Returns the value of the '<em><b>Backend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend</em>' attribute.
	 * @see #setBackend(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getSource_Backend()
	 * @model
	 * @generated
	 */
	String getBackend();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Source#getBackend <em>Backend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend</em>' attribute.
	 * @see #getBackend()
	 * @generated
	 */
	void setBackend(String value);

} // Source
