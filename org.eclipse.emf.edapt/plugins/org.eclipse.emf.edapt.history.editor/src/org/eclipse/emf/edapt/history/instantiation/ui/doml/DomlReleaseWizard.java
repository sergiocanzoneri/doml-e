package org.eclipse.emf.edapt.history.instantiation.ui.doml;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.wizard.Wizard;

/**
 * {@link Wizard} to update the version name of the DOML metamodel.
 *
 * @author Sergio Canzoneri
 *
 */
public class DomlReleaseWizard extends Wizard {

	private String source;
	private String target;

	private final List<EPackage> rootPackages;

	private DomlReleaseWizardPage domlReleaseWizardPage;

	public DomlReleaseWizard(List<EPackage> rootPackages) {
		if (rootPackages == null || rootPackages.isEmpty()) {
			throw new IllegalArgumentException("There must be at least one root package."); //$NON-NLS-1$
		}
		this.rootPackages = rootPackages;
	}

	@Override
	public String getWindowTitle() {
		return "Create Release"; //$NON-NLS-1$
	}

	@Override
	public void addPages() {
		domlReleaseWizardPage = new DomlReleaseWizardPage("Update version name of the DOMLModel class", //$NON-NLS-1$
			"Enter the desired new version name or deselect the update button", //$NON-NLS-1$
			null,
			rootPackages.get(0));
		addPage(domlReleaseWizardPage);
	}

	/**
	 * Returns the source label to replace (old DOML version name).
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Returns the target label (new DOML version name) which replaces the source label.
	 */
	public String getTarget() {
		return target;
	}

	@Override
	public boolean performFinish() {
		source = domlReleaseWizardPage.getSource();
		target = domlReleaseWizardPage.getTarget();
		domlReleaseWizardPage = null;
		return true;
	}

}
