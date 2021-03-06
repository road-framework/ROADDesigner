/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.Mode;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.AcquisitionRegime}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AcquisitionRegimeValidator {
	boolean validate();

	boolean validateSyncInterval(int value);
	boolean validateMode(Mode value);
}
