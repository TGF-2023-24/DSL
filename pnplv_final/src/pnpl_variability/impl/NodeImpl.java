/**
 */
package pnpl_variability.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import pnpl_variability.Node;
import pnpl_variability.Pnpl_variabilityPackage;
import pnpl_variability.Pnpl_variabilityTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pnpl_variability.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link pnpl_variability.impl.NodeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link pnpl_variability.impl.NodeImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link pnpl_variability.impl.NodeImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link pnpl_variability.impl.NodeImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link pnpl_variability.impl.NodeImpl#isRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> exclude;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> requires;

	/**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean root = ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pnpl_variabilityPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pnpl_variabilityPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pnpl_variabilityPackage.NODE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pnpl_variabilityPackage.NODE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getExclude() {
		if (exclude == null) {
			exclude = new EObjectResolvingEList<Node>(Node.class, this, Pnpl_variabilityPackage.NODE__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<Node>(Node.class, this, Pnpl_variabilityPackage.NODE__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(boolean newRoot) {
		boolean oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pnpl_variabilityPackage.NODE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint3(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::constraint3";
		try {
			/**
			 *
			 * inv constraint3:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.exclude->forAll(e |
			 *           self.requires->excludes(e))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.NODE___CONSTRAINT3__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Node> exclude = this.getExclude();
				final /*@NonInvalid*/ OrderedSetValue BOXED_exclude = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, exclude);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_e_0 = BOXED_exclude.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Node e_0 = (Node)ITERATOR_e_0.next();
					/**
					 * self.requires->excludes(e)
					 */
					final /*@NonInvalid*/ List<Node> requires = this.getRequires();
					final /*@NonInvalid*/ OrderedSetValue BOXED_requires = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, requires);
					final /*@NonInvalid*/ boolean excludes = CollectionExcludesOperation.INSTANCE.evaluate(BOXED_requires, e_0).booleanValue();
					//
					if (!excludes) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (excludes) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Pnpl_variabilityTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint4(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::constraint4";
		try {
			/**
			 *
			 * inv constraint4:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.exclude->excludes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.NODE___CONSTRAINT4__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Node> exclude = this.getExclude();
				final /*@NonInvalid*/ OrderedSetValue BOXED_exclude = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, exclude);
				final /*@NonInvalid*/ boolean result = CollectionExcludesOperation.INSTANCE.evaluate(BOXED_exclude, this).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Pnpl_variabilityTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint5(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::constraint5";
		try {
			/**
			 *
			 * inv constraint5:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.requires->excludes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.NODE___CONSTRAINT5__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Node> requires = this.getRequires();
				final /*@NonInvalid*/ OrderedSetValue BOXED_requires = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, requires);
				final /*@NonInvalid*/ boolean result = CollectionExcludesOperation.INSTANCE.evaluate(BOXED_requires, this).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Pnpl_variabilityTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint10(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Node::constraint10";
		try {
			/**
			 *
			 * inv constraint10:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.exclude->forAll(e |
			 *           e.exclude->includes(self))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.NODE___CONSTRAINT10__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Node> exclude = this.getExclude();
				final /*@NonInvalid*/ OrderedSetValue BOXED_exclude = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, exclude);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_e_0 = BOXED_exclude.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Node e_0 = (Node)ITERATOR_e_0.next();
					/**
					 * e.exclude->includes(self)
					 */
					final /*@NonInvalid*/ List<Node> exclude_0 = e_0.getExclude();
					final /*@NonInvalid*/ OrderedSetValue BOXED_exclude_0 = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, exclude_0);
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_exclude_0, this).booleanValue();
					//
					if (!includes) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (includes) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Pnpl_variabilityTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pnpl_variabilityPackage.NODE__NAME:
				return getName();
			case Pnpl_variabilityPackage.NODE__ABSTRACT:
				return isAbstract();
			case Pnpl_variabilityPackage.NODE__MANDATORY:
				return isMandatory();
			case Pnpl_variabilityPackage.NODE__EXCLUDE:
				return getExclude();
			case Pnpl_variabilityPackage.NODE__REQUIRES:
				return getRequires();
			case Pnpl_variabilityPackage.NODE__ROOT:
				return isRoot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Pnpl_variabilityPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case Pnpl_variabilityPackage.NODE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case Pnpl_variabilityPackage.NODE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case Pnpl_variabilityPackage.NODE__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends Node>)newValue);
				return;
			case Pnpl_variabilityPackage.NODE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Node>)newValue);
				return;
			case Pnpl_variabilityPackage.NODE__ROOT:
				setRoot((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Pnpl_variabilityPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Pnpl_variabilityPackage.NODE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case Pnpl_variabilityPackage.NODE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case Pnpl_variabilityPackage.NODE__EXCLUDE:
				getExclude().clear();
				return;
			case Pnpl_variabilityPackage.NODE__REQUIRES:
				getRequires().clear();
				return;
			case Pnpl_variabilityPackage.NODE__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Pnpl_variabilityPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Pnpl_variabilityPackage.NODE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case Pnpl_variabilityPackage.NODE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case Pnpl_variabilityPackage.NODE__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case Pnpl_variabilityPackage.NODE__REQUIRES:
				return requires != null && !requires.isEmpty();
			case Pnpl_variabilityPackage.NODE__ROOT:
				return root != ROOT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Pnpl_variabilityPackage.NODE___CONSTRAINT3__DIAGNOSTICCHAIN_MAP:
				return constraint3((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.NODE___CONSTRAINT4__DIAGNOSTICCHAIN_MAP:
				return constraint4((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.NODE___CONSTRAINT5__DIAGNOSTICCHAIN_MAP:
				return constraint5((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.NODE___CONSTRAINT10__DIAGNOSTICCHAIN_MAP:
				return constraint10((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", root: ");
		result.append(root);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
