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

import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;

import org.xml.sax.SAXException;

/**
 * @author Sergio Canzoneri
 *
 * This SAXException is used to terminate the parsing process of a DOML model
 * whenever the as soon as the searched value is found.
 * In this case, we want to parse the model to find the DOMLModel class,
 * within which is contained the version attribute, that we use to identify
 * the DOML release associated with a particular model.
 */
public class DomlSAXTerminatorException extends SAXException {

	private static final long serialVersionUID = -5814892215561031073L;

	public DomlSAXTerminatorException() {
		super();
	}

	public DomlSAXTerminatorException(String message) {
		super(message);
	}

	public DomlSAXTerminatorException(Exception e) {
		super(e);
	}

	public DomlSAXTerminatorException(String message, Exception e) {
		super(message, e);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	@Override
	public Exception getException() {
		return getExceptionInternal();
	}

	@Override
	public Throwable getCause() {
		return super.getCause();
	}

	@Override
	public String toString() {
		final Throwable exception = super.getCause();
		if (exception != null) {
			return super.toString() + "\n" + exception.toString();
		}
		return "Parsing was terminated due to DomlSAXTerminatorException."; //$NON-NLS-1$
	}

	private static final ObjectStreamField[] serialPersistentFields = {
		new ObjectStreamField("exception", Exception.class)
	};

	private void writeObject(ObjectOutputStream out)
		throws IOException {
		final ObjectOutputStream.PutField fields = out.putFields();
		fields.put("exception", getExceptionInternal());
		out.writeFields();
	}

	private void readObject(ObjectInputStream in)
		throws IOException, ClassNotFoundException {
		final ObjectInputStream.GetField fields = in.readFields();
		final Exception exception = (Exception) fields.get("exception", null);
		final Throwable superCause = super.getCause();

		// if super.getCause() and 'exception' fields present then always use
		// getCause() value. Otherwise, use 'exception' to initialize cause
		if (superCause == null && exception != null) {
			try {
				super.initCause(exception);
			} catch (final IllegalStateException e) {
				throw new InvalidClassException("Inconsistent state: two causes"); //$NON-NLS-1$
			}
		}
	}

	private Exception getExceptionInternal() {
		final Throwable cause = super.getCause();
		if (cause instanceof Exception) {
			return (Exception) cause;
		}
		return null;
	}
}
