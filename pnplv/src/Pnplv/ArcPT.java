/**
 */
package Pnplv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc PT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.ArcPT#getSource <em>Source</em>}</li>
 *   <li>{@link Pnplv.ArcPT#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getArcPT()
 * @model
 * @generated
 */
public interface ArcPT extends Arc {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Place)
	 * @see Pnplv.PnplvPackage#getArcPT_Source()
	 * @model required="true"
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link Pnplv.ArcPT#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Place value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Transition)
	 * @see Pnplv.PnplvPackage#getArcPT_Target()
	 * @model required="true"
	 * @generated
	 */
	Transition getTarget();

	/**
	 * Sets the value of the '{@link Pnplv.ArcPT#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Transition value);

} // ArcPT
