/**
 */
package Pnplv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.PresenceCondition#getId <em>Id</em>}</li>
 *   <li>{@link Pnplv.PresenceCondition#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getPresenceCondition()
 * @model
 * @generated
 */
public interface PresenceCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Pnplv.PnplvPackage#getPresenceCondition_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Pnplv.PresenceCondition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(Operand)
	 * @see Pnplv.PnplvPackage#getPresenceCondition_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getFormula();

	/**
	 * Sets the value of the '{@link Pnplv.PresenceCondition#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(Operand value);

} // PresenceCondition
