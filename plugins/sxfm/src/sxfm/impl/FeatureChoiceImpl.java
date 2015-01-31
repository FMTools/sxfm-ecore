/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sxfm.DecisionType;
import sxfm.Feature;
import sxfm.FeatureChoice;
import sxfm.SxfmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sxfm.impl.FeatureChoiceImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link sxfm.impl.FeatureChoiceImpl#getDecisionType <em>Decision Type</em>}</li>
 *   <li>{@link sxfm.impl.FeatureChoiceImpl#getDecisionStep <em>Decision Step</em>}</li>
 *   <li>{@link sxfm.impl.FeatureChoiceImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureChoiceImpl extends EObjectImpl implements FeatureChoice {
	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecisionType() <em>Decision Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionType()
	 * @generated
	 * @ordered
	 */
	protected static final DecisionType DECISION_TYPE_EDEFAULT = DecisionType.MANUAL;

	/**
	 * The cached value of the '{@link #getDecisionType() <em>Decision Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionType()
	 * @generated
	 * @ordered
	 */
	protected DecisionType decisionType = DECISION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecisionStep() <em>Decision Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionStep()
	 * @generated
	 * @ordered
	 */
	protected static final int DECISION_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecisionStep() <em>Decision Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionStep()
	 * @generated
	 * @ordered
	 */
	protected int decisionStep = DECISION_STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SxfmPackage.Literals.FEATURE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_CHOICE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionType getDecisionType() {
		return decisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionType(DecisionType newDecisionType) {
		DecisionType oldDecisionType = decisionType;
		decisionType = newDecisionType == null ? DECISION_TYPE_EDEFAULT : newDecisionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_CHOICE__DECISION_TYPE, oldDecisionType, decisionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecisionStep() {
		return decisionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionStep(int newDecisionStep) {
		int oldDecisionStep = decisionStep;
		decisionStep = newDecisionStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_CHOICE__DECISION_STEP, oldDecisionStep, decisionStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SxfmPackage.FEATURE_CHOICE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_CHOICE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SxfmPackage.FEATURE_CHOICE__SELECTED:
				return isSelected();
			case SxfmPackage.FEATURE_CHOICE__DECISION_TYPE:
				return getDecisionType();
			case SxfmPackage.FEATURE_CHOICE__DECISION_STEP:
				return getDecisionStep();
			case SxfmPackage.FEATURE_CHOICE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SxfmPackage.FEATURE_CHOICE__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case SxfmPackage.FEATURE_CHOICE__DECISION_TYPE:
				setDecisionType((DecisionType)newValue);
				return;
			case SxfmPackage.FEATURE_CHOICE__DECISION_STEP:
				setDecisionStep((Integer)newValue);
				return;
			case SxfmPackage.FEATURE_CHOICE__FEATURE:
				setFeature((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SxfmPackage.FEATURE_CHOICE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case SxfmPackage.FEATURE_CHOICE__DECISION_TYPE:
				setDecisionType(DECISION_TYPE_EDEFAULT);
				return;
			case SxfmPackage.FEATURE_CHOICE__DECISION_STEP:
				setDecisionStep(DECISION_STEP_EDEFAULT);
				return;
			case SxfmPackage.FEATURE_CHOICE__FEATURE:
				setFeature((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SxfmPackage.FEATURE_CHOICE__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case SxfmPackage.FEATURE_CHOICE__DECISION_TYPE:
				return decisionType != DECISION_TYPE_EDEFAULT;
			case SxfmPackage.FEATURE_CHOICE__DECISION_STEP:
				return decisionStep != DECISION_STEP_EDEFAULT;
			case SxfmPackage.FEATURE_CHOICE__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selected: ");
		result.append(selected);
		result.append(", decisionType: ");
		result.append(decisionType);
		result.append(", decisionStep: ");
		result.append(decisionStep);
		result.append(')');
		return result.toString();
	}

} //FeatureChoiceImpl
