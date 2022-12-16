/**
 */
package Repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.ModelSnapshot#getName <em>Name</em>}</li>
 *   <li>{@link Repository.ModelSnapshot#getPath <em>Path</em>}</li>
 *   <li>{@link Repository.ModelSnapshot#getDiffModified <em>Diff Modified</em>}</li>
 *   <li>{@link Repository.ModelSnapshot#getDiffCreated <em>Diff Created</em>}</li>
 *   <li>{@link Repository.ModelSnapshot#getDiffDeleted <em>Diff Deleted</em>}</li>
 *   <li>{@link Repository.ModelSnapshot#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getModelSnapshot()
 * @model
 * @generated
 */
public interface ModelSnapshot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Repository.RepositoryPackage#getModelSnapshot_Name()
	 * @model id="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Repository.ModelSnapshot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see Repository.RepositoryPackage#getModelSnapshot_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link Repository.ModelSnapshot#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Diff Modified</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Modified</em>' attribute list.
	 * @see Repository.RepositoryPackage#getModelSnapshot_DiffModified()
	 * @model
	 * @generated
	 */
	EList<String> getDiffModified();

	/**
	 * Returns the value of the '<em><b>Diff Created</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Created</em>' attribute list.
	 * @see Repository.RepositoryPackage#getModelSnapshot_DiffCreated()
	 * @model
	 * @generated
	 */
	EList<String> getDiffCreated();

	/**
	 * Returns the value of the '<em><b>Diff Deleted</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Deleted</em>' attribute list.
	 * @see Repository.RepositoryPackage#getModelSnapshot_DiffDeleted()
	 * @model
	 * @generated
	 */
	EList<String> getDiffDeleted();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ModelSnapshot)
	 * @see Repository.RepositoryPackage#getModelSnapshot_Next()
	 * @model
	 * @generated
	 */
	ModelSnapshot getNext();

	/**
	 * Sets the value of the '{@link Repository.ModelSnapshot#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ModelSnapshot value);

} // ModelSnapshot
