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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.edapt.spi.history.Create;
import org.eclipse.emf.edapt.spi.history.History;
import org.eclipse.emf.edapt.spi.history.HistoryPackage;
import org.eclipse.emf.edapt.spi.history.Release;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.edapt.spi.history.impl.HistoryImpl#getReleases <em>Releases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryImpl extends EObjectImpl implements History {
	/**
	 * The cached value of the '{@link #getReleases() <em>Releases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getReleases()
	 * @generated
	 * @ordered
	 */
	protected EList<Release> releases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HistoryImpl() {
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
		return HistoryPackage.Literals.HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Release> getReleases() {
		if (releases == null) {
			releases = new EObjectContainmentWithInverseEList<Release>(Release.class, this,
				HistoryPackage.HISTORY__RELEASES, HistoryPackage.RELEASE__HISTORY);
		}
		return releases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public Release getFirstRelease() {
		final EList<Release> releases = getReleases();
		if (releases.isEmpty()) {
			return null;
		}
		return releases.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public Release getLastRelease() {
		final EList<Release> releases = getReleases();
		if (releases.isEmpty()) {
			return null;
		}
		return releases.get(releases.size() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<EPackage> getRootPackages() {
		final EList<EPackage> rootPackages = new UniqueEList<EPackage>();
		for (final Iterator<EObject> i = eAllContents(); i.hasNext();) {
			final EObject object = i.next();
			if (object instanceof Create) {
				final Create createChild = (Create) object;
				if (createChild.getElement() instanceof EPackage && createChild.getTarget() == null) {
					final EPackage rootPackage = (EPackage) createChild.getElement();
					rootPackages.add(rootPackage);
				}
			}
		}
		return rootPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public Release getLatestRelease() {
		final EList<Release> releases = getReleases();
		if (releases.size() < 2) {
			return null;
		}
		return releases.get(releases.size() - 2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HistoryPackage.HISTORY__RELEASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReleases()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HistoryPackage.HISTORY__RELEASES:
			return ((InternalEList<?>) getReleases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case HistoryPackage.HISTORY__RELEASES:
			return getReleases();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HistoryPackage.HISTORY__RELEASES:
			getReleases().clear();
			getReleases().addAll((Collection<? extends Release>) newValue);
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
		case HistoryPackage.HISTORY__RELEASES:
			getReleases().clear();
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
		case HistoryPackage.HISTORY__RELEASES:
			return releases != null && !releases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // HistoryImpl
