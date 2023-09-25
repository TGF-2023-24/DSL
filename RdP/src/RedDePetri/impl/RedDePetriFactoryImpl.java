/**
 */
package RedDePetri.impl;

import RedDePetri.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedDePetriFactoryImpl extends EFactoryImpl implements RedDePetriFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RedDePetriFactory init() {
		try {
			RedDePetriFactory theRedDePetriFactory = (RedDePetriFactory)EPackage.Registry.INSTANCE.getEFactory(RedDePetriPackage.eNS_URI);
			if (theRedDePetriFactory != null) {
				return theRedDePetriFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RedDePetriFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedDePetriFactoryImpl() {
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
			case RedDePetriPackage.RD_P: return createRdP();
			case RedDePetriPackage.LUGAR: return createLugar();
			case RedDePetriPackage.TRANSICION: return createTransicion();
			case RedDePetriPackage.ARCO: return createArco();
			case RedDePetriPackage.ARCO_TL: return createArcoTL();
			case RedDePetriPackage.ARCO_LT: return createArcoLT();
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
	public RdP createRdP() {
		RdPImpl rdP = new RdPImpl();
		return rdP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lugar createLugar() {
		LugarImpl lugar = new LugarImpl();
		return lugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transicion createTransicion() {
		TransicionImpl transicion = new TransicionImpl();
		return transicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arco createArco() {
		ArcoImpl arco = new ArcoImpl();
		return arco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcoTL createArcoTL() {
		ArcoTLImpl arcoTL = new ArcoTLImpl();
		return arcoTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcoLT createArcoLT() {
		ArcoLTImpl arcoLT = new ArcoLTImpl();
		return arcoLT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedDePetriPackage getRedDePetriPackage() {
		return (RedDePetriPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RedDePetriPackage getPackage() {
		return RedDePetriPackage.eINSTANCE;
	}

} //RedDePetriFactoryImpl
