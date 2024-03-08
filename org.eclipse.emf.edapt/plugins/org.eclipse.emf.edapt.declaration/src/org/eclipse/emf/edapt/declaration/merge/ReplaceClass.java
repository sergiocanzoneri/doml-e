package org.eclipse.emf.edapt.declaration.merge;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
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
 * @levd.rating YELLOW Hash: 688AD53AE7A43304C0A691E7DB8D79B3
 */
@EdaptOperation(identifier = "replaceClass", label = "Replace Class", description = "In the metamodel, a class is deleted. In the model, instances of this class are migrated to another class based on a mapping of features.", breaking = true)
public class ReplaceClass extends OperationImplementation {

	/** {@description} */
	@EdaptParameter(main = true, description = "The class to be replaced")
	public EClass toReplace;

	/** {@description} */
	@EdaptParameter(description = "The class by which it is replaced")
	public EClass replaceBy;

	/** {@description} */
	@EdaptParameter(optional = true, description = "The features to be replaced")
	public List<EStructuralFeature> featuresToReplace;

	/** {@description} */
	@EdaptConstraint(restricts = "featuresToReplace", description = "The replace features must be defined in the replaced class")
	public boolean checkFeaturesToReplace(EStructuralFeature featuresToReplace) {
		return toReplace.getEAllStructuralFeatures()
			.contains(featuresToReplace);
	}

	/** {@description} */
	@EdaptParameter(optional = true, description = "The features by which they are replaced (in the same order)")
	public List<EStructuralFeature> featuresReplaceBy;

	/** {@description} */
	@EdaptConstraint(restricts = "featuresReplaceBy", description = "The replacing features must be defined in the replacing class")
	public boolean checkFeaturesReplaceBy(EStructuralFeature featuresReplaceBy) {
		return replaceBy.getEAllStructuralFeatures()
			.contains(featuresReplaceBy);
	}

	/** {@description} */
	@EdaptConstraint(description = "The replace features must cover all "
		+ "features from the difference between the class to "
		+ "replace and the class by which it is replaced")
	public boolean checkCoverFeatureDifference() {
		return replaceBy == null
			|| featuresToReplace.containsAll(MetamodelUtils
				.subtractFeatures(toReplace, replaceBy));
	}

	/** {@description} */
	@EdaptConstraint(description = "The replaced and replacing features have to be of the same size")
	public boolean checkFeaturesSameSize() {
		return featuresToReplace.size() == featuresReplaceBy.size();
	}

	/** {@description} */
	@EdaptConstraint(description = "The class to be replaced must not have sub types")
	public boolean checkToReplaceNoSubTypes(Metamodel metamodel) {
		return metamodel.getESubTypes(toReplace).isEmpty();
	}

	/** {@inheritDoc} */
	@Override
	public void execute(Metamodel metamodel, Model model) {
		// metamodel adaptation
		for (final EReference reference : metamodel.<EReference> getInverse(
			toReplace, EcorePackage.Literals.ETYPED_ELEMENT__ETYPE)) {
			reference.setEType(replaceBy);
		}
		metamodel.delete(toReplace);

		// model migration
		for (final Instance instance : model.getAllInstances(toReplace)) {
			instance.migrate(replaceBy);
			for (int i = 0; i < featuresToReplace.size(); i++) {
				instance.set(featuresReplaceBy.get(i), instance
					.unset(featuresToReplace.get(i)));
			}
		}
	}
}
