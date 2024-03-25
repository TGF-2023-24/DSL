/**
 */
package pnpl_variability.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pnpl_variability.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pnpl_variability.Pnpl_variabilityPackage
 * @generated
 */
public class Pnpl_variabilityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Pnpl_variabilityValidator INSTANCE = new Pnpl_variabilityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pnpl_variability";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint11' of 'Feature Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE_MODEL__CONSTRAINT11 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint3' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__CONSTRAINT3 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint4' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__CONSTRAINT4 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint5' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__CONSTRAINT5 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint10' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__CONSTRAINT10 = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint1' of 'Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATION__CONSTRAINT1 = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint2' of 'Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATION__CONSTRAINT2 = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint6' of 'Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATION__CONSTRAINT6 = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint7' of 'Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATION__CONSTRAINT7 = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint8' of 'Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATION__CONSTRAINT8 = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint9' of 'Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATION__CONSTRAINT9 = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint12' of 'Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATION__CONSTRAINT12 = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnpl_variabilityValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Pnpl_variabilityPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Pnpl_variabilityPackage.PNPL:
				return validatepnpl((pnpl)value, diagnostics, context);
			case Pnpl_variabilityPackage.PETRI_NET:
				return validatePetriNet((PetriNet)value, diagnostics, context);
			case Pnpl_variabilityPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case Pnpl_variabilityPackage.PLACE:
				return validatePlace((Place)value, diagnostics, context);
			case Pnpl_variabilityPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case Pnpl_variabilityPackage.ARC:
				return validateArc((Arc)value, diagnostics, context);
			case Pnpl_variabilityPackage.ARC_TP:
				return validateArcTP((ArcTP)value, diagnostics, context);
			case Pnpl_variabilityPackage.ARC_PT:
				return validateArcPT((ArcPT)value, diagnostics, context);
			case Pnpl_variabilityPackage.FEATURE_MODEL:
				return validateFeatureModel((FeatureModel)value, diagnostics, context);
			case Pnpl_variabilityPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case Pnpl_variabilityPackage.RELATION:
				return validateRelation((Relation)value, diagnostics, context);
			case Pnpl_variabilityPackage.PRESENCE_CONDITION:
				return validatePresenceCondition((PresenceCondition)value, diagnostics, context);
			case Pnpl_variabilityPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case Pnpl_variabilityPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case Pnpl_variabilityPackage.UNARY_EXPRESSION:
				return validateUnaryExpression((UnaryExpression)value, diagnostics, context);
			case Pnpl_variabilityPackage.BINARY_EXPRESSION:
				return validateBinaryExpression((BinaryExpression)value, diagnostics, context);
			case Pnpl_variabilityPackage.RELATION_TYPE:
				return validateRelationType((RelationType)value, diagnostics, context);
			case Pnpl_variabilityPackage.UNARY_OPERATOR:
				return validateUnaryOperator((UnaryOperator)value, diagnostics, context);
			case Pnpl_variabilityPackage.BINARY_OPERATOR:
				return validateBinaryOperator((BinaryOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatepnpl(pnpl pnpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pnpl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(petriNet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(place, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcTP(ArcTP arcTP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcTP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcPT(ArcPT arcPT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcPT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureModel(FeatureModel featureModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureModel_constraint11(featureModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the constraint11 constraint of '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureModel_constraint11(FeatureModel featureModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return featureModel.constraint11(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_constraint10(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_constraint3(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_constraint4(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_constraint5(node, diagnostics, context);
		return result;
	}

	/**
	 * Validates the constraint10 constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_constraint10(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.constraint10(diagnostics, context);
	}

	/**
	 * Validates the constraint3 constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_constraint3(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.constraint3(diagnostics, context);
	}

	/**
	 * Validates the constraint4 constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_constraint4(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.constraint4(diagnostics, context);
	}

	/**
	 * Validates the constraint5 constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_constraint5(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.constraint5(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_constraint12(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_constraint1(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_constraint2(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_constraint6(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_constraint7(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_constraint8(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_constraint9(relation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the constraint12 constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_constraint12(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relation.constraint12(diagnostics, context);
	}

	/**
	 * Validates the constraint1 constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_constraint1(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relation.constraint1(diagnostics, context);
	}

	/**
	 * Validates the constraint2 constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_constraint2(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relation.constraint2(diagnostics, context);
	}

	/**
	 * Validates the constraint6 constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_constraint6(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relation.constraint6(diagnostics, context);
	}

	/**
	 * Validates the constraint7 constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_constraint7(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relation.constraint7(diagnostics, context);
	}

	/**
	 * Validates the constraint8 constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_constraint8(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relation.constraint8(diagnostics, context);
	}

	/**
	 * Validates the constraint9 constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_constraint9(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relation.constraint9(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresenceCondition(PresenceCondition presenceCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(presenceCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryExpression(UnaryExpression unaryExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryExpression(BinaryExpression binaryExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationType(RelationType relationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryOperator(UnaryOperator unaryOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperator(BinaryOperator binaryOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Pnpl_variabilityValidator
