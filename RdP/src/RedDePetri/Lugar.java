/**
 */
package RedDePetri;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lugar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RedDePetri.Lugar#getName <em>Name</em>}</li>
 *   <li>{@link RedDePetri.Lugar#getMarca <em>Marca</em>}</li>
 * </ul>
 *
 * @see RedDePetri.RedDePetriPackage#getLugar()
 * @model
 * @generated
 */
public interface Lugar extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RedDePetri.RedDePetriPackage#getLugar_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RedDePetri.Lugar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marca</em>' attribute.
	 * @see #setMarca(int)
	 * @see RedDePetri.RedDePetriPackage#getLugar_Marca()
	 * @model required="true"
	 * @generated
	 */
	int getMarca();

	/**
	 * Sets the value of the '{@link RedDePetri.Lugar#getMarca <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marca</em>' attribute.
	 * @see #getMarca()
	 * @generated
	 */
	void setMarca(int value);

} // Lugar
