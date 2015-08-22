/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Task#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link se.remember.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link se.remember.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link se.remember.Task#getBudget <em>Budget</em>}</li>
 *   <li>{@link se.remember.Task#getText <em>Text</em>}</li>
 *   <li>{@link se.remember.Task#getParent <em>Parent</em>}</li>
 *   <li>{@link se.remember.Task#isDone <em>Done</em>}</li>
 *   <li>{@link se.remember.Task#getTimeSpent <em>Time Spent</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Node {
	/**
	 * Returns the value of the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Id</em>' attribute.
	 * @see #setTaskId(int)
	 * @see se.remember.RememberPackage#getTask_TaskId()
	 * @model required="true"
	 * @generated
	 */
	int getTaskId();

	/**
	 * Sets the value of the '{@link se.remember.Task#getTaskId <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Id</em>' attribute.
	 * @see #getTaskId()
	 * @generated
	 */
	void setTaskId(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see se.remember.RememberPackage#getTask_Priority()
	 * @model required="true"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link se.remember.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see se.remember.RememberPackage#getTask_Status()
	 * @model required="true"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link se.remember.Task#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' attribute.
	 * @see #setBudget(String)
	 * @see se.remember.RememberPackage#getTask_Budget()
	 * @model required="true"
	 * @generated
	 */
	String getBudget();

	/**
	 * Sets the value of the '{@link se.remember.Task#getBudget <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' attribute.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see se.remember.RememberPackage#getTask_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link se.remember.Task#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Folder#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Folder)
	 * @see se.remember.RememberPackage#getTask_Parent()
	 * @see se.remember.Folder#getTasks
	 * @model opposite="Tasks"
	 * @generated
	 */
	Folder getParent();

	/**
	 * Sets the value of the '{@link se.remember.Task#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Folder value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see se.remember.RememberPackage#getTask_Done()
	 * @model default="false"
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link se.remember.Task#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Spent</b></em>' reference list.
	 * The list contents are of type {@link se.remember.TimeSpent}.
	 * It is bidirectional and its opposite is '{@link se.remember.TimeSpent#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Spent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Spent</em>' reference list.
	 * @see se.remember.RememberPackage#getTask_TimeSpent()
	 * @see se.remember.TimeSpent#getTask
	 * @model opposite="task"
	 * @generated
	 */
	EList<TimeSpent> getTimeSpent();

} // Task
