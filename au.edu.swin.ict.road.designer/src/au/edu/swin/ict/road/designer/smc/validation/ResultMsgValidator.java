/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;


/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.ResultMsg}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResultMsgValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateTransformation(String value);

	boolean validateContractId(String value);

	boolean validateTermId(String value);

	boolean validateIsResponse(boolean value);

	boolean validateFactId(String value);
}