/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember.impl;

import java.util.Date;
import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import se.remember.InvoiceSpecification;
import se.remember.Project;
import se.remember.RememberPackage;
import se.remember.Task;
import se.remember.TimeSpent;
import se.remember.Year;
import se.remember.Years;
import se.remember.util.PersistXMI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Spent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.remember.impl.TimeSpentImpl#getTimeSpentId <em>Time Spent Id</em>}</li>
 *   <li>{@link se.remember.impl.TimeSpentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link se.remember.impl.TimeSpentImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link se.remember.impl.TimeSpentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link se.remember.impl.TimeSpentImpl#getProject <em>Project</em>}</li>
 *   <li>{@link se.remember.impl.TimeSpentImpl#isInvoiced <em>Invoiced</em>}</li>
 *   <li>{@link se.remember.impl.TimeSpentImpl#getTask <em>Task</em>}</li>
 *   <li>{@link se.remember.impl.TimeSpentImpl#getInvoiceSpecification <em>Invoice Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeSpentImpl extends EObjectImpl implements TimeSpent {
	/**
	 * The default value of the '{@link #getTimeSpentId() <em>Time Spent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpentId()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_SPENT_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeSpentId() <em>Time Spent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpentId()
	 * @generated
	 * @ordered
	 */
	protected long timeSpentId = TIME_SPENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected int minutes = MINUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	 * The default value of the '{@link #isInvoiced() <em>Invoiced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvoiced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVOICED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvoiced() <em>Invoiced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvoiced()
	 * @generated
	 * @ordered
	 */
	protected boolean invoiced = INVOICED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getInvoiceSpecification() <em>Invoice Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceSpecification()
	 * @generated
	 * @ordered
	 */
	protected InvoiceSpecification invoiceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSpentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RememberPackage.Literals.TIME_SPENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeSpentId() {
		return timeSpentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSpentId(long newTimeSpentId) {
		long oldTimeSpentId = timeSpentId;
		timeSpentId = newTimeSpentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__TIME_SPENT_ID, oldTimeSpentId, timeSpentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes(int newMinutes) {
		int oldMinutes = minutes;
		minutes = newMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__MINUTES, oldMinutes, minutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__COMMENT, oldComment, comment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RememberPackage.TIME_SPENT__PROJECT, oldProject, project));
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
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvoiced() {
		return invoiced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiced(boolean newInvoiced) {
		boolean oldInvoiced = invoiced;
		invoiced = newInvoiced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__INVOICED, oldInvoiced, invoiced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RememberPackage.TIME_SPENT__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, RememberPackage.TASK__TIME_SPENT, Task.class, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, RememberPackage.TASK__TIME_SPENT, Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceSpecification getInvoiceSpecification() {
		if (invoiceSpecification != null && invoiceSpecification.eIsProxy()) {
			InternalEObject oldInvoiceSpecification = (InternalEObject)invoiceSpecification;
			invoiceSpecification = (InvoiceSpecification)eResolveProxy(oldInvoiceSpecification);
			if (invoiceSpecification != oldInvoiceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION, oldInvoiceSpecification, invoiceSpecification));
			}
		}
		return invoiceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceSpecification basicGetInvoiceSpecification() {
		return invoiceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoiceSpecification(InvoiceSpecification newInvoiceSpecification, NotificationChain msgs) {
		InvoiceSpecification oldInvoiceSpecification = invoiceSpecification;
		invoiceSpecification = newInvoiceSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION, oldInvoiceSpecification, newInvoiceSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceSpecification(InvoiceSpecification newInvoiceSpecification) {
		if (newInvoiceSpecification != invoiceSpecification) {
			NotificationChain msgs = null;
			if (invoiceSpecification != null)
				msgs = ((InternalEObject)invoiceSpecification).eInverseRemove(this, RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT, InvoiceSpecification.class, msgs);
			if (newInvoiceSpecification != null)
				msgs = ((InternalEObject)newInvoiceSpecification).eInverseAdd(this, RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT, InvoiceSpecification.class, msgs);
			msgs = basicSetInvoiceSpecification(newInvoiceSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION, newInvoiceSpecification, newInvoiceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RememberPackage.TIME_SPENT__TASK:
				if (task != null)
					msgs = ((InternalEObject)task).eInverseRemove(this, RememberPackage.TASK__TIME_SPENT, Task.class, msgs);
				return basicSetTask((Task)otherEnd, msgs);
			case RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION:
				if (invoiceSpecification != null)
					msgs = ((InternalEObject)invoiceSpecification).eInverseRemove(this, RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT, InvoiceSpecification.class, msgs);
				return basicSetInvoiceSpecification((InvoiceSpecification)otherEnd, msgs);
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
			case RememberPackage.TIME_SPENT__TASK:
				return basicSetTask(null, msgs);
			case RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION:
				return basicSetInvoiceSpecification(null, msgs);
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
			case RememberPackage.TIME_SPENT__TIME_SPENT_ID:
				return getTimeSpentId();
			case RememberPackage.TIME_SPENT__DATE:
				return getDate();
			case RememberPackage.TIME_SPENT__MINUTES:
				return getMinutes();
			case RememberPackage.TIME_SPENT__COMMENT:
				return getComment();
			case RememberPackage.TIME_SPENT__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case RememberPackage.TIME_SPENT__INVOICED:
				return isInvoiced();
			case RememberPackage.TIME_SPENT__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION:
				if (resolve) return getInvoiceSpecification();
				return basicGetInvoiceSpecification();
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
			case RememberPackage.TIME_SPENT__TIME_SPENT_ID:
				setTimeSpentId((Long)newValue);
				return;
			case RememberPackage.TIME_SPENT__DATE:
				setDate((Date)newValue);
				return;
			case RememberPackage.TIME_SPENT__MINUTES:
				setMinutes((Integer)newValue);
				return;
			case RememberPackage.TIME_SPENT__COMMENT:
				setComment((String)newValue);
				return;
			case RememberPackage.TIME_SPENT__PROJECT:
				setProject((Project)newValue);
				return;
			case RememberPackage.TIME_SPENT__INVOICED:
				setInvoiced((Boolean)newValue);
				return;
			case RememberPackage.TIME_SPENT__TASK:
				setTask((Task)newValue);
				return;
			case RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION:
				setInvoiceSpecification((InvoiceSpecification)newValue);
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
			case RememberPackage.TIME_SPENT__TIME_SPENT_ID:
				setTimeSpentId(TIME_SPENT_ID_EDEFAULT);
				return;
			case RememberPackage.TIME_SPENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case RememberPackage.TIME_SPENT__MINUTES:
				setMinutes(MINUTES_EDEFAULT);
				return;
			case RememberPackage.TIME_SPENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RememberPackage.TIME_SPENT__PROJECT:
				setProject((Project)null);
				return;
			case RememberPackage.TIME_SPENT__INVOICED:
				setInvoiced(INVOICED_EDEFAULT);
				return;
			case RememberPackage.TIME_SPENT__TASK:
				setTask((Task)null);
				return;
			case RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION:
				setInvoiceSpecification((InvoiceSpecification)null);
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
			case RememberPackage.TIME_SPENT__TIME_SPENT_ID:
				return timeSpentId != TIME_SPENT_ID_EDEFAULT;
			case RememberPackage.TIME_SPENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case RememberPackage.TIME_SPENT__MINUTES:
				return minutes != MINUTES_EDEFAULT;
			case RememberPackage.TIME_SPENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RememberPackage.TIME_SPENT__PROJECT:
				return project != null;
			case RememberPackage.TIME_SPENT__INVOICED:
				return invoiced != INVOICED_EDEFAULT;
			case RememberPackage.TIME_SPENT__TASK:
				return task != null;
			case RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION:
				return invoiceSpecification != null;
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
		result.append(" (timeSpentId: ");
		result.append(timeSpentId);
		result.append(", date: ");
		result.append(date);
		result.append(", minutes: ");
		result.append(minutes);
		result.append(", comment: ");
		result.append(comment);
		result.append(", invoiced: ");
		result.append(invoiced);
		result.append(')');
		return result.toString();
	}

} //TimeSpentImpl
