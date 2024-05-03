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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import pnpl_variability.Node;
import pnpl_variability.Pnpl_variabilityPackage;
import pnpl_variability.Pnpl_variabilityTables;
import pnpl_variability.Relation;
import pnpl_variability.RelationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pnpl_variability.impl.RelationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link pnpl_variability.impl.RelationImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link pnpl_variability.impl.RelationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Node parent;

	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> childs;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationType TYPE_EDEFAULT = RelationType.DEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pnpl_variabilityPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Node)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Pnpl_variabilityPackage.RELATION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Node newParent) {
		Node oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pnpl_variabilityPackage.RELATION__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getChilds() {
		if (childs == null) {
			childs = new EObjectResolvingEList<Node>(Node.class, this, Pnpl_variabilityPackage.RELATION__CHILDS);
		}
		return childs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(RelationType newType) {
		RelationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pnpl_variabilityPackage.RELATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relation::constraint1";
		try {
			/**
			 *
			 * inv constraint1:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type = RelationType::DEFAULT or
			 *         self.childs->forAll(child | child.mandatory = false)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.RELATION___CONSTRAINT1__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ RelationType type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Pnpl_variabilityTables.ENUMid_RelationType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == Pnpl_variabilityTables.ELITid_DEFAULT;
					final /*@Thrown*/ Boolean result;
					if (eq) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Node> childs = this.getChilds();
						final /*@NonInvalid*/ OrderedSetValue BOXED_childs = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, childs);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_child = BOXED_childs.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_child.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Node child = (Node)ITERATOR_child.next();
							/**
							 * child.mandatory = false
							 */
							final /*@NonInvalid*/ boolean mandatory = child.isMandatory();
							final /*@NonInvalid*/ boolean eq_0 = !mandatory;
							//
							if (!eq_0) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (eq_0) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Pnpl_variabilityTables.INT_0).booleanValue();
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
	public boolean constraint2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relation::constraint2";
		try {
			/**
			 *
			 * inv constraint2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.childs->excludes(self.parent)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.RELATION___CONSTRAINT2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Node> childs = this.getChilds();
				final /*@NonInvalid*/ OrderedSetValue BOXED_childs = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, childs);
				final /*@NonInvalid*/ Node parent = this.getParent();
				final /*@NonInvalid*/ boolean result = CollectionExcludesOperation.INSTANCE.evaluate(BOXED_childs, parent).booleanValue();
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
	public boolean constraint6(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relation::constraint6";
		try {
			/**
			 *
			 * inv constraint6:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.childs->forAll(child |
			 *           child.requires->includes(self.parent))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.RELATION___CONSTRAINT6__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Node> childs = this.getChilds();
				final /*@NonInvalid*/ OrderedSetValue BOXED_childs = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, childs);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_child = BOXED_childs.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_child.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Node child = (Node)ITERATOR_child.next();
					/**
					 * child.requires->includes(self.parent)
					 */
					final /*@NonInvalid*/ List<Node> requires = child.getRequires();
					final /*@NonInvalid*/ OrderedSetValue BOXED_requires = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, requires);
					final /*@NonInvalid*/ Node parent = this.getParent();
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_requires, parent).booleanValue();
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
	public boolean constraint7(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relation::constraint7";
		try {
			/**
			 *
			 * inv constraint7:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.childs->forAll(child |
			 *           self.parent.requires->forAll(p | child.requires->includes(p)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.RELATION___CONSTRAINT7__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Node> childs = this.getChilds();
					final /*@NonInvalid*/ OrderedSetValue BOXED_childs = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, childs);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_child = BOXED_childs.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_child.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Node child = (Node)ITERATOR_child.next();
						/**
						 *
						 * self.parent.requires->forAll(p | child.requires->includes(p))
						 */
						final /*@NonInvalid*/ Node parent = this.getParent();
						final /*@NonInvalid*/ List<Node> requires = parent.getRequires();
						final /*@NonInvalid*/ OrderedSetValue BOXED_requires = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, requires);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_p = BOXED_requires.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_p.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Node p = (Node)ITERATOR_p.next();
							/**
							 * child.requires->includes(p)
							 */
							final /*@NonInvalid*/ List<Node> requires_0 = child.getRequires();
							final /*@NonInvalid*/ OrderedSetValue BOXED_requires_0 = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, requires_0);
							final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_requires_0, p).booleanValue();
							//
							if (!includes) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (includes) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						//
						if (forAll == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (forAll == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (forAll == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Pnpl_variabilityTables.INT_0).booleanValue();
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
	public boolean constraint8(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relation::constraint8";
		try {
			/**
			 *
			 * inv constraint8:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.childs->forAll(child | child.mandatory = true implies
			 *           self.childs->forAll(c | c <> child implies
			 *             c.requires->includes(child)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.RELATION___CONSTRAINT8__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Node> childs = this.getChilds();
					final /*@NonInvalid*/ OrderedSetValue BOXED_childs = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, childs);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_child = BOXED_childs.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_child.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Node child = (Node)ITERATOR_child.next();
						/**
						 * child.mandatory = true implies
						 * self.childs->forAll(c | c <> child implies c.requires->includes(child))
						 */
						/*@Caught*/ Object CAUGHT_implies_0;
						try {
							final /*@NonInvalid*/ boolean mandatory = child.isMandatory();
							final /*@Thrown*/ Boolean implies_0;
							if (!mandatory) {
								implies_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_forAll;
								try {
									/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
									Iterator<Object> ITERATOR_c = BOXED_childs.iterator();
									/*@Thrown*/ Boolean forAll;
									while (true) {
										if (!ITERATOR_c.hasNext()) {
											if (accumulator_0 == null) {
												forAll = null;
											}
											else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												forAll = ValueUtil.TRUE_VALUE;
											}
											else {
												throw (InvalidValueException)accumulator_0;
											}
											break;
										}
										/*@NonInvalid*/ Node c = (Node)ITERATOR_c.next();
										/**
										 * c <> child implies c.requires->includes(child)
										 */
										final /*@NonInvalid*/ boolean ne = !c.equals(child);
										final /*@NonInvalid*/ Boolean implies;
										if (!ne) {
											implies = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ List<Node> requires = c.getRequires();
											final /*@NonInvalid*/ OrderedSetValue BOXED_requires = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, requires);
											final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_requires, child).booleanValue();
											if (includes) {
												implies = ValueUtil.TRUE_VALUE;
											}
											else {
												implies = ValueUtil.FALSE_VALUE;
											}
										}
										//
										if (implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
											forAll = ValueUtil.FALSE_VALUE;
											break;														// Stop immediately
										}
										else if (implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
											;															// Carry on
										}
										else if (implies == null) {								// Abnormal null body evaluation result
											if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												accumulator_0 = null;										// Cache a null failure
											}
										}
										else {															// Impossible badly typed result
											accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
										}
									}
									CAUGHT_forAll = forAll;
								}
								catch (Exception e) {
									CAUGHT_forAll = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
									implies_0 = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_forAll instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_forAll;
									}
									if (CAUGHT_forAll == null) {
										implies_0 = null;
									}
									else {
										implies_0 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies_0 = implies_0;
						}
						catch (Exception e) {
							CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_implies_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_implies_0 == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_implies_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_implies_0;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Pnpl_variabilityTables.INT_0).booleanValue();
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
	public boolean constraint9(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relation::constraint9";
		try {
			/**
			 *
			 * inv constraint9:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type = RelationType::ALTERNATIVE implies
			 *         self.childs->forAll(child |
			 *           self.childs->forAll(c | c <> child implies
			 *             c.exclude->includes(child)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.RELATION___CONSTRAINT9__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ RelationType type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Pnpl_variabilityTables.ENUMid_RelationType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == Pnpl_variabilityTables.ELITid_ALTERNATIVE;
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<Node> childs = this.getChilds();
							final /*@NonInvalid*/ OrderedSetValue BOXED_childs = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, childs);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_child = BOXED_childs.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_child.hasNext()) {
									if (accumulator == null) {
										forAll = null;
									}
									else if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator;
									}
									break;
								}
								/*@NonInvalid*/ Node child = (Node)ITERATOR_child.next();
								/**
								 * self.childs->forAll(c | c <> child implies c.exclude->includes(child))
								 */
								/*@Caught*/ Object CAUGHT_forAll_0;
								try {
									/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
									Iterator<Object> ITERATOR_c = BOXED_childs.iterator();
									/*@Thrown*/ Boolean forAll_0;
									while (true) {
										if (!ITERATOR_c.hasNext()) {
											if (accumulator_0 == null) {
												forAll_0 = null;
											}
											else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												forAll_0 = ValueUtil.TRUE_VALUE;
											}
											else {
												throw (InvalidValueException)accumulator_0;
											}
											break;
										}
										/*@NonInvalid*/ Node c = (Node)ITERATOR_c.next();
										/**
										 * c <> child implies c.exclude->includes(child)
										 */
										final /*@NonInvalid*/ boolean ne = !c.equals(child);
										final /*@NonInvalid*/ Boolean implies;
										if (!ne) {
											implies = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ List<Node> exclude = c.getExclude();
											final /*@NonInvalid*/ OrderedSetValue BOXED_exclude = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, exclude);
											final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_exclude, child).booleanValue();
											if (includes) {
												implies = ValueUtil.TRUE_VALUE;
											}
											else {
												implies = ValueUtil.FALSE_VALUE;
											}
										}
										//
										if (implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
											forAll_0 = ValueUtil.FALSE_VALUE;
											break;														// Stop immediately
										}
										else if (implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
											;															// Carry on
										}
										else if (implies == null) {								// Abnormal null body evaluation result
											if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												accumulator_0 = null;										// Cache a null failure
											}
										}
										else {															// Impossible badly typed result
											accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
										}
									}
									CAUGHT_forAll_0 = forAll_0;
								}
								catch (Exception e) {
									CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (CAUGHT_forAll_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else if (CAUGHT_forAll_0 == null) {								// Abnormal null body evaluation result
									if (accumulator == ValueUtil.TRUE_VALUE) {
										accumulator = null;										// Cache a null failure
									}
								}
								else if (CAUGHT_forAll_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
									accumulator = CAUGHT_forAll_0;									// Cache an exception failure
								}
								else {															// Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_forAll;
							}
							if (CAUGHT_forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Pnpl_variabilityTables.INT_0).booleanValue();
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
	public boolean constraint12(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relation::constraint12";
		try {
			/**
			 *
			 * inv constraint12:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.childs->forAll(child | child.root = false)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Pnpl_variabilityPackage.Literals.RELATION___CONSTRAINT12__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Pnpl_variabilityTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Node> childs = this.getChilds();
				final /*@NonInvalid*/ OrderedSetValue BOXED_childs = idResolver.createOrderedSetOfAll(Pnpl_variabilityTables.ORD_CLSSid_Node, childs);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_child = BOXED_childs.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_child.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Node child = (Node)ITERATOR_child.next();
					/**
					 * child.root = false
					 */
					final /*@NonInvalid*/ boolean root = child.isRoot();
					final /*@NonInvalid*/ boolean eq = !root;
					//
					if (!eq) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (eq) {				// Normal successful body evaluation result
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
			case Pnpl_variabilityPackage.RELATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case Pnpl_variabilityPackage.RELATION__CHILDS:
				return getChilds();
			case Pnpl_variabilityPackage.RELATION__TYPE:
				return getType();
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
			case Pnpl_variabilityPackage.RELATION__PARENT:
				setParent((Node)newValue);
				return;
			case Pnpl_variabilityPackage.RELATION__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection<? extends Node>)newValue);
				return;
			case Pnpl_variabilityPackage.RELATION__TYPE:
				setType((RelationType)newValue);
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
			case Pnpl_variabilityPackage.RELATION__PARENT:
				setParent((Node)null);
				return;
			case Pnpl_variabilityPackage.RELATION__CHILDS:
				getChilds().clear();
				return;
			case Pnpl_variabilityPackage.RELATION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Pnpl_variabilityPackage.RELATION__PARENT:
				return parent != null;
			case Pnpl_variabilityPackage.RELATION__CHILDS:
				return childs != null && !childs.isEmpty();
			case Pnpl_variabilityPackage.RELATION__TYPE:
				return type != TYPE_EDEFAULT;
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
			case Pnpl_variabilityPackage.RELATION___CONSTRAINT1__DIAGNOSTICCHAIN_MAP:
				return constraint1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.RELATION___CONSTRAINT2__DIAGNOSTICCHAIN_MAP:
				return constraint2((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.RELATION___CONSTRAINT6__DIAGNOSTICCHAIN_MAP:
				return constraint6((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.RELATION___CONSTRAINT7__DIAGNOSTICCHAIN_MAP:
				return constraint7((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.RELATION___CONSTRAINT8__DIAGNOSTICCHAIN_MAP:
				return constraint8((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.RELATION___CONSTRAINT9__DIAGNOSTICCHAIN_MAP:
				return constraint9((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Pnpl_variabilityPackage.RELATION___CONSTRAINT12__DIAGNOSTICCHAIN_MAP:
				return constraint12((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
