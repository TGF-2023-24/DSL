/**
 */
package Pnplv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.Pn#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getPn()
 * @model
 * @generated
 */
public interface Pn extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Pnplv.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see Pnplv.PnplvPackage#getPn_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Pn
