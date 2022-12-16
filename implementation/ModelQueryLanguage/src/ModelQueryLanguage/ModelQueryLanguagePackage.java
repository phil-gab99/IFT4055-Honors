/**
 */
package ModelQueryLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ModelQueryLanguage.ModelQueryLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ModelQueryLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModelQueryLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "geodes.sms.modelquerylanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelQueryLanguagePackage eINSTANCE = ModelQueryLanguage.impl.ModelQueryLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link ModelQueryLanguage.impl.QueryFileImpl <em>Query File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelQueryLanguage.impl.QueryFileImpl
	 * @see ModelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getQueryFile()
	 * @generated
	 */
	int QUERY_FILE = 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FILE__QUERIES = 0;

	/**
	 * The number of structural features of the '<em>Query File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ModelQueryLanguage.impl.ModelQueryImpl <em>Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelQueryLanguage.impl.ModelQueryImpl
	 * @see ModelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getModelQuery()
	 * @generated
	 */
	int MODEL_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Container Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__CONTAINER_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Diff Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__DIFF_PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link ModelQueryLanguage.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelQueryLanguage.Operator
	 * @see ModelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 2;


	/**
	 * Returns the meta object for class '{@link ModelQueryLanguage.QueryFile <em>Query File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query File</em>'.
	 * @see ModelQueryLanguage.QueryFile
	 * @generated
	 */
	EClass getQueryFile();

	/**
	 * Returns the meta object for the containment reference list '{@link ModelQueryLanguage.QueryFile#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see ModelQueryLanguage.QueryFile#getQueries()
	 * @see #getQueryFile()
	 * @generated
	 */
	EReference getQueryFile_Queries();

	/**
	 * Returns the meta object for class '{@link ModelQueryLanguage.ModelQuery <em>Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query</em>'.
	 * @see ModelQueryLanguage.ModelQuery
	 * @generated
	 */
	EClass getModelQuery();

	/**
	 * Returns the meta object for the attribute '{@link ModelQueryLanguage.ModelQuery#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ModelQueryLanguage.ModelQuery#getOperator()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Operator();

	/**
	 * Returns the meta object for the attribute '{@link ModelQueryLanguage.ModelQuery#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see ModelQueryLanguage.ModelQuery#getSubject()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Subject();

	/**
	 * Returns the meta object for the attribute list '{@link ModelQueryLanguage.ModelQuery#getContainerParameters <em>Container Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Container Parameters</em>'.
	 * @see ModelQueryLanguage.ModelQuery#getContainerParameters()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_ContainerParameters();

	/**
	 * Returns the meta object for the attribute list '{@link ModelQueryLanguage.ModelQuery#getDiffParameters <em>Diff Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Diff Parameters</em>'.
	 * @see ModelQueryLanguage.ModelQuery#getDiffParameters()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_DiffParameters();

	/**
	 * Returns the meta object for enum '{@link ModelQueryLanguage.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see ModelQueryLanguage.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelQueryLanguageFactory getModelQueryLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ModelQueryLanguage.impl.QueryFileImpl <em>Query File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelQueryLanguage.impl.QueryFileImpl
		 * @see ModelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getQueryFile()
		 * @generated
		 */
		EClass QUERY_FILE = eINSTANCE.getQueryFile();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_FILE__QUERIES = eINSTANCE.getQueryFile_Queries();

		/**
		 * The meta object literal for the '{@link ModelQueryLanguage.impl.ModelQueryImpl <em>Model Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelQueryLanguage.impl.ModelQueryImpl
		 * @see ModelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getModelQuery()
		 * @generated
		 */
		EClass MODEL_QUERY = eINSTANCE.getModelQuery();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__OPERATOR = eINSTANCE.getModelQuery_Operator();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__SUBJECT = eINSTANCE.getModelQuery_Subject();

		/**
		 * The meta object literal for the '<em><b>Container Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__CONTAINER_PARAMETERS = eINSTANCE.getModelQuery_ContainerParameters();

		/**
		 * The meta object literal for the '<em><b>Diff Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__DIFF_PARAMETERS = eINSTANCE.getModelQuery_DiffParameters();

		/**
		 * The meta object literal for the '{@link ModelQueryLanguage.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelQueryLanguage.Operator
		 * @see ModelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //ModelQueryLanguagePackage
