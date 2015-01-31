/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.Group#getGroupedFeatures <em>Grouped Features</em>}</li>
 *   <li>{@link sxfm.Group#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends CardinalizedElement {
	/**
	 * Returns the value of the '<em><b>Grouped Features</b></em>' containment reference list.
	 * The list contents are of type {@link sxfm.GroupedFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Features</em>' containment reference list.
	 * @see sxfm.SxfmPackage#getGroup_GroupedFeatures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GroupedFeature> getGroupedFeatures();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sxfm.SxfmPackage#getGroup_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sxfm.Group#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Group
