package org.eclipse.emf.edapt.history.instantiation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.command.ChangeCommand;

/**
 * Command to update DOML version name within the new metamodel.
 *
 * @author Sergio Canzoneri
 */
public class UpdateDomlVersionNameCommand extends ChangeCommand {

	/**
	 * Root packages
	 */
	private final List<EPackage> ePackages;

	private static final String PACKAGE_CONTAINING_VERSION_NAME = "commons"; //$NON-NLS-1$
	private static final String CLASS_CONTAINING_VERSION_NAME = "DOMLModel"; //$NON-NLS-1$
	private static final String VERSION_ATTRIBUTE_NAME = "version"; //$NON-NLS-1$
	private final String newVersionName;

	/**
	 * Constructor
	 *
	 * @param ePackages
	 */
	@SuppressWarnings("unchecked")
	public UpdateDomlVersionNameCommand(List<EPackage> ePackages, String newVersionName) {
		super((Collection) ePackages);

		this.ePackages = ePackages;
		this.newVersionName = newVersionName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doExecute() {
		updateDomlVersionName();
	}

	/*
	 * Looks for the version attribute of DOMLModel class, within the commons DOML package,
	 * in order to change its default value literal to be equal to the chosen name for
	 * the new version of the language.
	 */
	private void updateDomlVersionName() {
		final EPackage domlPackage = ePackages.get(0);
		for (final EPackage ePackage : domlPackage.getESubpackages()) {
			if (ePackage.getName().equals(PACKAGE_CONTAINING_VERSION_NAME)) {
				final EClassifier eClassifier = ePackage.getEClassifier(CLASS_CONTAINING_VERSION_NAME);
				for (final EObject eObject : eClassifier.eContents()) {
					final ENamedElement eNamedElement = (ENamedElement) eObject;
					if (eNamedElement.getName().equals(VERSION_ATTRIBUTE_NAME)) {
						final EAttribute eAttribute = (EAttribute) eObject;
						eAttribute.setDefaultValueLiteral(newVersionName);
						return;
					}
				}
			}
		}
	}

}
