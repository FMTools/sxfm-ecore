/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sxfm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sxfm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sxfm.SxfmPackage
 * @generated
 */
public class SxfmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SxfmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SxfmSwitch() {
		if (modelPackage == null) {
			modelPackage = SxfmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SxfmPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseCardinalizedElement(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.MANDATORY: {
				Mandatory mandatory = (Mandatory)theEObject;
				T result = caseMandatory(mandatory);
				if (result == null) result = caseContainerElement(mandatory);
				if (result == null) result = caseContainableElement(mandatory);
				if (result == null) result = caseFeature(mandatory);
				if (result == null) result = caseConstraintableElement(mandatory);
				if (result == null) result = caseCommonFeature(mandatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.OPTIONAL: {
				Optional optional = (Optional)theEObject;
				T result = caseOptional(optional);
				if (result == null) result = caseFeature(optional);
				if (result == null) result = caseContainerElement(optional);
				if (result == null) result = caseContainableElement(optional);
				if (result == null) result = caseConstraintableElement(optional);
				if (result == null) result = caseVariableFeature(optional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.FEATURE_MODEL: {
				FeatureModel featureModel = (FeatureModel)theEObject;
				T result = caseFeatureModel(featureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.FEATURE_TREE: {
				FeatureTree featureTree = (FeatureTree)theEObject;
				T result = caseFeatureTree(featureTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.CARDINALIZED_ELEMENT: {
				CardinalizedElement cardinalizedElement = (CardinalizedElement)theEObject;
				T result = caseCardinalizedElement(cardinalizedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.CONSTRAINTS_SET: {
				ConstraintsSet constraintsSet = (ConstraintsSet)theEObject;
				T result = caseConstraintsSet(constraintsSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.GROUPED_FEATURE: {
				GroupedFeature groupedFeature = (GroupedFeature)theEObject;
				T result = caseGroupedFeature(groupedFeature);
				if (result == null) result = caseFeature(groupedFeature);
				if (result == null) result = caseConstraintableElement(groupedFeature);
				if (result == null) result = caseContainerElement(groupedFeature);
				if (result == null) result = caseVariableFeature(groupedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = caseContainerElement(root);
				if (result == null) result = caseFeature(root);
				if (result == null) result = caseCommonFeature(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.CONTAINER_ELEMENT: {
				ContainerElement containerElement = (ContainerElement)theEObject;
				T result = caseContainerElement(containerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.CONSTRAINTABLE_ELEMENT: {
				ConstraintableElement constraintableElement = (ConstraintableElement)theEObject;
				T result = caseConstraintableElement(constraintableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.CONTAINABLE_ELEMENT: {
				ContainableElement containableElement = (ContainableElement)theEObject;
				T result = caseContainableElement(containableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseLiteral(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = caseLiteral(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.METADATA_SET: {
				MetadataSet metadataSet = (MetadataSet)theEObject;
				T result = caseMetadataSet(metadataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.FEATURE_MODEL_CONFIGUARATION: {
				FeatureModelConfiguaration featureModelConfiguaration = (FeatureModelConfiguaration)theEObject;
				T result = caseFeatureModelConfiguaration(featureModelConfiguaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.FEATURE_CHOICE: {
				FeatureChoice featureChoice = (FeatureChoice)theEObject;
				T result = caseFeatureChoice(featureChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.VARIABLE_FEATURE: {
				VariableFeature variableFeature = (VariableFeature)theEObject;
				T result = caseVariableFeature(variableFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SxfmPackage.COMMON_FEATURE: {
				CommonFeature commonFeature = (CommonFeature)theEObject;
				T result = caseCommonFeature(commonFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatory(Mandatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptional(Optional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureModel(FeatureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTree(FeatureTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinalized Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinalized Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalizedElement(CardinalizedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsSet(ConstraintsSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grouped Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouped Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupedFeature(GroupedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerElement(ContainerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraintable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraintable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintableElement(ConstraintableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainableElement(ContainableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataSet(MetadataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model Configuaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model Configuaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureModelConfiguaration(FeatureModelConfiguaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureChoice(FeatureChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableFeature(VariableFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonFeature(CommonFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SxfmSwitch
