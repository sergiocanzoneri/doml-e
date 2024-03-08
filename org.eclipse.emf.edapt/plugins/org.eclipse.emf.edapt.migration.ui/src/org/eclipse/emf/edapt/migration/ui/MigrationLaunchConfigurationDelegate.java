package org.eclipse.emf.edapt.migration.ui;

import static org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLineOption.BACKUP;
import static org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLineOption.HISTORY;
import static org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLineOption.MODELS;
import static org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLineOption.SOURCE_RELEASE;
import static org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLineOption.TARGET_RELEASE;
import static org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLineOption.VALIDATION_LEVEL;
import static org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLineOption.VM_ARGUMENTS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.ILaunchesListener2;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edapt.common.ui.DialogUtils;
import org.eclipse.emf.edapt.declaration.Library;
import org.eclipse.emf.edapt.declaration.LibraryImplementation;
import org.eclipse.emf.edapt.declaration.Operation;
import org.eclipse.emf.edapt.declaration.OperationImplementation;
import org.eclipse.emf.edapt.internal.common.FileUtils;
import org.eclipse.emf.edapt.internal.common.LoggingUtils;
import org.eclipse.emf.edapt.internal.common.ResourceUtils;
import org.eclipse.emf.edapt.internal.common.URIUtils;
import org.eclipse.emf.edapt.internal.declaration.OperationRegistry;
import org.eclipse.emf.edapt.internal.migration.execution.ValidationLevel;
import org.eclipse.emf.edapt.internal.migration.execution.internal.MigratorCommandLine;
import org.eclipse.emf.edapt.migration.execution.Migrator;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

/**
 * Delegate for launching migrations.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating YELLOW Hash: 63F32051C0277326DE8204F8B83D36DD
 */
public class MigrationLaunchConfigurationDelegate extends JavaLaunchDelegate {

	/** {@inheritDoc} */
	@Override
	public boolean preLaunchCheck(ILaunchConfiguration configuration,
		String mode, IProgressMonitor monitor) throws CoreException {

		final String historyFilename = configuration.getAttribute(HISTORY.id(),
			(String) null);
		if (historyFilename == null) {
			DialogUtils.openErrorDialogAsync("Error", //$NON-NLS-1$
				"Could not determine history."); //$NON-NLS-1$
			return false;
		}

		final IFile historyFile = FileUtils.getFile(historyFilename);
		if (!historyFile.exists()) {
			DialogUtils.openErrorDialogAsync("Error", "History " //$NON-NLS-1$ //$NON-NLS-2$
				+ historyFilename + " does not exist."); //$NON-NLS-1$
			return false;
		}

		final URI uri = URIUtils.getURI(historyFile);
		try {
			ResourceUtils.loadElement(uri);
		} catch (final IOException e) {
			DialogUtils.openErrorDialogAsync("Error", "Could not load history " //$NON-NLS-1$ //$NON-NLS-2$
				+ historyFilename + ": " + e.getMessage()); //$NON-NLS-1$
			return false;
		}

		final List<IFile> modelFiles = getModelFiles(configuration);
		for (final IFile modelFile : modelFiles) {
			if (!modelFile.exists()) {
				DialogUtils.openErrorDialogAsync("Error", "Model " //$NON-NLS-1$ //$NON-NLS-2$
					+ modelFile.getLocation().toString()
					+ " does not exist."); //$NON-NLS-1$
				return false;
			}
		}

		return super.preLaunchCheck(configuration, mode, monitor);
	}

	/** Get the model files from the launch configuration. */
	private List<IFile> getModelFiles(ILaunchConfiguration configuration)
		throws CoreException {
		final List<IFile> files = new ArrayList<IFile>();
		final List<String> modelURIs = configuration.getAttribute(MODELS.id(),
			Collections.<String> emptyList());
		for (final String modelURI : modelURIs) {
			final IFile file = FileUtils.getFile(modelURI);
			files.add(file);
		}
		return files;
	}

	/** {@inheritDoc} */
	@Override
	public void launch(final ILaunchConfiguration configuration, String mode,
		final ILaunch launch, final IProgressMonitor monitor)
		throws CoreException {
		final ILaunchManager launchManager = DebugPlugin.getDefault()
			.getLaunchManager();
		launchManager.addLaunchListener(new LaunchTerminationListener(
			configuration, launch, monitor));
		super.launch(configuration, mode, launch, monitor);
	}

	/** {@inheritDoc} */
	@Override
	public String getMainTypeName(ILaunchConfiguration configuration) {
		return Migrator.class.getName();
	}

	/** {@inheritDoc} */
	@Override
	public String getProgramArguments(ILaunchConfiguration configuration)
		throws CoreException {

		final List<URI> modelURIs = getModelURIs(configuration);
		final URI historyURI = getHistoryURI(configuration);
		final int sourceReleaseNumber = getSourceReleaseNumber(configuration);
		final int targetReleaseNumber = getTargetReleaseNumber(configuration);
		final ValidationLevel level = getValidationLevel(configuration);
		final boolean backup = isBackup(configuration);
		final List<Class<? extends LibraryImplementation>> libraries = getLibraries();
		final List<Class<? extends OperationImplementation>> operations = getOperations();

		final MigratorCommandLine commandLine = new MigratorCommandLine(historyURI,
			modelURIs, sourceReleaseNumber, targetReleaseNumber, level,
			backup, libraries, operations);
		String argument = commandLine.getCommandLine();

		// VM arguments
		final String vmArguments = configuration.getAttribute(VM_ARGUMENTS.id(), ""); //$NON-NLS-1$
		argument += " " + vmArguments; //$NON-NLS-1$

		return argument;
	}

	/** Gets the list of model URIs from the launch configuration. */
	private List<URI> getModelURIs(ILaunchConfiguration configuration)
		throws CoreException {
		final List<URI> modelURIs = new ArrayList<URI>();
		final List<IFile> modelFiles = getModelFiles(configuration);
		for (final IFile modelFile : modelFiles) {
			modelURIs.add(URIUtils.getURI(modelFile.getLocation().toString()));
		}
		return modelURIs;
	}

	/** Gets the URI of the history model from the launch configuration. */
	private URI getHistoryURI(ILaunchConfiguration configuration)
		throws CoreException {
		final String historyFilename = configuration.getAttribute(HISTORY.id(), ""); //$NON-NLS-1$
		final IFile file = FileUtils.getFile(historyFilename);
		final URI historyURI = URIUtils.getURI(file.getLocation().toString());
		return historyURI;
	}

	/** Gets the source release number from the launch configuration. */
	private int getSourceReleaseNumber(ILaunchConfiguration configuration)
		throws CoreException {
		return configuration.getAttribute(SOURCE_RELEASE.id(), -1);
	}

	/** Gets the target release number from the launch configuration. */
	private int getTargetReleaseNumber(ILaunchConfiguration configuration)
		throws CoreException {
		return configuration.getAttribute(TARGET_RELEASE.id(), -1);
	}

	/** Gets the validation level from the launch configuration. */
	private ValidationLevel getValidationLevel(
		ILaunchConfiguration configuration) throws CoreException {
		return ValidationLevel.valueOf(configuration.getAttribute(
			VALIDATION_LEVEL.id(),
			ValidationLevel.CUSTOM_MIGRATION.toString()));
	}

	/** Gets the desire for backup from the launch configuration. */
	private boolean isBackup(ILaunchConfiguration configuration)
		throws CoreException {
		return configuration.getAttribute(BACKUP.id(), false);
	}

	/** Gets the currently registered library implementations. */
	@SuppressWarnings("unchecked")
	private List<Class<? extends LibraryImplementation>> getLibraries() {
		final OperationRegistry registry = OperationRegistry.getInstance();
		final List<Class<? extends LibraryImplementation>> libraries = new ArrayList<Class<? extends LibraryImplementation>>();
		for (final Library library : registry.getRootLibraries()) {
			libraries.add(library.getImplementation());
		}
		return libraries;
	}

	/** Gets the currently registered operation implementations. */
	@SuppressWarnings("unchecked")
	private List<Class<? extends OperationImplementation>> getOperations() {
		final OperationRegistry registry = OperationRegistry.getInstance();
		final List<Class<? extends OperationImplementation>> operations = new ArrayList<Class<? extends OperationImplementation>>();
		for (final Operation operation : registry.getRootOperations()) {
			operations.add(operation.getImplementation());
		}
		return operations;
	}

	/**
	 * A listener that waits until a certain launch is terminated and refreshes
	 * the migrated models afterwards.
	 */
	private class LaunchTerminationListener implements ILaunchesListener2 {

		/** The launch configuration that is executed. */
		private final ILaunchConfiguration configuration;

		/** The launch. */
		private final ILaunch launch;

		/** The monitor to show progress. */
		private final IProgressMonitor monitor;

		/** Constructor. */
		public LaunchTerminationListener(ILaunchConfiguration configuration,
			ILaunch launch, IProgressMonitor monitor) {
			this.configuration = configuration;
			this.launch = launch;
			this.monitor = monitor;
		}

		/** {@inheritDoc} */
		@Override
		public void launchesRemoved(ILaunch[] launches) {
			refreshModelsWhenTerminated();
		}

		/** {@inheritDoc} */
		@Override
		public void launchesChanged(ILaunch[] launches) {
			refreshModelsWhenTerminated();
		}

		/** {@inheritDoc} */
		@Override
		public void launchesAdded(ILaunch[] launches) {
			refreshModelsWhenTerminated();
		}

		/** Refresh the models when the launch is terminated. */
		private void refreshModelsWhenTerminated() {
			if (launch.isTerminated()) {
				refreshModels();
			}
		}

		/** {@inheritDoc} */
		@Override
		public void launchesTerminated(ILaunch[] launches) {
			for (final ILaunch l : launches) {
				if (l == launch) {
					refreshModels();
				}
			}
		}

		/** Refresh the migrated models when the migration is terminated. */
		private void refreshModels() {
			DebugPlugin.getDefault().getLaunchManager()
				.removeLaunchListener(this);
			final IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				@Override
				public void run(IProgressMonitor monitor) throws CoreException {
					try {
						while (!launch.isTerminated()) {
							Thread.sleep(100);
						}
					} catch (final InterruptedException e) {
						LoggingUtils.logError(
							MigrationUIActivator.getDefault(), e);
					}
					final List<IFile> modelFiles = getModelFiles(configuration);
					for (final IFile modelFile : modelFiles) {
						modelFile.getParent().refreshLocal(
							IResource.DEPTH_INFINITE, monitor);
					}
				}
			};
			try {
				ResourcesPlugin.getWorkspace().run(operation, monitor);
			} catch (final CoreException e) {
				LoggingUtils.logError(MigrationUIActivator.getDefault(), e);
			}
		}
	}
}
