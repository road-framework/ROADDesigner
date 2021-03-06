/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;


/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.Constraint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConstraintValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateExpression(String value);
	boolean validateEnabled(boolean value);
	boolean validateLanguage(String value);
	boolean validateSoft(boolean value);
}
