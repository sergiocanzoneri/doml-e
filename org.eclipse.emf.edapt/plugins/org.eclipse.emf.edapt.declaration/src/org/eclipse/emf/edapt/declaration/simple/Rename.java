package org.eclipse.emf.edapt.declaration.simple;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edapt.declaration.EdaptConstraint;
import org.eclipse.emf.edapt.declaration.EdaptOperation;
import org.eclipse.emf.edapt.declaration.EdaptParameter;
import org.eclipse.emf.edapt.declaration.OperationImplementation;
import org.eclipse.emf.edapt.spi.migration.Metamodel;
import org.eclipse.emf.edapt.spi.migration.Model;

/**
 * {@description}
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating YELLOW Hash: E13181E607AED01BF2E3F4FE062F569B
 */
@EdaptOperation(identifier = "rename", label = "Rename", description = "In the metamodel, an element is renamed. In the model, nothing is changed.", breaking = true)
public class Rename extends OperationImplementation {

	/** {@description} */
	@EdaptParameter(main = true, description = "The metamodel element to be renamed")
	public ENamedElement element;

	/** {@description} */
	@EdaptParameter(description = "The new name")
	public String name;

	/** {@description} */
	@EdaptConstraint(description = "The name must not be already defined by the children of the element's parent.")
	public boolean checkUniqueName() {
		if (element.eContainer() != null) {
			for (final EObject sibling : element.eContainer().eContents()) {
				if (sibling instanceof ENamedElement) {
					if (((ENamedElement) sibling).getName().equals(name)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/** {@inheritDoc} */
	@Override
	public void initialize(Metamodel metamodel) {
		if (name == null) {
			name = element.getName();
		}
	}

	/** {@inheritDoc} */
	@Override
	public void execute(Metamodel metamodel, Model model) {
		// metamodel adaptation
		element.setName(name);
		if (element instanceof EEnumLiteral) {
			((EEnumLiteral) element).setLiteral(name);
		}
	}
}
