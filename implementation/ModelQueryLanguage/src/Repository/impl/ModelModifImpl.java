/**
 */
package Repository.impl;

import Repository.Model;
import Repository.ModelModif;
import Repository.ModelSnapshot;
import Repository.RepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Modif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Repository.impl.ModelModifImpl#getModel <em>Model</em>}</li>
 *   <li>{@link Repository.impl.ModelModifImpl#getModelSnapshot <em>Model Snapshot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelModifImpl extends EObjectImpl implements ModelModif {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getModelSnapshot() <em>Model Snapshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSnapshot()
	 * @generated
	 * @ordered
	 */
	protected ModelSnapshot modelSnapshot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelModifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.MODEL_MODIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.MODEL_MODIF__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MODEL_MODIF__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelSnapshot getModelSnapshot() {
		if (modelSnapshot != null && modelSnapshot.eIsProxy()) {
			InternalEObject oldModelSnapshot = (InternalEObject)modelSnapshot;
			modelSnapshot = (ModelSnapshot)eResolveProxy(oldModelSnapshot);
			if (modelSnapshot != oldModelSnapshot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.MODEL_MODIF__MODEL_SNAPSHOT, oldModelSnapshot, modelSnapshot));
			}
		}
		return modelSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSnapshot basicGetModelSnapshot() {
		return modelSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelSnapshot(ModelSnapshot newModelSnapshot) {
		ModelSnapshot oldModelSnapshot = modelSnapshot;
		modelSnapshot = newModelSnapshot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MODEL_MODIF__MODEL_SNAPSHOT, oldModelSnapshot, modelSnapshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.MODEL_MODIF__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case RepositoryPackage.MODEL_MODIF__MODEL_SNAPSHOT:
				if (resolve) return getModelSnapshot();
				return basicGetModelSnapshot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepositoryPackage.MODEL_MODIF__MODEL:
				setModel((Model)newValue);
				return;
			case RepositoryPackage.MODEL_MODIF__MODEL_SNAPSHOT:
				setModelSnapshot((ModelSnapshot)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RepositoryPackage.MODEL_MODIF__MODEL:
				setModel((Model)null);
				return;
			case RepositoryPackage.MODEL_MODIF__MODEL_SNAPSHOT:
				setModelSnapshot((ModelSnapshot)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RepositoryPackage.MODEL_MODIF__MODEL:
				return model != null;
			case RepositoryPackage.MODEL_MODIF__MODEL_SNAPSHOT:
				return modelSnapshot != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelModifImpl
