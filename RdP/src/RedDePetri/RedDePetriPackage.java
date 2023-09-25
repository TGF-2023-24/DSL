/**
 */
package RedDePetri;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RedDePetri.RedDePetriFactory
 * @model kind="package"
 * @generated
 */
public interface RedDePetriPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RedDePetri";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://RedDePetri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RedDePetri";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedDePetriPackage eINSTANCE = RedDePetri.impl.RedDePetriPackageImpl.init();

	/**
	 * The meta object id for the '{@link RedDePetri.impl.RdPImpl <em>Rd P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RedDePetri.impl.RdPImpl
	 * @see RedDePetri.impl.RedDePetriPackageImpl#getRdP()
	 * @generated
	 */
	int RD_P = 0;

	/**
	 * The feature id for the '<em><b>Transiciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RD_P__TRANSICIONES = 0;

	/**
	 * The feature id for the '<em><b>Lugares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RD_P__LUGARES = 1;

	/**
	 * The feature id for the '<em><b>Arcos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RD_P__ARCOS = 2;

	/**
	 * The number of structural features of the '<em>Rd P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RD_P_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rd P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RD_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RedDePetri.impl.LugarImpl <em>Lugar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RedDePetri.impl.LugarImpl
	 * @see RedDePetri.impl.RedDePetriPackageImpl#getLugar()
	 * @generated
	 */
	int LUGAR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGAR__MARCA = 1;

	/**
	 * The number of structural features of the '<em>Lugar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lugar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RedDePetri.impl.TransicionImpl <em>Transicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RedDePetri.impl.TransicionImpl
	 * @see RedDePetri.impl.RedDePetriPackageImpl#getTransicion()
	 * @generated
	 */
	int TRANSICION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Transicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RedDePetri.impl.ArcoImpl <em>Arco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RedDePetri.impl.ArcoImpl
	 * @see RedDePetri.impl.RedDePetriPackageImpl#getArco()
	 * @generated
	 */
	int ARCO = 3;

	/**
	 * The feature id for the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__PESO = 0;

	/**
	 * The number of structural features of the '<em>Arco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RedDePetri.impl.ArcoTLImpl <em>Arco TL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RedDePetri.impl.ArcoTLImpl
	 * @see RedDePetri.impl.RedDePetriPackageImpl#getArcoTL()
	 * @generated
	 */
	int ARCO_TL = 4;

	/**
	 * The feature id for the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_TL__PESO = ARCO__PESO;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_TL__ORIGEN = ARCO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_TL__DESTINO = ARCO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arco TL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_TL_FEATURE_COUNT = ARCO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arco TL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_TL_OPERATION_COUNT = ARCO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RedDePetri.impl.ArcoLTImpl <em>Arco LT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RedDePetri.impl.ArcoLTImpl
	 * @see RedDePetri.impl.RedDePetriPackageImpl#getArcoLT()
	 * @generated
	 */
	int ARCO_LT = 5;

	/**
	 * The feature id for the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_LT__PESO = ARCO__PESO;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_LT__ORIGEN = ARCO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_LT__DESTINO = ARCO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arco LT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_LT_FEATURE_COUNT = ARCO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arco LT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_LT_OPERATION_COUNT = ARCO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link RedDePetri.RdP <em>Rd P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rd P</em>'.
	 * @see RedDePetri.RdP
	 * @generated
	 */
	EClass getRdP();

	/**
	 * Returns the meta object for the containment reference list '{@link RedDePetri.RdP#getTransiciones <em>Transiciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transiciones</em>'.
	 * @see RedDePetri.RdP#getTransiciones()
	 * @see #getRdP()
	 * @generated
	 */
	EReference getRdP_Transiciones();

	/**
	 * Returns the meta object for the containment reference list '{@link RedDePetri.RdP#getLugares <em>Lugares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lugares</em>'.
	 * @see RedDePetri.RdP#getLugares()
	 * @see #getRdP()
	 * @generated
	 */
	EReference getRdP_Lugares();

	/**
	 * Returns the meta object for the containment reference list '{@link RedDePetri.RdP#getArcos <em>Arcos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcos</em>'.
	 * @see RedDePetri.RdP#getArcos()
	 * @see #getRdP()
	 * @generated
	 */
	EReference getRdP_Arcos();

	/**
	 * Returns the meta object for class '{@link RedDePetri.Lugar <em>Lugar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lugar</em>'.
	 * @see RedDePetri.Lugar
	 * @generated
	 */
	EClass getLugar();

	/**
	 * Returns the meta object for the attribute '{@link RedDePetri.Lugar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RedDePetri.Lugar#getName()
	 * @see #getLugar()
	 * @generated
	 */
	EAttribute getLugar_Name();

	/**
	 * Returns the meta object for the attribute '{@link RedDePetri.Lugar#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see RedDePetri.Lugar#getMarca()
	 * @see #getLugar()
	 * @generated
	 */
	EAttribute getLugar_Marca();

	/**
	 * Returns the meta object for class '{@link RedDePetri.Transicion <em>Transicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transicion</em>'.
	 * @see RedDePetri.Transicion
	 * @generated
	 */
	EClass getTransicion();

	/**
	 * Returns the meta object for the attribute '{@link RedDePetri.Transicion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RedDePetri.Transicion#getName()
	 * @see #getTransicion()
	 * @generated
	 */
	EAttribute getTransicion_Name();

	/**
	 * Returns the meta object for class '{@link RedDePetri.Arco <em>Arco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arco</em>'.
	 * @see RedDePetri.Arco
	 * @generated
	 */
	EClass getArco();

	/**
	 * Returns the meta object for the attribute '{@link RedDePetri.Arco#getPeso <em>Peso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso</em>'.
	 * @see RedDePetri.Arco#getPeso()
	 * @see #getArco()
	 * @generated
	 */
	EAttribute getArco_Peso();

	/**
	 * Returns the meta object for class '{@link RedDePetri.ArcoTL <em>Arco TL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arco TL</em>'.
	 * @see RedDePetri.ArcoTL
	 * @generated
	 */
	EClass getArcoTL();

	/**
	 * Returns the meta object for the reference '{@link RedDePetri.ArcoTL#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see RedDePetri.ArcoTL#getOrigen()
	 * @see #getArcoTL()
	 * @generated
	 */
	EReference getArcoTL_Origen();

	/**
	 * Returns the meta object for the reference '{@link RedDePetri.ArcoTL#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see RedDePetri.ArcoTL#getDestino()
	 * @see #getArcoTL()
	 * @generated
	 */
	EReference getArcoTL_Destino();

	/**
	 * Returns the meta object for class '{@link RedDePetri.ArcoLT <em>Arco LT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arco LT</em>'.
	 * @see RedDePetri.ArcoLT
	 * @generated
	 */
	EClass getArcoLT();

	/**
	 * Returns the meta object for the reference '{@link RedDePetri.ArcoLT#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see RedDePetri.ArcoLT#getOrigen()
	 * @see #getArcoLT()
	 * @generated
	 */
	EReference getArcoLT_Origen();

	/**
	 * Returns the meta object for the reference '{@link RedDePetri.ArcoLT#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see RedDePetri.ArcoLT#getDestino()
	 * @see #getArcoLT()
	 * @generated
	 */
	EReference getArcoLT_Destino();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RedDePetriFactory getRedDePetriFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RedDePetri.impl.RdPImpl <em>Rd P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RedDePetri.impl.RdPImpl
		 * @see RedDePetri.impl.RedDePetriPackageImpl#getRdP()
		 * @generated
		 */
		EClass RD_P = eINSTANCE.getRdP();

		/**
		 * The meta object literal for the '<em><b>Transiciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RD_P__TRANSICIONES = eINSTANCE.getRdP_Transiciones();

		/**
		 * The meta object literal for the '<em><b>Lugares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RD_P__LUGARES = eINSTANCE.getRdP_Lugares();

		/**
		 * The meta object literal for the '<em><b>Arcos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RD_P__ARCOS = eINSTANCE.getRdP_Arcos();

		/**
		 * The meta object literal for the '{@link RedDePetri.impl.LugarImpl <em>Lugar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RedDePetri.impl.LugarImpl
		 * @see RedDePetri.impl.RedDePetriPackageImpl#getLugar()
		 * @generated
		 */
		EClass LUGAR = eINSTANCE.getLugar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGAR__NAME = eINSTANCE.getLugar_Name();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGAR__MARCA = eINSTANCE.getLugar_Marca();

		/**
		 * The meta object literal for the '{@link RedDePetri.impl.TransicionImpl <em>Transicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RedDePetri.impl.TransicionImpl
		 * @see RedDePetri.impl.RedDePetriPackageImpl#getTransicion()
		 * @generated
		 */
		EClass TRANSICION = eINSTANCE.getTransicion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSICION__NAME = eINSTANCE.getTransicion_Name();

		/**
		 * The meta object literal for the '{@link RedDePetri.impl.ArcoImpl <em>Arco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RedDePetri.impl.ArcoImpl
		 * @see RedDePetri.impl.RedDePetriPackageImpl#getArco()
		 * @generated
		 */
		EClass ARCO = eINSTANCE.getArco();

		/**
		 * The meta object literal for the '<em><b>Peso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCO__PESO = eINSTANCE.getArco_Peso();

		/**
		 * The meta object literal for the '{@link RedDePetri.impl.ArcoTLImpl <em>Arco TL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RedDePetri.impl.ArcoTLImpl
		 * @see RedDePetri.impl.RedDePetriPackageImpl#getArcoTL()
		 * @generated
		 */
		EClass ARCO_TL = eINSTANCE.getArcoTL();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO_TL__ORIGEN = eINSTANCE.getArcoTL_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO_TL__DESTINO = eINSTANCE.getArcoTL_Destino();

		/**
		 * The meta object literal for the '{@link RedDePetri.impl.ArcoLTImpl <em>Arco LT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RedDePetri.impl.ArcoLTImpl
		 * @see RedDePetri.impl.RedDePetriPackageImpl#getArcoLT()
		 * @generated
		 */
		EClass ARCO_LT = eINSTANCE.getArcoLT();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO_LT__ORIGEN = eINSTANCE.getArcoLT_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO_LT__DESTINO = eINSTANCE.getArcoLT_Destino();

	}

} //RedDePetriPackage
