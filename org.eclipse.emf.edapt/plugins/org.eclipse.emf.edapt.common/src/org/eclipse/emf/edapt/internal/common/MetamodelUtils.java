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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * Helper methods for metamodel access.
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating RED Rev:
 */
public final class MetamodelUtils {

	/** Name for generic types. */
	final static String GENERIC = "Generic"; //$NON-NLS-1$

	/** Constructor. */
	private MetamodelUtils() {
		// hidden, since this class only provides static helper methods
	}

	/** Check whether a reference is of generic type. */
	public static boolean isGenericReference(EReference reference) {
		return reference.getEReferenceType() == EcorePackage.eINSTANCE
			.getEGenericType();
	}

	/** Get the corresponding reference which is not generic. */
	public static EReference getNonGenericReference(EReference genericReference) {
		final EClass c = genericReference.getEContainingClass();
		final String referenceName = genericReference.getName().replace(GENERIC, ""); //$NON-NLS-1$
		final EReference nonGenericReference = (EReference) c
			.getEStructuralFeature(referenceName);
		return nonGenericReference;

	}

	/** Get the corresponding reference which is generic. */
	public static EReference getGenericReference(EReference reference) {
		String name = reference.getName();
		name = name.charAt(0) + GENERIC + name.substring(1);
		return (EReference) reference.getEContainingClass()
			.getEStructuralFeature(name);
	}

	/**
	 * Copy a metamodel element. Do not copy opposites in case this might lead
	 * to an inconsistency.
	 */
	@SuppressWarnings("unchecked")
	public static <V extends EModelElement> V copy(V modelElement) {
		@SuppressWarnings("serial")
		final Copier copier = new Copier() {
			@Override
			protected void copyReference(EReference eReference,
				EObject eObject, EObject copyEObject) {
				if (eReference == EcorePackage.eINSTANCE
					.getEReference_EOpposite()) {
					if (eObject.eIsSet(eReference)) {
						final Object value = eObject.eGet(eReference);
						if (get(value) == null) {
							return;
						}
					}
				}
				super.copyReference(eReference, eObject, copyEObject);
			}
		};
		final V result = (V) copier.copy(modelElement);
		copier.copyReferences();
		return result;
	}

	/** Get all root packages in a resource set. */
	public static Collection<EPackage> getAllRootPackages(
		ResourceSet resourceSet) {
		final List<EPackage> result = new ArrayList<EPackage>();

		for (final Resource resource : resourceSet.getResources()) {
			if (!MetamodelUtils.isMetamodelResource(resource)) {
				continue;
			}

			for (final EObject o : resource.getContents()) {
				if (o instanceof EPackage) {
					final EPackage p = (EPackage) o;
					result.add(p);
				}
			}
		}
		return result;
	}

	/** Check whether the resource contains a metamodel. */
	public static boolean isMetamodelResource(Resource resource) {
		final URI uri = resource.getURI();
		return MetamodelUtils.isMetamodelURI(uri);
	}

	/** Check whether the URI denotes a resource containing a metamodel. */
	public static boolean isMetamodelURI(URI uri) {
		return ResourceUtils.ECORE_FILE_EXTENSION.equals(uri.fileExtension());
	}

	/** Get any root package in a resource set. */
	@SuppressWarnings("cast")
	public static EPackage getRootPackage(ResourceSet resourceSet) {
		final Resource resource = (Resource) resourceSet.getResources().get(0);
		return (EPackage) resource.getContents().get(0);
	}

	/**
	 * Check whether a class is concrete, i.e. neither abstract nor an
	 * interface.
	 */
	public static boolean isConcrete(EClass eClass) {
		return !(eClass.isAbstract() || eClass.isInterface());
	}

	/**
	 * Subtract the types that are provided by a class from the types that are
	 * provided by another class.
	 */
	public static List<EClass> subtractTypes(EClass minuend, EClass subtrahend) {

		final List<EClass> superTypes = new ArrayList<EClass>();

		superTypes.addAll(minuend.getEAllSuperTypes());
		superTypes.add(0, minuend);

		superTypes.removeAll(subtrahend.getEAllSuperTypes());
		superTypes.remove(subtrahend);

		return superTypes;
	}

	/**
	 * Subtract the features that are provided by a class from the types that
	 * are provided by another class.
	 */
	public static List<EStructuralFeature> subtractFeatures(EClass minuend,
		EClass subtrahend) {

		final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
		final List<EClass> superTypes = subtractTypes(minuend, subtrahend);

		for (final EClass superType : superTypes) {
			features.addAll(superType.getEStructuralFeatures());
		}

		return features;
	}

	/**
	 * Create a copy of a set of packages that is independent of generated
	 * packages.
	 */
	public static ResourceSet createIndependentMetamodelCopy(
		Collection<EPackage> rootPackages, URI metamodelURI) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		// Use custom resource factory to have UUIDs
		final Map<String, Object> map = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		map.put(ResourceUtils.ECORE_FILE_EXTENSION, new MetamodelEcoreResourceFactoryImpl());

		final Resource resource = resourceSet.createResource(metamodelURI);

		@SuppressWarnings("serial")
		final Copier copier = new Copier() {
			@Override
			protected void copyReference(EReference reference, EObject object,
				EObject copyEObject) {
				if (MetamodelUtils.getGenericReference(reference) != null) {
					object.eGet(reference);
				}
				super.copyReference(reference, object, copyEObject);
			}

			@Override
			public EObject get(Object key) {
				final EObject value = super.get(key);
				if (value == null && key instanceof EObject) {
					final EObject element = (EObject) key;
					if (element.eResource() != null) {
						final URI uri = EcoreUtil.getURI(element);
						final EObject loaded = resourceSet.getEObject(uri, true);
						return loaded;
					}
				}
				return value;
			}
		};
		final Collection<EPackage> copy = copier.copyAll(rootPackages);
		resource.getContents().addAll(copy);
		copier.copyReferences();
		return resourceSet;
	}

	/**
	 * Resource factory that creates resources with UUIDs.
	 * UUIDs allow stable references to meta model elements even if the elements are renamed during the migration.
	 */
	static class MetamodelEcoreResourceFactoryImpl extends ResourceFactoryImpl {

		@Override
		public Resource createResource(URI uri) {
			final XMLResource result = new XMIResourceImpl(uri) {
				@Override
				protected boolean useUUIDs() {
					return true;
				}
			};
			result.setEncoding("UTF-8"); //$NON-NLS-1$

			return result;
		}
	}

}
