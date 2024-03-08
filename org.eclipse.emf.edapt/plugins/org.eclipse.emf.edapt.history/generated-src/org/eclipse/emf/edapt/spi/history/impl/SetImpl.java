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
package org.eclipse.emf.edapt.spi.history.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edapt.spi.history.HistoryPackage;
import org.eclipse.emf.edapt.spi.history.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.edapt.spi.history.impl.SetImpl#getOldDataValue <em>Old Data Value</em>}</li>
 * <li>{@link org.eclipse.emf.edapt.spi.history.impl.SetImpl#getOldReferenceValue <em>Old Reference Value</em>}</li>
 * <li>{@link org.eclipse.emf.edapt.spi.history.impl.SetImpl#getOldValue <em>Old Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetImpl extends ValueChangeImpl implements Set {
	/**
	 * The default value of the '{@link #getOldDataValue() <em>Old Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOldDataValue()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_DATA_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOldDataValue() <em>Old Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOldDataValue()
	 * @generated
	 * @ordered
	 */
	protected String oldDataValue = OLD_DATA_VALUE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getOldReferenceValue() <em>Old Reference Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOldReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected EObject oldReferenceValue;
	/**
	 * The default value of the '{@link #getOldValue() <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object OLD_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getOldDataValue() {
		return oldDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOldDataValue(String newOldDataValue) {
		final String oldOldDataValue = oldDataValue;
		oldDataValue = newOldDataValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.SET__OLD_DATA_VALUE, oldOldDataValue,
				oldDataValue));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject getOldReferenceValue() {
		if (oldReferenceValue != null && oldReferenceValue.eIsProxy()) {
			final InternalEObject oldOldReferenceValue = (InternalEObject) oldReferenceValue;
			oldReferenceValue = eResolveProxy(oldOldReferenceValue);
			if (oldReferenceValue != oldOldReferenceValue) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HistoryPackage.SET__OLD_REFERENCE_VALUE,
						oldOldReferenceValue, oldReferenceValue));
				}
			}
		}
		return oldReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EObject basicGetOldReferenceValue() {
		return oldReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOldReferenceValue(EObject newOldReferenceValue) {
		final EObject oldOldReferenceValue = oldReferenceValue;
		oldReferenceValue = newOldReferenceValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.SET__OLD_REFERENCE_VALUE,
				oldOldReferenceValue, oldReferenceValue));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public Object getOldValue() {
		final EStructuralFeature feature = getFeature();
		if (feature instanceof EReference) {
			return getOldReferenceValue();
		}
		final EAttribute attribute = (EAttribute) feature;
		final EDataType type = attribute.getEAttributeType();
		return EcoreUtil.createFromString(type, getOldDataValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void setOldValue(Object newOldValue) {
		final EStructuralFeature feature = getFeature();
		if (feature instanceof EReference) {
			setOldReferenceValue((EObject) newOldValue);
		}
		else {
			final EAttribute attribute = (EAttribute) feature;
			final EDataType type = attribute.getEAttributeType();
			setOldDataValue(EcoreUtil.convertToString(type, newOldValue));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HistoryPackage.SET__OLD_DATA_VALUE:
			return getOldDataValue();
		case HistoryPackage.SET__OLD_REFERENCE_VALUE:
			if (resolve) {
				return getOldReferenceValue();
			}
			return basicGetOldReferenceValue();
		case HistoryPackage.SET__OLD_VALUE:
			return getOldValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HistoryPackage.SET__OLD_DATA_VALUE:
			setOldDataValue((String) newValue);
			return;
		case HistoryPackage.SET__OLD_REFERENCE_VALUE:
			setOldReferenceValue((EObject) newValue);
			return;
		case HistoryPackage.SET__OLD_VALUE:
			setOldValue(newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HistoryPackage.SET__OLD_DATA_VALUE:
			setOldDataValue(OLD_DATA_VALUE_EDEFAULT);
			return;
		case HistoryPackage.SET__OLD_REFERENCE_VALUE:
			setOldReferenceValue((EObject) null);
			return;
		case HistoryPackage.SET__OLD_VALUE:
			setOldValue(OLD_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HistoryPackage.SET__OLD_DATA_VALUE:
			return OLD_DATA_VALUE_EDEFAULT == null ? oldDataValue != null : !OLD_DATA_VALUE_EDEFAULT
				.equals(oldDataValue);
		case HistoryPackage.SET__OLD_REFERENCE_VALUE:
			return oldReferenceValue != null;
		case HistoryPackage.SET__OLD_VALUE:
			return OLD_VALUE_EDEFAULT == null ? getOldValue() != null : !OLD_VALUE_EDEFAULT.equals(getOldValue());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (oldDataValue: "); //$NON-NLS-1$
		result.append(oldDataValue);
		result.append(')');
		return result.toString();
	}

} // SetImpl
