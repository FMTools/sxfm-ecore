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
 * A representation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.ContainerElement#getChildrenFeatures <em>Children Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getContainerElement()
 * @model abstract="true"
 * @generated
 */
public interface ContainerElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Children Features</b></em>' containment reference list.
	 * The list contents are of type {@link sxfm.ContainableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Features</em>' containment reference list.
	 * @see sxfm.SxfmPackage#getContainerElement_ChildrenFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainableElement> getChildrenFeatures();

} // ContainerElement
