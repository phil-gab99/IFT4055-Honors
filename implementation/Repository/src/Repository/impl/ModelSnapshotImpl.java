/**
 */
package Repository.impl;

import Repository.ModelSnapshot;
import Repository.RepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Repository.impl.ModelSnapshotImpl#getName <em>Name</em>}</li>
 *   <li>{@link Repository.impl.ModelSnapshotImpl#getPath <em>Path</em>}</li>
 *   <li>{@link Repository.impl.ModelSnapshotImpl#getDiffModified <em>Diff Modified</em>}</li>
 *   <li>{@link Repository.impl.ModelSnapshotImpl#getDiffCreated <em>Diff Created</em>}</li>
 *   <li>{@link Repository.impl.ModelSnapshotImpl#getDiffDeleted <em>Diff Deleted</em>}</li>
 *   <li>{@link Repository.impl.ModelSnapshotImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelSnapshotImpl extends EObjectImpl implements ModelSnapshot {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffModified() <em>Diff Modified</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffModified()
	 * @generated
	 * @ordered
	 */
	protected EList<String> diffModified;

	/**
	 * The cached value of the '{@link #getDiffCreated() <em>Diff Created</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffCreated()
	 * @generated
	 * @ordered
	 */
	protected EList<String> diffCreated;

	/**
	 * The cached value of the '{@link #getDiffDeleted() <em>Diff Deleted</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffDeleted()
	 * @generated
	 * @ordered
	 */
	protected EList<String> diffDeleted;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ModelSnapshot next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSnapshotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.MODEL_SNAPSHOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MODEL_SNAPSHOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MODEL_SNAPSHOT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDiffModified() {
		if (diffModified == null) {
			diffModified = new EDataTypeUniqueEList<String>(String.class, this, RepositoryPackage.MODEL_SNAPSHOT__DIFF_MODIFIED);
		}
		return diffModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDiffCreated() {
		if (diffCreated == null) {
			diffCreated = new EDataTypeUniqueEList<String>(String.class, this, RepositoryPackage.MODEL_SNAPSHOT__DIFF_CREATED);
		}
		return diffCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDiffDeleted() {
		if (diffDeleted == null) {
			diffDeleted = new EDataTypeUniqueEList<String>(String.class, this, RepositoryPackage.MODEL_SNAPSHOT__DIFF_DELETED);
		}
		return diffDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelSnapshot getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (ModelSnapshot)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.MODEL_SNAPSHOT__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSnapshot basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(ModelSnapshot newNext) {
		ModelSnapshot oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MODEL_SNAPSHOT__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.MODEL_SNAPSHOT__NAME:
				return getName();
			case RepositoryPackage.MODEL_SNAPSHOT__PATH:
				return getPath();
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_MODIFIED:
				return getDiffModified();
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_CREATED:
				return getDiffCreated();
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_DELETED:
				return getDiffDeleted();
			case RepositoryPackage.MODEL_SNAPSHOT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepositoryPackage.MODEL_SNAPSHOT__NAME:
				setName((String)newValue);
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__PATH:
				setPath((String)newValue);
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_MODIFIED:
				getDiffModified().clear();
				getDiffModified().addAll((Collection<? extends String>)newValue);
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_CREATED:
				getDiffCreated().clear();
				getDiffCreated().addAll((Collection<? extends String>)newValue);
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_DELETED:
				getDiffDeleted().clear();
				getDiffDeleted().addAll((Collection<? extends String>)newValue);
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__NEXT:
				setNext((ModelSnapshot)newValue);
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
			case RepositoryPackage.MODEL_SNAPSHOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_MODIFIED:
				getDiffModified().clear();
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_CREATED:
				getDiffCreated().clear();
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_DELETED:
				getDiffDeleted().clear();
				return;
			case RepositoryPackage.MODEL_SNAPSHOT__NEXT:
				setNext((ModelSnapshot)null);
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
			case RepositoryPackage.MODEL_SNAPSHOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RepositoryPackage.MODEL_SNAPSHOT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_MODIFIED:
				return diffModified != null && !diffModified.isEmpty();
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_CREATED:
				return diffCreated != null && !diffCreated.isEmpty();
			case RepositoryPackage.MODEL_SNAPSHOT__DIFF_DELETED:
				return diffDeleted != null && !diffDeleted.isEmpty();
			case RepositoryPackage.MODEL_SNAPSHOT__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", diffModified: ");
		result.append(diffModified);
		result.append(", diffCreated: ");
		result.append(diffCreated);
		result.append(", diffDeleted: ");
		result.append(diffDeleted);
		result.append(')');
		return result.toString();
	}

} //ModelSnapshotImpl
