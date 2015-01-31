/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sxfm.ConstraintsSet;
import sxfm.FeatureModel;
import sxfm.FeatureModelConfiguaration;
import sxfm.FeatureTree;
import sxfm.MetadataSet;
import sxfm.SxfmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sxfm.impl.FeatureModelImpl#getConstraintsSet <em>Constraints Set</em>}</li>
 *   <li>{@link sxfm.impl.FeatureModelImpl#getFeatureTree <em>Feature Tree</em>}</li>
 *   <li>{@link sxfm.impl.FeatureModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link sxfm.impl.FeatureModelImpl#getFeatureModelInfo <em>Feature Model Info</em>}</li>
 *   <li>{@link sxfm.impl.FeatureModelImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureModelImpl extends EObjectImpl implements FeatureModel {
	/**
	 * The cached value of the '{@link #getConstraintsSet() <em>Constraints Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsSet()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsSet constraintsSet;

	/**
	 * The cached value of the '{@link #getFeatureTree() <em>Feature Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTree()
	 * @generated
	 * @ordered
	 */
	protected FeatureTree featureTree;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureModelInfo() <em>Feature Model Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureModelInfo()
	 * @generated
	 * @ordered
	 */
	protected MetadataSet featureModelInfo;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModelConfiguaration> configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SxfmPackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsSet getConstraintsSet() {
		return constraintsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintsSet(ConstraintsSet newConstraintsSet, NotificationChain msgs) {
		ConstraintsSet oldConstraintsSet = constraintsSet;
		constraintsSet = newConstraintsSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET, oldConstraintsSet, newConstraintsSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintsSet(ConstraintsSet newConstraintsSet) {
		if (newConstraintsSet != constraintsSet) {
			NotificationChain msgs = null;
			if (constraintsSet != null)
				msgs = ((InternalEObject)constraintsSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET, null, msgs);
			if (newConstraintsSet != null)
				msgs = ((InternalEObject)newConstraintsSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET, null, msgs);
			msgs = basicSetConstraintsSet(newConstraintsSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET, newConstraintsSet, newConstraintsSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTree getFeatureTree() {
		return featureTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureTree(FeatureTree newFeatureTree, NotificationChain msgs) {
		FeatureTree oldFeatureTree = featureTree;
		featureTree = newFeatureTree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_MODEL__FEATURE_TREE, oldFeatureTree, newFeatureTree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureTree(FeatureTree newFeatureTree) {
		if (newFeatureTree != featureTree) {
			NotificationChain msgs = null;
			if (featureTree != null)
				msgs = ((InternalEObject)featureTree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SxfmPackage.FEATURE_MODEL__FEATURE_TREE, null, msgs);
			if (newFeatureTree != null)
				msgs = ((InternalEObject)newFeatureTree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SxfmPackage.FEATURE_MODEL__FEATURE_TREE, null, msgs);
			msgs = basicSetFeatureTree(newFeatureTree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_MODEL__FEATURE_TREE, newFeatureTree, newFeatureTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataSet getFeatureModelInfo() {
		return featureModelInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureModelInfo(MetadataSet newFeatureModelInfo, NotificationChain msgs) {
		MetadataSet oldFeatureModelInfo = featureModelInfo;
		featureModelInfo = newFeatureModelInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO, oldFeatureModelInfo, newFeatureModelInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModelInfo(MetadataSet newFeatureModelInfo) {
		if (newFeatureModelInfo != featureModelInfo) {
			NotificationChain msgs = null;
			if (featureModelInfo != null)
				msgs = ((InternalEObject)featureModelInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO, null, msgs);
			if (newFeatureModelInfo != null)
				msgs = ((InternalEObject)newFeatureModelInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO, null, msgs);
			msgs = basicSetFeatureModelInfo(newFeatureModelInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO, newFeatureModelInfo, newFeatureModelInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModelConfiguaration> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<FeatureModelConfiguaration>(FeatureModelConfiguaration.class, this, SxfmPackage.FEATURE_MODEL__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET:
				return basicSetConstraintsSet(null, msgs);
			case SxfmPackage.FEATURE_MODEL__FEATURE_TREE:
				return basicSetFeatureTree(null, msgs);
			case SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO:
				return basicSetFeatureModelInfo(null, msgs);
			case SxfmPackage.FEATURE_MODEL__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
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
			case SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET:
				return getConstraintsSet();
			case SxfmPackage.FEATURE_MODEL__FEATURE_TREE:
				return getFeatureTree();
			case SxfmPackage.FEATURE_MODEL__NAME:
				return getName();
			case SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO:
				return getFeatureModelInfo();
			case SxfmPackage.FEATURE_MODEL__CONFIGURATION:
				return getConfiguration();
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
			case SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)newValue);
				return;
			case SxfmPackage.FEATURE_MODEL__FEATURE_TREE:
				setFeatureTree((FeatureTree)newValue);
				return;
			case SxfmPackage.FEATURE_MODEL__NAME:
				setName((String)newValue);
				return;
			case SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO:
				setFeatureModelInfo((MetadataSet)newValue);
				return;
			case SxfmPackage.FEATURE_MODEL__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends FeatureModelConfiguaration>)newValue);
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
			case SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET:
				setConstraintsSet((ConstraintsSet)null);
				return;
			case SxfmPackage.FEATURE_MODEL__FEATURE_TREE:
				setFeatureTree((FeatureTree)null);
				return;
			case SxfmPackage.FEATURE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO:
				setFeatureModelInfo((MetadataSet)null);
				return;
			case SxfmPackage.FEATURE_MODEL__CONFIGURATION:
				getConfiguration().clear();
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
			case SxfmPackage.FEATURE_MODEL__CONSTRAINTS_SET:
				return constraintsSet != null;
			case SxfmPackage.FEATURE_MODEL__FEATURE_TREE:
				return featureTree != null;
			case SxfmPackage.FEATURE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SxfmPackage.FEATURE_MODEL__FEATURE_MODEL_INFO:
				return featureModelInfo != null;
			case SxfmPackage.FEATURE_MODEL__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FeatureModelImpl
