/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.Not#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Literal {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Atom)
	 * @see sxfm.SxfmPackage#getNot_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Atom getFeature();

	/**
	 * Sets the value of the '{@link sxfm.Not#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Atom value);

} // Not
