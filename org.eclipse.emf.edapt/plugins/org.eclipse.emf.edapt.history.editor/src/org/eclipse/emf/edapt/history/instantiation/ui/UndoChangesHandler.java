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
package org.eclipse.emf.edapt.history.instantiation.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.edapt.history.instantiation.UndoChangesCommand;
import org.eclipse.emf.edapt.history.presentation.action.SubsequentChangesHandler;
import org.eclipse.emf.edapt.history.recorder.EditingDomainListener;
import org.eclipse.emf.edapt.history.recorder.ui.EcoreEditorDetector;
import org.eclipse.emf.edapt.history.util.DependencyChecker;
import org.eclipse.emf.edapt.spi.history.Change;
import org.eclipse.emf.edapt.spi.history.Release;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Action to undo a sequence of changes
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class UndoChangesHandler extends SubsequentChangesHandler<Change> {

	/** {@inheritDoc} */
	@Override
	protected Object execute(Release release, List<Change> changes,
		EditingDomain domain, ExecutionEvent event) {
		final EcoreEditor editor = (EcoreEditor) HandlerUtil.getActiveEditor(event);
		if (DependencyChecker.depends(getSubsequentChanges(changes), changes)) {
			MessageDialog
				.openInformation(
					Display.getDefault().getActiveShell(),
					"Dependency", //$NON-NLS-1$
					"These changes cannot be undone. There are subsequent changes which depend on these changes."); //$NON-NLS-1$
		} else {
			final EcoreEditorDetector detector = EcoreEditorDetector.getInstance();
			final EditingDomainListener listener = detector.getListener(editor);
			final UndoChangesCommand command = new UndoChangesCommand(changes,
				listener.getExtent());
			domain.getCommandStack().execute(command);
		}
		return null;
	}

	/**
	 * Get the changes which were performed subsequently after the changes to be
	 * undone
	 */
	private List<Change> getSubsequentChanges(List<Change> changes) {
		final Change lastChange = changes.get(changes.size() - 1);
		final List<Change> subsequentChanges = new ArrayList<Change>();

		final Release release = lastChange.getRelease();
		final List<Change> releaseChanges = release.getChanges();
		for (int i = releaseChanges.indexOf(lastChange) + 1; i < releaseChanges
			.size(); i++) {
			subsequentChanges.add(releaseChanges.get(i));
		}

		final List<Release> releases = release.getHistory().getReleases();
		for (int i = release.getNumber() + 1; i < releases.size(); i++) {
			subsequentChanges.addAll(releases.get(i).getChanges());
		}

		return subsequentChanges;
	}
}
