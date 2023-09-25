/**
 */
package RedDePetri;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rd P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RedDePetri.RdP#getTransiciones <em>Transiciones</em>}</li>
 *   <li>{@link RedDePetri.RdP#getLugares <em>Lugares</em>}</li>
 *   <li>{@link RedDePetri.RdP#getArcos <em>Arcos</em>}</li>
 * </ul>
 *
 * @see RedDePetri.RedDePetriPackage#getRdP()
 * @model
 * @generated
 */
public interface RdP extends EObject {
	/**
	 * Returns the value of the '<em><b>Transiciones</b></em>' containment reference list.
	 * The list contents are of type {@link RedDePetri.Transicion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transiciones</em>' containment reference list.
	 * @see RedDePetri.RedDePetriPackage#getRdP_Transiciones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transicion> getTransiciones();

	/**
	 * Returns the value of the '<em><b>Lugares</b></em>' containment reference list.
	 * The list contents are of type {@link RedDePetri.Lugar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lugares</em>' containment reference list.
	 * @see RedDePetri.RedDePetriPackage#getRdP_Lugares()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Lugar> getLugares();

	/**
	 * Returns the value of the '<em><b>Arcos</b></em>' containment reference list.
	 * The list contents are of type {@link RedDePetri.Arco}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcos</em>' containment reference list.
	 * @see RedDePetri.RedDePetriPackage#getRdP_Arcos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Arco> getArcos();

} // RdP
