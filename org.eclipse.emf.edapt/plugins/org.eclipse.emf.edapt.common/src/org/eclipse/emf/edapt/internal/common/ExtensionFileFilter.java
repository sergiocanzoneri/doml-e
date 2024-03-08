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
package org.eclipse.emf.edapt.internal.common;

import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.Set;

/**
 * This {@link FileFilter} accepts only files with a certain extension.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public class ExtensionFileFilter implements FileFilter {

	/** The set of extensions which are accepted. */
	private final Set<String> extensions;

	/** Constructor. */
	public ExtensionFileFilter(String extension) {
		this(Collections.singleton(extension));
	}

	/** Constructor. */
	public ExtensionFileFilter(Set<String> extensions) {
		this.extensions = extensions;
	}

	/** {@inheritDoc} */
	@Override
	public boolean accept(File file) {
		final String extension = FileUtils.getExtension(file);
		if (extension != null && extensions.contains(extension)) {
			return true;
		}
		return false;
	}
}
