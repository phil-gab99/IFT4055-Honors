/**
 */
package Repository;

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
 *   <li>{@link Repository.ModelSnapshot#getPath <em>Path</em>}</li>
 *   <li>{@link Repository.ModelSnapshot#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getModelSnapshot()
 * @model
 * @generated
 */
public interface ModelSnapshot extends EObject {
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
