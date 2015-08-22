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
 * A representation of the model object '<em><b>Invoice Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.InvoiceSpecification#getMonth <em>Month</em>}</li>
 *   <li>{@link se.remember.InvoiceSpecification#getTimeSpent <em>Time Spent</em>}</li>
 *   <li>{@link se.remember.InvoiceSpecification#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getInvoiceSpecification()
 * @model
 * @generated
 */
public interface InvoiceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(int)
	 * @see se.remember.RememberPackage#getInvoiceSpecification_Month()
	 * @model
	 * @generated
	 */
	int getMonth();

	/**
	 * Sets the value of the '{@link se.remember.InvoiceSpecification#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(int value);

	/**
	 * Returns the value of the '<em><b>Time Spent</b></em>' reference list.
	 * The list contents are of type {@link se.remember.TimeSpent}.
	 * It is bidirectional and its opposite is '{@link se.remember.TimeSpent#getInvoiceSpecification <em>Invoice Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Spent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Spent</em>' reference list.
	 * @see se.remember.RememberPackage#getInvoiceSpecification_TimeSpent()
	 * @see se.remember.TimeSpent#getInvoiceSpecification
	 * @model opposite="invoiceSpecification"
	 * @generated
	 */
	EList<TimeSpent> getTimeSpent();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Year#getInvoiceSpecifications <em>Invoice Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' reference.
	 * @see #setYear(Year)
	 * @see se.remember.RememberPackage#getInvoiceSpecification_Year()
	 * @see se.remember.Year#getInvoiceSpecifications
	 * @model opposite="invoiceSpecifications" required="true"
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link se.remember.InvoiceSpecification#getYear <em>Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

} // InvoiceSpecification
