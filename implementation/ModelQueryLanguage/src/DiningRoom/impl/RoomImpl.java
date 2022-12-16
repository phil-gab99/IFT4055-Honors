/**
 */
package DiningRoom.impl;

import DiningRoom.DiningRoomPackage;
import DiningRoom.Furniture;
import DiningRoom.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DiningRoom.impl.RoomImpl#getFurniture <em>Furniture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends EObjectImpl implements Room {
	/**
	 * The cached value of the '{@link #getFurniture() <em>Furniture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurniture()
	 * @generated
	 * @ordered
	 */
	protected EList<Furniture> furniture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiningRoomPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Furniture> getFurniture() {
		if (furniture == null) {
			furniture = new EObjectContainmentEList<Furniture>(Furniture.class, this, DiningRoomPackage.ROOM__FURNITURE);
		}
		return furniture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiningRoomPackage.ROOM__FURNITURE:
				return ((InternalEList<?>)getFurniture()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiningRoomPackage.ROOM__FURNITURE:
				return getFurniture();
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
			case DiningRoomPackage.ROOM__FURNITURE:
				getFurniture().clear();
				getFurniture().addAll((Collection<? extends Furniture>)newValue);
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
			case DiningRoomPackage.ROOM__FURNITURE:
				getFurniture().clear();
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
			case DiningRoomPackage.ROOM__FURNITURE:
				return furniture != null && !furniture.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
