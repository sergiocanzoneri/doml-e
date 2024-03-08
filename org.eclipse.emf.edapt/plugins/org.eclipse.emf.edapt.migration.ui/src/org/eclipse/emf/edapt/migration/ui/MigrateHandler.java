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
package org.eclipse.emf.edapt.migration.ui;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edapt.internal.common.FileUtils;
import org.eclipse.emf.edapt.internal.common.LoggingUtils;
import org.eclipse.emf.edapt.internal.common.URIUtils;
import org.eclipse.emf.edapt.internal.migration.internal.BackupUtils;
import org.eclipse.emf.edapt.migration.MigrationException;
import org.eclipse.emf.edapt.migration.execution.Migrator;
import org.eclipse.emf.edapt.spi.history.Release;
import org.eclipse.emf.edapt.spi.migration.Metamodel;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Action to migrate a model based on the registered or selected migrators.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class MigrateHandler extends MigratorHandlerBase {

	/** Perform the migration. */
	@Override
	protected void run(final List<URI> modelURIs, final Migrator migrator,
		Release release) {
		try {
			final Metamodel metamodel = migrator.getMetamodel(release);
			final List<URI> backupURIs = BackupUtils.backup(modelURIs,
				metamodel);
			final Release sourceRelease = release;

			final IRunnableWithProgress runnable = new IRunnableWithProgress() {

				/** {@inheritDoc} */
				@Override
				public void run(IProgressMonitor monitor) {
					try {
						migrator.migrateAndSave(modelURIs, sourceRelease, null,
							monitor);
					} catch (final MigrationException e) {
						LoggingUtils.logError(
							MigrationUIActivator.getDefault(), e);
						restoreBackup(metamodel, backupURIs);
						showException(e);
					}
					refreshModels();
				}

			};

			new ProgressMonitorDialog(Display.getCurrent().getActiveShell())
				.run(false, false, runnable);
		} catch (final InvocationTargetException e) {
			LoggingUtils.logError(MigrationUIActivator.getDefault(), e);
		} catch (final InterruptedException e) {
			LoggingUtils.logError(MigrationUIActivator.getDefault(), e);
		} catch (final IOException e) {
			LoggingUtils.logError(MigrationUIActivator.getDefault(), e);
		}
	}

	/** Restore the backed up models. */
	private void restoreBackup(final Metamodel metamodel,
		final List<URI> backupURIs) {
		try {
			BackupUtils.restore(backupURIs, metamodel);
			for (final URI backupURI : backupURIs) {
				FileUtils.delete(backupURI);
			}
		} catch (final IOException e1) {
			LoggingUtils.logError(MigrationUIActivator.getDefault(), e1);
		}
	}

	/** Show an exception. */
	private void showException(MigrationException e) {
		MessageDialog.openError(Display.getDefault().getActiveShell(),
			"Error during migration", e.getMessage()); //$NON-NLS-1$
		final URI location = e.getLocation();
		if (location != null) {
			showLocation(location);
		}
	}

	/** Show an exception location. */
	private void showLocation(URI location) {
		try {
			final IFile file = URIUtils.getFile(location);
			if (file != null && file.exists()) {
				final String fileString = file.getLocation().toPortableString();
				final IEditorDescriptor descriptor = PlatformUI.getWorkbench()
					.getEditorRegistry().getDefaultEditor(fileString);

				final IWorkbenchPage activePage = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
				activePage.openEditor(new FileEditorInput(file),
					descriptor.getId());
			}
		} catch (final PartInitException e) {
			LoggingUtils.logError(MigrationUIActivator.getDefault(), e);
		}
	}

	/** Refresh the models. */
	private void refreshModels() {
		try {
			for (final IFile modelFile : getSelectedFiles()) {
				modelFile.getParent()
					.refreshLocal(1, new NullProgressMonitor());
			}
		} catch (final CoreException e) {
			LoggingUtils.logError(MigrationUIActivator.getDefault(), e);
		}
	}
}
