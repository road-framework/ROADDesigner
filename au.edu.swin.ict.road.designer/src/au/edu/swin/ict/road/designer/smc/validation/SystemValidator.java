/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.Player;
import au.edu.swin.ict.road.designer.smc.SMC;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.System}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SystemValidator {
	boolean validate();

	boolean validateSmc(SMC value);
	boolean validatePlayer(EList<Player> value);
	boolean validateName(String value);
}
