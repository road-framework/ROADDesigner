/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.edu.swin.ict.road.designer.smc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.edu.swin.ict.road.designer.smc.FactAccessor#getFactLink <em>Fact Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getFactAccessor()
 * @model
 * @generated
 */
public interface FactAccessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Fact Link</b></em>' containment reference list.
	 * The list contents are of type {@link au.edu.swin.ict.road.designer.smc.FactLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Link</em>' containment reference list.
	 * @see au.edu.swin.ict.road.designer.smc.SmcPackage#getFactAccessor_FactLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<FactLink> getFactLink();

} // FactAccessor
