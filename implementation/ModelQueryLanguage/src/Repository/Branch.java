/**
 */
package Repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Branch#getBranchName <em>Branch Name</em>}</li>
 *   <li>{@link Repository.Branch#getCommits <em>Commits</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getBranch()
 * @model abstract="true"
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Name</em>' attribute.
	 * @see #setBranchName(String)
	 * @see Repository.RepositoryPackage#getBranch_BranchName()
	 * @model
	 * @generated
	 */
	String getBranchName();

	/**
	 * Sets the value of the '{@link Repository.Branch#getBranchName <em>Branch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Name</em>' attribute.
	 * @see #getBranchName()
	 * @generated
	 */
	void setBranchName(String value);

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.Commit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' containment reference list.
	 * @see Repository.RepositoryPackage#getBranch_Commits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Commit> getCommits();

} // Branch
