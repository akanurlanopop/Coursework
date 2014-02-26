/**
 */
package entityconstructor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityconstructor.DataType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link entityconstructor.DataType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityconstructor.EntityconstructorPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(Attribute)
	 * @see entityconstructor.EntityconstructorPackage#getDataType_DataType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attribute getDataType();

	/**
	 * Sets the value of the '{@link entityconstructor.DataType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Attribute value);

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
	 * @see entityconstructor.EntityconstructorPackage#getDataType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entityconstructor.DataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataType
