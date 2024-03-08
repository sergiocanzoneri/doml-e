package org.eclipse.emf.edapt.declaration.inheritance;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edapt.declaration.EdaptConstraint;
import org.eclipse.emf.edapt.declaration.EdaptOperation;
import org.eclipse.emf.edapt.declaration.EdaptParameter;
import org.eclipse.emf.edapt.declaration.OperationImplementation;
import org.eclipse.emf.edapt.internal.common.MetamodelUtils;
import org.eclipse.emf.edapt.spi.migration.Instance;
import org.eclipse.emf.edapt.spi.migration.Metamodel;
import org.eclipse.emf.edapt.spi.migration.Model;

/**
 * {@description}
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating YELLOW Hash: 74170865CBAF4803DAB09DE795B54ABF
 */
@EdaptOperation(identifier = "imitateSuperType", label = "Unfold Superclass", description = "In the metamodel, a superclass is removed from a subclass, while all its features are copied into the subclass. In the model, values are changed accordingly.", breaking = false)
public class ImitateSuperType extends OperationImplementation {

	/** {@description} */
	@EdaptParameter(main = true, description = "The subclass")
	public EClass subClass;

	/** {@description} */
	@EdaptParameter(description = "The superclass")
	public EClass superClass;

	/** {@description} */
	@EdaptConstraint(restricts = "superClass", description = "The super class has to be a super type of the sub class")
	public boolean checkSuperClass(EClass superClass) {
		return subClass.getESuperTypes().contains(superClass);
	}

	/** {@description} */
	@EdaptConstraint(description = "The super class must not be target of a reference")
	public boolean checkSuperClassNoReferenceTarget(Metamodel metamodel) {
		return metamodel.getInverse(superClass,
			EcorePackage.eINSTANCE.getETypedElement_EType()).isEmpty();
	}

	/** {@inheritDoc} */
	@Override
	public void initialize(Metamodel metamodel) {
		if (superClass == null && !subClass.getESuperTypes().isEmpty()) {
			superClass = subClass.getESuperTypes().get(0);
		}
	}

	/** {@inheritDoc} */
	@Override
	public void execute(Metamodel metamodel, Model model) {
		final List<EStructuralFeature> features = superClass.getEStructuralFeatures();

		// metamodel adaptation
		subClass.getESuperTypes().remove(superClass);
		subClass.getESuperTypes().addAll(superClass.getESuperTypes());

		final List<EStructuralFeature> clones = new ArrayList<EStructuralFeature>();
		for (final EStructuralFeature feature : features) {
			final EStructuralFeature clone = MetamodelUtils.copy(feature);
			subClass.getEStructuralFeatures().add(clone);
			clones.add(clone);
		}

		// model migration
		for (final Instance instance : model.getAllInstances(subClass)) {
			for (int i = 0; i < features.size(); i++) {
				instance.set(clones.get(i), instance.unset(features.get(i)));
			}
		}
	}
}
