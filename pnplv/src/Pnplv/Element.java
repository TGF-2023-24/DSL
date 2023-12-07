/**
 */
package Pnplv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.Element#getPresencecondition <em>Presencecondition</em>}</li>
 *   <li>{@link Pnplv.Element#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Presencecondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presencecondition</em>' reference.
	 * @see #setPresencecondition(PresenceCondition)
	 * @see Pnplv.PnplvPackage#getElement_Presencecondition()
	 * @model required="true"
	 * @generated
	 */
	PresenceCondition getPresencecondition();

	/**
	 * Sets the value of the '{@link Pnplv.Element#getPresencecondition <em>Presencecondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presencecondition</em>' reference.
	 * @see #getPresencecondition()
	 * @generated
	 */
	void setPresencecondition(PresenceCondition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Pnplv.PnplvPackage#getElement_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Pnplv.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Element
