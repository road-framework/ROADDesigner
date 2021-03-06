/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc.validation;

import au.edu.swin.ict.road.designer.smc.FactLink;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link au.edu.swin.ict.road.designer.smc.FactAccessor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FactAccessorValidator {
	boolean validate();

	boolean validateFactLink(EList<FactLink> value);
}
