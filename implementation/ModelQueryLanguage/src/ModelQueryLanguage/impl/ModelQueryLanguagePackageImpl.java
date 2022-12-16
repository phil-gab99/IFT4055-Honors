/**
 */
package ModelQueryLanguage.impl;

import DiningRoom.DiningRoomPackage;
import DiningRoom.impl.DiningRoomPackageImpl;
import ModelQueryLanguage.ModelQuery;
import ModelQueryLanguage.ModelQueryLanguageFactory;
import ModelQueryLanguage.ModelQueryLanguagePackage;
import ModelQueryLanguage.Operator;
import ModelQueryLanguage.QueryFile;

import Repository.RepositoryPackage;
import Repository.impl.RepositoryPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelQueryLanguagePackageImpl extends EPackageImpl implements ModelQueryLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ModelQueryLanguage.ModelQueryLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelQueryLanguagePackageImpl() {
		super(eNS_URI, ModelQueryLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelQueryLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelQueryLanguagePackage init() {
		if (isInited) return (ModelQueryLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ModelQueryLanguagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelQueryLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelQueryLanguagePackageImpl theModelQueryLanguagePackage = registeredModelQueryLanguagePackage instanceof ModelQueryLanguagePackageImpl ? (ModelQueryLanguagePackageImpl)registeredModelQueryLanguagePackage : new ModelQueryLanguagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelQueryLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theModelQueryLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelQueryLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelQueryLanguagePackage.eNS_URI, theModelQueryLanguagePackage);
		return theModelQueryLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryFile() {
		return queryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryFile_Queries() {
		return (EReference)queryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelQuery() {
		return modelQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelQuery_Operator() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelQuery_Subject() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelQuery_ContainerParameters() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelQuery_DiffParameters() {
		return (EAttribute)modelQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelQueryLanguageFactory getModelQueryLanguageFactory() {
		return (ModelQueryLanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		queryFileEClass = createEClass(QUERY_FILE);
		createEReference(queryFileEClass, QUERY_FILE__QUERIES);

		modelQueryEClass = createEClass(MODEL_QUERY);
		createEAttribute(modelQueryEClass, MODEL_QUERY__OPERATOR);
		createEAttribute(modelQueryEClass, MODEL_QUERY__SUBJECT);
		createEAttribute(modelQueryEClass, MODEL_QUERY__CONTAINER_PARAMETERS);
		createEAttribute(modelQueryEClass, MODEL_QUERY__DIFF_PARAMETERS);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(queryFileEClass, QueryFile.class, "QueryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryFile_Queries(), this.getModelQuery(), null, "queries", null, 0, -1, QueryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelQueryEClass, ModelQuery.class, "ModelQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelQuery_Operator(), this.getOperator(), "operator", null, 1, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelQuery_Subject(), ecorePackage.getEString(), "subject", null, 1, 1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelQuery_ContainerParameters(), ecorePackage.getEString(), "containerParameters", null, 0, -1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelQuery_DiffParameters(), ecorePackage.getEString(), "diffParameters", null, 0, -1, ModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.WHO);
		addEEnumLiteral(operatorEEnum, Operator.WHEN);
		addEEnumLiteral(operatorEEnum, Operator.WHAT);
		addEEnumLiteral(operatorEEnum, Operator.WHERE);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelQueryLanguagePackageImpl
