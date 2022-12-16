/**
 */
package Repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.GenericBranch#getActive <em>Active</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getGenericBranch()
 * @model
 * @generated
 */
public interface GenericBranch extends Branch {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see Repository.RepositoryPackage#getGenericBranch_Active()
	 * @model
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link Repository.GenericBranch#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

} // GenericBranch
