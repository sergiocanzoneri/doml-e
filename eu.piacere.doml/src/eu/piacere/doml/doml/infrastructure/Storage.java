/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Storage#getLabel <em>Label</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Storage#getSize_gb <em>Size gb</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Storage#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends InfrastructureElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getStorage_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Storage#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Size gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size gb</em>' attribute.
	 * @see #setSize_gb(int)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getStorage_Size_gb()
	 * @model
	 * @generated
	 */
	int getSize_gb();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Storage#getSize_gb <em>Size gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size gb</em>' attribute.
	 * @see #getSize_gb()
	 * @generated
	 */
	void setSize_gb(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Float)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getStorage_Cost()
	 * @model
	 * @generated
	 */
	Float getCost();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Storage#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Float value);

} // Storage
