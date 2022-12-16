/**
 */
package ModelQueryLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ModelQueryLanguage.ModelQueryLanguagePackage
 * @generated
 */
public interface ModelQueryLanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelQueryLanguageFactory eINSTANCE = ModelQueryLanguage.impl.ModelQueryLanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Query File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query File</em>'.
	 * @generated
	 */
	QueryFile createQueryFile();

	/**
	 * Returns a new object of class '<em>Model Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Query</em>'.
	 * @generated
	 */
	ModelQuery createModelQuery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelQueryLanguagePackage getModelQueryLanguagePackage();

} //ModelQueryLanguageFactory
