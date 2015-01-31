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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sxfm.ConstraintableElement;
import sxfm.ContainableElement;
import sxfm.ContainerElement;
import sxfm.GroupedFeature;
import sxfm.SxfmPackage;
import sxfm.VariableFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouped Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sxfm.impl.GroupedFeatureImpl#getChildrenFeatures <em>Children Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupedFeatureImpl extends FeatureImpl implements GroupedFeature {
	/**
	 * The cached value of the '{@link #getChildrenFeatures() <em>Children Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainableElement> childrenFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SxfmPackage.Literals.GROUPED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainableElement> getChildrenFeatures() {
		if (childrenFeatures == null) {
			childrenFeatures = new EObjectContainmentEList<ContainableElement>(ContainableElement.class, this, SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES:
				return ((InternalEList<?>)getChildrenFeatures()).basicRemove(otherEnd, msgs);
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
			case SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES:
				return getChildrenFeatures();
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
			case SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES:
				getChildrenFeatures().clear();
				getChildrenFeatures().addAll((Collection<? extends ContainableElement>)newValue);
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
			case SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES:
				getChildrenFeatures().clear();
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
			case SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES:
				return childrenFeatures != null && !childrenFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConstraintableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ContainerElement.class) {
			switch (derivedFeatureID) {
				case SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES: return SxfmPackage.CONTAINER_ELEMENT__CHILDREN_FEATURES;
				default: return -1;
			}
		}
		if (baseClass == VariableFeature.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConstraintableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ContainerElement.class) {
			switch (baseFeatureID) {
				case SxfmPackage.CONTAINER_ELEMENT__CHILDREN_FEATURES: return SxfmPackage.GROUPED_FEATURE__CHILDREN_FEATURES;
				default: return -1;
			}
		}
		if (baseClass == VariableFeature.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GroupedFeatureImpl
