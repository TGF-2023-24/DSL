/**
 */
package Pnplv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.Unary#getRight <em>Right</em>}</li>
 *   <li>{@link Pnplv.Unary#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getUnary()
 * @model
 * @generated
 */
public interface Unary extends Operand {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Operand)
	 * @see Pnplv.PnplvPackage#getUnary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getRight();

	/**
	 * Sets the value of the '{@link Pnplv.Unary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Operand value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link Pnplv.UnEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see Pnplv.UnEnum
	 * @see #setOp(UnEnum)
	 * @see Pnplv.PnplvPackage#getUnary_Op()
	 * @model required="true"
	 * @generated
	 */
	UnEnum getOp();

	/**
	 * Sets the value of the '{@link Pnplv.Unary#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see Pnplv.UnEnum
	 * @see #getOp()
	 * @generated
	 */
	void setOp(UnEnum value);

} // Unary
