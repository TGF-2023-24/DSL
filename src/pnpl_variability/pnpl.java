/**
 */
package pnpl_variability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pnpl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pnpl_variability.pnpl#getPn_150 <em>Pn 150</em>}</li>
 *   <li>{@link pnpl_variability.pnpl#getFeaturemodel <em>Featuremodel</em>}</li>
 *   <li>{@link pnpl_variability.pnpl#getPresenceconditions <em>Presenceconditions</em>}</li>
 * </ul>
 *
 * @see pnpl_variability.Pnpl_variabilityPackage#getpnpl()
 * @model
 * @generated
 */
public interface pnpl extends EObject {
	/**
	 * Returns the value of the '<em><b>Pn 150</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pn 150</em>' containment reference.
	 * @see #setPn_150(PetriNet)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getpnpl_Pn_150()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PetriNet getPn_150();

	/**
	 * Sets the value of the '{@link pnpl_variability.pnpl#getPn_150 <em>Pn 150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pn 150</em>' containment reference.
	 * @see #getPn_150()
	 * @generated
	 */
	void setPn_150(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Featuremodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuremodel</em>' containment reference.
	 * @see #setFeaturemodel(FeatureModel)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getpnpl_Featuremodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureModel getFeaturemodel();

	/**
	 * Sets the value of the '{@link pnpl_variability.pnpl#getFeaturemodel <em>Featuremodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuremodel</em>' containment reference.
	 * @see #getFeaturemodel()
	 * @generated
	 */
	void setFeaturemodel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Presenceconditions</b></em>' containment reference list.
	 * The list contents are of type {@link pnpl_variability.PresenceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presenceconditions</em>' containment reference list.
	 * @see pnpl_variability.Pnpl_variabilityPackage#getpnpl_Presenceconditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PresenceCondition> getPresenceconditions();

} // pnpl
