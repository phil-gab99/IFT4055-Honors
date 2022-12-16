/**
 */
package Repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Next#getCurrent <em>Current</em>}</li>
 *   <li>{@link Repository.Next#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getNext()
 * @model
 * @generated
 */
public interface Next extends Queryable {
	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(Commit)
	 * @see Repository.RepositoryPackage#getNext_Current()
	 * @model required="true"
	 * @generated
	 */
	Commit getCurrent();

	/**
	 * Sets the value of the '{@link Repository.Next#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(Commit value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Commit)
	 * @see Repository.RepositoryPackage#getNext_Next()
	 * @model required="true"
	 * @generated
	 */
	Commit getNext();

	/**
	 * Sets the value of the '{@link Repository.Next#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Commit value);

} // Next
