/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Spent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.TimeSpent#getTimeSpentId <em>Time Spent Id</em>}</li>
 *   <li>{@link se.remember.TimeSpent#getDate <em>Date</em>}</li>
 *   <li>{@link se.remember.TimeSpent#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link se.remember.TimeSpent#getComment <em>Comment</em>}</li>
 *   <li>{@link se.remember.TimeSpent#getProject <em>Project</em>}</li>
 *   <li>{@link se.remember.TimeSpent#isInvoiced <em>Invoiced</em>}</li>
 *   <li>{@link se.remember.TimeSpent#getTask <em>Task</em>}</li>
 *   <li>{@link se.remember.TimeSpent#getInvoiceSpecification <em>Invoice Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getTimeSpent()
 * @model
 * @generated
 */
public interface TimeSpent extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Spent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Spent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Spent Id</em>' attribute.
	 * @see #setTimeSpentId(long)
	 * @see se.remember.RememberPackage#getTimeSpent_TimeSpentId()
	 * @model required="true"
	 * @generated
	 */
	long getTimeSpentId();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#getTimeSpentId <em>Time Spent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Spent Id</em>' attribute.
	 * @see #getTimeSpentId()
	 * @generated
	 */
	void setTimeSpentId(long value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see se.remember.RememberPackage#getTimeSpent_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(int)
	 * @see se.remember.RememberPackage#getTimeSpent_Minutes()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinutes();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see se.remember.RememberPackage#getTimeSpent_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see se.remember.RememberPackage#getTimeSpent_Project()
	 * @model
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Invoiced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoiced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoiced</em>' attribute.
	 * @see #setInvoiced(boolean)
	 * @see se.remember.RememberPackage#getTimeSpent_Invoiced()
	 * @model required="true"
	 * @generated
	 */
	boolean isInvoiced();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#isInvoiced <em>Invoiced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoiced</em>' attribute.
	 * @see #isInvoiced()
	 * @generated
	 */
	void setInvoiced(boolean value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Task#getTimeSpent <em>Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see se.remember.RememberPackage#getTimeSpent_Task()
	 * @see se.remember.Task#getTimeSpent
	 * @model opposite="timeSpent" required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Invoice Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.InvoiceSpecification#getTimeSpent <em>Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Specification</em>' reference.
	 * @see #setInvoiceSpecification(InvoiceSpecification)
	 * @see se.remember.RememberPackage#getTimeSpent_InvoiceSpecification()
	 * @see se.remember.InvoiceSpecification#getTimeSpent
	 * @model opposite="timeSpent" required="true"
	 * @generated
	 */
	InvoiceSpecification getInvoiceSpecification();

	/**
	 * Sets the value of the '{@link se.remember.TimeSpent#getInvoiceSpecification <em>Invoice Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Specification</em>' reference.
	 * @see #getInvoiceSpecification()
	 * @generated
	 */
	void setInvoiceSpecification(InvoiceSpecification value);

} // TimeSpent
