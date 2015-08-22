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
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Year#getYear <em>Year</em>}</li>
 *   <li>{@link se.remember.Year#getInvoiceSpecifications <em>Invoice Specifications</em>}</li>
 *   <li>{@link se.remember.Year#getYears <em>Years</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see se.remember.RememberPackage#getYear_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link se.remember.Year#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Invoice Specifications</b></em>' reference list.
	 * The list contents are of type {@link se.remember.InvoiceSpecification}.
	 * It is bidirectional and its opposite is '{@link se.remember.InvoiceSpecification#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Specifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Specifications</em>' reference list.
	 * @see se.remember.RememberPackage#getYear_InvoiceSpecifications()
	 * @see se.remember.InvoiceSpecification#getYear
	 * @model opposite="year"
	 * @generated
	 */
	EList<InvoiceSpecification> getInvoiceSpecifications();

	/**
	 * Returns the value of the '<em><b>Years</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Years#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Years</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' reference.
	 * @see #setYears(Years)
	 * @see se.remember.RememberPackage#getYear_Years()
	 * @see se.remember.Years#getYear
	 * @model opposite="year" required="true"
	 * @generated
	 */
	Years getYears();

	/**
	 * Sets the value of the '{@link se.remember.Year#getYears <em>Years</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years</em>' reference.
	 * @see #getYears()
	 * @generated
	 */
	void setYears(Years value);

	/**
	 * Get {@link InvoiceSpecification} for specified month 
	 * @param month
	 * @return The {@link InvoiceSpecification} for specified month or null if not found
	 */
	InvoiceSpecification getInvoiceSpecification(int month);
} // Year
