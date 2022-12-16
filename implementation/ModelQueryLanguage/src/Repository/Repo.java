/**
 */
package Repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Repo#getMain <em>Main</em>}</li>
 *   <li>{@link Repository.Repo#getBranches <em>Branches</em>}</li>
 *   <li>{@link Repository.Repo#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getRepo()
 * @model
 * @generated
 */
public interface Repo extends EObject {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(MainBranch)
	 * @see Repository.RepositoryPackage#getRepo_Main()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MainBranch getMain();

	/**
	 * Sets the value of the '{@link Repository.Repo#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(MainBranch value);

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.GenericBranch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see Repository.RepositoryPackage#getRepo_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericBranch> getBranches();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see Repository.RepositoryPackage#getRepo_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

} // Repo
