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
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Customer#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link se.remember.Customer#getName <em>Name</em>}</li>
 *   <li>{@link se.remember.Customer#getProjects <em>Projects</em>}</li>
 *   <li>{@link se.remember.Customer#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(long)
	 * @see se.remember.RememberPackage#getCustomer_CustomerId()
	 * @model required="true"
	 * @generated
	 */
	long getCustomerId();

	/**
	 * Sets the value of the '{@link se.remember.Customer#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.remember.RememberPackage#getCustomer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.remember.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link se.remember.Project}.
	 * It is bidirectional and its opposite is '{@link se.remember.Project#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see se.remember.RememberPackage#getCustomer_Projects()
	 * @see se.remember.Project#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link se.remember.Node}.
	 * It is bidirectional and its opposite is '{@link se.remember.Node#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see se.remember.RememberPackage#getCustomer_Nodes()
	 * @see se.remember.Node#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Node> getNodes();

} // Customer
