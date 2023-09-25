/**
 */
package RedDePetri;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RedDePetri.RedDePetriPackage
 * @generated
 */
public interface RedDePetriFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedDePetriFactory eINSTANCE = RedDePetri.impl.RedDePetriFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rd P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rd P</em>'.
	 * @generated
	 */
	RdP createRdP();

	/**
	 * Returns a new object of class '<em>Lugar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lugar</em>'.
	 * @generated
	 */
	Lugar createLugar();

	/**
	 * Returns a new object of class '<em>Transicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transicion</em>'.
	 * @generated
	 */
	Transicion createTransicion();

	/**
	 * Returns a new object of class '<em>Arco</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arco</em>'.
	 * @generated
	 */
	Arco createArco();

	/**
	 * Returns a new object of class '<em>Arco TL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arco TL</em>'.
	 * @generated
	 */
	ArcoTL createArcoTL();

	/**
	 * Returns a new object of class '<em>Arco LT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arco LT</em>'.
	 * @generated
	 */
	ArcoLT createArcoLT();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RedDePetriPackage getRedDePetriPackage();

} //RedDePetriFactory
