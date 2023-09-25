/**
 */
package RedDePetri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arco LT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RedDePetri.ArcoLT#getOrigen <em>Origen</em>}</li>
 *   <li>{@link RedDePetri.ArcoLT#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see RedDePetri.RedDePetriPackage#getArcoLT()
 * @model
 * @generated
 */
public interface ArcoLT extends Arco {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Lugar)
	 * @see RedDePetri.RedDePetriPackage#getArcoLT_Origen()
	 * @model required="true"
	 * @generated
	 */
	Lugar getOrigen();

	/**
	 * Sets the value of the '{@link RedDePetri.ArcoLT#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Lugar value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Transicion)
	 * @see RedDePetri.RedDePetriPackage#getArcoLT_Destino()
	 * @model required="true"
	 * @generated
	 */
	Transicion getDestino();

	/**
	 * Sets the value of the '{@link RedDePetri.ArcoLT#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Transicion value);

} // ArcoLT
