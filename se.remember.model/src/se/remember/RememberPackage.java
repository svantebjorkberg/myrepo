/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see se.remember.RememberFactory
 * @model kind="package"
 * @generated
 */
public interface RememberPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "remember";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://remember/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "remember";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RememberPackage eINSTANCE = se.remember.impl.RememberPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.remember.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.NodeImpl
	 * @see se.remember.impl.RememberPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_ID = 0;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT_NODE_ID = 2;

	/**
	 * The feature id for the '<em><b>Parent Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT_NODE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DATE_CREATED = 7;

	/**
	 * The feature id for the '<em><b>Date Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DATE_MODIFIED = 8;

	/**
	 * The feature id for the '<em><b>Marked For Deletion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MARKED_FOR_DELETION = 9;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CUSTOMER = 10;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROJECT = 11;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link se.remember.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.FolderImpl
	 * @see se.remember.impl.RememberPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NODE_TYPE = NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT_NODE_ID = NODE__PARENT_NODE_ID;

	/**
	 * The feature id for the '<em><b>Parent Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT_NODE_TYPE = NODE__PARENT_NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SEQUENCE = NODE__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DATE_CREATED = NODE__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Date Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DATE_MODIFIED = NODE__DATE_MODIFIED;

	/**
	 * The feature id for the '<em><b>Marked For Deletion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__MARKED_FOR_DELETION = NODE__MARKED_FOR_DELETION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CUSTOMER = NODE__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PROJECT = NODE__PROJECT;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TASKS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FOLDERS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__WORKSPACE = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link se.remember.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.TaskImpl
	 * @see se.remember.impl.RememberPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NODE_TYPE = NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_NODE_ID = NODE__PARENT_NODE_ID;

	/**
	 * The feature id for the '<em><b>Parent Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_NODE_TYPE = NODE__PARENT_NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SEQUENCE = NODE__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATE_CREATED = NODE__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Date Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATE_MODIFIED = NODE__DATE_MODIFIED;

	/**
	 * The feature id for the '<em><b>Marked For Deletion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MARKED_FOR_DELETION = NODE__MARKED_FOR_DELETION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CUSTOMER = NODE__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROJECT = NODE__PROJECT;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_ID = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BUDGET = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TEXT = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DONE = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Spent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIME_SPENT = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NODE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link se.remember.impl.KeyManagerImpl <em>Key Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.KeyManagerImpl
	 * @see se.remember.impl.RememberPackageImpl#getKeyManager()
	 * @generated
	 */
	int KEY_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Key Id Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANAGER__KEY_ID_PAIRS = 0;

	/**
	 * The number of structural features of the '<em>Key Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.remember.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.CustomerImpl
	 * @see se.remember.impl.RememberPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PROJECTS = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NODES = 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link se.remember.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.ProjectImpl
	 * @see se.remember.impl.RememberPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 5;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Project Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NODES = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link se.remember.impl.CustomersImpl <em>Customers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.CustomersImpl
	 * @see se.remember.impl.RememberPackageImpl#getCustomers()
	 * @generated
	 */
	int CUSTOMERS = 6;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS__CUSTOMERS = 0;

	/**
	 * The number of structural features of the '<em>Customers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.remember.impl.KeyIdPairImpl <em>Key Id Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.KeyIdPairImpl
	 * @see se.remember.impl.RememberPackageImpl#getKeyIdPair()
	 * @generated
	 */
	int KEY_ID_PAIR = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ID_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ID_PAIR__ID = 1;

	/**
	 * The number of structural features of the '<em>Key Id Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ID_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link se.remember.impl.TimeSpentImpl <em>Time Spent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.TimeSpentImpl
	 * @see se.remember.impl.RememberPackageImpl#getTimeSpent()
	 * @generated
	 */
	int TIME_SPENT = 8;

	/**
	 * The feature id for the '<em><b>Time Spent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__TIME_SPENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__MINUTES = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Invoiced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__INVOICED = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__TASK = 6;

	/**
	 * The feature id for the '<em><b>Invoice Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT__INVOICE_SPECIFICATION = 7;

	/**
	 * The number of structural features of the '<em>Time Spent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link se.remember.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.YearImpl
	 * @see se.remember.impl.RememberPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 9;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Invoice Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__INVOICE_SPECIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Years</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__YEARS = 2;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link se.remember.impl.InvoiceSpecificationImpl <em>Invoice Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.InvoiceSpecificationImpl
	 * @see se.remember.impl.RememberPackageImpl#getInvoiceSpecification()
	 * @generated
	 */
	int INVOICE_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_SPECIFICATION__MONTH = 0;

	/**
	 * The feature id for the '<em><b>Time Spent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_SPECIFICATION__TIME_SPENT = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_SPECIFICATION__YEAR = 2;

	/**
	 * The number of structural features of the '<em>Invoice Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link se.remember.impl.YearsImpl <em>Years</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.remember.impl.YearsImpl
	 * @see se.remember.impl.RememberPackageImpl#getYears()
	 * @generated
	 */
	int YEARS = 11;

	/**
	 * The feature id for the '<em><b>Year</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEARS__YEAR = 0;

	/**
	 * The number of structural features of the '<em>Years</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEARS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>gregorian Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.GregorianCalendar
	 * @see se.remember.impl.RememberPackageImpl#getgregorianCalendar()
	 * @generated
	 */
	int GREGORIAN_CALENDAR = 12;


	/**
	 * Returns the meta object for class '{@link se.remember.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see se.remember.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Folder#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see se.remember.Folder#getTasks()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Folder#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Folders</em>'.
	 * @see se.remember.Folder#getFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Folders();

	/**
	 * Returns the meta object for the reference '{@link se.remember.Folder#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see se.remember.Folder#getParent()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Parent();

	/**
	 * Returns the meta object for the reference '{@link se.remember.Folder#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workspace</em>'.
	 * @see se.remember.Folder#getWorkspace()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Workspace();

	/**
	 * Returns the meta object for class '{@link se.remember.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see se.remember.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Task#getTaskId <em>Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Id</em>'.
	 * @see se.remember.Task#getTaskId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskId();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see se.remember.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Task#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see se.remember.Task#getStatus()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Status();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Task#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget</em>'.
	 * @see se.remember.Task#getBudget()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Budget();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Task#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see se.remember.Task#getText()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Text();

	/**
	 * Returns the meta object for the reference '{@link se.remember.Task#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see se.remember.Task#getParent()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Parent();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Task#isDone <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see se.remember.Task#isDone()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Done();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Task#getTimeSpent <em>Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Spent</em>'.
	 * @see se.remember.Task#getTimeSpent()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TimeSpent();

	/**
	 * Returns the meta object for class '{@link se.remember.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see se.remember.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see se.remember.Node#getNodeId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see se.remember.Node#getNodeType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getParentNodeId <em>Parent Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Node Id</em>'.
	 * @see se.remember.Node#getParentNodeId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ParentNodeId();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getParentNodeType <em>Parent Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Node Type</em>'.
	 * @see se.remember.Node#getParentNodeType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ParentNodeType();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see se.remember.Node#getSequence()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.remember.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.remember.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see se.remember.Node#getDateCreated()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#getDateModified <em>Date Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Modified</em>'.
	 * @see se.remember.Node#getDateModified()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_DateModified();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Node#isMarkedForDeletion <em>Marked For Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marked For Deletion</em>'.
	 * @see se.remember.Node#isMarkedForDeletion()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_MarkedForDeletion();

	/**
	 * Returns the meta object for the reference '{@link se.remember.Node#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see se.remember.Node#getCustomer()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Customer();

	/**
	 * Returns the meta object for the reference '{@link se.remember.Node#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see se.remember.Node#getProject()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Project();

	/**
	 * Returns the meta object for class '{@link se.remember.KeyManager <em>Key Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Manager</em>'.
	 * @see se.remember.KeyManager
	 * @generated
	 */
	EClass getKeyManager();

	/**
	 * Returns the meta object for the containment reference list '{@link se.remember.KeyManager#getKeyIdPairs <em>Key Id Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Id Pairs</em>'.
	 * @see se.remember.KeyManager#getKeyIdPairs()
	 * @see #getKeyManager()
	 * @generated
	 */
	EReference getKeyManager_KeyIdPairs();

	/**
	 * Returns the meta object for class '{@link se.remember.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see se.remember.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Customer#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see se.remember.Customer#getCustomerId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerId();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.remember.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Customer#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see se.remember.Customer#getProjects()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Projects();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Customer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see se.remember.Customer#getNodes()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Nodes();

	/**
	 * Returns the meta object for class '{@link se.remember.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see se.remember.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Project#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see se.remember.Project#getProjectId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Project#getProjectNumber <em>Project Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Number</em>'.
	 * @see se.remember.Project#getProjectNumber()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectNumber();

	/**
	 * Returns the meta object for the reference '{@link se.remember.Project#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see se.remember.Project#getCustomer()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Customer();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.remember.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Project#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see se.remember.Project#getNodes()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Nodes();

	/**
	 * Returns the meta object for class '{@link se.remember.Customers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customers</em>'.
	 * @see se.remember.Customers
	 * @generated
	 */
	EClass getCustomers();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Customers#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customers</em>'.
	 * @see se.remember.Customers#getCustomers()
	 * @see #getCustomers()
	 * @generated
	 */
	EReference getCustomers_Customers();

	/**
	 * Returns the meta object for class '{@link se.remember.KeyIdPair <em>Key Id Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Id Pair</em>'.
	 * @see se.remember.KeyIdPair
	 * @generated
	 */
	EClass getKeyIdPair();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.KeyIdPair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see se.remember.KeyIdPair#getKey()
	 * @see #getKeyIdPair()
	 * @generated
	 */
	EAttribute getKeyIdPair_Key();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.KeyIdPair#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see se.remember.KeyIdPair#getId()
	 * @see #getKeyIdPair()
	 * @generated
	 */
	EAttribute getKeyIdPair_Id();

	/**
	 * Returns the meta object for class '{@link se.remember.TimeSpent <em>Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Spent</em>'.
	 * @see se.remember.TimeSpent
	 * @generated
	 */
	EClass getTimeSpent();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.TimeSpent#getTimeSpentId <em>Time Spent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Spent Id</em>'.
	 * @see se.remember.TimeSpent#getTimeSpentId()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EAttribute getTimeSpent_TimeSpentId();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.TimeSpent#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see se.remember.TimeSpent#getDate()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EAttribute getTimeSpent_Date();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.TimeSpent#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see se.remember.TimeSpent#getMinutes()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EAttribute getTimeSpent_Minutes();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.TimeSpent#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see se.remember.TimeSpent#getComment()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EAttribute getTimeSpent_Comment();

	/**
	 * Returns the meta object for the reference '{@link se.remember.TimeSpent#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see se.remember.TimeSpent#getProject()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EReference getTimeSpent_Project();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.TimeSpent#isInvoiced <em>Invoiced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoiced</em>'.
	 * @see se.remember.TimeSpent#isInvoiced()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EAttribute getTimeSpent_Invoiced();

	/**
	 * Returns the meta object for the reference '{@link se.remember.TimeSpent#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see se.remember.TimeSpent#getTask()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EReference getTimeSpent_Task();

	/**
	 * Returns the meta object for the reference '{@link se.remember.TimeSpent#getInvoiceSpecification <em>Invoice Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Specification</em>'.
	 * @see se.remember.TimeSpent#getInvoiceSpecification()
	 * @see #getTimeSpent()
	 * @generated
	 */
	EReference getTimeSpent_InvoiceSpecification();

	/**
	 * Returns the meta object for class '{@link se.remember.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see se.remember.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.Year#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see se.remember.Year#getYear()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Year();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Year#getInvoiceSpecifications <em>Invoice Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Specifications</em>'.
	 * @see se.remember.Year#getInvoiceSpecifications()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_InvoiceSpecifications();

	/**
	 * Returns the meta object for the reference '{@link se.remember.Year#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Years</em>'.
	 * @see se.remember.Year#getYears()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Years();

	/**
	 * Returns the meta object for class '{@link se.remember.InvoiceSpecification <em>Invoice Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice Specification</em>'.
	 * @see se.remember.InvoiceSpecification
	 * @generated
	 */
	EClass getInvoiceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link se.remember.InvoiceSpecification#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see se.remember.InvoiceSpecification#getMonth()
	 * @see #getInvoiceSpecification()
	 * @generated
	 */
	EAttribute getInvoiceSpecification_Month();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.InvoiceSpecification#getTimeSpent <em>Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Spent</em>'.
	 * @see se.remember.InvoiceSpecification#getTimeSpent()
	 * @see #getInvoiceSpecification()
	 * @generated
	 */
	EReference getInvoiceSpecification_TimeSpent();

	/**
	 * Returns the meta object for the reference '{@link se.remember.InvoiceSpecification#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Year</em>'.
	 * @see se.remember.InvoiceSpecification#getYear()
	 * @see #getInvoiceSpecification()
	 * @generated
	 */
	EReference getInvoiceSpecification_Year();

	/**
	 * Returns the meta object for class '{@link se.remember.Years <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Years</em>'.
	 * @see se.remember.Years
	 * @generated
	 */
	EClass getYears();

	/**
	 * Returns the meta object for the reference list '{@link se.remember.Years#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Year</em>'.
	 * @see se.remember.Years#getYear()
	 * @see #getYears()
	 * @generated
	 */
	EReference getYears_Year();

	/**
	 * Returns the meta object for data type '{@link java.util.GregorianCalendar <em>gregorian Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>gregorian Calendar</em>'.
	 * @see java.util.GregorianCalendar
	 * @model instanceClass="java.util.GregorianCalendar"
	 * @generated
	 */
	EDataType getgregorianCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RememberFactory getRememberFactory();

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
		 * The meta object literal for the '{@link se.remember.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.FolderImpl
		 * @see se.remember.impl.RememberPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__TASKS = eINSTANCE.getFolder_Tasks();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__FOLDERS = eINSTANCE.getFolder_Folders();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__PARENT = eINSTANCE.getFolder_Parent();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__WORKSPACE = eINSTANCE.getFolder_Workspace();

		/**
		 * The meta object literal for the '{@link se.remember.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.TaskImpl
		 * @see se.remember.impl.RememberPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_ID = eINSTANCE.getTask_TaskId();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__BUDGET = eINSTANCE.getTask_Budget();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TEXT = eINSTANCE.getTask_Text();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT = eINSTANCE.getTask_Parent();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DONE = eINSTANCE.getTask_Done();

		/**
		 * The meta object literal for the '<em><b>Time Spent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TIME_SPENT = eINSTANCE.getTask_TimeSpent();

		/**
		 * The meta object literal for the '{@link se.remember.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.NodeImpl
		 * @see se.remember.impl.RememberPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_ID = eINSTANCE.getNode_NodeId();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_TYPE = eINSTANCE.getNode_NodeType();

		/**
		 * The meta object literal for the '<em><b>Parent Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PARENT_NODE_ID = eINSTANCE.getNode_ParentNodeId();

		/**
		 * The meta object literal for the '<em><b>Parent Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PARENT_NODE_TYPE = eINSTANCE.getNode_ParentNodeType();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SEQUENCE = eINSTANCE.getNode_Sequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DATE_CREATED = eINSTANCE.getNode_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Date Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DATE_MODIFIED = eINSTANCE.getNode_DateModified();

		/**
		 * The meta object literal for the '<em><b>Marked For Deletion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MARKED_FOR_DELETION = eINSTANCE.getNode_MarkedForDeletion();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CUSTOMER = eINSTANCE.getNode_Customer();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PROJECT = eINSTANCE.getNode_Project();

		/**
		 * The meta object literal for the '{@link se.remember.impl.KeyManagerImpl <em>Key Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.KeyManagerImpl
		 * @see se.remember.impl.RememberPackageImpl#getKeyManager()
		 * @generated
		 */
		EClass KEY_MANAGER = eINSTANCE.getKeyManager();

		/**
		 * The meta object literal for the '<em><b>Key Id Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_MANAGER__KEY_ID_PAIRS = eINSTANCE.getKeyManager_KeyIdPairs();

		/**
		 * The meta object literal for the '{@link se.remember.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.CustomerImpl
		 * @see se.remember.impl.RememberPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_ID = eINSTANCE.getCustomer_CustomerId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PROJECTS = eINSTANCE.getCustomer_Projects();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__NODES = eINSTANCE.getCustomer_Nodes();

		/**
		 * The meta object literal for the '{@link se.remember.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.ProjectImpl
		 * @see se.remember.impl.RememberPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_ID = eINSTANCE.getProject_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Project Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_NUMBER = eINSTANCE.getProject_ProjectNumber();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CUSTOMER = eINSTANCE.getProject_Customer();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__NODES = eINSTANCE.getProject_Nodes();

		/**
		 * The meta object literal for the '{@link se.remember.impl.CustomersImpl <em>Customers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.CustomersImpl
		 * @see se.remember.impl.RememberPackageImpl#getCustomers()
		 * @generated
		 */
		EClass CUSTOMERS = eINSTANCE.getCustomers();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMERS__CUSTOMERS = eINSTANCE.getCustomers_Customers();

		/**
		 * The meta object literal for the '{@link se.remember.impl.KeyIdPairImpl <em>Key Id Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.KeyIdPairImpl
		 * @see se.remember.impl.RememberPackageImpl#getKeyIdPair()
		 * @generated
		 */
		EClass KEY_ID_PAIR = eINSTANCE.getKeyIdPair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_ID_PAIR__KEY = eINSTANCE.getKeyIdPair_Key();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_ID_PAIR__ID = eINSTANCE.getKeyIdPair_Id();

		/**
		 * The meta object literal for the '{@link se.remember.impl.TimeSpentImpl <em>Time Spent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.TimeSpentImpl
		 * @see se.remember.impl.RememberPackageImpl#getTimeSpent()
		 * @generated
		 */
		EClass TIME_SPENT = eINSTANCE.getTimeSpent();

		/**
		 * The meta object literal for the '<em><b>Time Spent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPENT__TIME_SPENT_ID = eINSTANCE.getTimeSpent_TimeSpentId();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPENT__DATE = eINSTANCE.getTimeSpent_Date();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPENT__MINUTES = eINSTANCE.getTimeSpent_Minutes();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPENT__COMMENT = eINSTANCE.getTimeSpent_Comment();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SPENT__PROJECT = eINSTANCE.getTimeSpent_Project();

		/**
		 * The meta object literal for the '<em><b>Invoiced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPENT__INVOICED = eINSTANCE.getTimeSpent_Invoiced();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SPENT__TASK = eINSTANCE.getTimeSpent_Task();

		/**
		 * The meta object literal for the '<em><b>Invoice Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SPENT__INVOICE_SPECIFICATION = eINSTANCE.getTimeSpent_InvoiceSpecification();

		/**
		 * The meta object literal for the '{@link se.remember.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.YearImpl
		 * @see se.remember.impl.RememberPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__YEAR = eINSTANCE.getYear_Year();

		/**
		 * The meta object literal for the '<em><b>Invoice Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__INVOICE_SPECIFICATIONS = eINSTANCE.getYear_InvoiceSpecifications();

		/**
		 * The meta object literal for the '<em><b>Years</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__YEARS = eINSTANCE.getYear_Years();

		/**
		 * The meta object literal for the '{@link se.remember.impl.InvoiceSpecificationImpl <em>Invoice Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.InvoiceSpecificationImpl
		 * @see se.remember.impl.RememberPackageImpl#getInvoiceSpecification()
		 * @generated
		 */
		EClass INVOICE_SPECIFICATION = eINSTANCE.getInvoiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_SPECIFICATION__MONTH = eINSTANCE.getInvoiceSpecification_Month();

		/**
		 * The meta object literal for the '<em><b>Time Spent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_SPECIFICATION__TIME_SPENT = eINSTANCE.getInvoiceSpecification_TimeSpent();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_SPECIFICATION__YEAR = eINSTANCE.getInvoiceSpecification_Year();

		/**
		 * The meta object literal for the '{@link se.remember.impl.YearsImpl <em>Years</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.remember.impl.YearsImpl
		 * @see se.remember.impl.RememberPackageImpl#getYears()
		 * @generated
		 */
		EClass YEARS = eINSTANCE.getYears();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEARS__YEAR = eINSTANCE.getYears_Year();

		/**
		 * The meta object literal for the '<em>gregorian Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.GregorianCalendar
		 * @see se.remember.impl.RememberPackageImpl#getgregorianCalendar()
		 * @generated
		 */
		EDataType GREGORIAN_CALENDAR = eINSTANCE.getgregorianCalendar();

	}

} //RememberPackage
