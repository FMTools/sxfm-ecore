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
 * A representation of the model object '<em><b>Feature Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.FeatureChoice#isSelected <em>Selected</em>}</li>
 *   <li>{@link sxfm.FeatureChoice#getDecisionType <em>Decision Type</em>}</li>
 *   <li>{@link sxfm.FeatureChoice#getDecisionStep <em>Decision Step</em>}</li>
 *   <li>{@link sxfm.FeatureChoice#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getFeatureChoice()
 * @model
 * @generated
 */
public interface FeatureChoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see sxfm.SxfmPackage#getFeatureChoice_Selected()
	 * @model required="true"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link sxfm.FeatureChoice#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Decision Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sxfm.DecisionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Type</em>' attribute.
	 * @see sxfm.DecisionType
	 * @see #setDecisionType(DecisionType)
	 * @see sxfm.SxfmPackage#getFeatureChoice_DecisionType()
	 * @model required="true"
	 * @generated
	 */
	DecisionType getDecisionType();

	/**
	 * Sets the value of the '{@link sxfm.FeatureChoice#getDecisionType <em>Decision Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Type</em>' attribute.
	 * @see sxfm.DecisionType
	 * @see #getDecisionType()
	 * @generated
	 */
	void setDecisionType(DecisionType value);

	/**
	 * Returns the value of the '<em><b>Decision Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Step</em>' attribute.
	 * @see #setDecisionStep(int)
	 * @see sxfm.SxfmPackage#getFeatureChoice_DecisionStep()
	 * @model required="true"
	 * @generated
	 */
	int getDecisionStep();

	/**
	 * Sets the value of the '{@link sxfm.FeatureChoice#getDecisionStep <em>Decision Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Step</em>' attribute.
	 * @see #getDecisionStep()
	 * @generated
	 */
	void setDecisionStep(int value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see sxfm.SxfmPackage#getFeatureChoice_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link sxfm.FeatureChoice#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // FeatureChoice
