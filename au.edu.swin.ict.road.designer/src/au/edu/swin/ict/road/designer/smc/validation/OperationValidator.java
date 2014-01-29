/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.Operation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateReturn(String value);
	boolean validateParameter(EList<Parameter> value);
}
