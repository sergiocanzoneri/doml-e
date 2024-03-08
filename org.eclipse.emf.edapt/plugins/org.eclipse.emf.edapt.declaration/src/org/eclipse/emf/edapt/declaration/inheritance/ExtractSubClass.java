package org.eclipse.emf.edapt.declaration.inheritance;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edapt.declaration.EdaptConstraint;
import org.eclipse.emf.edapt.declaration.EdaptOperation;
import org.eclipse.emf.edapt.declaration.EdaptParameter;
import org.eclipse.emf.edapt.declaration.OperationImplementation;
import org.eclipse.emf.edapt.internal.common.MetamodelFactory;
import org.eclipse.emf.edapt.spi.migration.Instance;
import org.eclipse.emf.edapt.spi.migration.Metamodel;
import org.eclipse.emf.edapt.spi.migration.Model;

/**
 * {@description}
 *
 * @author herrmama
 * @author $Author$
 * @version $Rev$
 * @levd.rating YELLOW Hash: FF35E810834285266B8BB66E934575D7
 */
@EdaptOperation(identifier = "extractSubClass", label = "Extract Subclass", description = "In the metamodel, a feature is extracted into a new subclass and the feature is made mandatory. In the model, all instances of the superclass that have the feature set are migrated to the new subclass.", breaking = true)
public class ExtractSubClass extends OperationImplementation {

	/** {@description} */
	@EdaptParameter(main = true, description = "The superclass from which the feature is extracted")
	public EClass superClass;

	/** {@description} */
	@EdaptParameter(description = "The feature to be extracted")
	public EStructuralFeature feature;

	/** {@description} */
	@EdaptConstraint(restricts = "feature", description = "The feature has to belong to the super class")
	public boolean checkFeature(EStructuralFeature feature) {
		return superClass.getEStructuralFeatures().contains(feature);
	}

	/** {@description} */
	@EdaptParameter(description = "The name of the new subclass")
	public String className;

	/** {@description} */
	@EdaptConstraint(restricts = "superClass", description = "The super class may not have a sub class")
	public boolean checkSuperClassNoSubTypes(EClass superClass,
		Metamodel metamodel) {
		return metamodel.getESubTypes(superClass).isEmpty();
	}

	/** {@inheritDoc} */
	@Override
	public void execute(Metamodel metamodel, Model model) {

		// metamodel adaptation
		final EPackage ePackage = superClass.getEPackage();
		final EClass subClass = MetamodelFactory.newEClass(ePackage, className,
			superClass);
		subClass.getEStructuralFeatures().add(feature);
		feature.setLowerBound(1);

		// model migration
		for (final Instance instance : model.getInstances(superClass)) {
			if (instance.isSet(feature)) {
				instance.migrate(subClass);
			}
		}
	}
}
