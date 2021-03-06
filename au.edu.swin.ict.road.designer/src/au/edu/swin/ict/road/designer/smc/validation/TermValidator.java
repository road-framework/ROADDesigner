/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.DeonticType;
import au.edu.swin.ict.road.designer.smc.DirectionType;
import au.edu.swin.ict.road.designer.smc.MessageType;
import au.edu.swin.ict.road.designer.smc.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.Term}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TermValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateName(String value);
	boolean validateMessageType(MessageType value);
	boolean validateDeonticType(DeonticType value);
	boolean validateDirection(DirectionType value);
	boolean validateDescription(String value);
	boolean validateOperation(EList<Operation> value);
}
