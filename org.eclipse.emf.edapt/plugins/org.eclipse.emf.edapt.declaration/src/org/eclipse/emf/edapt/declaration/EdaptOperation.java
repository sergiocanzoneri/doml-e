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
package org.eclipse.emf.edapt.declaration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for a class implementing an operation.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating YELLOW Hash: AC766839BB65372CB54BCF49F78DFF53
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EdaptOperation {

	/** The label of the operation. */
	String label();

	/** The description of the operation. */
	String description();

	/**
	 * The identifier of the operation. If it is empty, the fully qualified name
	 * of the class implementing the operation is used as identifier of the
	 * operation.
	 */
	String identifier() default "";

	/**
	 * Whether this operation breaks existing models in a way that migration is inevitable.
	 *
	 * @since 1.3
	 */
	boolean breaking() default false;
}
