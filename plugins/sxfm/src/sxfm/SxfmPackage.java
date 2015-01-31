/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sxfm.SxfmFactory
 * @model kind="package"
 * @generated
 */
public interface SxfmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sxfm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sxfm.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sxfm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SxfmPackage eINSTANCE = sxfm.impl.SxfmPackageImpl.init();

	/**
	 * The meta object id for the '{@link sxfm.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.FeatureImpl
	 * @see sxfm.impl.SxfmPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = 2;

	/**
	 * The feature id for the '<em><b>Tree Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TREE_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link sxfm.impl.CardinalizedElementImpl <em>Cardinalized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.CardinalizedElementImpl
	 * @see sxfm.impl.SxfmPackageImpl#getCardinalizedElement()
	 * @generated
	 */
	int CARDINALIZED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Min Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALIZED_ELEMENT__MIN_CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Max Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALIZED_ELEMENT__MAX_CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>Cardinalized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALIZED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sxfm.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.GroupImpl
	 * @see sxfm.impl.SxfmPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 1;

	/**
	 * The feature id for the '<em><b>Min Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MIN_CARDINALITY = CARDINALIZED_ELEMENT__MIN_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Max Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MAX_CARDINALITY = CARDINALIZED_ELEMENT__MAX_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPED_FEATURES = CARDINALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = CARDINALIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CARDINALIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sxfm.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.ConstraintImpl
	 * @see sxfm.impl.SxfmPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OR = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sxfm.impl.ContainerElementImpl <em>Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.ContainerElementImpl
	 * @see sxfm.impl.SxfmPackageImpl#getContainerElement()
	 * @generated
	 */
	int CONTAINER_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Children Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__CHILDREN_FEATURES = 0;

	/**
	 * The number of structural features of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.MandatoryImpl
	 * @see sxfm.impl.SxfmPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Children Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CHILDREN_FEATURES = CONTAINER_ELEMENT__CHILDREN_FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__NAME = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__GROUPS = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ID = CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tree Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__TREE_LEVEL = CONTAINER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__DESCRIPTION = CONTAINER_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link sxfm.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.OptionalImpl
	 * @see sxfm.impl.SxfmPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__GROUPS = FEATURE__GROUPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Tree Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__TREE_LEVEL = FEATURE__TREE_LEVEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CHILDREN_FEATURES = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.FeatureModelImpl
	 * @see sxfm.impl.SxfmPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Constraints Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONSTRAINTS_SET = 0;

	/**
	 * The feature id for the '<em><b>Feature Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATURE_TREE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Feature Model Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATURE_MODEL_INFO = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONFIGURATION = 4;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link sxfm.impl.FeatureTreeImpl <em>Feature Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.FeatureTreeImpl
	 * @see sxfm.impl.SxfmPackageImpl#getFeatureTree()
	 * @generated
	 */
	int FEATURE_TREE = 6;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE__ROOT = 0;

	/**
	 * The number of structural features of the '<em>Feature Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.ConstraintsSetImpl <em>Constraints Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.ConstraintsSetImpl
	 * @see sxfm.impl.SxfmPackageImpl#getConstraintsSet()
	 * @generated
	 */
	int CONSTRAINTS_SET = 8;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_SET__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Constraints Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.GroupedFeatureImpl <em>Grouped Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.GroupedFeatureImpl
	 * @see sxfm.impl.SxfmPackageImpl#getGroupedFeature()
	 * @generated
	 */
	int GROUPED_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__GROUPS = FEATURE__GROUPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Tree Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__TREE_LEVEL = FEATURE__TREE_LEVEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Children Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE__CHILDREN_FEATURES = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grouped Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.RootImpl
	 * @see sxfm.impl.SxfmPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 10;

	/**
	 * The feature id for the '<em><b>Children Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CHILDREN_FEATURES = CONTAINER_ELEMENT__CHILDREN_FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__GROUPS = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ID = CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tree Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TREE_LEVEL = CONTAINER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DESCRIPTION = CONTAINER_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link sxfm.impl.ConstraintableElementImpl <em>Constraintable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.ConstraintableElementImpl
	 * @see sxfm.impl.SxfmPackageImpl#getConstraintableElement()
	 * @generated
	 */
	int CONSTRAINTABLE_ELEMENT = 12;

	/**
	 * The number of structural features of the '<em>Constraintable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sxfm.impl.ContainableElementImpl <em>Containable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.ContainableElementImpl
	 * @see sxfm.impl.SxfmPackageImpl#getContainableElement()
	 * @generated
	 */
	int CONTAINABLE_ELEMENT = 13;

	/**
	 * The number of structural features of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sxfm.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.LiteralImpl
	 * @see sxfm.impl.SxfmPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 17;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sxfm.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.NotImpl
	 * @see sxfm.impl.SxfmPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 14;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__FEATURE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.OrImpl
	 * @see sxfm.impl.SxfmPackageImpl#getOr()
	 * @generated
	 */
	int OR = 15;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__CLAUSE = 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.AtomImpl
	 * @see sxfm.impl.SxfmPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 16;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__FEATURE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.DataImpl
	 * @see sxfm.impl.SxfmPackageImpl#getData()
	 * @generated
	 */
	int DATA = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sxfm.impl.MetadataSetImpl <em>Metadata Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.MetadataSetImpl
	 * @see sxfm.impl.SxfmPackageImpl#getMetadataSet()
	 * @generated
	 */
	int METADATA_SET = 19;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_SET__DATA = 0;

	/**
	 * The number of structural features of the '<em>Metadata Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.FeatureModelConfiguarationImpl <em>Feature Model Configuaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.FeatureModelConfiguarationImpl
	 * @see sxfm.impl.SxfmPackageImpl#getFeatureModelConfiguaration()
	 * @generated
	 */
	int FEATURE_MODEL_CONFIGUARATION = 20;

	/**
	 * The feature id for the '<em><b>Feature Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE = 0;

	/**
	 * The number of structural features of the '<em>Feature Model Configuaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_CONFIGUARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sxfm.impl.FeatureChoiceImpl <em>Feature Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.FeatureChoiceImpl
	 * @see sxfm.impl.SxfmPackageImpl#getFeatureChoice()
	 * @generated
	 */
	int FEATURE_CHOICE = 21;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHOICE__SELECTED = 0;

	/**
	 * The feature id for the '<em><b>Decision Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHOICE__DECISION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Decision Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHOICE__DECISION_STEP = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHOICE__FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Feature Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHOICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sxfm.impl.VariableFeatureImpl <em>Variable Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.VariableFeatureImpl
	 * @see sxfm.impl.SxfmPackageImpl#getVariableFeature()
	 * @generated
	 */
	int VARIABLE_FEATURE = 22;

	/**
	 * The number of structural features of the '<em>Variable Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sxfm.impl.CommonFeatureImpl <em>Common Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.impl.CommonFeatureImpl
	 * @see sxfm.impl.SxfmPackageImpl#getCommonFeature()
	 * @generated
	 */
	int COMMON_FEATURE = 23;

	/**
	 * The number of structural features of the '<em>Common Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sxfm.DecisionType <em>Decision Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sxfm.DecisionType
	 * @see sxfm.impl.SxfmPackageImpl#getDecisionType()
	 * @generated
	 */
	int DECISION_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link sxfm.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see sxfm.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sxfm.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see sxfm.Feature#getGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Groups();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sxfm.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Feature#getTreeLevel <em>Tree Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Level</em>'.
	 * @see sxfm.Feature#getTreeLevel()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_TreeLevel();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sxfm.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for class '{@link sxfm.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see sxfm.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.Group#getGroupedFeatures <em>Grouped Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grouped Features</em>'.
	 * @see sxfm.Group#getGroupedFeatures()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_GroupedFeatures();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sxfm.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for class '{@link sxfm.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see sxfm.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Constraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sxfm.Constraint#getId()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Id();

	/**
	 * Returns the meta object for the containment reference '{@link sxfm.Constraint#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see sxfm.Constraint#getOr()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Or();

	/**
	 * Returns the meta object for class '{@link sxfm.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see sxfm.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for class '{@link sxfm.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see sxfm.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for class '{@link sxfm.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see sxfm.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link sxfm.FeatureModel#getConstraintsSet <em>Constraints Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints Set</em>'.
	 * @see sxfm.FeatureModel#getConstraintsSet()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_ConstraintsSet();

	/**
	 * Returns the meta object for the containment reference '{@link sxfm.FeatureModel#getFeatureTree <em>Feature Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Tree</em>'.
	 * @see sxfm.FeatureModel#getFeatureTree()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_FeatureTree();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.FeatureModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sxfm.FeatureModel#getName()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EAttribute getFeatureModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link sxfm.FeatureModel#getFeatureModelInfo <em>Feature Model Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Model Info</em>'.
	 * @see sxfm.FeatureModel#getFeatureModelInfo()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_FeatureModelInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.FeatureModel#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see sxfm.FeatureModel#getConfiguration()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Configuration();

	/**
	 * Returns the meta object for class '{@link sxfm.FeatureTree <em>Feature Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Tree</em>'.
	 * @see sxfm.FeatureTree
	 * @generated
	 */
	EClass getFeatureTree();

	/**
	 * Returns the meta object for the containment reference '{@link sxfm.FeatureTree#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see sxfm.FeatureTree#getRoot()
	 * @see #getFeatureTree()
	 * @generated
	 */
	EReference getFeatureTree_Root();

	/**
	 * Returns the meta object for class '{@link sxfm.CardinalizedElement <em>Cardinalized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinalized Element</em>'.
	 * @see sxfm.CardinalizedElement
	 * @generated
	 */
	EClass getCardinalizedElement();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.CardinalizedElement#getMinCardinality <em>Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cardinality</em>'.
	 * @see sxfm.CardinalizedElement#getMinCardinality()
	 * @see #getCardinalizedElement()
	 * @generated
	 */
	EAttribute getCardinalizedElement_MinCardinality();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.CardinalizedElement#getMaxCardinality <em>Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cardinality</em>'.
	 * @see sxfm.CardinalizedElement#getMaxCardinality()
	 * @see #getCardinalizedElement()
	 * @generated
	 */
	EAttribute getCardinalizedElement_MaxCardinality();

	/**
	 * Returns the meta object for class '{@link sxfm.ConstraintsSet <em>Constraints Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Set</em>'.
	 * @see sxfm.ConstraintsSet
	 * @generated
	 */
	EClass getConstraintsSet();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.ConstraintsSet#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see sxfm.ConstraintsSet#getConstraints()
	 * @see #getConstraintsSet()
	 * @generated
	 */
	EReference getConstraintsSet_Constraints();

	/**
	 * Returns the meta object for class '{@link sxfm.GroupedFeature <em>Grouped Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouped Feature</em>'.
	 * @see sxfm.GroupedFeature
	 * @generated
	 */
	EClass getGroupedFeature();

	/**
	 * Returns the meta object for class '{@link sxfm.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see sxfm.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for class '{@link sxfm.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Element</em>'.
	 * @see sxfm.ContainerElement
	 * @generated
	 */
	EClass getContainerElement();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.ContainerElement#getChildrenFeatures <em>Children Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Features</em>'.
	 * @see sxfm.ContainerElement#getChildrenFeatures()
	 * @see #getContainerElement()
	 * @generated
	 */
	EReference getContainerElement_ChildrenFeatures();

	/**
	 * Returns the meta object for class '{@link sxfm.ConstraintableElement <em>Constraintable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraintable Element</em>'.
	 * @see sxfm.ConstraintableElement
	 * @generated
	 */
	EClass getConstraintableElement();

	/**
	 * Returns the meta object for class '{@link sxfm.ContainableElement <em>Containable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Element</em>'.
	 * @see sxfm.ContainableElement
	 * @generated
	 */
	EClass getContainableElement();

	/**
	 * Returns the meta object for class '{@link sxfm.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see sxfm.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link sxfm.Not#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see sxfm.Not#getFeature()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Feature();

	/**
	 * Returns the meta object for class '{@link sxfm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see sxfm.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.Or#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see sxfm.Or#getClause()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Clause();

	/**
	 * Returns the meta object for class '{@link sxfm.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see sxfm.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the reference '{@link sxfm.Atom#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see sxfm.Atom#getFeature()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Feature();

	/**
	 * Returns the meta object for class '{@link sxfm.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see sxfm.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link sxfm.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see sxfm.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sxfm.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sxfm.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for class '{@link sxfm.MetadataSet <em>Metadata Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Set</em>'.
	 * @see sxfm.MetadataSet
	 * @generated
	 */
	EClass getMetadataSet();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.MetadataSet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see sxfm.MetadataSet#getData()
	 * @see #getMetadataSet()
	 * @generated
	 */
	EReference getMetadataSet_Data();

	/**
	 * Returns the meta object for class '{@link sxfm.FeatureModelConfiguaration <em>Feature Model Configuaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model Configuaration</em>'.
	 * @see sxfm.FeatureModelConfiguaration
	 * @generated
	 */
	EClass getFeatureModelConfiguaration();

	/**
	 * Returns the meta object for the containment reference list '{@link sxfm.FeatureModelConfiguaration#getFeatureChoice <em>Feature Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Choice</em>'.
	 * @see sxfm.FeatureModelConfiguaration#getFeatureChoice()
	 * @see #getFeatureModelConfiguaration()
	 * @generated
	 */
	EReference getFeatureModelConfiguaration_FeatureChoice();

	/**
	 * Returns the meta object for class '{@link sxfm.FeatureChoice <em>Feature Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Choice</em>'.
	 * @see sxfm.FeatureChoice
	 * @generated
	 */
	EClass getFeatureChoice();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.FeatureChoice#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see sxfm.FeatureChoice#isSelected()
	 * @see #getFeatureChoice()
	 * @generated
	 */
	EAttribute getFeatureChoice_Selected();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.FeatureChoice#getDecisionType <em>Decision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Type</em>'.
	 * @see sxfm.FeatureChoice#getDecisionType()
	 * @see #getFeatureChoice()
	 * @generated
	 */
	EAttribute getFeatureChoice_DecisionType();

	/**
	 * Returns the meta object for the attribute '{@link sxfm.FeatureChoice#getDecisionStep <em>Decision Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Step</em>'.
	 * @see sxfm.FeatureChoice#getDecisionStep()
	 * @see #getFeatureChoice()
	 * @generated
	 */
	EAttribute getFeatureChoice_DecisionStep();

	/**
	 * Returns the meta object for the reference '{@link sxfm.FeatureChoice#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see sxfm.FeatureChoice#getFeature()
	 * @see #getFeatureChoice()
	 * @generated
	 */
	EReference getFeatureChoice_Feature();

	/**
	 * Returns the meta object for class '{@link sxfm.VariableFeature <em>Variable Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Feature</em>'.
	 * @see sxfm.VariableFeature
	 * @generated
	 */
	EClass getVariableFeature();

	/**
	 * Returns the meta object for class '{@link sxfm.CommonFeature <em>Common Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Feature</em>'.
	 * @see sxfm.CommonFeature
	 * @generated
	 */
	EClass getCommonFeature();

	/**
	 * Returns the meta object for enum '{@link sxfm.DecisionType <em>Decision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Type</em>'.
	 * @see sxfm.DecisionType
	 * @generated
	 */
	EEnum getDecisionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SxfmFactory getSxfmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sxfm.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.FeatureImpl
		 * @see sxfm.impl.SxfmPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPS = eINSTANCE.getFeature_Groups();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Tree Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TREE_LEVEL = eINSTANCE.getFeature_TreeLevel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '{@link sxfm.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.GroupImpl
		 * @see sxfm.impl.SxfmPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPED_FEATURES = eINSTANCE.getGroup_GroupedFeatures();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ID = eINSTANCE.getGroup_Id();

		/**
		 * The meta object literal for the '{@link sxfm.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.ConstraintImpl
		 * @see sxfm.impl.SxfmPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__ID = eINSTANCE.getConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__OR = eINSTANCE.getConstraint_Or();

		/**
		 * The meta object literal for the '{@link sxfm.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.MandatoryImpl
		 * @see sxfm.impl.SxfmPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '{@link sxfm.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.OptionalImpl
		 * @see sxfm.impl.SxfmPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '{@link sxfm.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.FeatureModelImpl
		 * @see sxfm.impl.SxfmPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Constraints Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CONSTRAINTS_SET = eINSTANCE.getFeatureModel_ConstraintsSet();

		/**
		 * The meta object literal for the '<em><b>Feature Tree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATURE_TREE = eINSTANCE.getFeatureModel_FeatureTree();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL__NAME = eINSTANCE.getFeatureModel_Name();

		/**
		 * The meta object literal for the '<em><b>Feature Model Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATURE_MODEL_INFO = eINSTANCE.getFeatureModel_FeatureModelInfo();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CONFIGURATION = eINSTANCE.getFeatureModel_Configuration();

		/**
		 * The meta object literal for the '{@link sxfm.impl.FeatureTreeImpl <em>Feature Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.FeatureTreeImpl
		 * @see sxfm.impl.SxfmPackageImpl#getFeatureTree()
		 * @generated
		 */
		EClass FEATURE_TREE = eINSTANCE.getFeatureTree();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TREE__ROOT = eINSTANCE.getFeatureTree_Root();

		/**
		 * The meta object literal for the '{@link sxfm.impl.CardinalizedElementImpl <em>Cardinalized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.CardinalizedElementImpl
		 * @see sxfm.impl.SxfmPackageImpl#getCardinalizedElement()
		 * @generated
		 */
		EClass CARDINALIZED_ELEMENT = eINSTANCE.getCardinalizedElement();

		/**
		 * The meta object literal for the '<em><b>Min Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALIZED_ELEMENT__MIN_CARDINALITY = eINSTANCE.getCardinalizedElement_MinCardinality();

		/**
		 * The meta object literal for the '<em><b>Max Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALIZED_ELEMENT__MAX_CARDINALITY = eINSTANCE.getCardinalizedElement_MaxCardinality();

		/**
		 * The meta object literal for the '{@link sxfm.impl.ConstraintsSetImpl <em>Constraints Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.ConstraintsSetImpl
		 * @see sxfm.impl.SxfmPackageImpl#getConstraintsSet()
		 * @generated
		 */
		EClass CONSTRAINTS_SET = eINSTANCE.getConstraintsSet();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_SET__CONSTRAINTS = eINSTANCE.getConstraintsSet_Constraints();

		/**
		 * The meta object literal for the '{@link sxfm.impl.GroupedFeatureImpl <em>Grouped Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.GroupedFeatureImpl
		 * @see sxfm.impl.SxfmPackageImpl#getGroupedFeature()
		 * @generated
		 */
		EClass GROUPED_FEATURE = eINSTANCE.getGroupedFeature();

		/**
		 * The meta object literal for the '{@link sxfm.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.RootImpl
		 * @see sxfm.impl.SxfmPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '{@link sxfm.impl.ContainerElementImpl <em>Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.ContainerElementImpl
		 * @see sxfm.impl.SxfmPackageImpl#getContainerElement()
		 * @generated
		 */
		EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

		/**
		 * The meta object literal for the '<em><b>Children Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ELEMENT__CHILDREN_FEATURES = eINSTANCE.getContainerElement_ChildrenFeatures();

		/**
		 * The meta object literal for the '{@link sxfm.impl.ConstraintableElementImpl <em>Constraintable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.ConstraintableElementImpl
		 * @see sxfm.impl.SxfmPackageImpl#getConstraintableElement()
		 * @generated
		 */
		EClass CONSTRAINTABLE_ELEMENT = eINSTANCE.getConstraintableElement();

		/**
		 * The meta object literal for the '{@link sxfm.impl.ContainableElementImpl <em>Containable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.ContainableElementImpl
		 * @see sxfm.impl.SxfmPackageImpl#getContainableElement()
		 * @generated
		 */
		EClass CONTAINABLE_ELEMENT = eINSTANCE.getContainableElement();

		/**
		 * The meta object literal for the '{@link sxfm.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.NotImpl
		 * @see sxfm.impl.SxfmPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__FEATURE = eINSTANCE.getNot_Feature();

		/**
		 * The meta object literal for the '{@link sxfm.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.OrImpl
		 * @see sxfm.impl.SxfmPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__CLAUSE = eINSTANCE.getOr_Clause();

		/**
		 * The meta object literal for the '{@link sxfm.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.AtomImpl
		 * @see sxfm.impl.SxfmPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__FEATURE = eINSTANCE.getAtom_Feature();

		/**
		 * The meta object literal for the '{@link sxfm.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.LiteralImpl
		 * @see sxfm.impl.SxfmPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link sxfm.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.DataImpl
		 * @see sxfm.impl.SxfmPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '{@link sxfm.impl.MetadataSetImpl <em>Metadata Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.MetadataSetImpl
		 * @see sxfm.impl.SxfmPackageImpl#getMetadataSet()
		 * @generated
		 */
		EClass METADATA_SET = eINSTANCE.getMetadataSet();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_SET__DATA = eINSTANCE.getMetadataSet_Data();

		/**
		 * The meta object literal for the '{@link sxfm.impl.FeatureModelConfiguarationImpl <em>Feature Model Configuaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.FeatureModelConfiguarationImpl
		 * @see sxfm.impl.SxfmPackageImpl#getFeatureModelConfiguaration()
		 * @generated
		 */
		EClass FEATURE_MODEL_CONFIGUARATION = eINSTANCE.getFeatureModelConfiguaration();

		/**
		 * The meta object literal for the '<em><b>Feature Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_CONFIGUARATION__FEATURE_CHOICE = eINSTANCE.getFeatureModelConfiguaration_FeatureChoice();

		/**
		 * The meta object literal for the '{@link sxfm.impl.FeatureChoiceImpl <em>Feature Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.FeatureChoiceImpl
		 * @see sxfm.impl.SxfmPackageImpl#getFeatureChoice()
		 * @generated
		 */
		EClass FEATURE_CHOICE = eINSTANCE.getFeatureChoice();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CHOICE__SELECTED = eINSTANCE.getFeatureChoice_Selected();

		/**
		 * The meta object literal for the '<em><b>Decision Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CHOICE__DECISION_TYPE = eINSTANCE.getFeatureChoice_DecisionType();

		/**
		 * The meta object literal for the '<em><b>Decision Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CHOICE__DECISION_STEP = eINSTANCE.getFeatureChoice_DecisionStep();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CHOICE__FEATURE = eINSTANCE.getFeatureChoice_Feature();

		/**
		 * The meta object literal for the '{@link sxfm.impl.VariableFeatureImpl <em>Variable Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.VariableFeatureImpl
		 * @see sxfm.impl.SxfmPackageImpl#getVariableFeature()
		 * @generated
		 */
		EClass VARIABLE_FEATURE = eINSTANCE.getVariableFeature();

		/**
		 * The meta object literal for the '{@link sxfm.impl.CommonFeatureImpl <em>Common Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.impl.CommonFeatureImpl
		 * @see sxfm.impl.SxfmPackageImpl#getCommonFeature()
		 * @generated
		 */
		EClass COMMON_FEATURE = eINSTANCE.getCommonFeature();

		/**
		 * The meta object literal for the '{@link sxfm.DecisionType <em>Decision Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sxfm.DecisionType
		 * @see sxfm.impl.SxfmPackageImpl#getDecisionType()
		 * @generated
		 */
		EEnum DECISION_TYPE = eINSTANCE.getDecisionType();

	}

} //SxfmPackage
