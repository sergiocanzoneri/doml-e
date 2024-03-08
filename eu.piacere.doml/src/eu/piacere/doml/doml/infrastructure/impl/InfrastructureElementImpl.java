/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructureElement;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class InfrastructureElementImpl extends DOMLElementImpl implements InfrastructureElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.INFRASTRUCTURE_ELEMENT;
	}

} //InfrastructureElementImpl
