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
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Folder#getTasks <em>Tasks</em>}</li>
 *   <li>{@link se.remember.Folder#getFolders <em>Folders</em>}</li>
 *   <li>{@link se.remember.Folder#getParent <em>Parent</em>}</li>
 *   <li>{@link se.remember.Folder#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends Node {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link se.remember.Task}.
	 * It is bidirectional and its opposite is '{@link se.remember.Task#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see se.remember.RememberPackage#getFolder_Tasks()
	 * @see se.remember.Task#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Folders</b></em>' reference list.
	 * The list contents are of type {@link se.remember.Folder}.
	 * It is bidirectional and its opposite is '{@link se.remember.Folder#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' reference list.
	 * @see se.remember.RememberPackage#getFolder_Folders()
	 * @see se.remember.Folder#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Folder> getFolders();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Folder#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Folder)
	 * @see se.remember.RememberPackage#getFolder_Parent()
	 * @see se.remember.Folder#getFolders
	 * @model opposite="folders"
	 * @generated
	 */
	Folder getParent();

	/**
	 * Sets the value of the '{@link se.remember.Folder#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Folder value);

	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' reference.
	 * @see #setWorkspace(Customers)
	 * @see se.remember.RememberPackage#getFolder_Workspace()
	 * @model
	 * @generated
	 */
	Customers getWorkspace();

	/**
	 * Sets the value of the '{@link se.remember.Folder#getWorkspace <em>Workspace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' reference.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(Customers value);

} // Folder
