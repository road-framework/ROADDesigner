/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Task;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.Role}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RoleValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateName(String value);
	boolean validateDescription(String value);
	boolean validateTask(EList<Task> value);
	boolean validateExternalFactLink(EList<ExternalFactLink> value);
	boolean validateManagementResponsibilities(String value);
}
