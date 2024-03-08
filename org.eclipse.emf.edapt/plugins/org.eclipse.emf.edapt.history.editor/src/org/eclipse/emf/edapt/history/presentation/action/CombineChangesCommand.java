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
package org.eclipse.emf.edapt.history.presentation.action;

import java.util.List;

import org.eclipse.emf.edapt.spi.history.CompositeChange;
import org.eclipse.emf.edapt.spi.history.HistoryFactory;
import org.eclipse.emf.edapt.spi.history.PrimitiveChange;
import org.eclipse.emf.edapt.spi.history.Release;
import org.eclipse.emf.edit.command.ChangeCommand;

/**
 * Command to combine a sequence of primitive changes into a composite change
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class CombineChangesCommand extends ChangeCommand {

	/**
	 * Release
	 */
	private final Release release;

	/**
	 * Sequence of primitive changes
	 */
	private final List<PrimitiveChange> changes;

	/**
	 * Constructor
	 */
	public CombineChangesCommand(Release release, List<PrimitiveChange> changes) {
		super(release);
		this.release = release;
		this.changes = changes;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doExecute() {
		final CompositeChange compositeChange = HistoryFactory.eINSTANCE.createCompositeChange();
		release.getChanges().add(release.getChanges().indexOf(changes.get(0)), compositeChange);
		compositeChange.getChanges().addAll(changes);
	}

}
