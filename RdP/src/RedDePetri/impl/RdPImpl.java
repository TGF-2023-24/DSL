/**
 */
package RedDePetri.impl;

import RedDePetri.Arco;
import RedDePetri.Lugar;
import RedDePetri.RdP;
import RedDePetri.RedDePetriPackage;
import RedDePetri.Transicion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rd P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RedDePetri.impl.RdPImpl#getTransiciones <em>Transiciones</em>}</li>
 *   <li>{@link RedDePetri.impl.RdPImpl#getLugares <em>Lugares</em>}</li>
 *   <li>{@link RedDePetri.impl.RdPImpl#getArcos <em>Arcos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdPImpl extends MinimalEObjectImpl.Container implements RdP {
	/**
	 * The cached value of the '{@link #getTransiciones() <em>Transiciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransiciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Transicion> transiciones;

	/**
	 * The cached value of the '{@link #getLugares() <em>Lugares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugares()
	 * @generated
	 * @ordered
	 */
	protected EList<Lugar> lugares;

	/**
	 * The cached value of the '{@link #getArcos() <em>Arcos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcos()
	 * @generated
	 * @ordered
	 */
	protected EList<Arco> arcos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedDePetriPackage.Literals.RD_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transicion> getTransiciones() {
		if (transiciones == null) {
			transiciones = new EObjectContainmentEList<Transicion>(Transicion.class, this, RedDePetriPackage.RD_P__TRANSICIONES);
		}
		return transiciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lugar> getLugares() {
		if (lugares == null) {
			lugares = new EObjectContainmentEList<Lugar>(Lugar.class, this, RedDePetriPackage.RD_P__LUGARES);
		}
		return lugares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arco> getArcos() {
		if (arcos == null) {
			arcos = new EObjectContainmentEList<Arco>(Arco.class, this, RedDePetriPackage.RD_P__ARCOS);
		}
		return arcos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedDePetriPackage.RD_P__TRANSICIONES:
				return ((InternalEList<?>)getTransiciones()).basicRemove(otherEnd, msgs);
			case RedDePetriPackage.RD_P__LUGARES:
				return ((InternalEList<?>)getLugares()).basicRemove(otherEnd, msgs);
			case RedDePetriPackage.RD_P__ARCOS:
				return ((InternalEList<?>)getArcos()).basicRemove(otherEnd, msgs);
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
			case RedDePetriPackage.RD_P__TRANSICIONES:
				return getTransiciones();
			case RedDePetriPackage.RD_P__LUGARES:
				return getLugares();
			case RedDePetriPackage.RD_P__ARCOS:
				return getArcos();
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
			case RedDePetriPackage.RD_P__TRANSICIONES:
				getTransiciones().clear();
				getTransiciones().addAll((Collection<? extends Transicion>)newValue);
				return;
			case RedDePetriPackage.RD_P__LUGARES:
				getLugares().clear();
				getLugares().addAll((Collection<? extends Lugar>)newValue);
				return;
			case RedDePetriPackage.RD_P__ARCOS:
				getArcos().clear();
				getArcos().addAll((Collection<? extends Arco>)newValue);
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
			case RedDePetriPackage.RD_P__TRANSICIONES:
				getTransiciones().clear();
				return;
			case RedDePetriPackage.RD_P__LUGARES:
				getLugares().clear();
				return;
			case RedDePetriPackage.RD_P__ARCOS:
				getArcos().clear();
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
			case RedDePetriPackage.RD_P__TRANSICIONES:
				return transiciones != null && !transiciones.isEmpty();
			case RedDePetriPackage.RD_P__LUGARES:
				return lugares != null && !lugares.isEmpty();
			case RedDePetriPackage.RD_P__ARCOS:
				return arcos != null && !arcos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RdPImpl
