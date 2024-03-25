/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /pnpl_fide/model/pnplv.ecore
 * using:
 *   /pnpl_fide/model/pnplmodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package pnpl_variability;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import pnpl_variability.Pnpl_variabilityPackage;
// import pnpl_variability.Pnpl_variabilityTables;

/**
 * Pnpl_variabilityTables provides the dispatch tables for the pnpl_variability for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Pnpl_variabilityTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Pnpl_variabilityPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_petrinets_org_s_pnpl = IdManager.getNsURIPackageId("http://www.petrinets.org/pnpl", null, Pnpl_variabilityPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_ArcPT = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("ArcPT", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ArcTP = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("ArcTP", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BinaryExpression = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("BinaryExpression", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Expression = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("Expression", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FeatureModel = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("FeatureModel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Node = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("Node", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PetriNet = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("PetriNet", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Place = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("Place", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PresenceCondition = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("PresenceCondition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Relation = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("Relation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Transition = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("Transition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UnaryExpression = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("UnaryExpression", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_pnpl = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getClassId("pnpl", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Pnpl_variabilityTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_BinaryOperator = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getEnumerationId("BinaryOperator");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_RelationType = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getEnumerationId("RelationType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_UnaryOperator = Pnpl_variabilityTables.PACKid_http_c_s_s_www_petrinets_org_s_pnpl.getEnumerationId("UnaryOperator");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ArcPT = TypeId.BAG.getSpecializedId(Pnpl_variabilityTables.CLSSid_ArcPT);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ArcTP = TypeId.BAG.getSpecializedId(Pnpl_variabilityTables.CLSSid_ArcTP);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Element = TypeId.BAG.getSpecializedId(Pnpl_variabilityTables.CLSSid_Element);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Feature = TypeId.BAG.getSpecializedId(Pnpl_variabilityTables.CLSSid_Feature);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Node = TypeId.BAG.getSpecializedId(Pnpl_variabilityTables.CLSSid_Node);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Relation = TypeId.BAG.getSpecializedId(Pnpl_variabilityTables.CLSSid_Relation);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ALTERNATIVE = Pnpl_variabilityTables.ENUMid_RelationType.getEnumerationLiteralId("ALTERNATIVE");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_DEFAULT = Pnpl_variabilityTables.ENUMid_RelationType.getEnumerationLiteralId("DEFAULT");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(Pnpl_variabilityTables.CLSSid_Element);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Node = TypeId.ORDERED_SET.getSpecializedId(Pnpl_variabilityTables.CLSSid_Node);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PresenceCondition = TypeId.ORDERED_SET.getSpecializedId(Pnpl_variabilityTables.CLSSid_PresenceCondition);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Relation = TypeId.ORDERED_SET.getSpecializedId(Pnpl_variabilityTables.CLSSid_Relation);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Pnpl_variabilityTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Arc = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.ARC, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ArcPT = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.ARC_PT, PACKAGE, 0);
		public static final EcoreExecutorType _ArcTP = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.ARC_TP, PACKAGE, 0);
		public static final EcoreExecutorType _BinaryExpression = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.BINARY_EXPRESSION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _BinaryOperator = new EcoreExecutorEnumeration(Pnpl_variabilityPackage.Literals.BINARY_OPERATOR, PACKAGE, 0);
		public static final EcoreExecutorType _Element = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Expression = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.EXPRESSION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Feature = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.FEATURE, PACKAGE, 0);
		public static final EcoreExecutorType _FeatureModel = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.FEATURE_MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _Node = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.NODE, PACKAGE, 0);
		public static final EcoreExecutorType _PetriNet = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.PETRI_NET, PACKAGE, 0);
		public static final EcoreExecutorType _Place = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.PLACE, PACKAGE, 0);
		public static final EcoreExecutorType _PresenceCondition = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.PRESENCE_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorType _Relation = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.RELATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _RelationType = new EcoreExecutorEnumeration(Pnpl_variabilityPackage.Literals.RELATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Transition = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.TRANSITION, PACKAGE, 0);
		public static final EcoreExecutorType _UnaryExpression = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.UNARY_EXPRESSION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _UnaryOperator = new EcoreExecutorEnumeration(Pnpl_variabilityPackage.Literals.UNARY_OPERATOR, PACKAGE, 0);
		public static final EcoreExecutorType _pnpl = new EcoreExecutorType(Pnpl_variabilityPackage.Literals.PNPL, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Arc,
			_ArcPT,
			_ArcTP,
			_BinaryExpression,
			_BinaryOperator,
			_Element,
			_Expression,
			_Feature,
			_FeatureModel,
			_Node,
			_PetriNet,
			_Place,
			_PresenceCondition,
			_Relation,
			_RelationType,
			_Transition,
			_UnaryExpression,
			_UnaryOperator,
			_pnpl
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Arc__Arc = new ExecutorFragment(Types._Arc, Pnpl_variabilityTables.Types._Arc);
		private static final ExecutorFragment _Arc__Element = new ExecutorFragment(Types._Arc, Pnpl_variabilityTables.Types._Element);
		private static final ExecutorFragment _Arc__OclAny = new ExecutorFragment(Types._Arc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Arc__OclElement = new ExecutorFragment(Types._Arc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ArcPT__Arc = new ExecutorFragment(Types._ArcPT, Pnpl_variabilityTables.Types._Arc);
		private static final ExecutorFragment _ArcPT__ArcPT = new ExecutorFragment(Types._ArcPT, Pnpl_variabilityTables.Types._ArcPT);
		private static final ExecutorFragment _ArcPT__Element = new ExecutorFragment(Types._ArcPT, Pnpl_variabilityTables.Types._Element);
		private static final ExecutorFragment _ArcPT__OclAny = new ExecutorFragment(Types._ArcPT, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ArcPT__OclElement = new ExecutorFragment(Types._ArcPT, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ArcTP__Arc = new ExecutorFragment(Types._ArcTP, Pnpl_variabilityTables.Types._Arc);
		private static final ExecutorFragment _ArcTP__ArcTP = new ExecutorFragment(Types._ArcTP, Pnpl_variabilityTables.Types._ArcTP);
		private static final ExecutorFragment _ArcTP__Element = new ExecutorFragment(Types._ArcTP, Pnpl_variabilityTables.Types._Element);
		private static final ExecutorFragment _ArcTP__OclAny = new ExecutorFragment(Types._ArcTP, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ArcTP__OclElement = new ExecutorFragment(Types._ArcTP, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BinaryExpression__BinaryExpression = new ExecutorFragment(Types._BinaryExpression, Pnpl_variabilityTables.Types._BinaryExpression);
		private static final ExecutorFragment _BinaryExpression__Expression = new ExecutorFragment(Types._BinaryExpression, Pnpl_variabilityTables.Types._Expression);
		private static final ExecutorFragment _BinaryExpression__OclAny = new ExecutorFragment(Types._BinaryExpression, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BinaryExpression__OclElement = new ExecutorFragment(Types._BinaryExpression, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BinaryOperator__BinaryOperator = new ExecutorFragment(Types._BinaryOperator, Pnpl_variabilityTables.Types._BinaryOperator);
		private static final ExecutorFragment _BinaryOperator__OclAny = new ExecutorFragment(Types._BinaryOperator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BinaryOperator__OclElement = new ExecutorFragment(Types._BinaryOperator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BinaryOperator__OclEnumeration = new ExecutorFragment(Types._BinaryOperator, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _BinaryOperator__OclType = new ExecutorFragment(Types._BinaryOperator, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, Pnpl_variabilityTables.Types._Element);
		private static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Expression__Expression = new ExecutorFragment(Types._Expression, Pnpl_variabilityTables.Types._Expression);
		private static final ExecutorFragment _Expression__OclAny = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Expression__OclElement = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Feature__Expression = new ExecutorFragment(Types._Feature, Pnpl_variabilityTables.Types._Expression);
		private static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, Pnpl_variabilityTables.Types._Feature);
		private static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FeatureModel__FeatureModel = new ExecutorFragment(Types._FeatureModel, Pnpl_variabilityTables.Types._FeatureModel);
		private static final ExecutorFragment _FeatureModel__OclAny = new ExecutorFragment(Types._FeatureModel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FeatureModel__OclElement = new ExecutorFragment(Types._FeatureModel, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Node__Node = new ExecutorFragment(Types._Node, Pnpl_variabilityTables.Types._Node);
		private static final ExecutorFragment _Node__OclAny = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Node__OclElement = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PetriNet__OclAny = new ExecutorFragment(Types._PetriNet, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PetriNet__OclElement = new ExecutorFragment(Types._PetriNet, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PetriNet__PetriNet = new ExecutorFragment(Types._PetriNet, Pnpl_variabilityTables.Types._PetriNet);

		private static final ExecutorFragment _Place__Element = new ExecutorFragment(Types._Place, Pnpl_variabilityTables.Types._Element);
		private static final ExecutorFragment _Place__OclAny = new ExecutorFragment(Types._Place, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Place__OclElement = new ExecutorFragment(Types._Place, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Place__Place = new ExecutorFragment(Types._Place, Pnpl_variabilityTables.Types._Place);

		private static final ExecutorFragment _PresenceCondition__OclAny = new ExecutorFragment(Types._PresenceCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PresenceCondition__OclElement = new ExecutorFragment(Types._PresenceCondition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PresenceCondition__PresenceCondition = new ExecutorFragment(Types._PresenceCondition, Pnpl_variabilityTables.Types._PresenceCondition);

		private static final ExecutorFragment _Relation__OclAny = new ExecutorFragment(Types._Relation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Relation__OclElement = new ExecutorFragment(Types._Relation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Relation__Relation = new ExecutorFragment(Types._Relation, Pnpl_variabilityTables.Types._Relation);

		private static final ExecutorFragment _RelationType__OclAny = new ExecutorFragment(Types._RelationType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RelationType__OclElement = new ExecutorFragment(Types._RelationType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RelationType__OclEnumeration = new ExecutorFragment(Types._RelationType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _RelationType__OclType = new ExecutorFragment(Types._RelationType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _RelationType__RelationType = new ExecutorFragment(Types._RelationType, Pnpl_variabilityTables.Types._RelationType);

		private static final ExecutorFragment _Transition__Element = new ExecutorFragment(Types._Transition, Pnpl_variabilityTables.Types._Element);
		private static final ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, Pnpl_variabilityTables.Types._Transition);

		private static final ExecutorFragment _UnaryExpression__Expression = new ExecutorFragment(Types._UnaryExpression, Pnpl_variabilityTables.Types._Expression);
		private static final ExecutorFragment _UnaryExpression__OclAny = new ExecutorFragment(Types._UnaryExpression, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UnaryExpression__OclElement = new ExecutorFragment(Types._UnaryExpression, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UnaryExpression__UnaryExpression = new ExecutorFragment(Types._UnaryExpression, Pnpl_variabilityTables.Types._UnaryExpression);

		private static final ExecutorFragment _UnaryOperator__OclAny = new ExecutorFragment(Types._UnaryOperator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UnaryOperator__OclElement = new ExecutorFragment(Types._UnaryOperator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UnaryOperator__OclEnumeration = new ExecutorFragment(Types._UnaryOperator, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _UnaryOperator__OclType = new ExecutorFragment(Types._UnaryOperator, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _UnaryOperator__UnaryOperator = new ExecutorFragment(Types._UnaryOperator, Pnpl_variabilityTables.Types._UnaryOperator);

		private static final ExecutorFragment _pnpl__OclAny = new ExecutorFragment(Types._pnpl, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _pnpl__OclElement = new ExecutorFragment(Types._pnpl, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _pnpl__pnpl = new ExecutorFragment(Types._pnpl, Pnpl_variabilityTables.Types._pnpl);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Arc__weight = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.ARC__WEIGHT, Types._Arc, 0);

		public static final ExecutorProperty _ArcPT__source = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.ARC_PT__SOURCE, Types._ArcPT, 0);
		public static final ExecutorProperty _ArcPT__target = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.ARC_PT__TARGET, Types._ArcPT, 1);

		public static final ExecutorProperty _ArcTP__source = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.ARC_TP__SOURCE, Types._ArcTP, 0);
		public static final ExecutorProperty _ArcTP__target = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.ARC_TP__TARGET, Types._ArcTP, 1);

		public static final ExecutorProperty _BinaryExpression__left = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.BINARY_EXPRESSION__LEFT, Types._BinaryExpression, 0);
		public static final ExecutorProperty _BinaryExpression__operator = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.BINARY_EXPRESSION__OPERATOR, Types._BinaryExpression, 1);
		public static final ExecutorProperty _BinaryExpression__right = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.BINARY_EXPRESSION__RIGHT, Types._BinaryExpression, 2);

		public static final ExecutorProperty _Element__name = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.ELEMENT__NAME, Types._Element, 0);
		public static final ExecutorProperty _Element__presenceCondition = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.ELEMENT__PRESENCE_CONDITION, Types._Element, 1);
		public static final ExecutorProperty _Element__PetriNet__elements = new ExecutorPropertyWithImplementation("PetriNet", Types._Element, 2, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.PETRI_NET__ELEMENTS));

		public static final ExecutorProperty _Expression__BinaryExpression__left = new ExecutorPropertyWithImplementation("BinaryExpression", Types._Expression, 0, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.BINARY_EXPRESSION__LEFT));
		public static final ExecutorProperty _Expression__BinaryExpression__right = new ExecutorPropertyWithImplementation("BinaryExpression", Types._Expression, 1, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.BINARY_EXPRESSION__RIGHT));
		public static final ExecutorProperty _Expression__PresenceCondition__expression = new ExecutorPropertyWithImplementation("PresenceCondition", Types._Expression, 2, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.PRESENCE_CONDITION__EXPRESSION));
		public static final ExecutorProperty _Expression__UnaryExpression__right = new ExecutorPropertyWithImplementation("UnaryExpression", Types._Expression, 3, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.UNARY_EXPRESSION__RIGHT));

		public static final ExecutorProperty _Feature__feature = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.FEATURE__FEATURE, Types._Feature, 0);

		public static final ExecutorProperty _FeatureModel__nodes = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.FEATURE_MODEL__NODES, Types._FeatureModel, 0);
		public static final ExecutorProperty _FeatureModel__relations = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.FEATURE_MODEL__RELATIONS, Types._FeatureModel, 1);
		public static final ExecutorProperty _FeatureModel__pnpl__featuremodel = new ExecutorPropertyWithImplementation("pnpl", Types._FeatureModel, 2, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.PNPL__FEATUREMODEL));

		public static final ExecutorProperty _Node__abstract = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.NODE__ABSTRACT, Types._Node, 0);
		public static final ExecutorProperty _Node__exclude = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.NODE__EXCLUDE, Types._Node, 1);
		public static final ExecutorProperty _Node__mandatory = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.NODE__MANDATORY, Types._Node, 2);
		public static final ExecutorProperty _Node__name = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.NODE__NAME, Types._Node, 3);
		public static final ExecutorProperty _Node__requires = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.NODE__REQUIRES, Types._Node, 4);
		public static final ExecutorProperty _Node__root = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.NODE__ROOT, Types._Node, 5);
		public static final ExecutorProperty _Node__Feature__feature = new ExecutorPropertyWithImplementation("Feature", Types._Node, 6, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.FEATURE__FEATURE));
		public static final ExecutorProperty _Node__FeatureModel__nodes = new ExecutorPropertyWithImplementation("FeatureModel", Types._Node, 7, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.FEATURE_MODEL__NODES));
		public static final ExecutorProperty _Node__Node__exclude = new ExecutorPropertyWithImplementation("Node", Types._Node, 8, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.NODE__EXCLUDE));
		public static final ExecutorProperty _Node__Node__requires = new ExecutorPropertyWithImplementation("Node", Types._Node, 9, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.NODE__REQUIRES));
		public static final ExecutorProperty _Node__Relation__childs = new ExecutorPropertyWithImplementation("Relation", Types._Node, 10, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.RELATION__CHILDS));
		public static final ExecutorProperty _Node__Relation__parent = new ExecutorPropertyWithImplementation("Relation", Types._Node, 11, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.RELATION__PARENT));

		public static final ExecutorProperty _PetriNet__elements = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.PETRI_NET__ELEMENTS, Types._PetriNet, 0);
		public static final ExecutorProperty _PetriNet__pnpl__pn_150 = new ExecutorPropertyWithImplementation("pnpl", Types._PetriNet, 1, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.PNPL__PN_150));

		public static final ExecutorProperty _Place__tokens = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.PLACE__TOKENS, Types._Place, 0);
		public static final ExecutorProperty _Place__ArcPT__source = new ExecutorPropertyWithImplementation("ArcPT", Types._Place, 1, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.ARC_PT__SOURCE));
		public static final ExecutorProperty _Place__ArcTP__target = new ExecutorPropertyWithImplementation("ArcTP", Types._Place, 2, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.ARC_TP__TARGET));

		public static final ExecutorProperty _PresenceCondition__expression = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.PRESENCE_CONDITION__EXPRESSION, Types._PresenceCondition, 0);
		public static final ExecutorProperty _PresenceCondition__id = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.PRESENCE_CONDITION__ID, Types._PresenceCondition, 1);
		public static final ExecutorProperty _PresenceCondition__Element__presenceCondition = new ExecutorPropertyWithImplementation("Element", Types._PresenceCondition, 2, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.ELEMENT__PRESENCE_CONDITION));
		public static final ExecutorProperty _PresenceCondition__pnpl__presenceconditions = new ExecutorPropertyWithImplementation("pnpl", Types._PresenceCondition, 3, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.PNPL__PRESENCECONDITIONS));

		public static final ExecutorProperty _Relation__childs = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.RELATION__CHILDS, Types._Relation, 0);
		public static final ExecutorProperty _Relation__parent = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.RELATION__PARENT, Types._Relation, 1);
		public static final ExecutorProperty _Relation__type = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.RELATION__TYPE, Types._Relation, 2);
		public static final ExecutorProperty _Relation__FeatureModel__relations = new ExecutorPropertyWithImplementation("FeatureModel", Types._Relation, 3, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.FEATURE_MODEL__RELATIONS));

		public static final ExecutorProperty _Transition__ArcPT__target = new ExecutorPropertyWithImplementation("ArcPT", Types._Transition, 0, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.ARC_PT__TARGET));
		public static final ExecutorProperty _Transition__ArcTP__source = new ExecutorPropertyWithImplementation("ArcTP", Types._Transition, 1, new EcoreLibraryOppositeProperty(Pnpl_variabilityPackage.Literals.ARC_TP__SOURCE));

		public static final ExecutorProperty _UnaryExpression__operator = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.UNARY_EXPRESSION__OPERATOR, Types._UnaryExpression, 0);
		public static final ExecutorProperty _UnaryExpression__right = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.UNARY_EXPRESSION__RIGHT, Types._UnaryExpression, 1);

		public static final ExecutorProperty _pnpl__featuremodel = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.PNPL__FEATUREMODEL, Types._pnpl, 0);
		public static final ExecutorProperty _pnpl__pn_150 = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.PNPL__PN_150, Types._pnpl, 1);
		public static final ExecutorProperty _pnpl__presenceconditions = new EcoreExecutorProperty(Pnpl_variabilityPackage.Literals.PNPL__PRESENCECONDITIONS, Types._pnpl, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Arc =
			{
				Fragments._Arc__OclAny /* 0 */,
				Fragments._Arc__OclElement /* 1 */,
				Fragments._Arc__Element /* 2 */,
				Fragments._Arc__Arc /* 3 */
			};
		private static final int /*@NonNull*/ [] __Arc = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ArcPT =
			{
				Fragments._ArcPT__OclAny /* 0 */,
				Fragments._ArcPT__OclElement /* 1 */,
				Fragments._ArcPT__Element /* 2 */,
				Fragments._ArcPT__Arc /* 3 */,
				Fragments._ArcPT__ArcPT /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArcPT = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ArcTP =
			{
				Fragments._ArcTP__OclAny /* 0 */,
				Fragments._ArcTP__OclElement /* 1 */,
				Fragments._ArcTP__Element /* 2 */,
				Fragments._ArcTP__Arc /* 3 */,
				Fragments._ArcTP__ArcTP /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArcTP = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BinaryExpression =
			{
				Fragments._BinaryExpression__OclAny /* 0 */,
				Fragments._BinaryExpression__OclElement /* 1 */,
				Fragments._BinaryExpression__Expression /* 2 */,
				Fragments._BinaryExpression__BinaryExpression /* 3 */
			};
		private static final int /*@NonNull*/ [] __BinaryExpression = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BinaryOperator =
			{
				Fragments._BinaryOperator__OclAny /* 0 */,
				Fragments._BinaryOperator__OclElement /* 1 */,
				Fragments._BinaryOperator__OclType /* 2 */,
				Fragments._BinaryOperator__OclEnumeration /* 3 */,
				Fragments._BinaryOperator__BinaryOperator /* 4 */
			};
		private static final int /*@NonNull*/ [] __BinaryOperator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Element =
			{
				Fragments._Element__OclAny /* 0 */,
				Fragments._Element__OclElement /* 1 */,
				Fragments._Element__Element /* 2 */
			};
		private static final int /*@NonNull*/ [] __Element = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Expression =
			{
				Fragments._Expression__OclAny /* 0 */,
				Fragments._Expression__OclElement /* 1 */,
				Fragments._Expression__Expression /* 2 */
			};
		private static final int /*@NonNull*/ [] __Expression = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Feature =
			{
				Fragments._Feature__OclAny /* 0 */,
				Fragments._Feature__OclElement /* 1 */,
				Fragments._Feature__Expression /* 2 */,
				Fragments._Feature__Feature /* 3 */
			};
		private static final int /*@NonNull*/ [] __Feature = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FeatureModel =
			{
				Fragments._FeatureModel__OclAny /* 0 */,
				Fragments._FeatureModel__OclElement /* 1 */,
				Fragments._FeatureModel__FeatureModel /* 2 */
			};
		private static final int /*@NonNull*/ [] __FeatureModel = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Node =
			{
				Fragments._Node__OclAny /* 0 */,
				Fragments._Node__OclElement /* 1 */,
				Fragments._Node__Node /* 2 */
			};
		private static final int /*@NonNull*/ [] __Node = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PetriNet =
			{
				Fragments._PetriNet__OclAny /* 0 */,
				Fragments._PetriNet__OclElement /* 1 */,
				Fragments._PetriNet__PetriNet /* 2 */
			};
		private static final int /*@NonNull*/ [] __PetriNet = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Place =
			{
				Fragments._Place__OclAny /* 0 */,
				Fragments._Place__OclElement /* 1 */,
				Fragments._Place__Element /* 2 */,
				Fragments._Place__Place /* 3 */
			};
		private static final int /*@NonNull*/ [] __Place = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PresenceCondition =
			{
				Fragments._PresenceCondition__OclAny /* 0 */,
				Fragments._PresenceCondition__OclElement /* 1 */,
				Fragments._PresenceCondition__PresenceCondition /* 2 */
			};
		private static final int /*@NonNull*/ [] __PresenceCondition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Relation =
			{
				Fragments._Relation__OclAny /* 0 */,
				Fragments._Relation__OclElement /* 1 */,
				Fragments._Relation__Relation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Relation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RelationType =
			{
				Fragments._RelationType__OclAny /* 0 */,
				Fragments._RelationType__OclElement /* 1 */,
				Fragments._RelationType__OclType /* 2 */,
				Fragments._RelationType__OclEnumeration /* 3 */,
				Fragments._RelationType__RelationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __RelationType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__Element /* 2 */,
				Fragments._Transition__Transition /* 3 */
			};
		private static final int /*@NonNull*/ [] __Transition = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UnaryExpression =
			{
				Fragments._UnaryExpression__OclAny /* 0 */,
				Fragments._UnaryExpression__OclElement /* 1 */,
				Fragments._UnaryExpression__Expression /* 2 */,
				Fragments._UnaryExpression__UnaryExpression /* 3 */
			};
		private static final int /*@NonNull*/ [] __UnaryExpression = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UnaryOperator =
			{
				Fragments._UnaryOperator__OclAny /* 0 */,
				Fragments._UnaryOperator__OclElement /* 1 */,
				Fragments._UnaryOperator__OclType /* 2 */,
				Fragments._UnaryOperator__OclEnumeration /* 3 */,
				Fragments._UnaryOperator__UnaryOperator /* 4 */
			};
		private static final int /*@NonNull*/ [] __UnaryOperator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _pnpl =
			{
				Fragments._pnpl__OclAny /* 0 */,
				Fragments._pnpl__OclElement /* 1 */,
				Fragments._pnpl__pnpl /* 2 */
			};
		private static final int /*@NonNull*/ [] __pnpl = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Arc.initFragments(_Arc, __Arc);
			Types._ArcPT.initFragments(_ArcPT, __ArcPT);
			Types._ArcTP.initFragments(_ArcTP, __ArcTP);
			Types._BinaryExpression.initFragments(_BinaryExpression, __BinaryExpression);
			Types._BinaryOperator.initFragments(_BinaryOperator, __BinaryOperator);
			Types._Element.initFragments(_Element, __Element);
			Types._Expression.initFragments(_Expression, __Expression);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._FeatureModel.initFragments(_FeatureModel, __FeatureModel);
			Types._Node.initFragments(_Node, __Node);
			Types._PetriNet.initFragments(_PetriNet, __PetriNet);
			Types._Place.initFragments(_Place, __Place);
			Types._PresenceCondition.initFragments(_PresenceCondition, __PresenceCondition);
			Types._Relation.initFragments(_Relation, __Relation);
			Types._RelationType.initFragments(_RelationType, __RelationType);
			Types._Transition.initFragments(_Transition, __Transition);
			Types._UnaryExpression.initFragments(_UnaryExpression, __UnaryExpression);
			Types._UnaryOperator.initFragments(_UnaryOperator, __UnaryOperator);
			Types._pnpl.initFragments(_pnpl, __pnpl);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Arc__Arc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Arc__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Arc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Arc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ArcPT__ArcPT = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcPT__Arc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcPT__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcPT__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcPT__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ArcTP__ArcTP = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcTP__Arc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcTP__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcTP__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcTP__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BinaryExpression__BinaryExpression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryExpression__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BinaryOperator__BinaryOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryOperator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryOperator__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryOperator__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryOperator__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Element__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Expression__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Feature__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FeatureModel__FeatureModel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureModel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Node__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PetriNet__PetriNet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PetriNet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PetriNet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Place__Place = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Place__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Place__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Place__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PresenceCondition__PresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Relation__Relation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Relation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Relation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RelationType__RelationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Transition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UnaryExpression__UnaryExpression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryExpression__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UnaryOperator__UnaryOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryOperator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryOperator__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryOperator__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryOperator__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _pnpl__pnpl = {};
		private static final ExecutorOperation /*@NonNull*/ [] _pnpl__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _pnpl__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Arc__Arc.initOperations(_Arc__Arc);
			Fragments._Arc__Element.initOperations(_Arc__Element);
			Fragments._Arc__OclAny.initOperations(_Arc__OclAny);
			Fragments._Arc__OclElement.initOperations(_Arc__OclElement);

			Fragments._ArcPT__Arc.initOperations(_ArcPT__Arc);
			Fragments._ArcPT__ArcPT.initOperations(_ArcPT__ArcPT);
			Fragments._ArcPT__Element.initOperations(_ArcPT__Element);
			Fragments._ArcPT__OclAny.initOperations(_ArcPT__OclAny);
			Fragments._ArcPT__OclElement.initOperations(_ArcPT__OclElement);

			Fragments._ArcTP__Arc.initOperations(_ArcTP__Arc);
			Fragments._ArcTP__ArcTP.initOperations(_ArcTP__ArcTP);
			Fragments._ArcTP__Element.initOperations(_ArcTP__Element);
			Fragments._ArcTP__OclAny.initOperations(_ArcTP__OclAny);
			Fragments._ArcTP__OclElement.initOperations(_ArcTP__OclElement);

			Fragments._BinaryExpression__BinaryExpression.initOperations(_BinaryExpression__BinaryExpression);
			Fragments._BinaryExpression__Expression.initOperations(_BinaryExpression__Expression);
			Fragments._BinaryExpression__OclAny.initOperations(_BinaryExpression__OclAny);
			Fragments._BinaryExpression__OclElement.initOperations(_BinaryExpression__OclElement);

			Fragments._BinaryOperator__BinaryOperator.initOperations(_BinaryOperator__BinaryOperator);
			Fragments._BinaryOperator__OclAny.initOperations(_BinaryOperator__OclAny);
			Fragments._BinaryOperator__OclElement.initOperations(_BinaryOperator__OclElement);
			Fragments._BinaryOperator__OclEnumeration.initOperations(_BinaryOperator__OclEnumeration);
			Fragments._BinaryOperator__OclType.initOperations(_BinaryOperator__OclType);

			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._Expression__Expression.initOperations(_Expression__Expression);
			Fragments._Expression__OclAny.initOperations(_Expression__OclAny);
			Fragments._Expression__OclElement.initOperations(_Expression__OclElement);

			Fragments._Feature__Expression.initOperations(_Feature__Expression);
			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);

			Fragments._FeatureModel__FeatureModel.initOperations(_FeatureModel__FeatureModel);
			Fragments._FeatureModel__OclAny.initOperations(_FeatureModel__OclAny);
			Fragments._FeatureModel__OclElement.initOperations(_FeatureModel__OclElement);

			Fragments._Node__Node.initOperations(_Node__Node);
			Fragments._Node__OclAny.initOperations(_Node__OclAny);
			Fragments._Node__OclElement.initOperations(_Node__OclElement);

			Fragments._PetriNet__OclAny.initOperations(_PetriNet__OclAny);
			Fragments._PetriNet__OclElement.initOperations(_PetriNet__OclElement);
			Fragments._PetriNet__PetriNet.initOperations(_PetriNet__PetriNet);

			Fragments._Place__Element.initOperations(_Place__Element);
			Fragments._Place__OclAny.initOperations(_Place__OclAny);
			Fragments._Place__OclElement.initOperations(_Place__OclElement);
			Fragments._Place__Place.initOperations(_Place__Place);

			Fragments._PresenceCondition__OclAny.initOperations(_PresenceCondition__OclAny);
			Fragments._PresenceCondition__OclElement.initOperations(_PresenceCondition__OclElement);
			Fragments._PresenceCondition__PresenceCondition.initOperations(_PresenceCondition__PresenceCondition);

			Fragments._Relation__OclAny.initOperations(_Relation__OclAny);
			Fragments._Relation__OclElement.initOperations(_Relation__OclElement);
			Fragments._Relation__Relation.initOperations(_Relation__Relation);

			Fragments._RelationType__OclAny.initOperations(_RelationType__OclAny);
			Fragments._RelationType__OclElement.initOperations(_RelationType__OclElement);
			Fragments._RelationType__OclEnumeration.initOperations(_RelationType__OclEnumeration);
			Fragments._RelationType__OclType.initOperations(_RelationType__OclType);
			Fragments._RelationType__RelationType.initOperations(_RelationType__RelationType);

			Fragments._Transition__Element.initOperations(_Transition__Element);
			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Fragments._UnaryExpression__Expression.initOperations(_UnaryExpression__Expression);
			Fragments._UnaryExpression__OclAny.initOperations(_UnaryExpression__OclAny);
			Fragments._UnaryExpression__OclElement.initOperations(_UnaryExpression__OclElement);
			Fragments._UnaryExpression__UnaryExpression.initOperations(_UnaryExpression__UnaryExpression);

			Fragments._UnaryOperator__OclAny.initOperations(_UnaryOperator__OclAny);
			Fragments._UnaryOperator__OclElement.initOperations(_UnaryOperator__OclElement);
			Fragments._UnaryOperator__OclEnumeration.initOperations(_UnaryOperator__OclEnumeration);
			Fragments._UnaryOperator__OclType.initOperations(_UnaryOperator__OclType);
			Fragments._UnaryOperator__UnaryOperator.initOperations(_UnaryOperator__UnaryOperator);

			Fragments._pnpl__OclAny.initOperations(_pnpl__OclAny);
			Fragments._pnpl__OclElement.initOperations(_pnpl__OclElement);
			Fragments._pnpl__pnpl.initOperations(_pnpl__pnpl);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Arc = {
			Pnpl_variabilityTables.Properties._Element__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Element__presenceCondition,
			Pnpl_variabilityTables.Properties._Arc__weight
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ArcPT = {
			Pnpl_variabilityTables.Properties._Element__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Element__presenceCondition,
			Pnpl_variabilityTables.Properties._ArcPT__source,
			Pnpl_variabilityTables.Properties._ArcPT__target,
			Pnpl_variabilityTables.Properties._Arc__weight
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ArcTP = {
			Pnpl_variabilityTables.Properties._Element__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Element__presenceCondition,
			Pnpl_variabilityTables.Properties._ArcTP__source,
			Pnpl_variabilityTables.Properties._ArcTP__target,
			Pnpl_variabilityTables.Properties._Arc__weight
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BinaryExpression = {
			Pnpl_variabilityTables.Properties._BinaryExpression__left,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._BinaryExpression__operator,
			Pnpl_variabilityTables.Properties._BinaryExpression__right
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BinaryOperator = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Element = {
			Pnpl_variabilityTables.Properties._Element__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Element__presenceCondition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Expression = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Feature = {
			Pnpl_variabilityTables.Properties._Feature__feature,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FeatureModel = {
			Pnpl_variabilityTables.Properties._FeatureModel__nodes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._FeatureModel__relations
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Node = {
			Pnpl_variabilityTables.Properties._Node__abstract,
			Pnpl_variabilityTables.Properties._Node__exclude,
			Pnpl_variabilityTables.Properties._Node__mandatory,
			Pnpl_variabilityTables.Properties._Node__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Node__requires,
			Pnpl_variabilityTables.Properties._Node__root
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PetriNet = {
			Pnpl_variabilityTables.Properties._PetriNet__elements,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Place = {
			Pnpl_variabilityTables.Properties._Element__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Element__presenceCondition,
			Pnpl_variabilityTables.Properties._Place__tokens
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PresenceCondition = {
			Pnpl_variabilityTables.Properties._PresenceCondition__expression,
			Pnpl_variabilityTables.Properties._PresenceCondition__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Relation = {
			Pnpl_variabilityTables.Properties._Relation__childs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Relation__parent,
			Pnpl_variabilityTables.Properties._Relation__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RelationType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Transition = {
			Pnpl_variabilityTables.Properties._Element__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._Element__presenceCondition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UnaryExpression = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._UnaryExpression__operator,
			Pnpl_variabilityTables.Properties._UnaryExpression__right
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UnaryOperator = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _pnpl = {
			Pnpl_variabilityTables.Properties._pnpl__featuremodel,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Pnpl_variabilityTables.Properties._pnpl__pn_150,
			Pnpl_variabilityTables.Properties._pnpl__presenceconditions
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Arc__Arc.initProperties(_Arc);
			Fragments._ArcPT__ArcPT.initProperties(_ArcPT);
			Fragments._ArcTP__ArcTP.initProperties(_ArcTP);
			Fragments._BinaryExpression__BinaryExpression.initProperties(_BinaryExpression);
			Fragments._BinaryOperator__BinaryOperator.initProperties(_BinaryOperator);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._Expression__Expression.initProperties(_Expression);
			Fragments._Feature__Feature.initProperties(_Feature);
			Fragments._FeatureModel__FeatureModel.initProperties(_FeatureModel);
			Fragments._Node__Node.initProperties(_Node);
			Fragments._PetriNet__PetriNet.initProperties(_PetriNet);
			Fragments._Place__Place.initProperties(_Place);
			Fragments._PresenceCondition__PresenceCondition.initProperties(_PresenceCondition);
			Fragments._Relation__Relation.initProperties(_Relation);
			Fragments._RelationType__RelationType.initProperties(_RelationType);
			Fragments._Transition__Transition.initProperties(_Transition);
			Fragments._UnaryExpression__UnaryExpression.initProperties(_UnaryExpression);
			Fragments._UnaryOperator__UnaryOperator.initProperties(_UnaryOperator);
			Fragments._pnpl__pnpl.initProperties(_pnpl);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _BinaryOperator__AND = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.BINARY_OPERATOR.getEEnumLiteral("AND"), Types._BinaryOperator, 0);
		public static final EcoreExecutorEnumerationLiteral _BinaryOperator__OR = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.BINARY_OPERATOR.getEEnumLiteral("OR"), Types._BinaryOperator, 1);
		public static final EcoreExecutorEnumerationLiteral _BinaryOperator__XOR = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.BINARY_OPERATOR.getEEnumLiteral("XOR"), Types._BinaryOperator, 2);
		public static final EcoreExecutorEnumerationLiteral _BinaryOperator__IFF = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.BINARY_OPERATOR.getEEnumLiteral("IFF"), Types._BinaryOperator, 3);
		public static final EcoreExecutorEnumerationLiteral _BinaryOperator__IMPLIES = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.BINARY_OPERATOR.getEEnumLiteral("IMPLIES"), Types._BinaryOperator, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _BinaryOperator = {
			_BinaryOperator__AND,
			_BinaryOperator__OR,
			_BinaryOperator__XOR,
			_BinaryOperator__IFF,
			_BinaryOperator__IMPLIES
		};

		public static final EcoreExecutorEnumerationLiteral _RelationType__DEFAULT = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.RELATION_TYPE.getEEnumLiteral("DEFAULT"), Types._RelationType, 0);
		public static final EcoreExecutorEnumerationLiteral _RelationType__OR = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.RELATION_TYPE.getEEnumLiteral("OR"), Types._RelationType, 1);
		public static final EcoreExecutorEnumerationLiteral _RelationType__ALTERNATIVE = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.RELATION_TYPE.getEEnumLiteral("ALTERNATIVE"), Types._RelationType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _RelationType = {
			_RelationType__DEFAULT,
			_RelationType__OR,
			_RelationType__ALTERNATIVE
		};

		public static final EcoreExecutorEnumerationLiteral _UnaryOperator__NOT = new EcoreExecutorEnumerationLiteral(Pnpl_variabilityPackage.Literals.UNARY_OPERATOR.getEEnumLiteral("NOT"), Types._UnaryOperator, 0);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _UnaryOperator = {
			_UnaryOperator__NOT
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._BinaryOperator.initLiterals(_BinaryOperator);
			Types._RelationType.initLiterals(_RelationType);
			Types._UnaryOperator.initLiterals(_UnaryOperator);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Pnpl_variabilityTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Pnpl_variabilityTables();
	}

	private Pnpl_variabilityTables() {
		super(Pnpl_variabilityPackage.eNS_URI);
	}
}
