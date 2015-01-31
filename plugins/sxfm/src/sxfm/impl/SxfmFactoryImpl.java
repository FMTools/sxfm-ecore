/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sxfm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SxfmFactoryImpl extends EFactoryImpl implements SxfmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SxfmFactory init() {
		try {
			SxfmFactory theSxfmFactory = (SxfmFactory)EPackage.Registry.INSTANCE.getEFactory("http://sxfm.com"); 
			if (theSxfmFactory != null) {
				return theSxfmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SxfmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SxfmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SxfmPackage.GROUP: return createGroup();
			case SxfmPackage.CONSTRAINT: return createConstraint();
			case SxfmPackage.MANDATORY: return createMandatory();
			case SxfmPackage.OPTIONAL: return createOptional();
			case SxfmPackage.FEATURE_MODEL: return createFeatureModel();
			case SxfmPackage.FEATURE_TREE: return createFeatureTree();
			case SxfmPackage.CONSTRAINTS_SET: return createConstraintsSet();
			case SxfmPackage.GROUPED_FEATURE: return createGroupedFeature();
			case SxfmPackage.ROOT: return createRoot();
			case SxfmPackage.NOT: return createNot();
			case SxfmPackage.OR: return createOr();
			case SxfmPackage.ATOM: return createAtom();
			case SxfmPackage.DATA: return createData();
			case SxfmPackage.METADATA_SET: return createMetadataSet();
			case SxfmPackage.FEATURE_MODEL_CONFIGUARATION: return createFeatureModelConfiguaration();
			case SxfmPackage.FEATURE_CHOICE: return createFeatureChoice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SxfmPackage.DECISION_TYPE:
				return createDecisionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SxfmPackage.DECISION_TYPE:
				return convertDecisionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory createMandatory() {
		MandatoryImpl mandatory = new MandatoryImpl();
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional createOptional() {
		OptionalImpl optional = new OptionalImpl();
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel createFeatureModel() {
		FeatureModelImpl featureModel = new FeatureModelImpl();
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTree createFeatureTree() {
		FeatureTreeImpl featureTree = new FeatureTreeImpl();
		return featureTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsSet createConstraintsSet() {
		ConstraintsSetImpl constraintsSet = new ConstraintsSetImpl();
		return constraintsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedFeature createGroupedFeature() {
		GroupedFeatureImpl groupedFeature = new GroupedFeatureImpl();
		return groupedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataSet createMetadataSet() {
		MetadataSetImpl metadataSet = new MetadataSetImpl();
		return metadataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelConfiguaration createFeatureModelConfiguaration() {
		FeatureModelConfiguarationImpl featureModelConfiguaration = new FeatureModelConfiguarationImpl();
		return featureModelConfiguaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureChoice createFeatureChoice() {
		FeatureChoiceImpl featureChoice = new FeatureChoiceImpl();
		return featureChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionType createDecisionTypeFromString(EDataType eDataType, String initialValue) {
		DecisionType result = DecisionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SxfmPackage getSxfmPackage() {
		return (SxfmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SxfmPackage getPackage() {
		return SxfmPackage.eINSTANCE;
	}

} //SxfmFactoryImpl
