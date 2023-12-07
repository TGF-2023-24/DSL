/**
 */
package Pnplv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.FeatureConfiguration#getPn_150 <em>Pn 150</em>}</li>
 *   <li>{@link Pnplv.FeatureConfiguration#getFeaturemodel <em>Featuremodel</em>}</li>
 *   <li>{@link Pnplv.FeatureConfiguration#getPresencecondition <em>Presencecondition</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getFeatureConfiguration()
 * @model
 * @generated
 */
public interface FeatureConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Pn 150</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pn 150</em>' containment reference.
	 * @see #setPn_150(Pn)
	 * @see Pnplv.PnplvPackage#getFeatureConfiguration_Pn_150()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pn getPn_150();

	/**
	 * Sets the value of the '{@link Pnplv.FeatureConfiguration#getPn_150 <em>Pn 150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pn 150</em>' containment reference.
	 * @see #getPn_150()
	 * @generated
	 */
	void setPn_150(Pn value);

	/**
	 * Returns the value of the '<em><b>Featuremodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuremodel</em>' containment reference.
	 * @see #setFeaturemodel(FeatureModel)
	 * @see Pnplv.PnplvPackage#getFeatureConfiguration_Featuremodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureModel getFeaturemodel();

	/**
	 * Sets the value of the '{@link Pnplv.FeatureConfiguration#getFeaturemodel <em>Featuremodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuremodel</em>' containment reference.
	 * @see #getFeaturemodel()
	 * @generated
	 */
	void setFeaturemodel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Presencecondition</b></em>' containment reference list.
	 * The list contents are of type {@link Pnplv.PresenceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presencecondition</em>' containment reference list.
	 * @see Pnplv.PnplvPackage#getFeatureConfiguration_Presencecondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PresenceCondition> getPresencecondition();

} // FeatureConfiguration
