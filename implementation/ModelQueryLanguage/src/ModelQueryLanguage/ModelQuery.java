/**
 */
package ModelQueryLanguage;

import DiningRoom.Furniture;
import Repository.Queryable;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModelQueryLanguage.ModelQuery#getOperator <em>Operator</em>}</li>
 *   <li>{@link ModelQueryLanguage.ModelQuery#getSubject <em>Subject</em>}</li>
 *   <li>{@link ModelQueryLanguage.ModelQuery#getContainerParameters <em>Container Parameters</em>}</li>
 *   <li>{@link ModelQueryLanguage.ModelQuery#getDiffParameters <em>Diff Parameters</em>}</li>
 * </ul>
 *
 * @see ModelQueryLanguage.ModelQueryLanguagePackage#getModelQuery()
 * @model
 * @generated
 */
public interface ModelQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ModelQueryLanguage.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ModelQueryLanguage.Operator
	 * @see #setOperator(Operator)
	 * @see ModelQueryLanguage.ModelQueryLanguagePackage#getModelQuery_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link ModelQueryLanguage.ModelQuery#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ModelQueryLanguage.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see ModelQueryLanguage.ModelQueryLanguagePackage#getModelQuery_Subject()
	 * @model required="true"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link ModelQueryLanguage.ModelQuery#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Container Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Parameters</em>' attribute list.
	 * @see ModelQueryLanguage.ModelQueryLanguagePackage#getModelQuery_ContainerParameters()
	 * @model
	 * @generated
	 */
	EList<String> getContainerParameters();

	/**
	 * Returns the value of the '<em><b>Diff Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Parameters</em>' attribute list.
	 * @see ModelQueryLanguage.ModelQueryLanguagePackage#getModelQuery_DiffParameters()
	 * @model
	 * @generated
	 */
	EList<String> getDiffParameters();

} // ModelQuery
