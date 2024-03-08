/*******************************************************************************
 * Copyright (c) 2007-2023 BMW Car IT, TUM, EclipseSource Muenchen GmbH, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * sergi - initial API and implementation
 ******************************************************************************/
package org.eclipse.emf.edapt.migration.ui.doml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Sergio Canzoneri
 * 
 * Parsing a DOML Model until the version attribute of the DOMLModel class is found.
 * This particular attribute is used to retrieve the name of the DOML version,
 * identifying the release associated with a model, in order to correctly migrate it
 * from such a release to the required one (normally the latest one).
 */
public class DomlModelParserHandler extends DefaultHandler {

	private String version;

	private static final String PACKAGE_CONTAINING_VERSION_NAME = "commons"; //$NON-NLS-1$
	private static final String CLASS_CONTAINING_VERSION_NAME = "DOMLModel"; //$NON-NLS-1$
	private static final String VERSION_ATTRIBUTE_NAME = "version"; //$NON-NLS-1$

	private static final String WANTED_QNAME = PACKAGE_CONTAINING_VERSION_NAME.concat(":") //$NON-NLS-1$
		.concat(CLASS_CONTAINING_VERSION_NAME);

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals(WANTED_QNAME)) {
			version = attributes.getValue(VERSION_ATTRIBUTE_NAME);
			throw new SAXException(new DomlSAXTerminatorException());
		}
	}

	public String getVersion() {
		return version;
	}

}
