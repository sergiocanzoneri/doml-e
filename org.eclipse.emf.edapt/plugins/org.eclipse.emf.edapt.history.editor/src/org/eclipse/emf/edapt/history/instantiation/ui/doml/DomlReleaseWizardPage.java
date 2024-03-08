package org.eclipse.emf.edapt.history.instantiation.ui.doml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edapt.history.instantiation.ui.ReleaseWizardPage;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * {@link WizardPage} to replace the DOML version name within its "commons" EPackage.
 *
 * @author Sergio Canzoneri
 *
 */
public class DomlReleaseWizardPage extends WizardPage {

	private static final String PACKAGE_CONTAINING_VERSION_NAME = "commons"; //$NON-NLS-1$
	private static final String CLASS_CONTAINING_VERSION_NAME = "DOMLModel"; //$NON-NLS-1$
	private static final String VERSION_ATTRIBUTE_NAME = "version"; //$NON-NLS-1$
	private final EPackage domlPackage;
	private final String currentVersionName;
	private Text sourceText;
	private Text targetText;

	/**
	 * Constructs a new {@link ReleaseWizardPage}.
	 *
	 * @param pageName
	 * @param description
	 * @param titleImage
	 * @param packages the packages
	 * @param changedPackages the changed packages
	 */
	protected DomlReleaseWizardPage(String pageName, String description, ImageDescriptor titleImage,
		EPackage domlPackage) {
		super(pageName, pageName, titleImage);
		setDescription(description);
		this.domlPackage = domlPackage;
		currentVersionName = getCurrentVersionName();
	}

	/*
	 * Scans the metamodel looking for the version attribute of the DOMLModel class,
	 * within the DOML commons package.
	 * It returns the default value literal of such an attribute, which is a String
	 * consisting of the DOML version name.
	 * If it was not found, the string "Undetectable" is returned.
	 * Please note that this string is shown in the dialog asking the user to choose
	 * a new version name to replace the old one.
	 */
	private String getCurrentVersionName() {
		for (final EPackage ePackage : domlPackage.getESubpackages()) {
			if (ePackage.getName().equals(PACKAGE_CONTAINING_VERSION_NAME)) {
				final EClassifier eClassifier = ePackage.getEClassifier(CLASS_CONTAINING_VERSION_NAME);
				for (final EObject eObject : eClassifier.eContents()) {
					final ENamedElement eNamedElement = (ENamedElement) eObject;
					if (eNamedElement.getName().equals(VERSION_ATTRIBUTE_NAME)) {
						final EAttribute eAttribute = (EAttribute) eObject;
						return eAttribute.getDefaultValueLiteral();
					}
				}
			}
		}
		return "Undetectable"; //$NON-NLS-1$
	}

	@Override
	public void createControl(Composite parent) {
		final Composite mainComposite = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1).applyTo(mainComposite);

		final ScrolledComposite scrolledComposite = new ScrolledComposite(mainComposite, SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setShowFocusedControl(true);
		GridLayoutFactory.fillDefaults().numColumns(1).applyTo(scrolledComposite);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(scrolledComposite);

		final Composite composite = new Composite(scrolledComposite, SWT.None);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.BEGINNING, SWT.BEGINNING).applyTo(composite);
		composite.setBackground(composite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		composite.setBackgroundMode(SWT.INHERIT_FORCE);

		GridDataFactory.fillDefaults().hint(250, SWT.DEFAULT)
			.applyTo(createLabel(composite, "Old version name", SWT.COLOR_DARK_BLUE)); //$NON-NLS-1$
		GridDataFactory.fillDefaults().hint(250, SWT.DEFAULT)
			.applyTo(createLabel(composite, "New version name", SWT.COLOR_DARK_BLUE)); //$NON-NLS-1$

		sourceText = new Text(composite, SWT.BORDER);
		sourceText.setText(currentVersionName);
		sourceText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		sourceText.setEnabled(false);
		initText(sourceText);

		targetText = new Text(composite, SWT.BORDER);
		targetText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		initText(targetText);

		setTextEnablement();

		scrolledComposite.setContent(composite);
		composite.layout();
		final Point point = composite.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		scrolledComposite.setMinSize(point);

		setControl(mainComposite);

		checkIfPageComplete();
	}

	private Label createLabel(Composite composite, String string) {
		final Label label = new Label(composite, SWT.NONE);
		label.setText(string);
		return label;
	}

	private Label createLabel(Composite composite, String string, int color) {
		final Label label = createLabel(composite, string);
		label.setForeground(label.getDisplay().getSystemColor(color));
		return label;
	}

	private void initText(Text text) {
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				checkIfPageComplete();
			}
		});
	}

	private void setTextEnablement() {
		targetText.setEnabled(true);
		// Can we pre-populate the target text?
		final String target = targetText.getText().trim();
		if (target.isEmpty()) {
			final String source = sourceText.getText();
			final int lastCharIndex = source.length() - 1;
			int lastCharInt = Character.getNumericValue(source.charAt(lastCharIndex));
			lastCharInt++;
			lastCharInt = lastCharInt % 10;
			final String newTarget = source.substring(0, lastCharIndex).concat(Integer.toString(lastCharInt));
			if (!source.equals(newTarget)) {
				targetText.setText(newTarget);
			}
		}
	}

	private void checkIfPageComplete() {

		if (targetText.getText().isEmpty()) {
			setErrorMessage("New version name may not be empty"); //$NON-NLS-1$
			setPageComplete(false);
			return;
		} else if (sourceText.getText().equals(targetText.getText())) {
			setErrorMessage("Old and new version names may not be equal"); //$NON-NLS-1$
			setPageComplete(false);
			return;
		}

		setErrorMessage(null);
		setPageComplete(true);
	}

	/**
	 * Returns source label.
	 */
	public String getSource() {
		return sourceText.getText();
	}

	/**
	 * Returns target label.
	 */
	public String getTarget() {
		return targetText.getText();
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			targetText.setFocus();
		}
	}

	/**
	 * Allows to set the target text that is visible.
	 */
	public void setTarget(String target) {
		targetText.setText(target);
		checkIfPageComplete();
	}

}
