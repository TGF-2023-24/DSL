/**
 */
package pnpl_variability;

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
 *   <li>{@link pnpl_variability.Element#getPresenceCondition <em>Presence Condition</em>}</li>
 *   <li>{@link pnpl_variability.Element#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pnpl_variability.Pnpl_variabilityPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Presence Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence Condition</em>' reference.
	 * @see #setPresenceCondition(PresenceCondition)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getElement_PresenceCondition()
	 * @model
	 * @generated
	 */
	PresenceCondition getPresenceCondition();

	/**
	 * Sets the value of the '{@link pnpl_variability.Element#getPresenceCondition <em>Presence Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence Condition</em>' reference.
	 * @see #getPresenceCondition()
	 * @generated
	 */
	void setPresenceCondition(PresenceCondition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getElement_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pnpl_variability.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Element
