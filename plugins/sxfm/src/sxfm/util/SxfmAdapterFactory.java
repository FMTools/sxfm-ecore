/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sxfm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sxfm.SxfmPackage
 * @generated
 */
public class SxfmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SxfmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SxfmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SxfmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SxfmSwitch<Adapter> modelSwitch =
		new SxfmSwitch<Adapter>() {
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseMandatory(Mandatory object) {
				return createMandatoryAdapter();
			}
			@Override
			public Adapter caseOptional(Optional object) {
				return createOptionalAdapter();
			}
			@Override
			public Adapter caseFeatureModel(FeatureModel object) {
				return createFeatureModelAdapter();
			}
			@Override
			public Adapter caseFeatureTree(FeatureTree object) {
				return createFeatureTreeAdapter();
			}
			@Override
			public Adapter caseCardinalizedElement(CardinalizedElement object) {
				return createCardinalizedElementAdapter();
			}
			@Override
			public Adapter caseConstraintsSet(ConstraintsSet object) {
				return createConstraintsSetAdapter();
			}
			@Override
			public Adapter caseGroupedFeature(GroupedFeature object) {
				return createGroupedFeatureAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseContainerElement(ContainerElement object) {
				return createContainerElementAdapter();
			}
			@Override
			public Adapter caseConstraintableElement(ConstraintableElement object) {
				return createConstraintableElementAdapter();
			}
			@Override
			public Adapter caseContainableElement(ContainableElement object) {
				return createContainableElementAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseMetadataSet(MetadataSet object) {
				return createMetadataSetAdapter();
			}
			@Override
			public Adapter caseFeatureModelConfiguaration(FeatureModelConfiguaration object) {
				return createFeatureModelConfiguarationAdapter();
			}
			@Override
			public Adapter caseFeatureChoice(FeatureChoice object) {
				return createFeatureChoiceAdapter();
			}
			@Override
			public Adapter caseVariableFeature(VariableFeature object) {
				return createVariableFeatureAdapter();
			}
			@Override
			public Adapter caseCommonFeature(CommonFeature object) {
				return createCommonFeatureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Mandatory
	 * @generated
	 */
	public Adapter createMandatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Optional
	 * @generated
	 */
	public Adapter createOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.FeatureModel
	 * @generated
	 */
	public Adapter createFeatureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.FeatureTree <em>Feature Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.FeatureTree
	 * @generated
	 */
	public Adapter createFeatureTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.CardinalizedElement <em>Cardinalized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.CardinalizedElement
	 * @generated
	 */
	public Adapter createCardinalizedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.ConstraintsSet <em>Constraints Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.ConstraintsSet
	 * @generated
	 */
	public Adapter createConstraintsSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.GroupedFeature <em>Grouped Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.GroupedFeature
	 * @generated
	 */
	public Adapter createGroupedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.ContainerElement
	 * @generated
	 */
	public Adapter createContainerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.ConstraintableElement <em>Constraintable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.ConstraintableElement
	 * @generated
	 */
	public Adapter createConstraintableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.ContainableElement <em>Containable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.ContainableElement
	 * @generated
	 */
	public Adapter createContainableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.MetadataSet <em>Metadata Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.MetadataSet
	 * @generated
	 */
	public Adapter createMetadataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.FeatureModelConfiguaration <em>Feature Model Configuaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.FeatureModelConfiguaration
	 * @generated
	 */
	public Adapter createFeatureModelConfiguarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.FeatureChoice <em>Feature Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.FeatureChoice
	 * @generated
	 */
	public Adapter createFeatureChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.VariableFeature <em>Variable Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.VariableFeature
	 * @generated
	 */
	public Adapter createVariableFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sxfm.CommonFeature <em>Common Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sxfm.CommonFeature
	 * @generated
	 */
	public Adapter createCommonFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SxfmAdapterFactory
