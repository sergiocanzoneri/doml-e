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
package org.eclipse.emf.edapt.cdo.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edapt.cdo.migration.execution.CDOMigrator;
import org.eclipse.emf.edapt.internal.common.ResourceUtils;
import org.eclipse.emf.edapt.internal.migration.execution.IClassLoader;
import org.eclipse.emf.edapt.migration.CustomMigration;
import org.eclipse.emf.edapt.migration.test.TestCaseDefinition;
import org.eclipse.emf.edapt.migration.test.TestPackage;
import org.eclipse.emf.edapt.migration.test.TestSuiteDefinition;
import org.eclipse.emf.edapt.spi.history.History;
import org.eclipse.emf.edapt.spi.history.HistoryPackage;

import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Suite to test a migration.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating YELLOW Hash: 2C4DF77775780E1EA52BAB95C2F42E0A
 */
@SuppressWarnings("restriction")
public class CDOMigrationTestSuite extends TestSuite {

	/** Definition of the test suite. */
	private final TestSuiteDefinition suiteDefinition;

	/** Migrator. */
	private CDOMigrator migrator;

	/** Classloader for loading {@link CustomMigration}s. */
	private IClassLoader loader;

	/** Constructor. */
	public CDOMigrationTestSuite(URI definitionURI, IClassLoader loader)
		throws IOException {
		this(loadTestSuiteDefinition(definitionURI));
		this.loader = loader;
	}

	/** Helper method to load a test suite definition. */
	private static TestSuiteDefinition loadTestSuiteDefinition(URI definitionURI)
		throws IOException {
		// ensure that test metamodel is initialized.
		TestPackage.eINSTANCE.getTestCaseDefinition();
		return (TestSuiteDefinition) ResourceUtils.loadElement(definitionURI);
	}

	/** Constructor. */
	public CDOMigrationTestSuite(TestSuiteDefinition suiteDefinition) {
		super(suiteDefinition.getName());

		this.suiteDefinition = suiteDefinition;

		for (final TestCaseDefinition caseDefinition : suiteDefinition.getCases()) {
			addTest(new CDOMigrationTestCase(this, caseDefinition));
		}
	}

	/** {@inheritDoc} */
	@Override
	public void run(TestResult result) {
		try {
			migrator = loadMigrator();
			super.run(result);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	/** Resolve the {@link URI} relative to the location of the definition. */
	private URI getURI(String uri) {
		final URI definitionURI = suiteDefinition.eResource().getURI();
		return URI.createFileURI(uri).resolve(definitionURI);
	}

	/** Load the history. */
	private History loadHistory() throws IOException {
		// ensure that history metamodel is initialized.
		HistoryPackage.eINSTANCE.getHistory();
		final URI historyURI = getURI(suiteDefinition.getHistory());
		final History history = ResourceUtils.loadElement(historyURI);
		return history;
	}

	/** Get the migrator. */
	CDOMigrator getMigrator() {
		return migrator;
	}

	/** Load the migrator from the history model. */
	private CDOMigrator loadMigrator() throws IOException {
		final History history = loadHistory();
		final CDOMigrator migrator = new CDOMigrator(history, loader);
		return migrator;
	}
}
