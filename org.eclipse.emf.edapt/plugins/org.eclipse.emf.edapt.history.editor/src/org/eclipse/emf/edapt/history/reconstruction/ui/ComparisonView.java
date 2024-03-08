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
package org.eclipse.emf.edapt.history.reconstruction.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
// import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSetSnapshot;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edapt.common.ui.ModelSash;
import org.eclipse.emf.edapt.history.reconstruction.CompositeMapping;
import org.eclipse.emf.edapt.history.reconstruction.EcoreForwardReconstructor;
import org.eclipse.emf.edapt.history.reconstruction.HistoryComparer2;
import org.eclipse.emf.edapt.spi.history.Change;
import org.eclipse.emf.edapt.spi.history.Release;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.part.ViewPart;

/**
 * View to show a comparison between two metamodel versions
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class ComparisonView extends ViewPart {

	/**
	 * Identifier of the view as in the plugin.xml
	 */
	public static final String ID = ComparisonView.class.getName();

	/**
	 * Sash for metamodel before
	 */
	private ModelSash beforeSash;

	/**
	 * Sash for difference model
	 */
	private ModelSash differenceSash;

	/**
	 * Sash for metamodel after
	 */
	private ModelSash afterSash;

	/**
	 * Difference calculator
	 */
	private HistoryComparer2 comparer;

	/**
	 * Adapter for selection of metamodel elements
	 */
	private DiffSelectionAdapter adapter;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createPartControl(Composite parent) {
		final SashForm sash = new SashForm(parent, SWT.HORIZONTAL);

		beforeSash = new ModelSash(sash, SWT.None);
		differenceSash = new ModelSash(sash, SWT.None);
		afterSash = new ModelSash(sash, SWT.None);

		beforeSash.getStructureViewer().expandToLevel(3);
		afterSash.getStructureViewer().expandToLevel(3);

		adapter = new DiffSelectionAdapter(beforeSash, afterSash);
		differenceSash.getStructureViewer().getTree()
			.addSelectionListener(adapter);

		beforeSash.getStructureViewer().getTree()
			.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					final Object data = ((TreeItem) e.item).getData();
					if (data instanceof EObject) {
						final EObject source = (EObject) data;
						final EObject target = adapter.getMapping().getTarget(
							source);
						adapter.selectTarget(target);
					}
				}
			});

		afterSash.getStructureViewer().getTree()
			.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					final Object data = ((TreeItem) e.item).getData();
					if (data instanceof EObject) {
						final EObject target = (EObject) data;
						final EObject source = adapter.getMapping().getSource(
							target);
						adapter.selectSource(source);
					}
				}
			});

		sash.setWeights(new int[] { 1, 1, 1 });
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFocus() {
		// not required
	}

	/**
	 * Set the change to be compared
	 */
	public void setChange(Change from, Change to) {

		final EcoreForwardReconstructor beforeReconstructor = new EcoreForwardReconstructor(
			URI.createURI("before")); //$NON-NLS-1$
		beforeReconstructor.reconstruct(from, true);

		final EcoreForwardReconstructor afterReconstructor = new EcoreForwardReconstructor(
			URI.createURI("after")); //$NON-NLS-1$
		afterReconstructor.reconstruct(to, false);

		comparer = new HistoryComparer2(beforeReconstructor, afterReconstructor);

		show();
	}

	/**
	 * Show the metamodel versions and their difference
	 */
	private void show() {

		beforeSash.getStructureViewer().setInput(
			comparer.getSourceReconstructor().getResourceSet());
		beforeSash.getStructureViewer().expandToLevel(3);

		afterSash.getStructureViewer().setInput(
			comparer.getTargetReconstructor().getResourceSet());
		afterSash.getStructureViewer().expandToLevel(3);

		final Comparison comparison = comparer.compare();

		final CompositeMapping mapping = new CompositeMapping(comparer
			.getSourceReconstructor().getMapping(),
			comparer
				.getTargetReconstructor().getMapping());
		adapter.setMapping(mapping);

		differenceSash.getStructureViewer().setInput(
			comparison.getDifferences());
		differenceSash.getStructureViewer().expandToLevel(3);
	}

	/**
	 * Set the release to be compared
	 */
	public void setRelease(Release from, Release to) {

		final EcoreForwardReconstructor beforeReconstructor = new EcoreForwardReconstructor(
			URI.createURI("before")); //$NON-NLS-1$
		beforeReconstructor.reconstruct(from, true);

		final EcoreForwardReconstructor afterReconstructor = new EcoreForwardReconstructor(
			URI.createURI("after")); //$NON-NLS-1$
		afterReconstructor.reconstruct(to, false);

		// CB Migrate
		comparer = new HistoryComparer2(beforeReconstructor, afterReconstructor);

		show();
	}
}
