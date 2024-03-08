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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ChangeCommand;

/**
 * Command to add a metamodel resource to the history.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class AddResourceCommand extends ChangeCommand {

	/** The metamodel resource that is added. */
	private final Resource resource;

	/** The recorder representing the history. */
	private final EditingDomainListener listener;

	/** Constructor. */
	public AddResourceCommand(EditingDomainListener listener,
		Resource resource) {
		super(listener.getHistory());

		this.listener = listener;
		this.resource = resource;
	}

	/** {@inheritDoc} */
	@Override
	protected boolean prepare() {
		return !listener.isRecorded(resource) && super.prepare();
	}

	/** {@inheritDoc} */
	@Override
	public void doExecute() {
		listener.addHistory(resource);
	}
}
