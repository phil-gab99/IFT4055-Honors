/**
 */
package ModelQueryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModelQueryLanguage.QueryFile#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see ModelQueryLanguage.ModelQueryLanguagePackage#getQueryFile()
 * @model
 * @generated
 */
public interface QueryFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link ModelQueryLanguage.ModelQuery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see ModelQueryLanguage.ModelQueryLanguagePackage#getQueryFile_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelQuery> getQueries();

} // QueryFile
