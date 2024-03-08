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
package org.eclipse.emf.edapt.cdo.migration.execution;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edapt.cdo.migration.StrategyBackwardConverter;
import org.eclipse.emf.edapt.cdo.migration.StrategyForwardConverter;
import org.eclipse.emf.edapt.internal.common.MetamodelExtent;
import org.eclipse.emf.edapt.internal.common.ResourceUtils;
import org.eclipse.emf.edapt.internal.migration.internal.Persistency;
import org.eclipse.emf.edapt.spi.migration.Metamodel;
import org.eclipse.emf.edapt.spi.migration.Model;

/**
 * Helper class for loading and saving models.
 *
 * @author herrmama
 * @author Christophe Bouhier
 * @version $Rev$
 * @levd.rating YELLOW Hash: 7340771F1DE173BDAA2534B8901681B1
 */
public class CDOPersistency extends Persistency {

	/**
	 * Save model to an explity URI.
	 *
	 * @param model
	 * @param extent
	 * @param list
	 * @throws IOException
	 */
	public static void saveModel(Model model, MetamodelExtent extent,
		List<URI> list) throws IOException {

		final StrategyBackwardConverter bConverter = new StrategyBackwardConverter(
			extent, list);
		final ResourceSet resourceSet = bConverter.convert(model);
		ResourceUtils.saveResourceSet(resourceSet, null);
	}

	public static Model loadModel(List<URI> modelURIs, Metamodel metamodel,
		ResourceSet set) throws IOException {

		// Register all our packages...otherwise proxy resolve won't work.
		for (final EPackage pack : metamodel.getEPackages()) {
			set.getPackageRegistry().put(pack.getNsURI(), pack);
		}

		ResourceUtils.loadResourceSet(modelURIs, set);
		final StrategyForwardConverter fConverter = new StrategyForwardConverter(
			metamodel.getEPackages());
		final Model model = fConverter.convert(set);
		model.setMetamodel(metamodel);
		return model;
	}

}
