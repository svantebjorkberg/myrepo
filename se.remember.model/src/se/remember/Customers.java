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
 * A representation of the model object '<em><b>Customers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Customers#getCustomers <em>Customers</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getCustomers()
 * @model
 * @generated
 */
public interface Customers extends EObject {
	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link se.remember.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @see se.remember.RememberPackage#getCustomers_Customers()
	 * @model
	 * @generated
	 */
	EList<Customer> getCustomers();

} // Customers
