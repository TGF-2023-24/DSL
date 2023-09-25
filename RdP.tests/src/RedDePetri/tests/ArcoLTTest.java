/**
 */
package RedDePetri.tests;

import RedDePetri.ArcoLT;
import RedDePetri.RedDePetriFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arco LT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcoLTTest extends ArcoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArcoLTTest.class);
	}

	/**
	 * Constructs a new Arco LT test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcoLTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arco LT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArcoLT getFixture() {
		return (ArcoLT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RedDePetriFactory.eINSTANCE.createArcoLT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ArcoLTTest
