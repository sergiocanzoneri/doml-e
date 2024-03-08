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
package org.eclipse.emf.edapt.history.recorder;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edapt.spi.history.History;
import org.eclipse.emf.edapt.spi.history.Release;

/**
 * Class to generate the default history for a metamodel
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class HistoryGenerator extends GeneratorBase {

	/**
	 * Root packages
	 */
	private final List<EPackage> rootPackages;

	/**
	 * Constructor
	 *
	 * @param rootPackages
	 */
	public HistoryGenerator(List<EPackage> rootPackages) {
		this.rootPackages = rootPackages;
	}

	/**
	 * Generate the default history
	 *
	 * @return History
	 */
	public History generate() {

		final History history = factory.createHistory();
		final Release release = factory.createRelease();
		history.getReleases().add(release);

		final List<EObject> rootElements = new ArrayList<EObject>();
		rootElements.addAll(rootPackages);
		generateElements(rootElements);

		release.getChanges().add(changeContainer);

		return history;
	}
}
