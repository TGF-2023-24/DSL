/**
 */
package Pnplv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.FeatureModel#getFormula <em>Formula</em>}</li>
 *   <li>{@link Pnplv.FeatureModel#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see Pnplv.PnplvPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(Operand)
	 * @see Pnplv.PnplvPackage#getFeatureModel_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getFormula();

	/**
	 * Sets the value of the '{@link Pnplv.FeatureModel#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(Operand value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link Pnplv.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see Pnplv.PnplvPackage#getFeatureModel_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureModel
