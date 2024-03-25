/**
 */
package pnpl_variability;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pnpl_variability.Node#getName <em>Name</em>}</li>
 *   <li>{@link pnpl_variability.Node#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link pnpl_variability.Node#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link pnpl_variability.Node#getExclude <em>Exclude</em>}</li>
 *   <li>{@link pnpl_variability.Node#getRequires <em>Requires</em>}</li>
 *   <li>{@link pnpl_variability.Node#isRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see pnpl_variability.Pnpl_variabilityPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constraint10'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getNode_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pnpl_variability.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getNode_Abstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link pnpl_variability.Node#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getNode_Mandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link pnpl_variability.Node#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' reference list.
	 * The list contents are of type {@link pnpl_variability.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' reference list.
	 * @see pnpl_variability.Pnpl_variabilityPackage#getNode_Exclude()
	 * @model
	 * @generated
	 */
	EList<Node> getExclude();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link pnpl_variability.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see pnpl_variability.Pnpl_variabilityPackage#getNode_Requires()
	 * @model
	 * @generated
	 */
	EList<Node> getRequires();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getNode_Root()
	 * @model required="true"
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link pnpl_variability.Node#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.exclude -&gt; forAll(e | self.requires -&gt; excludes(e))'"
	 * @generated
	 */
	boolean constraint3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.exclude -&gt; excludes(self)'"
	 * @generated
	 */
	boolean constraint4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.requires -&gt; excludes(self)'"
	 * @generated
	 */
	boolean constraint5(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.exclude -&gt; forAll(e | e.exclude -&gt; includes(self))'"
	 * @generated
	 */
	boolean constraint10(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Node
