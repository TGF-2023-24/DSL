/**
 */
package pnpl_variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc TP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pnpl_variability.ArcTP#getSource <em>Source</em>}</li>
 *   <li>{@link pnpl_variability.ArcTP#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see pnpl_variability.Pnpl_variabilityPackage#getArcTP()
 * @model
 * @generated
 */
public interface ArcTP extends Arc {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Transition)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getArcTP_Source()
	 * @model required="true"
	 * @generated
	 */
	Transition getSource();

	/**
	 * Sets the value of the '{@link pnpl_variability.ArcTP#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Transition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Place)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getArcTP_Target()
	 * @model required="true"
	 * @generated
	 */
	Place getTarget();

	/**
	 * Sets the value of the '{@link pnpl_variability.ArcTP#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Place value);

} // ArcTP
