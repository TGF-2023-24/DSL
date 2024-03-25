/**
 */
package pnpl_variability;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pnpl_variability.Relation#getParent <em>Parent</em>}</li>
 *   <li>{@link pnpl_variability.Relation#getChilds <em>Childs</em>}</li>
 *   <li>{@link pnpl_variability.Relation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pnpl_variability.Pnpl_variabilityPackage#getRelation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constraint12'"
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Node)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getRelation_Parent()
	 * @model required="true"
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link pnpl_variability.Relation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' reference list.
	 * The list contents are of type {@link pnpl_variability.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' reference list.
	 * @see pnpl_variability.Pnpl_variabilityPackage#getRelation_Childs()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getChilds();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pnpl_variability.RelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pnpl_variability.RelationType
	 * @see #setType(RelationType)
	 * @see pnpl_variability.Pnpl_variabilityPackage#getRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	RelationType getType();

	/**
	 * Sets the value of the '{@link pnpl_variability.Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pnpl_variability.RelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type = RelationType::DEFAULT or self.childs -&gt; forAll(child | child.mandatory = false)'"
	 * @generated
	 */
	boolean constraint1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.childs -&gt; excludes(self.parent)'"
	 * @generated
	 */
	boolean constraint2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.childs -&gt; forAll(child | child.requires -&gt; includes(self.parent))'"
	 * @generated
	 */
	boolean constraint6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.childs -&gt; forAll(child | self.parent.requires -&gt; forAll(p | child.requires -&gt; includes(p)))'"
	 * @generated
	 */
	boolean constraint7(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.childs -&gt; forAll(child | child.mandatory = true implies self.childs -&gt; forAll(c | c &lt;&gt; child implies c.requires -&gt; includes(child)))'"
	 * @generated
	 */
	boolean constraint8(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type = RelationType::ALTERNATIVE implies self.childs -&gt; forAll(child | self.childs -&gt; forAll(c | c &lt;&gt; child implies c.exclude -&gt; includes(child)))'"
	 * @generated
	 */
	boolean constraint9(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.childs -&gt; forAll(child | child.root = false)'"
	 * @generated
	 */
	boolean constraint12(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Relation
