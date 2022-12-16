/**
 */
package Repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Head#getBranch <em>Branch</em>}</li>
 *   <li>{@link Repository.Head#getCommit <em>Commit</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends Queryable {
	/**
	 * Returns the value of the '<em><b>Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' reference.
	 * @see #setBranch(Branch)
	 * @see Repository.RepositoryPackage#getHead_Branch()
	 * @model required="true"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link Repository.Head#getBranch <em>Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

	/**
	 * Returns the value of the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit</em>' reference.
	 * @see #setCommit(Commit)
	 * @see Repository.RepositoryPackage#getHead_Commit()
	 * @model required="true"
	 * @generated
	 */
	Commit getCommit();

	/**
	 * Sets the value of the '{@link Repository.Head#getCommit <em>Commit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit</em>' reference.
	 * @see #getCommit()
	 * @generated
	 */
	void setCommit(Commit value);

} // Head
