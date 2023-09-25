/**
 */
package RedDePetri.impl;

import RedDePetri.Arco;
import RedDePetri.ArcoLT;
import RedDePetri.ArcoTL;
import RedDePetri.Lugar;
import RedDePetri.RdP;
import RedDePetri.RedDePetriFactory;
import RedDePetri.RedDePetriPackage;
import RedDePetri.Transicion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedDePetriPackageImpl extends EPackageImpl implements RedDePetriPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lugarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcoTLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcoLTEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RedDePetri.RedDePetriPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RedDePetriPackageImpl() {
		super(eNS_URI, RedDePetriFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RedDePetriPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RedDePetriPackage init() {
		if (isInited) return (RedDePetriPackage)EPackage.Registry.INSTANCE.getEPackage(RedDePetriPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRedDePetriPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RedDePetriPackageImpl theRedDePetriPackage = registeredRedDePetriPackage instanceof RedDePetriPackageImpl ? (RedDePetriPackageImpl)registeredRedDePetriPackage : new RedDePetriPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRedDePetriPackage.createPackageContents();

		// Initialize created meta-data
		theRedDePetriPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRedDePetriPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RedDePetriPackage.eNS_URI, theRedDePetriPackage);
		return theRedDePetriPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdP() {
		return rdPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdP_Transiciones() {
		return (EReference)rdPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdP_Lugares() {
		return (EReference)rdPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdP_Arcos() {
		return (EReference)rdPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLugar() {
		return lugarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLugar_Name() {
		return (EAttribute)lugarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLugar_Marca() {
		return (EAttribute)lugarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransicion() {
		return transicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransicion_Name() {
		return (EAttribute)transicionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArco() {
		return arcoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArco_Peso() {
		return (EAttribute)arcoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcoTL() {
		return arcoTLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcoTL_Origen() {
		return (EReference)arcoTLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcoTL_Destino() {
		return (EReference)arcoTLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcoLT() {
		return arcoLTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcoLT_Origen() {
		return (EReference)arcoLTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArcoLT_Destino() {
		return (EReference)arcoLTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedDePetriFactory getRedDePetriFactory() {
		return (RedDePetriFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rdPEClass = createEClass(RD_P);
		createEReference(rdPEClass, RD_P__TRANSICIONES);
		createEReference(rdPEClass, RD_P__LUGARES);
		createEReference(rdPEClass, RD_P__ARCOS);

		lugarEClass = createEClass(LUGAR);
		createEAttribute(lugarEClass, LUGAR__NAME);
		createEAttribute(lugarEClass, LUGAR__MARCA);

		transicionEClass = createEClass(TRANSICION);
		createEAttribute(transicionEClass, TRANSICION__NAME);

		arcoEClass = createEClass(ARCO);
		createEAttribute(arcoEClass, ARCO__PESO);

		arcoTLEClass = createEClass(ARCO_TL);
		createEReference(arcoTLEClass, ARCO_TL__ORIGEN);
		createEReference(arcoTLEClass, ARCO_TL__DESTINO);

		arcoLTEClass = createEClass(ARCO_LT);
		createEReference(arcoLTEClass, ARCO_LT__ORIGEN);
		createEReference(arcoLTEClass, ARCO_LT__DESTINO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arcoTLEClass.getESuperTypes().add(this.getArco());
		arcoLTEClass.getESuperTypes().add(this.getArco());

		// Initialize classes, features, and operations; add parameters
		initEClass(rdPEClass, RdP.class, "RdP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdP_Transiciones(), this.getTransicion(), null, "transiciones", null, 1, -1, RdP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdP_Lugares(), this.getLugar(), null, "lugares", null, 1, -1, RdP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdP_Arcos(), this.getArco(), null, "arcos", null, 1, -1, RdP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lugarEClass, Lugar.class, "Lugar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLugar_Name(), ecorePackage.getEString(), "name", null, 1, 1, Lugar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLugar_Marca(), ecorePackage.getEInt(), "marca", null, 1, 1, Lugar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transicionEClass, Transicion.class, "Transicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransicion_Name(), ecorePackage.getEString(), "name", null, 1, 1, Transicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcoEClass, Arco.class, "Arco", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArco_Peso(), ecorePackage.getEInt(), "peso", null, 1, 1, Arco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcoTLEClass, ArcoTL.class, "ArcoTL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcoTL_Origen(), this.getTransicion(), null, "origen", null, 1, 1, ArcoTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcoTL_Destino(), this.getLugar(), null, "destino", null, 1, 1, ArcoTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcoLTEClass, ArcoLT.class, "ArcoLT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArcoLT_Origen(), this.getLugar(), null, "origen", null, 1, 1, ArcoLT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcoLT_Destino(), this.getTransicion(), null, "destino", null, 1, 1, ArcoLT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RedDePetriPackageImpl
