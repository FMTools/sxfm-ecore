/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.Or#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends EObject {
	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link sxfm.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see sxfm.SxfmPackage#getOr_Clause()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Literal> getClause();

} // Or
