/**
 */
package Repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Modif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.ModelModif#getModel <em>Model</em>}</li>
 *   <li>{@link Repository.ModelModif#getModelSnapshot <em>Model Snapshot</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getModelModif()
 * @model
 * @generated
 */
public interface ModelModif extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see Repository.RepositoryPackage#getModelModif_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link Repository.ModelModif#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Model Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Snapshot</em>' reference.
	 * @see #setModelSnapshot(ModelSnapshot)
	 * @see Repository.RepositoryPackage#getModelModif_ModelSnapshot()
	 * @model required="true"
	 * @generated
	 */
	ModelSnapshot getModelSnapshot();

	/**
	 * Sets the value of the '{@link Repository.ModelModif#getModelSnapshot <em>Model Snapshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Snapshot</em>' reference.
	 * @see #getModelSnapshot()
	 * @generated
	 */
	void setModelSnapshot(ModelSnapshot value);

} // ModelModif
