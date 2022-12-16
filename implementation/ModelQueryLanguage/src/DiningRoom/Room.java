/**
 */
package DiningRoom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DiningRoom.Room#getFurniture <em>Furniture</em>}</li>
 * </ul>
 *
 * @see DiningRoom.DiningRoomPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Furniture</b></em>' containment reference list.
	 * The list contents are of type {@link DiningRoom.Furniture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Furniture</em>' containment reference list.
	 * @see DiningRoom.DiningRoomPackage#getRoom_Furniture()
	 * @model containment="true"
	 * @generated
	 */
	EList<Furniture> getFurniture();

} // Room
