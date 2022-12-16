/**
 */
package Repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.CurrentModel#getModel <em>Model</em>}</li>
 *   <li>{@link Repository.CurrentModel#getSnapshot <em>Snapshot</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getCurrentModel()
 * @model
 * @generated
 */
public interface CurrentModel extends Queryable {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see Repository.RepositoryPackage#getCurrentModel_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link Repository.CurrentModel#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snapshot</em>' reference.
	 * @see #setSnapshot(ModelSnapshot)
	 * @see Repository.RepositoryPackage#getCurrentModel_Snapshot()
	 * @model required="true"
	 * @generated
	 */
	ModelSnapshot getSnapshot();

	/**
	 * Sets the value of the '{@link Repository.CurrentModel#getSnapshot <em>Snapshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot</em>' reference.
	 * @see #getSnapshot()
	 * @generated
	 */
	void setSnapshot(ModelSnapshot value);

} // CurrentModel
