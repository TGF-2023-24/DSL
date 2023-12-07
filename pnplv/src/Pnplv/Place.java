/**
 */
package Pnplv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.Place#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Element {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see Pnplv.PnplvPackage#getPlace_Tokens()
	 * @model required="true"
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link Pnplv.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

} // Place
