/*******************************************************************************
 * Copyright (c) 2007, 2010 BMW Car IT, Technische Universitaet Muenchen, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * BMW Car IT - Initial API and implementation
 * Technische Universitaet Muenchen - Major refactoring and extension
 *******************************************************************************/
package org.eclipse.emf.edapt.declaration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for elements which are identified by a name
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.edapt.declaration.IdentifiedElement#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.edapt.declaration.IdentifiedElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.edapt.declaration.DeclarationPackage#getIdentifiedElement()
 * @model abstract="true"
 * @generated
 */
public interface IdentifiedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.edapt.declaration.DeclarationPackage#getIdentifiedElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.edapt.declaration.IdentifiedElement#getName <em>Name</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description for the metamodeler to be able to understand the parameter
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.edapt.declaration.DeclarationPackage#getIdentifiedElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.edapt.declaration.IdentifiedElement#getDescription
	 * <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // IdentifiedElement
