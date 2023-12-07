/**
 */
package Pnplv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.Binary#getLeft <em>Left</em>}</li>
 *   <li>{@link Pnplv.Binary#getOp <em>Op</em>}</li>
 *   <li>{@link Pnplv.Binary#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends Operand {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Operand)
	 * @see Pnplv.PnplvPackage#getBinary_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getLeft();

	/**
	 * Sets the value of the '{@link Pnplv.Binary#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Operand value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link Pnplv.BinEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see Pnplv.BinEnum
	 * @see #setOp(BinEnum)
	 * @see Pnplv.PnplvPackage#getBinary_Op()
	 * @model required="true"
	 * @generated
	 */
	BinEnum getOp();

	/**
	 * Sets the value of the '{@link Pnplv.Binary#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see Pnplv.BinEnum
	 * @see #getOp()
	 * @generated
	 */
	void setOp(BinEnum value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Operand)
	 * @see Pnplv.PnplvPackage#getBinary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getRight();

	/**
	 * Sets the value of the '{@link Pnplv.Binary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Operand value);

} // Binary
