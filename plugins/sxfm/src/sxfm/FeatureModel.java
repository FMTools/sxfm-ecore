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
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sxfm.FeatureModel#getConstraintsSet <em>Constraints Set</em>}</li>
 *   <li>{@link sxfm.FeatureModel#getFeatureTree <em>Feature Tree</em>}</li>
 *   <li>{@link sxfm.FeatureModel#getName <em>Name</em>}</li>
 *   <li>{@link sxfm.FeatureModel#getFeatureModelInfo <em>Feature Model Info</em>}</li>
 *   <li>{@link sxfm.FeatureModel#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see sxfm.SxfmPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints Set</em>' containment reference.
	 * @see #setConstraintsSet(ConstraintsSet)
	 * @see sxfm.SxfmPackage#getFeatureModel_ConstraintsSet()
	 * @model containment="true"
	 * @generated
	 */
	ConstraintsSet getConstraintsSet();

	/**
	 * Sets the value of the '{@link sxfm.FeatureModel#getConstraintsSet <em>Constraints Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints Set</em>' containment reference.
	 * @see #getConstraintsSet()
	 * @generated
	 */
	void setConstraintsSet(ConstraintsSet value);

	/**
	 * Returns the value of the '<em><b>Feature Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Tree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Tree</em>' containment reference.
	 * @see #setFeatureTree(FeatureTree)
	 * @see sxfm.SxfmPackage#getFeatureModel_FeatureTree()
	 * @model containment="true"
	 * @generated
	 */
	FeatureTree getFeatureTree();

	/**
	 * Sets the value of the '{@link sxfm.FeatureModel#getFeatureTree <em>Feature Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Tree</em>' containment reference.
	 * @see #getFeatureTree()
	 * @generated
	 */
	void setFeatureTree(FeatureTree value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sxfm.SxfmPackage#getFeatureModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sxfm.FeatureModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Feature Model Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model Info</em>' containment reference.
	 * @see #setFeatureModelInfo(MetadataSet)
	 * @see sxfm.SxfmPackage#getFeatureModel_FeatureModelInfo()
	 * @model containment="true"
	 * @generated
	 */
	MetadataSet getFeatureModelInfo();

	/**
	 * Sets the value of the '{@link sxfm.FeatureModel#getFeatureModelInfo <em>Feature Model Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model Info</em>' containment reference.
	 * @see #getFeatureModelInfo()
	 * @generated
	 */
	void setFeatureModelInfo(MetadataSet value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link sxfm.FeatureModelConfiguaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see sxfm.SxfmPackage#getFeatureModel_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureModelConfiguaration> getConfiguration();

} // FeatureModel
