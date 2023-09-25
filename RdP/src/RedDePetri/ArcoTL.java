/**
 */
package RedDePetri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arco TL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RedDePetri.ArcoTL#getOrigen <em>Origen</em>}</li>
 *   <li>{@link RedDePetri.ArcoTL#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see RedDePetri.RedDePetriPackage#getArcoTL()
 * @model
 * @generated
 */
public interface ArcoTL extends Arco {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Transicion)
	 * @see RedDePetri.RedDePetriPackage#getArcoTL_Origen()
	 * @model required="true"
	 * @generated
	 */
	Transicion getOrigen();

	/**
	 * Sets the value of the '{@link RedDePetri.ArcoTL#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Transicion value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Lugar)
	 * @see RedDePetri.RedDePetriPackage#getArcoTL_Destino()
	 * @model required="true"
	 * @generated
	 */
	Lugar getDestino();

	/**
	 * Sets the value of the '{@link RedDePetri.ArcoTL#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Lugar value);

} // ArcoTL
