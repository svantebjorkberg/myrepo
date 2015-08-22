/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Project#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link se.remember.Project#getProjectNumber <em>Project Number</em>}</li>
 *   <li>{@link se.remember.Project#getCustomer <em>Customer</em>}</li>
 *   <li>{@link se.remember.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link se.remember.Project#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(long)
	 * @see se.remember.RememberPackage#getProject_ProjectId()
	 * @model
	 * @generated
	 */
	long getProjectId();

	/**
	 * Sets the value of the '{@link se.remember.Project#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(long value);

	/**
	 * Returns the value of the '<em><b>Project Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Number</em>' attribute.
	 * @see #setProjectNumber(String)
	 * @see se.remember.RememberPackage#getProject_ProjectNumber()
	 * @model required="true"
	 * @generated
	 */
	String getProjectNumber();

	/**
	 * Sets the value of the '{@link se.remember.Project#getProjectNumber <em>Project Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Number</em>' attribute.
	 * @see #getProjectNumber()
	 * @generated
	 */
	void setProjectNumber(String value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Customer#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see se.remember.RememberPackage#getProject_Customer()
	 * @see se.remember.Customer#getProjects
	 * @model opposite="projects" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link se.remember.Project#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see se.remember.RememberPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link se.remember.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link se.remember.Node}.
	 * It is bidirectional and its opposite is '{@link se.remember.Node#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see se.remember.RememberPackage#getProject_Nodes()
	 * @see se.remember.Node#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<Node> getNodes();

} // Project
