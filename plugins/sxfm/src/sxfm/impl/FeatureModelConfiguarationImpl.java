/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sxfm.FeatureChoice;
import sxfm.FeatureModelConfiguaration;
import sxfm.SxfmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model Configuaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sxfm.impl.FeatureModelConfiguarationImpl#getFeatureChoice <em>Feature Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureModelConfiguarationImpl extends EObjectImpl implements FeatureModelConfiguaration {
	/**
	 * The cached value of the '{@link #getFeatureChoice() <em>Feature Choice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureChoice> featureChoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelConfiguarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SxfmPackage.Literals.FEATURE_MODEL_CONFIGUARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureChoice> getFeatureChoice() {
		if (featureChoice == null) {
			featureChoice = new EObjectContainmentEList<FeatureChoice>(FeatureChoice.class, this, SxfmPackage.FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE);
		}
		return featureChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SxfmPackage.FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE:
				return ((InternalEList<?>)getFeatureChoice()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SxfmPackage.FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE:
				return getFeatureChoice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SxfmPackage.FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE:
				getFeatureChoice().clear();
				getFeatureChoice().addAll((Collection<? extends FeatureChoice>)newValue);
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
			case SxfmPackage.FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE:
				getFeatureChoice().clear();
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
			case SxfmPackage.FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE:
				return featureChoice != null && !featureChoice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureModelConfiguarationImpl
