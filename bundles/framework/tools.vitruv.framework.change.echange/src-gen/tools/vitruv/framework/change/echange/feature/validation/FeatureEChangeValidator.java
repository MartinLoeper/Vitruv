/**
 *
 * $Id$
 */
package tools.vitruv.framework.change.echange.feature.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A sample validator interface for {@link tools.vitruv.framework.change.echange.feature.FeatureEChange}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FeatureEChangeValidator {
	boolean validate();

	boolean validateAffectedFeature(EStructuralFeature value);
	boolean validateAffectedEObject(EObject value);
}
