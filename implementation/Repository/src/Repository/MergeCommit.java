/**
 */
package Repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Commit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.MergeCommit#getFrom <em>From</em>}</li>
 *   <li>{@link Repository.MergeCommit#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getMergeCommit()
 * @model
 * @generated
 */
public interface MergeCommit extends Commit {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Commit)
	 * @see Repository.RepositoryPackage#getMergeCommit_From()
	 * @model required="true"
	 * @generated
	 */
	Commit getFrom();

	/**
	 * Sets the value of the '{@link Repository.MergeCommit#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Commit value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Commit)
	 * @see Repository.RepositoryPackage#getMergeCommit_To()
	 * @model required="true"
	 * @generated
	 */
	Commit getTo();

	/**
	 * Sets the value of the '{@link Repository.MergeCommit#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Commit value);

} // MergeCommit
