/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.FeatureTree#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getFeatureTree()
 * @model
 * @generated
 */
public interface FeatureTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Root)
	 * @see sxfm.SxfmPackage#getFeatureTree_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Root getRoot();

	/**
	 * Sets the value of the '{@link sxfm.FeatureTree#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Root value);

} // FeatureTree
