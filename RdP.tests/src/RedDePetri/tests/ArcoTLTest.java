/**
 */
package RedDePetri.tests;

import RedDePetri.ArcoTL;
import RedDePetri.RedDePetriFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arco TL</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcoTLTest extends ArcoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArcoTLTest.class);
	}

	/**
	 * Constructs a new Arco TL test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcoTLTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arco TL test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArcoTL getFixture() {
		return (ArcoTL)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RedDePetriFactory.eINSTANCE.createArcoTL());
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

} //ArcoTLTest
