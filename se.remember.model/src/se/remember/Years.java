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
 * A representation of the model object '<em><b>Years</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Years#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getYears()
 * @model
 * @generated
 */
public interface Years extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' reference list.
	 * The list contents are of type {@link se.remember.Year}.
	 * It is bidirectional and its opposite is '{@link se.remember.Year#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' reference list.
	 * @see se.remember.RememberPackage#getYears_Year()
	 * @see se.remember.Year#getYears
	 * @model opposite="years"
	 * @generated
	 */
	EList<Year> getYear();
	
	/**
	 * Get the specified {@link Year}
	 * @param year
	 * @return The specified {@link Year} or null if not found
	 */
	public Year getYear(int year);
} // Years
