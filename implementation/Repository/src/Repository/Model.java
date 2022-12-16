/**
 */
package Repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Model#getName <em>Name</em>}</li>
 *   <li>{@link Repository.Model#getModelId <em>Model Id</em>}</li>
 *   <li>{@link Repository.Model#getIsDeleted <em>Is Deleted</em>}</li>
 *   <li>{@link Repository.Model#getOwner <em>Owner</em>}</li>
 *   <li>{@link Repository.Model#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link Repository.Model#getCurrent <em>Current</em>}</li>
 *   <li>{@link Repository.Model#getLifetime <em>Lifetime</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Repository.RepositoryPackage#getModel_Name()
	 * @model id="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Repository.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Id</em>' attribute.
	 * @see #setModelId(String)
	 * @see Repository.RepositoryPackage#getModel_ModelId()
	 * @model ordered="false"
	 * @generated
	 */
	String getModelId();

	/**
	 * Sets the value of the '{@link Repository.Model#getModelId <em>Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Id</em>' attribute.
	 * @see #getModelId()
	 * @generated
	 */
	void setModelId(String value);

	/**
	 * Returns the value of the '<em><b>Is Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Deleted</em>' attribute.
	 * @see #setIsDeleted(Boolean)
	 * @see Repository.RepositoryPackage#getModel_IsDeleted()
	 * @model
	 * @generated
	 */
	Boolean getIsDeleted();

	/**
	 * Sets the value of the '{@link Repository.Model#getIsDeleted <em>Is Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deleted</em>' attribute.
	 * @see #getIsDeleted()
	 * @generated
	 */
	void setIsDeleted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see Repository.RepositoryPackage#getModel_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link Repository.Model#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see Repository.RepositoryPackage#getModel_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link Repository.Model#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(ModelSnapshot)
	 * @see Repository.RepositoryPackage#getModel_Current()
	 * @model required="true"
	 * @generated
	 */
	ModelSnapshot getCurrent();

	/**
	 * Sets the value of the '{@link Repository.Model#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(ModelSnapshot value);

	/**
	 * Returns the value of the '<em><b>Lifetime</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.ModelSnapshot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifetime</em>' containment reference list.
	 * @see Repository.RepositoryPackage#getModel_Lifetime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelSnapshot> getLifetime();

} // Model
