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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPO__NAME = 0;

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
	 * The meta object id for the '{@link Repository.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.BranchImpl
	 * @see Repository.impl.RepositoryPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_NAME = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__COMMITS = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__HEAD = 5;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link Repository.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.CommitImpl
	 * @see Repository.impl.RepositoryPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__HASH = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__NEXT = 5;

	/**
	 * The feature id for the '<em><b>Modified Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MODIFIED_MODELS = 6;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link Repository.impl.GenericCommitImpl <em>Generic Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.GenericCommitImpl
	 * @see Repository.impl.RepositoryPackageImpl#getGenericCommit()
	 * @generated
	 */
	int GENERIC_COMMIT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT__NAME = COMMIT__NAME;

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
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMMIT__NEXT = COMMIT__NEXT;

	/**
	 * The feature id for the '<em><b>Modified Models</b></em>' reference list.
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
	int MERGE_COMMIT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__NAME = COMMIT__NAME;

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
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__NEXT = COMMIT__NEXT;

	/**
	 * The feature id for the '<em><b>Modified Models</b></em>' reference list.
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
	 * The meta object id for the '{@link Repository.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.ModelImpl
	 * @see Repository.impl.RepositoryPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_ID = 1;

	/**
	 * The feature id for the '<em><b>Is Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_DELETED = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CREATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CURRENT = 5;

	/**
	 * The feature id for the '<em><b>Lifetime</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LIFETIME = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link Repository.impl.ModelSnapshotImpl <em>Model Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Repository.impl.ModelSnapshotImpl
	 * @see Repository.impl.RepositoryPackageImpl#getModelSnapshot()
	 * @generated
	 */
	int MODEL_SNAPSHOT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__PATH = 1;

	/**
	 * The feature id for the '<em><b>Diff Modified</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__DIFF_MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Diff Created</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__DIFF_CREATED = 3;

	/**
	 * The feature id for the '<em><b>Diff Deleted</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__DIFF_DELETED = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT__NEXT = 5;

	/**
	 * The number of structural features of the '<em>Model Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SNAPSHOT_FEATURE_COUNT = 6;


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
	 * Returns the meta object for the attribute '{@link Repository.Repo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Repository.Repo#getName()
	 * @see #getRepo()
	 * @generated
	 */
	EAttribute getRepo_Name();

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
	 * Returns the meta object for class '{@link Repository.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see Repository.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Repository.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

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
	 * Returns the meta object for the attribute '{@link Repository.Branch#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see Repository.Branch#getActive()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Active();

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
	 * Returns the meta object for the reference '{@link Repository.Branch#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see Repository.Branch#getParent()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Parent();

	/**
	 * Returns the meta object for the reference '{@link Repository.Branch#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Head</em>'.
	 * @see Repository.Branch#getHead()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Head();

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
	 * Returns the meta object for the attribute '{@link Repository.Commit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Repository.Commit#getName()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Name();

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
	 * Returns the meta object for the reference '{@link Repository.Commit#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see Repository.Commit#getNext()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Next();

	/**
	 * Returns the meta object for the reference list '{@link Repository.Commit#getModifiedModels <em>Modified Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modified Models</em>'.
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
	 * Returns the meta object for class '{@link Repository.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see Repository.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Repository.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link Repository.Model#getModelId <em>Model Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Id</em>'.
	 * @see Repository.Model#getModelId()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelId();

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
	 * Returns the meta object for the reference '{@link Repository.Model#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see Repository.Model#getCurrent()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Current();

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
	 * Returns the meta object for the attribute '{@link Repository.ModelSnapshot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Repository.ModelSnapshot#getName()
	 * @see #getModelSnapshot()
	 * @generated
	 */
	EAttribute getModelSnapshot_Name();

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
	 * Returns the meta object for the attribute list '{@link Repository.ModelSnapshot#getDiffModified <em>Diff Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Diff Modified</em>'.
	 * @see Repository.ModelSnapshot#getDiffModified()
	 * @see #getModelSnapshot()
	 * @generated
	 */
	EAttribute getModelSnapshot_DiffModified();

	/**
	 * Returns the meta object for the attribute list '{@link Repository.ModelSnapshot#getDiffCreated <em>Diff Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Diff Created</em>'.
	 * @see Repository.ModelSnapshot#getDiffCreated()
	 * @see #getModelSnapshot()
	 * @generated
	 */
	EAttribute getModelSnapshot_DiffCreated();

	/**
	 * Returns the meta object for the attribute list '{@link Repository.ModelSnapshot#getDiffDeleted <em>Diff Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Diff Deleted</em>'.
	 * @see Repository.ModelSnapshot#getDiffDeleted()
	 * @see #getModelSnapshot()
	 * @generated
	 */
	EAttribute getModelSnapshot_DiffDeleted();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPO__NAME = eINSTANCE.getRepo_Name();

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
		 * The meta object literal for the '{@link Repository.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.BranchImpl
		 * @see Repository.impl.RepositoryPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '<em><b>Branch Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_NAME = eINSTANCE.getBranch_BranchName();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__ACTIVE = eINSTANCE.getBranch_Active();

		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__COMMITS = eINSTANCE.getBranch_Commits();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__PARENT = eINSTANCE.getBranch_Parent();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__HEAD = eINSTANCE.getBranch_Head();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__NAME = eINSTANCE.getCommit_Name();

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
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__NEXT = eINSTANCE.getCommit_Next();

		/**
		 * The meta object literal for the '<em><b>Modified Models</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link Repository.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Repository.impl.ModelImpl
		 * @see Repository.impl.RepositoryPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Model Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_ID = eINSTANCE.getModel_ModelId();

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
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CURRENT = eINSTANCE.getModel_Current();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SNAPSHOT__NAME = eINSTANCE.getModelSnapshot_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SNAPSHOT__PATH = eINSTANCE.getModelSnapshot_Path();

		/**
		 * The meta object literal for the '<em><b>Diff Modified</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SNAPSHOT__DIFF_MODIFIED = eINSTANCE.getModelSnapshot_DiffModified();

		/**
		 * The meta object literal for the '<em><b>Diff Created</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SNAPSHOT__DIFF_CREATED = eINSTANCE.getModelSnapshot_DiffCreated();

		/**
		 * The meta object literal for the '<em><b>Diff Deleted</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SNAPSHOT__DIFF_DELETED = eINSTANCE.getModelSnapshot_DiffDeleted();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SNAPSHOT__NEXT = eINSTANCE.getModelSnapshot_Next();

	}

} //RepositoryPackage
