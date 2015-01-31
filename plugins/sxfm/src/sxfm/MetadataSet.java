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
 * A representation of the model object '<em><b>Metadata Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.MetadataSet#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getMetadataSet()
 * @model
 * @generated
 */
public interface MetadataSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link sxfm.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see sxfm.SxfmPackage#getMetadataSet_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // MetadataSet
