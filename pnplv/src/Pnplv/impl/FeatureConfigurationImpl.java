/**
 */
package Pnplv.impl;

import Pnplv.FeatureConfiguration;
import Pnplv.FeatureModel;
import Pnplv.Pn;
import Pnplv.PnplvPackage;
import Pnplv.PresenceCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Pnplv.impl.FeatureConfigurationImpl#getPn_150 <em>Pn 150</em>}</li>
 *   <li>{@link Pnplv.impl.FeatureConfigurationImpl#getFeaturemodel <em>Featuremodel</em>}</li>
 *   <li>{@link Pnplv.impl.FeatureConfigurationImpl#getPresencecondition <em>Presencecondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureConfigurationImpl extends MinimalEObjectImpl.Container implements FeatureConfiguration {
	/**
	 * The cached value of the '{@link #getPn_150() <em>Pn 150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPn_150()
	 * @generated
	 * @ordered
	 */
	protected Pn pn_150;

	/**
	 * The cached value of the '{@link #getFeaturemodel() <em>Featuremodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturemodel()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel featuremodel;

	/**
	 * The cached value of the '{@link #getPresencecondition() <em>Presencecondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresencecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<PresenceCondition> presencecondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnplvPackage.Literals.FEATURE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pn getPn_150() {
		return pn_150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPn_150(Pn newPn_150, NotificationChain msgs) {
		Pn oldPn_150 = pn_150;
		pn_150 = newPn_150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnplvPackage.FEATURE_CONFIGURATION__PN_150, oldPn_150, newPn_150);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPn_150(Pn newPn_150) {
		if (newPn_150 != pn_150) {
			NotificationChain msgs = null;
			if (pn_150 != null)
				msgs = ((InternalEObject)pn_150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnplvPackage.FEATURE_CONFIGURATION__PN_150, null, msgs);
			if (newPn_150 != null)
				msgs = ((InternalEObject)newPn_150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnplvPackage.FEATURE_CONFIGURATION__PN_150, null, msgs);
			msgs = basicSetPn_150(newPn_150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnplvPackage.FEATURE_CONFIGURATION__PN_150, newPn_150, newPn_150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureModel getFeaturemodel() {
		return featuremodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturemodel(FeatureModel newFeaturemodel, NotificationChain msgs) {
		FeatureModel oldFeaturemodel = featuremodel;
		featuremodel = newFeaturemodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL, oldFeaturemodel, newFeaturemodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturemodel(FeatureModel newFeaturemodel) {
		if (newFeaturemodel != featuremodel) {
			NotificationChain msgs = null;
			if (featuremodel != null)
				msgs = ((InternalEObject)featuremodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL, null, msgs);
			if (newFeaturemodel != null)
				msgs = ((InternalEObject)newFeaturemodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL, null, msgs);
			msgs = basicSetFeaturemodel(newFeaturemodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL, newFeaturemodel, newFeaturemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PresenceCondition> getPresencecondition() {
		if (presencecondition == null) {
			presencecondition = new EObjectContainmentEList<PresenceCondition>(PresenceCondition.class, this, PnplvPackage.FEATURE_CONFIGURATION__PRESENCECONDITION);
		}
		return presencecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnplvPackage.FEATURE_CONFIGURATION__PN_150:
				return basicSetPn_150(null, msgs);
			case PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL:
				return basicSetFeaturemodel(null, msgs);
			case PnplvPackage.FEATURE_CONFIGURATION__PRESENCECONDITION:
				return ((InternalEList<?>)getPresencecondition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PnplvPackage.FEATURE_CONFIGURATION__PN_150:
				return getPn_150();
			case PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL:
				return getFeaturemodel();
			case PnplvPackage.FEATURE_CONFIGURATION__PRESENCECONDITION:
				return getPresencecondition();
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
			case PnplvPackage.FEATURE_CONFIGURATION__PN_150:
				setPn_150((Pn)newValue);
				return;
			case PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL:
				setFeaturemodel((FeatureModel)newValue);
				return;
			case PnplvPackage.FEATURE_CONFIGURATION__PRESENCECONDITION:
				getPresencecondition().clear();
				getPresencecondition().addAll((Collection<? extends PresenceCondition>)newValue);
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
			case PnplvPackage.FEATURE_CONFIGURATION__PN_150:
				setPn_150((Pn)null);
				return;
			case PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL:
				setFeaturemodel((FeatureModel)null);
				return;
			case PnplvPackage.FEATURE_CONFIGURATION__PRESENCECONDITION:
				getPresencecondition().clear();
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
			case PnplvPackage.FEATURE_CONFIGURATION__PN_150:
				return pn_150 != null;
			case PnplvPackage.FEATURE_CONFIGURATION__FEATUREMODEL:
				return featuremodel != null;
			case PnplvPackage.FEATURE_CONFIGURATION__PRESENCECONDITION:
				return presencecondition != null && !presencecondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureConfigurationImpl
