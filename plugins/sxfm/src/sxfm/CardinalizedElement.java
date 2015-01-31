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
 * A representation of the model object '<em><b>Cardinalized Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.CardinalizedElement#getMinCardinality <em>Min Cardinality</em>}</li>
 *   <li>{@link sxfm.CardinalizedElement#getMaxCardinality <em>Max Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getCardinalizedElement()
 * @model abstract="true"
 * @generated
 */
public interface CardinalizedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cardinality</em>' attribute.
	 * @see #setMinCardinality(int)
	 * @see sxfm.SxfmPackage#getCardinalizedElement_MinCardinality()
	 * @model required="true"
	 * @generated
	 */
	int getMinCardinality();

	/**
	 * Sets the value of the '{@link sxfm.CardinalizedElement#getMinCardinality <em>Min Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cardinality</em>' attribute.
	 * @see #getMinCardinality()
	 * @generated
	 */
	void setMinCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Max Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cardinality</em>' attribute.
	 * @see #setMaxCardinality(int)
	 * @see sxfm.SxfmPackage#getCardinalizedElement_MaxCardinality()
	 * @model required="true"
	 * @generated
	 */
	int getMaxCardinality();

	/**
	 * Sets the value of the '{@link sxfm.CardinalizedElement#getMaxCardinality <em>Max Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cardinality</em>' attribute.
	 * @see #getMaxCardinality()
	 * @generated
	 */
	void setMaxCardinality(int value);

} // CardinalizedElement
