/**
 */
package Repository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "geodes.sms.repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = Repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link Repository.impl.RepoImpl <em>Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.RepoImpl
	 * @see Repository.impl.RepositoryPackageImpl#getRepo()
	 * @generated
	 */
	int REPO = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__MAIN = 0;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__BRANCHES = 1;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__MODELS = 2;

	/**
	 * The number of structural features of the '<em>Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Repository.Queryable <em>Queryable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.Queryable
	 * @see Repository.impl.RepositoryPackageImpl#getQueryable()
	 * @generated
	 */
	int QUERYABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERYABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Queryable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERYABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Repository.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.ParentImpl
	 * @see Repository.impl.RepositoryPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__NAME = QUERYABLE__NAME;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__BRANCH = QUERYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__COMMIT = QUERYABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = QUERYABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Repository.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.HeadImpl
	 * @see Repository.impl.RepositoryPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__NAME = QUERYABLE__NAME;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__BRANCH = QUERYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__COMMIT = QUERYABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = QUERYABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Repository.impl.NextImpl <em>Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.NextImpl
	 * @see Repository.impl.RepositoryPackageImpl#getNext()
	 * @generated
	 */
	int NEXT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__NAME = QUERYABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__CURRENT = QUERYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__NEXT = QUERYABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_FEATURE_COUNT = QUERYABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Repository.impl.CurrentModelImpl <em>Current Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.CurrentModelImpl
	 * @see Repository.impl.RepositoryPackageImpl#getCurrentModel()
	 * @generated
	 */
	int CURRENT_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_MODEL__NAME = QUERYABLE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_MODEL__MODEL = QUERYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_MODEL__SNAPSHOT = QUERYABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Current Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_MODEL_FEATURE_COUNT = QUERYABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Repository.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.BranchImpl
	 * @see Repository.impl.RepositoryPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 6;

	/**
	 * The feature id for the '<em><b>Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_NAME = 0;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__COMMITS = 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Repository.impl.MainBranchImpl <em>Main Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.MainBranchImpl
	 * @see Repository.impl.RepositoryPackageImpl#getMainBranch()
	 * @generated
	 */
	int MAIN_BRANCH = 7;

	/**
	 * The feature id for the '<em><b>Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BRANCH__BRANCH_NAME = BRANCH__BRANCH_NAME;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BRANCH__COMMITS = BRANCH__COMMITS;

	/**
	 * The number of structural features of the '<em>Main Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Repository.impl.GenericBranchImpl <em>Generic Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.GenericBranchImpl
	 * @see Repository.impl.RepositoryPackageImpl#getGenericBranch()
	 * @generated
	 */
	int GENERIC_BRANCH = 8;

	/**
	 * The feature id for the '<em><b>Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BRANCH__BRANCH_NAME = BRANCH__BRANCH_NAME;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BRANCH__COMMITS = BRANCH__COMMITS;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BRANCH__ACTIVE = BRANCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Repository.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.CommitImpl
	 * @see Repository.impl.RepositoryPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 9;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__HASH = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TIMESTAMP = 3;

	/**
	 * The feature id for the '<em><b>Modified Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MODIFIED_MODELS = 4;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link Repository.impl.GenericCommitImpl <em>Generic Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.GenericCommitImpl
	 * @see Repository.impl.RepositoryPackageImpl#getGenericCommit()
	 * @generated
	 */
	int GENERIC_COMMIT = 10;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT__HASH = COMMIT__HASH;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT__AUTHOR = COMMIT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT__MESSAGE = COMMIT__MESSAGE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT__TIMESTAMP = COMMIT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Modified Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT__MODIFIED_MODELS = COMMIT__MODIFIED_MODELS;

	/**
	 * The number of structural features of the '<em>Generic Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT_FEATURE_COUNT = COMMIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Repository.impl.MergeCommitImpl <em>Merge Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.MergeCommitImpl
	 * @see Repository.impl.RepositoryPackageImpl#getMergeCommit()
	 * @generated
	 */
	int MERGE_COMMIT = 11;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__HASH = COMMIT__HASH;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__AUTHOR = COMMIT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__MESSAGE = COMMIT__MESSAGE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__TIMESTAMP = COMMIT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Modified Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__MODIFIED_MODELS = COMMIT__MODIFIED_MODELS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__FROM = COMMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__TO = COMMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT_FEATURE_COUNT = COMMIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Repository.impl.ModelModifImpl <em>Model Modif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.ModelModifImpl
	 * @see Repository.impl.RepositoryPackageImpl#getModelModif()
	 * @generated
	 */
	int MODEL_MODIF = 12;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MODIF__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Model Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MODIF__MODEL_SNAPSHOT = 1;

	/**
	 * The number of structural features of the '<em>Model Modif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MODIF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Repository.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.ModelImpl
	 * @see Repository.impl.RepositoryPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 13;

	/**
	 * The feature id for the '<em><b>Is Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_DELETED = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Lifetime</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LIFETIME = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Repository.impl.ModelSnapshotImpl <em>Model Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.ModelSnapshotImpl
	 * @see Repository.impl.RepositoryPackageImpl#getModelSnapshot()
	 * @generated
	 */
	int MODEL_SNAPSHOT = 14;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__PATH = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Model Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link Repository.Repo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repo</em>'.
	 * @see Repository.Repo
	 * @generated
	 */
	EClass getRepo();

	/**
	 * Returns the meta object for the containment reference '{@link Repository.Repo#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see Repository.Repo#getMain()
	 * @see #getRepo()
	 * @generated
	 */
	EReference getRepo_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link Repository.Repo#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see Repository.Repo#getBranches()
	 * @see #getRepo()
	 * @generated
	 */
	EReference getRepo_Branches();

	/**
	 * Returns the meta object for the containment reference list '{@link Repository.Repo#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see Repository.Repo#getModels()
	 * @see #getRepo()
	 * @generated
	 */
	EReference getRepo_Models();

	/**
	 * Returns the meta object for class '{@link Repository.Queryable <em>Queryable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queryable</em>'.
	 * @see Repository.Queryable
	 * @generated
	 */
	EClass getQueryable();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Queryable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Repository.Queryable#getName()
	 * @see #getQueryable()
	 * @generated
	 */
	EAttribute getQueryable_Name();

	/**
	 * Returns the meta object for class '{@link Repository.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see Repository.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the reference '{@link Repository.Parent#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branch</em>'.
	 * @see Repository.Parent#getBranch()
	 * @see #getParent()
	 * @generated
	 */
	EReference getParent_Branch();

	/**
	 * Returns the meta object for the reference '{@link Repository.Parent#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commit</em>'.
	 * @see Repository.Parent#getCommit()
	 * @see #getParent()
	 * @generated
	 */
	EReference getParent_Commit();

	/**
	 * Returns the meta object for class '{@link Repository.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see Repository.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for the reference '{@link Repository.Head#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branch</em>'.
	 * @see Repository.Head#getBranch()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Branch();

	/**
	 * Returns the meta object for the reference '{@link Repository.Head#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commit</em>'.
	 * @see Repository.Head#getCommit()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Commit();

	/**
	 * Returns the meta object for class '{@link Repository.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next</em>'.
	 * @see Repository.Next
	 * @generated
	 */
	EClass getNext();

	/**
	 * Returns the meta object for the reference '{@link Repository.Next#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see Repository.Next#getCurrent()
	 * @see #getNext()
	 * @generated
	 */
	EReference getNext_Current();

	/**
	 * Returns the meta object for the reference '{@link Repository.Next#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see Repository.Next#getNext()
	 * @see #getNext()
	 * @generated
	 */
	EReference getNext_Next();

	/**
	 * Returns the meta object for class '{@link Repository.CurrentModel <em>Current Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Model</em>'.
	 * @see Repository.CurrentModel
	 * @generated
	 */
	EClass getCurrentModel();

	/**
	 * Returns the meta object for the reference '{@link Repository.CurrentModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see Repository.CurrentModel#getModel()
	 * @see #getCurrentModel()
	 * @generated
	 */
	EReference getCurrentModel_Model();

	/**
	 * Returns the meta object for the reference '{@link Repository.CurrentModel#getSnapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Snapshot</em>'.
	 * @see Repository.CurrentModel#getSnapshot()
	 * @see #getCurrentModel()
	 * @generated
	 */
	EReference getCurrentModel_Snapshot();

	/**
	 * Returns the meta object for class '{@link Repository.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see Repository.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Branch#getBranchName <em>Branch Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Name</em>'.
	 * @see Repository.Branch#getBranchName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_BranchName();

	/**
	 * Returns the meta object for the containment reference list '{@link Repository.Branch#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commits</em>'.
	 * @see Repository.Branch#getCommits()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Commits();

	/**
	 * Returns the meta object for class '{@link Repository.MainBranch <em>Main Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Branch</em>'.
	 * @see Repository.MainBranch
	 * @generated
	 */
	EClass getMainBranch();

	/**
	 * Returns the meta object for class '{@link Repository.GenericBranch <em>Generic Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Branch</em>'.
	 * @see Repository.GenericBranch
	 * @generated
	 */
	EClass getGenericBranch();

	/**
	 * Returns the meta object for the attribute '{@link Repository.GenericBranch#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see Repository.GenericBranch#getActive()
	 * @see #getGenericBranch()
	 * @generated
	 */
	EAttribute getGenericBranch_Active();

	/**
	 * Returns the meta object for class '{@link Repository.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit</em>'.
	 * @see Repository.Commit
	 * @generated
	 */
	EClass getCommit();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Commit#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see Repository.Commit#getHash()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Hash();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Commit#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see Repository.Commit#getAuthor()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Author();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Commit#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see Repository.Commit#getMessage()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Message();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Commit#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see Repository.Commit#getTimestamp()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link Repository.Commit#getModifiedModels <em>Modified Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modified Models</em>'.
	 * @see Repository.Commit#getModifiedModels()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_ModifiedModels();

	/**
	 * Returns the meta object for class '{@link Repository.GenericCommit <em>Generic Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Commit</em>'.
	 * @see Repository.GenericCommit
	 * @generated
	 */
	EClass getGenericCommit();

	/**
	 * Returns the meta object for class '{@link Repository.MergeCommit <em>Merge Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Commit</em>'.
	 * @see Repository.MergeCommit
	 * @generated
	 */
	EClass getMergeCommit();

	/**
	 * Returns the meta object for the reference '{@link Repository.MergeCommit#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see Repository.MergeCommit#getFrom()
	 * @see #getMergeCommit()
	 * @generated
	 */
	EReference getMergeCommit_From();

	/**
	 * Returns the meta object for the reference '{@link Repository.MergeCommit#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see Repository.MergeCommit#getTo()
	 * @see #getMergeCommit()
	 * @generated
	 */
	EReference getMergeCommit_To();

	/**
	 * Returns the meta object for class '{@link Repository.ModelModif <em>Model Modif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Modif</em>'.
	 * @see Repository.ModelModif
	 * @generated
	 */
	EClass getModelModif();

	/**
	 * Returns the meta object for the reference '{@link Repository.ModelModif#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see Repository.ModelModif#getModel()
	 * @see #getModelModif()
	 * @generated
	 */
	EReference getModelModif_Model();

	/**
	 * Returns the meta object for the reference '{@link Repository.ModelModif#getModelSnapshot <em>Model Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Snapshot</em>'.
	 * @see Repository.ModelModif#getModelSnapshot()
	 * @see #getModelModif()
	 * @generated
	 */
	EReference getModelModif_ModelSnapshot();

	/**
	 * Returns the meta object for class '{@link Repository.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see Repository.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Model#getIsDeleted <em>Is Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deleted</em>'.
	 * @see Repository.Model#getIsDeleted()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_IsDeleted();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Model#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see Repository.Model#getOwner()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Owner();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Model#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see Repository.Model#getCreationDate()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link Repository.Model#getLifetime <em>Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifetime</em>'.
	 * @see Repository.Model#getLifetime()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Lifetime();

	/**
	 * Returns the meta object for class '{@link Repository.ModelSnapshot <em>Model Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Snapshot</em>'.
	 * @see Repository.ModelSnapshot
	 * @generated
	 */
	EClass getModelSnapshot();

	/**
	 * Returns the meta object for the attribute '{@link Repository.ModelSnapshot#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see Repository.ModelSnapshot#getPath()
	 * @see #getModelSnapshot()
	 * @generated
	 */
	EAttribute getModelSnapshot_Path();

	/**
	 * Returns the meta object for the reference '{@link Repository.ModelSnapshot#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see Repository.ModelSnapshot#getNext()
	 * @see #getModelSnapshot()
	 * @generated
	 */
	EReference getModelSnapshot_Next();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link Repository.impl.RepoImpl <em>Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.RepoImpl
		 * @see Repository.impl.RepositoryPackageImpl#getRepo()
		 * @generated
		 */
		EClass REPO = eINSTANCE.getRepo();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPO__MAIN = eINSTANCE.getRepo_Main();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPO__BRANCHES = eINSTANCE.getRepo_Branches();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPO__MODELS = eINSTANCE.getRepo_Models();

		/**
		 * The meta object literal for the '{@link Repository.Queryable <em>Queryable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.Queryable
		 * @see Repository.impl.RepositoryPackageImpl#getQueryable()
		 * @generated
		 */
		EClass QUERYABLE = eINSTANCE.getQueryable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERYABLE__NAME = eINSTANCE.getQueryable_Name();

		/**
		 * The meta object literal for the '{@link Repository.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.ParentImpl
		 * @see Repository.impl.RepositoryPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT__BRANCH = eINSTANCE.getParent_Branch();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT__COMMIT = eINSTANCE.getParent_Commit();

		/**
		 * The meta object literal for the '{@link Repository.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.HeadImpl
		 * @see Repository.impl.RepositoryPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__BRANCH = eINSTANCE.getHead_Branch();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__COMMIT = eINSTANCE.getHead_Commit();

		/**
		 * The meta object literal for the '{@link Repository.impl.NextImpl <em>Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.NextImpl
		 * @see Repository.impl.RepositoryPackageImpl#getNext()
		 * @generated
		 */
		EClass NEXT = eINSTANCE.getNext();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT__CURRENT = eINSTANCE.getNext_Current();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT__NEXT = eINSTANCE.getNext_Next();

		/**
		 * The meta object literal for the '{@link Repository.impl.CurrentModelImpl <em>Current Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.CurrentModelImpl
		 * @see Repository.impl.RepositoryPackageImpl#getCurrentModel()
		 * @generated
		 */
		EClass CURRENT_MODEL = eINSTANCE.getCurrentModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_MODEL__MODEL = eINSTANCE.getCurrentModel_Model();

		/**
		 * The meta object literal for the '<em><b>Snapshot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_MODEL__SNAPSHOT = eINSTANCE.getCurrentModel_Snapshot();

		/**
		 * The meta object literal for the '{@link Repository.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.BranchImpl
		 * @see Repository.impl.RepositoryPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Branch Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_NAME = eINSTANCE.getBranch_BranchName();

		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__COMMITS = eINSTANCE.getBranch_Commits();

		/**
		 * The meta object literal for the '{@link Repository.impl.MainBranchImpl <em>Main Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.MainBranchImpl
		 * @see Repository.impl.RepositoryPackageImpl#getMainBranch()
		 * @generated
		 */
		EClass MAIN_BRANCH = eINSTANCE.getMainBranch();

		/**
		 * The meta object literal for the '{@link Repository.impl.GenericBranchImpl <em>Generic Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.GenericBranchImpl
		 * @see Repository.impl.RepositoryPackageImpl#getGenericBranch()
		 * @generated
		 */
		EClass GENERIC_BRANCH = eINSTANCE.getGenericBranch();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_BRANCH__ACTIVE = eINSTANCE.getGenericBranch_Active();

		/**
		 * The meta object literal for the '{@link Repository.impl.CommitImpl <em>Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.CommitImpl
		 * @see Repository.impl.RepositoryPackageImpl#getCommit()
		 * @generated
		 */
		EClass COMMIT = eINSTANCE.getCommit();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__HASH = eINSTANCE.getCommit_Hash();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__AUTHOR = eINSTANCE.getCommit_Author();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__MESSAGE = eINSTANCE.getCommit_Message();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__TIMESTAMP = eINSTANCE.getCommit_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Modified Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__MODIFIED_MODELS = eINSTANCE.getCommit_ModifiedModels();

		/**
		 * The meta object literal for the '{@link Repository.impl.GenericCommitImpl <em>Generic Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.GenericCommitImpl
		 * @see Repository.impl.RepositoryPackageImpl#getGenericCommit()
		 * @generated
		 */
		EClass GENERIC_COMMIT = eINSTANCE.getGenericCommit();

		/**
		 * The meta object literal for the '{@link Repository.impl.MergeCommitImpl <em>Merge Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.MergeCommitImpl
		 * @see Repository.impl.RepositoryPackageImpl#getMergeCommit()
		 * @generated
		 */
		EClass MERGE_COMMIT = eINSTANCE.getMergeCommit();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_COMMIT__FROM = eINSTANCE.getMergeCommit_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_COMMIT__TO = eINSTANCE.getMergeCommit_To();

		/**
		 * The meta object literal for the '{@link Repository.impl.ModelModifImpl <em>Model Modif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.ModelModifImpl
		 * @see Repository.impl.RepositoryPackageImpl#getModelModif()
		 * @generated
		 */
		EClass MODEL_MODIF = eINSTANCE.getModelModif();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MODIF__MODEL = eINSTANCE.getModelModif_Model();

		/**
		 * The meta object literal for the '<em><b>Model Snapshot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MODIF__MODEL_SNAPSHOT = eINSTANCE.getModelModif_ModelSnapshot();

		/**
		 * The meta object literal for the '{@link Repository.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.ModelImpl
		 * @see Repository.impl.RepositoryPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Is Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__IS_DELETED = eINSTANCE.getModel_IsDeleted();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__OWNER = eINSTANCE.getModel_Owner();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__CREATION_DATE = eINSTANCE.getModel_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Lifetime</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LIFETIME = eINSTANCE.getModel_Lifetime();

		/**
		 * The meta object literal for the '{@link Repository.impl.ModelSnapshotImpl <em>Model Snapshot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.ModelSnapshotImpl
		 * @see Repository.impl.RepositoryPackageImpl#getModelSnapshot()
		 * @generated
		 */
		EClass MODEL_SNAPSHOT = eINSTANCE.getModelSnapshot();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SNAPSHOT__PATH = eINSTANCE.getModelSnapshot_Path();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SNAPSHOT__NEXT = eINSTANCE.getModelSnapshot_Next();

	}

} //RepositoryPackage
