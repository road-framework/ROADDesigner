/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.Player;
import au.edu.swin.ict.road.designer.smc.Role;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.PlayerBinding}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PlayerBindingValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateName(String value);
	boolean validateEndpoint(String value);
	boolean validateImplementation(String value);
	boolean validateDescription(String value);
	boolean validateRole(Role value);
	boolean validatePlayer(Player value);
}
