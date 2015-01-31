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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sxfm.CommonFeature;
import sxfm.ConstraintableElement;
import sxfm.ContainableElement;
import sxfm.Feature;
import sxfm.Group;
import sxfm.Mandatory;
import sxfm.SxfmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sxfm.impl.MandatoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link sxfm.impl.MandatoryImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link sxfm.impl.MandatoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link sxfm.impl.MandatoryImpl#getTreeLevel <em>Tree Level</em>}</li>
 *   <li>{@link sxfm.impl.MandatoryImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryImpl extends ContainerElementImpl implements Mandatory {
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
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreeLevel() <em>Tree Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int TREE_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTreeLevel() <em>Tree Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeLevel()
	 * @generated
	 * @ordered
	 */
	protected int treeLevel = TREE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SxfmPackage.Literals.MANDATORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.MANDATORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, SxfmPackage.MANDATORY__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.MANDATORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTreeLevel() {
		return treeLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeLevel(int newTreeLevel) {
		int oldTreeLevel = treeLevel;
		treeLevel = newTreeLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.MANDATORY__TREE_LEVEL, oldTreeLevel, treeLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SxfmPackage.MANDATORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SxfmPackage.MANDATORY__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case SxfmPackage.MANDATORY__NAME:
				return getName();
			case SxfmPackage.MANDATORY__GROUPS:
				return getGroups();
			case SxfmPackage.MANDATORY__ID:
				return getId();
			case SxfmPackage.MANDATORY__TREE_LEVEL:
				return getTreeLevel();
			case SxfmPackage.MANDATORY__DESCRIPTION:
				return getDescription();
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
			case SxfmPackage.MANDATORY__NAME:
				setName((String)newValue);
				return;
			case SxfmPackage.MANDATORY__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case SxfmPackage.MANDATORY__ID:
				setId((String)newValue);
				return;
			case SxfmPackage.MANDATORY__TREE_LEVEL:
				setTreeLevel((Integer)newValue);
				return;
			case SxfmPackage.MANDATORY__DESCRIPTION:
				setDescription((String)newValue);
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
			case SxfmPackage.MANDATORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SxfmPackage.MANDATORY__GROUPS:
				getGroups().clear();
				return;
			case SxfmPackage.MANDATORY__ID:
				setId(ID_EDEFAULT);
				return;
			case SxfmPackage.MANDATORY__TREE_LEVEL:
				setTreeLevel(TREE_LEVEL_EDEFAULT);
				return;
			case SxfmPackage.MANDATORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case SxfmPackage.MANDATORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SxfmPackage.MANDATORY__GROUPS:
				return groups != null && !groups.isEmpty();
			case SxfmPackage.MANDATORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SxfmPackage.MANDATORY__TREE_LEVEL:
				return treeLevel != TREE_LEVEL_EDEFAULT;
			case SxfmPackage.MANDATORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		if (baseClass == ContainableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case SxfmPackage.MANDATORY__NAME: return SxfmPackage.FEATURE__NAME;
				case SxfmPackage.MANDATORY__GROUPS: return SxfmPackage.FEATURE__GROUPS;
				case SxfmPackage.MANDATORY__ID: return SxfmPackage.FEATURE__ID;
				case SxfmPackage.MANDATORY__TREE_LEVEL: return SxfmPackage.FEATURE__TREE_LEVEL;
				case SxfmPackage.MANDATORY__DESCRIPTION: return SxfmPackage.FEATURE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ConstraintableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CommonFeature.class) {
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
		if (baseClass == ContainableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case SxfmPackage.FEATURE__NAME: return SxfmPackage.MANDATORY__NAME;
				case SxfmPackage.FEATURE__GROUPS: return SxfmPackage.MANDATORY__GROUPS;
				case SxfmPackage.FEATURE__ID: return SxfmPackage.MANDATORY__ID;
				case SxfmPackage.FEATURE__TREE_LEVEL: return SxfmPackage.MANDATORY__TREE_LEVEL;
				case SxfmPackage.FEATURE__DESCRIPTION: return SxfmPackage.MANDATORY__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ConstraintableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CommonFeature.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", id: ");
		result.append(id);
		result.append(", treeLevel: ");
		result.append(treeLevel);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MandatoryImpl
