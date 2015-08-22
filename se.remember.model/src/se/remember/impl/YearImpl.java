/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.remember.InvoiceSpecification;
import se.remember.RememberPackage;
import se.remember.Year;
import se.remember.Years;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.remember.impl.YearImpl#getYear <em>Year</em>}</li>
 *   <li>{@link se.remember.impl.YearImpl#getInvoiceSpecifications <em>Invoice Specifications</em>}</li>
 *   <li>{@link se.remember.impl.YearImpl#getYears <em>Years</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YearImpl extends EObjectImpl implements Year {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvoiceSpecifications() <em>Invoice Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceSpecification> invoiceSpecifications;

	/**
	 * The cached value of the '{@link #getYears() <em>Years</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected Years years;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RememberPackage.Literals.YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.YEAR__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvoiceSpecification> getInvoiceSpecifications() {
		if (invoiceSpecifications == null) {
			invoiceSpecifications = new EObjectWithInverseResolvingEList<InvoiceSpecification>(InvoiceSpecification.class, this, RememberPackage.YEAR__INVOICE_SPECIFICATIONS, RememberPackage.INVOICE_SPECIFICATION__YEAR);
		}
		return invoiceSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Years getYears() {
		if (years != null && years.eIsProxy()) {
			InternalEObject oldYears = (InternalEObject)years;
			years = (Years)eResolveProxy(oldYears);
			if (years != oldYears) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RememberPackage.YEAR__YEARS, oldYears, years));
			}
		}
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Years basicGetYears() {
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYears(Years newYears, NotificationChain msgs) {
		Years oldYears = years;
		years = newYears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RememberPackage.YEAR__YEARS, oldYears, newYears);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYears(Years newYears) {
		if (newYears != years) {
			NotificationChain msgs = null;
			if (years != null)
				msgs = ((InternalEObject)years).eInverseRemove(this, RememberPackage.YEARS__YEAR, Years.class, msgs);
			if (newYears != null)
				msgs = ((InternalEObject)newYears).eInverseAdd(this, RememberPackage.YEARS__YEAR, Years.class, msgs);
			msgs = basicSetYears(newYears, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.YEAR__YEARS, newYears, newYears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RememberPackage.YEAR__INVOICE_SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvoiceSpecifications()).basicAdd(otherEnd, msgs);
			case RememberPackage.YEAR__YEARS:
				if (years != null)
					msgs = ((InternalEObject)years).eInverseRemove(this, RememberPackage.YEARS__YEAR, Years.class, msgs);
				return basicSetYears((Years)otherEnd, msgs);
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
			case RememberPackage.YEAR__INVOICE_SPECIFICATIONS:
				return ((InternalEList<?>)getInvoiceSpecifications()).basicRemove(otherEnd, msgs);
			case RememberPackage.YEAR__YEARS:
				return basicSetYears(null, msgs);
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
			case RememberPackage.YEAR__YEAR:
				return getYear();
			case RememberPackage.YEAR__INVOICE_SPECIFICATIONS:
				return getInvoiceSpecifications();
			case RememberPackage.YEAR__YEARS:
				if (resolve) return getYears();
				return basicGetYears();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RememberPackage.YEAR__YEAR:
				setYear((Integer)newValue);
				return;
			case RememberPackage.YEAR__INVOICE_SPECIFICATIONS:
				getInvoiceSpecifications().clear();
				getInvoiceSpecifications().addAll((Collection<? extends InvoiceSpecification>)newValue);
				return;
			case RememberPackage.YEAR__YEARS:
				setYears((Years)newValue);
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
			case RememberPackage.YEAR__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case RememberPackage.YEAR__INVOICE_SPECIFICATIONS:
				getInvoiceSpecifications().clear();
				return;
			case RememberPackage.YEAR__YEARS:
				setYears((Years)null);
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
			case RememberPackage.YEAR__YEAR:
				return year != YEAR_EDEFAULT;
			case RememberPackage.YEAR__INVOICE_SPECIFICATIONS:
				return invoiceSpecifications != null && !invoiceSpecifications.isEmpty();
			case RememberPackage.YEAR__YEARS:
				return years != null;
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
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

	public InvoiceSpecification getInvoiceSpecification(int inMonth) {
		EList<InvoiceSpecification> invoiceSpecifications = this.getInvoiceSpecifications();
		
		for (InvoiceSpecification is : invoiceSpecifications) {
			if (is.getMonth() == inMonth) {
				return is;
			}
		}
		
		return null;
	}
} //YearImpl
