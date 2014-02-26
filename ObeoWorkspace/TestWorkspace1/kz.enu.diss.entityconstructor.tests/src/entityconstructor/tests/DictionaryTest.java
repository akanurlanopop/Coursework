/**
 */
package entityconstructor.tests;

import entityconstructor.Dictionary;
import entityconstructor.EntityconstructorFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DictionaryTest extends TestCase {

	/**
	 * The fixture for this Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dictionary fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DictionaryTest.class);
	}

	/**
	 * Constructs a new Dictionary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dictionary fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dictionary getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityconstructorFactory.eINSTANCE.createDictionary());
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

} //DictionaryTest
