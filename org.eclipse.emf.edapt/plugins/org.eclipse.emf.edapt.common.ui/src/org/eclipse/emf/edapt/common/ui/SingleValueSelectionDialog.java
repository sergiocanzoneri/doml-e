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
package org.eclipse.emf.edapt.common.ui;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionStatusDialog;

/**
 * Dialog to select a single value.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating YELLOW Hash: B5190DE11ADF34F7F6D183B7F9E33109
 */
public class SingleValueSelectionDialog extends SelectionStatusDialog {

	/**
	 * The label provider
	 */
	protected final AdapterFactoryLabelProvider labelProvider;

	/**
	 * Root elements of area in which values can be found
	 */
	private final Collection valueArea;

	/**
	 * Current value that is selected
	 */
	private final Object value;

	/**
	 * Composite for value selection
	 */
	private ValueSelectionComposite composite;

	/**
	 * Validator to determine possible values.
	 */
	private final IValueValidator validator;

	/**
	 * Constructor
	 */
	public SingleValueSelectionDialog(Shell parent, Image image, String title,
		Object value, Collection valueArea,
		AdapterFactoryLabelProvider labelProvider, IValueValidator validator) {
		super(parent);

		setImage(image);
		setTitle(title);

		this.value = value;
		this.valueArea = valueArea;
		this.labelProvider = labelProvider;
		this.validator = validator;
	}

	/** {@inheritDoc} */
	@Override
	protected void initializeBounds() {
		super.initializeBounds();
		getShell().setSize(400, 500);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite contents = (Composite) super.createDialogArea(parent);

		composite = new ValueSelectionComposite(contents, labelProvider, value,
			false, valueArea, validator);

		composite.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				validateSelection();
			}

		});

		composite.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (composite.validSelection()) {
					okPressed();
				}
			}

		});

		return contents;
	}

	/**
	 * Validate the selection
	 */
	private void validateSelection() {
		if (composite.validSelection()) {
			getOkButton().setEnabled(true);
		} else {
			getOkButton().setEnabled(false);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create() {
		super.create();

		validateSelection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void computeResult() {
		final List selectedElements = composite.getSelectedElements();
		setResult(selectedElements);
	}
}
