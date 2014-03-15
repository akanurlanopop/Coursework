/**
 */
package entityconstructor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityconstructor.Card#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link entityconstructor.Card#getName <em>Name</em>}</li>
 *   <li>{@link entityconstructor.Card#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link entityconstructor.Card#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link entityconstructor.Card#getDictionaries <em>Dictionaries</em>}</li>
 *   <li>{@link entityconstructor.Card#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityconstructor.EntityconstructorPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link entityconstructor.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see entityconstructor.EntityconstructorPackage#getCard_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entityconstructor.EntityconstructorPackage#getCard_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entityconstructor.Card#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Child Classes</b></em>' reference list.
	 * The list contents are of type {@link entityconstructor.Card}.
	 * It is bidirectional and its opposite is '{@link entityconstructor.Card#getParentClass <em>Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Classes</em>' reference list.
	 * @see entityconstructor.EntityconstructorPackage#getCard_ChildClasses()
	 * @see entityconstructor.Card#getParentClass
	 * @model opposite="ParentClass"
	 * @generated
	 */
	EList<Card> getChildClasses();

	/**
	 * Returns the value of the '<em><b>Parent Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityconstructor.Card#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Class</em>' reference.
	 * @see #setParentClass(Card)
	 * @see entityconstructor.EntityconstructorPackage#getCard_ParentClass()
	 * @see entityconstructor.Card#getChildClasses
	 * @model opposite="ChildClasses"
	 * @generated
	 */
	Card getParentClass();

	/**
	 * Sets the value of the '{@link entityconstructor.Card#getParentClass <em>Parent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Class</em>' reference.
	 * @see #getParentClass()
	 * @generated
	 */
	void setParentClass(Card value);

	/**
	 * Returns the value of the '<em><b>Dictionaries</b></em>' reference list.
	 * The list contents are of type {@link entityconstructor.Dictionary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionaries</em>' reference list.
	 * @see entityconstructor.EntityconstructorPackage#getCard_Dictionaries()
	 * @model
	 * @generated
	 */
	EList<Dictionary> getDictionaries();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see entityconstructor.EntityconstructorPackage#getCard_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link entityconstructor.Card#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Card
