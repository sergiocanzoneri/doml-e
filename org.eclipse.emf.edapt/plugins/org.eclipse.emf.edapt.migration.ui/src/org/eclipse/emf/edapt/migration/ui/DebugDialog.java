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

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edapt.common.ui.ModelSash;
import org.eclipse.emf.edapt.common.ui.ResizeableDialogBase;
import org.eclipse.emf.edapt.spi.migration.Instance;
import org.eclipse.emf.edapt.spi.migration.Repository;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * A debug dialog during model migration
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class DebugDialog extends ResizeableDialogBase {

	/**
	 * Instance to be selected
	 */
	private Instance instance;

	/**
	 * Repository to be displayed
	 */
	private final Repository repository;

	/**
	 * Adapter factory
	 */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * Constructor
	 */
	public DebugDialog(Repository repository, String message) {
		super(new Point(800, 600), "Debug migration", message); //$NON-NLS-1$

		this.repository = repository;
	}

	/**
	 * Constructor
	 */
	public DebugDialog(Instance instance, String message) {
		this(instance.getType().getModel().getRepository(), message);

		this.instance = instance;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Debug"); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		parent = (Composite) super.createDialogArea(parent);

		adapterFactory = new ComposedAdapterFactory();
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		final ModelSash modelSash = new MigrationModelSash(parent, SWT.None, adapterFactory);
		modelSash.setLayoutData(new GridData(GridData.FILL_BOTH));

		final StructuredViewer modelViewer = modelSash.getStructureViewer();
		modelViewer.setInput(repository);
		if (instance != null) {
			modelViewer.setSelection(new StructuredSelection(instance), true);
		}

		modelViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
					if (selection.getFirstElement() instanceof Instance) {
						final Instance instance = (Instance) selection.getFirstElement();
						modelViewer.setSelection(new StructuredSelection(instance.getEClass()));
					}
				}
			}

		});

		return parent;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean close() {
		adapterFactory.dispose();
		return super.close();
	}
}
