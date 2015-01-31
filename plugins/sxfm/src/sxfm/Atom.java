/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.Atom#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends Literal {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(ConstraintableElement)
	 * @see sxfm.SxfmPackage#getAtom_Feature()
	 * @model required="true"
	 * @generated
	 */
	ConstraintableElement getFeature();

	/**
	 * Sets the value of the '{@link sxfm.Atom#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(ConstraintableElement value);

} // Atom
