/**
 */
package RedDePetri.util;

import RedDePetri.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see RedDePetri.RedDePetriPackage
 * @generated
 */
public class RedDePetriSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RedDePetriPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedDePetriSwitch() {
		if (modelPackage == null) {
			modelPackage = RedDePetriPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RedDePetriPackage.RD_P: {
				RdP rdP = (RdP)theEObject;
				T result = caseRdP(rdP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedDePetriPackage.LUGAR: {
				Lugar lugar = (Lugar)theEObject;
				T result = caseLugar(lugar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedDePetriPackage.TRANSICION: {
				Transicion transicion = (Transicion)theEObject;
				T result = caseTransicion(transicion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedDePetriPackage.ARCO: {
				Arco arco = (Arco)theEObject;
				T result = caseArco(arco);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedDePetriPackage.ARCO_TL: {
				ArcoTL arcoTL = (ArcoTL)theEObject;
				T result = caseArcoTL(arcoTL);
				if (result == null) result = caseArco(arcoTL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedDePetriPackage.ARCO_LT: {
				ArcoLT arcoLT = (ArcoLT)theEObject;
				T result = caseArcoLT(arcoLT);
				if (result == null) result = caseArco(arcoLT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rd P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rd P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdP(RdP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lugar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lugar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLugar(Lugar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransicion(Transicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arco</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arco</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArco(Arco object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arco TL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arco TL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcoTL(ArcoTL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arco LT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arco LT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcoLT(ArcoLT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RedDePetriSwitch
