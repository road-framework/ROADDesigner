/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.AcquisitionRegime;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.ProvisionRegime;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.ExternalFactLink}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExternalFactLinkValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateOnChange(boolean value);
	boolean validateAcquisitionRegime(AcquisitionRegime value);
	boolean validateProvisionRegime(ProvisionRegime value);
	boolean validateFact(Fact value);
}
