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
 *
 * Extended by Sergio Canzoneri to handle DOML (PIACERE Project).
 *
 *******************************************************************************/
package org.eclipse.emf.edapt.migration.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edapt.common.ui.SelectionUtils;
import org.eclipse.emf.edapt.internal.common.URIUtils;
import org.eclipse.emf.edapt.internal.migration.internal.MigratorOptions;
import org.eclipse.emf.edapt.internal.migration.internal.Persistency;
import org.eclipse.emf.edapt.migration.ReleaseUtils;
import org.eclipse.emf.edapt.migration.execution.Migrator;
import org.eclipse.emf.edapt.migration.execution.MigratorRegistry;
import org.eclipse.emf.edapt.migration.ui.doml.DomlModelParserHandler;
import org.eclipse.emf.edapt.migration.ui.doml.DomlSAXTerminatorException;
import org.eclipse.emf.edapt.spi.history.Release;
import org.eclipse.emf.edapt.spi.migration.Metamodel;
import org.eclipse.emf.edapt.spi.migration.Model;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;
import org.xml.sax.SAXException;

/**
 * Base class to deal with migrators.
 *
 * @author herrmama
 * @author $Author$
 * @author Extended by Sergio Canzoneri to handle DOML (PIACERE Project).
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public abstract class MigratorHandlerBase extends AbstractHandler {

	private static final String DOML_COMMONS_NSURI = "http://www.piacere-project.eu/doml/commons"; //$NON-NLS-1$

	/** File with model. */
	private List<IFile> selectedFiles;

	private Map<URI, String> domlVersions;

	/** {@inheritDoc} */
	@Override
	public Object execute(ExecutionEvent event) {
		updateSelection(HandlerUtil.getCurrentSelection(event));
		run();
		return null;
	}

	/** Run the action. */
	protected void run() {
		final List<URI> modelURIs = getURIs();

		// Getting the namespace URI from models to detect DOML.
		final String nsURI = ReleaseUtils.getNamespaceURI(modelURIs.get(0));

		/*
		 * Initializing the domlVersion map, containing the association
		 * between model file URIs and the corresponding DOML version.
		 * Please notice that it is currently not so useful to store this as a map,
		 * since the Edapt migration works only if all the selected models are
		 * instances of the same release of the metamodel.
		 * Anyway, we have chosen to keep this as a map for future development,
		 * therefore not ignoring the possibility that the selected models are
		 * instances of different releases of the same metamodel.
		 */
		if (nsURI.equals(DOML_COMMONS_NSURI)) {
			domlVersions = getDomlVersions();
		}

		/*
		 * NOTE: This is not working if selecting models belonging to different releases
		 * (in general, not only for DOML specific case).
		 */

		final Migrator migrator = getMigrator(modelURIs);
		if (migrator == null) {
			return;
		}

		final Release release = getRelease(modelURIs, migrator);
		if (release == null) {
			return;
		}

		run(modelURIs, migrator, release);

	}

	/** Run the action. */
	protected abstract void run(List<URI> modelURIs, Migrator migrator,
		Release release);

	/** Get the migrator for a model. */
	protected Migrator getMigrator(final List<URI> modelURIs) {

		if (modelURIs.isEmpty()) {
			MessageDialog.openError(Display.getDefault().getActiveShell(),
				"Namespace", "Not a valid model"); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}

		MigratorOptions.getInstance().setOracle(new InteractiveOracle());
		MigratorOptions.getInstance().setDebugger(new InteractiveDebugger());

		final String nsURI = ReleaseUtils.getNamespaceURI(modelURIs.get(0));

		if (nsURI == null) {
			MessageDialog.openError(Display.getDefault().getActiveShell(),
				"Namespace", "Not a valid model"); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}
		final Migrator migrator = getRegistryMigrator(nsURI);
		return migrator;
	}

	/** Search for a migrator in the registry. */
	private Migrator getRegistryMigrator(String nsURI) {
		final Migrator migrator = MigratorRegistry.getInstance().getMigrator(
			nsURI);

		if (migrator == null) {
			MessageDialog.openError(Display.getDefault().getActiveShell(),
				"Migrator", //$NON-NLS-1$
				"No migrator registered for model with that namespace"); //$NON-NLS-1$
			return null;
		}
		return migrator;
	}

	/** Infer the release of a model. */
	protected Release getRelease(final List<URI> modelURIs,
		final Migrator migrator) {
		Set<Release> releases;

		// This line has the same meaning as the one in the else clause below, but it handles DOML.
		if (ReleaseUtils.getNamespaceURI(modelURIs.get(0)).equals(DOML_COMMONS_NSURI)) {
			releases = new HashSet<Release>(migrator.getDomlRelease(domlVersions.get(modelURIs.get(0))));
		} else {
			/*
			 * This line, not modified when extending the class to handle DOML,
			 * is basically the reason why the migrator only works if the models
			 * are all instances of the same release of the metamodel: in fact,
			 * here only the first of the model URIs is taken into account.
			 */
			releases = new HashSet<Release>(
				migrator.getRelease(modelURIs.get(0)));
		}
		Release release = null;
		if (releases.size() > 1) {
			for (final Iterator<Release> i = releases.iterator(); i.hasNext();) {
				final Release r = i.next();
				final Metamodel metamodel = migrator.getMetamodel(r);
				/*
				 * NOTE: If more than a release is suitable for the model,
				 * then check the model conformance to exclude some releases.
				 */
				try {
					final Model model = Persistency.loadModel(modelURIs, metamodel,
						migrator.getResourceSetFactory(), migrator.getPostLoadModelProcessor());
					model.checkConformance();
				} catch (final Exception e) {
					i.remove();
				}
			}
		}

		// Then, if there are still more suitable releases, ask the user to choose among them.
		if (releases.size() > 1) {
			final ReleaseDialog dialog = new ReleaseDialog(releases);
			if (dialog.open() != IDialogConstants.OK_ID) {
				return null;
			}
			release = dialog.getRelease();
		} else {
			release = releases.iterator().next();
		}
		return release;
	}

	/** Returns the URIs based on files. */
	protected List<URI> getURIs() {
		final List<URI> uris = new ArrayList<URI>();
		for (final IFile file : selectedFiles) {
			uris.add(URIUtils.getURI(file));
		}
		return uris;
	}

	/*
	 * Creates a map associating a file (model) URI to its corresponding DOML version.
	 * Please note that a particular use of exception is made here, since the
	 * DomlSAXTerminatorException is specifically use to terminate the parsing process
	 * of models as soon as the version of the language is detected within the model itself.
	 */
	private Map<URI, String> getDomlVersions() {
		final Map<URI, String> versions = new HashMap<URI, String>();
		for (final IFile file : selectedFiles) {
			final DomlModelParserHandler handler = new DomlModelParserHandler();
			try {
				final SAXParserFactory factory = SAXParserFactory.newInstance();
				final SAXParser saxParser = factory.newSAXParser();
				saxParser.parse(file.getContents(), handler);

			}
			/*
			 * If the detected exception is instance of DomlSAXTerminatorException,
			 * then the parser has terminated its job and, in case of well-formed models,
			 * it has retrieved the DOML version associated with the specific model,
			 * here identified by the file URI.
			 * In any other case, the exception stack trace is printed.
			 */
			catch (ParserConfigurationException | SAXException | IOException | CoreException e) {
				//
				if (e.getCause() instanceof DomlSAXTerminatorException) {
					versions.put(URIUtils.getURI(file), handler.getVersion());
				} else {
					e.printStackTrace();
				}
			}

		}
		return versions;
	}

	/** Update the selection. */
	private void updateSelection(ISelection selection) {
		selectedFiles = SelectionUtils.getSelectedElements(selection, IFile.class);
	}

	/** Get the selected files. */
	protected List<IFile> getSelectedFiles() {
		return selectedFiles;
	}
}
