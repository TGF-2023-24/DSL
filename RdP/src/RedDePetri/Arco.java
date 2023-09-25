/**
 */
package RedDePetri;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arco</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RedDePetri.Arco#getPeso <em>Peso</em>}</li>
 * </ul>
 *
 * @see RedDePetri.RedDePetriPackage#getArco()
 * @model
 * @generated
 */
public interface Arco extends EObject {
	/**
	 * Returns the value of the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso</em>' attribute.
	 * @see #setPeso(int)
	 * @see RedDePetri.RedDePetriPackage#getArco_Peso()
	 * @model required="true"
	 * @generated
	 */
	int getPeso();

	/**
	 * Sets the value of the '{@link RedDePetri.Arco#getPeso <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso</em>' attribute.
	 * @see #getPeso()
	 * @generated
	 */
	void setPeso(int value);

} // Arco
