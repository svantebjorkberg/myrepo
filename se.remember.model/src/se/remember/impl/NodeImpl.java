/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember.impl;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import se.remember.Customer;
import se.remember.Folder;
import se.remember.Node;
import se.remember.Project;
import se.remember.RememberPackage;
import se.remember.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.remember.impl.NodeImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getParentNodeId <em>Parent Node Id</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getParentNodeType <em>Parent Node Type</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#isMarkedForDeletion <em>Marked For Deletion</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link se.remember.impl.NodeImpl#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final long NODE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected long nodeId = NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected String nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentNodeId() <em>Parent Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final long PARENT_NODE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getParentNodeId() <em>Parent Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeId()
	 * @generated
	 * @ordered
	 */
	protected long parentNodeId = PARENT_NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentNodeType() <em>Parent Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NODE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentNodeType() <em>Parent Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodeType()
	 * @generated
	 * @ordered
	 */
	protected String parentNodeType = PARENT_NODE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected int sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected Date dateCreated = DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateModified() <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateModified() <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModified()
	 * @generated
	 * @ordered
	 */
	protected Date dateModified = DATE_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #isMarkedForDeletion() <em>Marked For Deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkedForDeletion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARKED_FOR_DELETION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarkedForDeletion() <em>Marked For Deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkedForDeletion()
	 * @generated
	 * @ordered
	 */
	protected boolean markedForDeletion = MARKED_FOR_DELETION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected NodeImpl() {
		super();
		this.dateCreated	= new Date();
		this.dateModified	= new Date();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RememberPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(long newNodeId) {
		long oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__NODE_ID, oldNodeId, nodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(String newNodeType) {
		String oldNodeType = nodeType;
		nodeType = newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__NODE_TYPE, oldNodeType, nodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getParentNodeId() {
		return parentNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNodeId(long newParentNodeId) {
		long oldParentNodeId = parentNodeId;
		parentNodeId = newParentNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__PARENT_NODE_ID, oldParentNodeId, parentNodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentNodeType() {
		return parentNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNodeType(String newParentNodeType) {
		String oldParentNodeType = parentNodeType;
		parentNodeType = newParentNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__PARENT_NODE_TYPE, oldParentNodeType, parentNodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(int newSequence) {
		int oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreated(Date newDateCreated) {
		Date oldDateCreated = dateCreated;
		dateCreated = newDateCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateModified() {
		return dateModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateModified(Date newDateModified) {
		Date oldDateModified = dateModified;
		dateModified = newDateModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__DATE_MODIFIED, oldDateModified, dateModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarkedForDeletion() {
		return markedForDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkedForDeletion(boolean newMarkedForDeletion) {
		boolean oldMarkedForDeletion = markedForDeletion;
		markedForDeletion = newMarkedForDeletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__MARKED_FOR_DELETION, oldMarkedForDeletion, markedForDeletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RememberPackage.NODE__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, RememberPackage.CUSTOMER__NODES, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, RememberPackage.CUSTOMER__NODES, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RememberPackage.NODE__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, RememberPackage.PROJECT__NODES, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, RememberPackage.PROJECT__NODES, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.NODE__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RememberPackage.NODE__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, RememberPackage.CUSTOMER__NODES, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case RememberPackage.NODE__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, RememberPackage.PROJECT__NODES, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RememberPackage.NODE__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case RememberPackage.NODE__PROJECT:
				return basicSetProject(null, msgs);
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
			case RememberPackage.NODE__NODE_ID:
				return getNodeId();
			case RememberPackage.NODE__NODE_TYPE:
				return getNodeType();
			case RememberPackage.NODE__PARENT_NODE_ID:
				return getParentNodeId();
			case RememberPackage.NODE__PARENT_NODE_TYPE:
				return getParentNodeType();
			case RememberPackage.NODE__SEQUENCE:
				return getSequence();
			case RememberPackage.NODE__NAME:
				return getName();
			case RememberPackage.NODE__DESCRIPTION:
				return getDescription();
			case RememberPackage.NODE__DATE_CREATED:
				return getDateCreated();
			case RememberPackage.NODE__DATE_MODIFIED:
				return getDateModified();
			case RememberPackage.NODE__MARKED_FOR_DELETION:
				return isMarkedForDeletion();
			case RememberPackage.NODE__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case RememberPackage.NODE__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RememberPackage.NODE__NODE_ID:
				setNodeId((Long)newValue);
				return;
			case RememberPackage.NODE__NODE_TYPE:
				setNodeType((String)newValue);
				return;
			case RememberPackage.NODE__PARENT_NODE_ID:
				setParentNodeId((Long)newValue);
				return;
			case RememberPackage.NODE__PARENT_NODE_TYPE:
				setParentNodeType((String)newValue);
				return;
			case RememberPackage.NODE__SEQUENCE:
				setSequence((Integer)newValue);
				return;
			case RememberPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case RememberPackage.NODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RememberPackage.NODE__DATE_CREATED:
				setDateCreated((Date)newValue);
				return;
			case RememberPackage.NODE__DATE_MODIFIED:
				setDateModified((Date)newValue);
				return;
			case RememberPackage.NODE__MARKED_FOR_DELETION:
				setMarkedForDeletion((Boolean)newValue);
				return;
			case RememberPackage.NODE__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case RememberPackage.NODE__PROJECT:
				setProject((Project)newValue);
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
			case RememberPackage.NODE__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case RememberPackage.NODE__NODE_TYPE:
				setNodeType(NODE_TYPE_EDEFAULT);
				return;
			case RememberPackage.NODE__PARENT_NODE_ID:
				setParentNodeId(PARENT_NODE_ID_EDEFAULT);
				return;
			case RememberPackage.NODE__PARENT_NODE_TYPE:
				setParentNodeType(PARENT_NODE_TYPE_EDEFAULT);
				return;
			case RememberPackage.NODE__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case RememberPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RememberPackage.NODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RememberPackage.NODE__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case RememberPackage.NODE__DATE_MODIFIED:
				setDateModified(DATE_MODIFIED_EDEFAULT);
				return;
			case RememberPackage.NODE__MARKED_FOR_DELETION:
				setMarkedForDeletion(MARKED_FOR_DELETION_EDEFAULT);
				return;
			case RememberPackage.NODE__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case RememberPackage.NODE__PROJECT:
				setProject((Project)null);
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
			case RememberPackage.NODE__NODE_ID:
				return nodeId != NODE_ID_EDEFAULT;
			case RememberPackage.NODE__NODE_TYPE:
				return NODE_TYPE_EDEFAULT == null ? nodeType != null : !NODE_TYPE_EDEFAULT.equals(nodeType);
			case RememberPackage.NODE__PARENT_NODE_ID:
				return parentNodeId != PARENT_NODE_ID_EDEFAULT;
			case RememberPackage.NODE__PARENT_NODE_TYPE:
				return PARENT_NODE_TYPE_EDEFAULT == null ? parentNodeType != null : !PARENT_NODE_TYPE_EDEFAULT.equals(parentNodeType);
			case RememberPackage.NODE__SEQUENCE:
				return sequence != SEQUENCE_EDEFAULT;
			case RememberPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RememberPackage.NODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RememberPackage.NODE__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case RememberPackage.NODE__DATE_MODIFIED:
				return DATE_MODIFIED_EDEFAULT == null ? dateModified != null : !DATE_MODIFIED_EDEFAULT.equals(dateModified);
			case RememberPackage.NODE__MARKED_FOR_DELETION:
				return markedForDeletion != MARKED_FOR_DELETION_EDEFAULT;
			case RememberPackage.NODE__CUSTOMER:
				return customer != null;
			case RememberPackage.NODE__PROJECT:
				return project != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nodeId: ");
		result.append(nodeId);
		result.append(", nodeType: ");
		result.append(nodeType);
		result.append(", parentNodeId: ");
		result.append(parentNodeId);
		result.append(", parentNodeType: ");
		result.append(parentNodeType);
		result.append(", sequence: ");
		result.append(sequence);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", dateCreated: ");
		result.append(dateCreated);
		result.append(", dateModified: ");
		result.append(dateModified);
		result.append(", markedForDeletion: ");
		result.append(markedForDeletion);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * The customer should be inherited to sub-nodes. This method returns
	 * the customer from the first parent with a customer defined.
	 * @param node
	 * @return customer - first Customer defined up-streams. 
	 */
	public Customer getCustomerFromParent() {
		Customer customer = null;
		Node node = this;
		
		while (node != null) {
			customer = node.getCustomer();
			if (customer != null) break;
			
			switch (node.eClass().getClassifierID()) {
				case RememberPackage.FOLDER:
					node = ((Folder)node).getParent();
					break;

				case RememberPackage.TASK:
					node = ((Task)node).getParent();
					break;
					
				default:
					node = null;
			}
		}

		return customer;
	}
	
	/**
	 * The project should be inherited to sub-nodes. This method returns
	 * the project from the first parent with a <ul>customer</ul> defined. If that 
	 * node has no project deined this method returns <null>. The reason
	 * we check the customer is that this customer is inherited to sub-nodes
	 * and this customer defines available project numbers. If no project is
	 * defined then there is no default project number or sub-nodes. 
	 * @param node
	 * @return customer - first Customer defined up-streams. 
	 */
	public Project getProjectFromParent() {
		Project project = null;
		Node node = this;
		
		while (node != null) {
			if (node.getCustomer() != null) {
				project = node.getProject();
				break;
			}
			
			switch (node.eClass().getClassifierID()) {
				case RememberPackage.FOLDER:
					node = ((Folder)node).getParent();
					break;

				case RememberPackage.TASK:
					node = ((Task)node).getParent();
					break;
					
				default:
					node = null;
			}
		}

		return project;
	}

} //NodeImpl
