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
import se.remember.TimeSpent;
import se.remember.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.remember.impl.InvoiceSpecificationImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link se.remember.impl.InvoiceSpecificationImpl#getTimeSpent <em>Time Spent</em>}</li>
 *   <li>{@link se.remember.impl.InvoiceSpecificationImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvoiceSpecificationImpl extends EObjectImpl implements InvoiceSpecification {
	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected int month = MONTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSpent() <em>Time Spent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpent()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSpent> timeSpent;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected Year year;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RememberPackage.Literals.INVOICE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(int newMonth) {
		int oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.INVOICE_SPECIFICATION__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSpent> getTimeSpent() {
		if (timeSpent == null) {
			timeSpent = new EObjectWithInverseResolvingEList<TimeSpent>(TimeSpent.class, this, RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT, RememberPackage.TIME_SPENT__INVOICE_SPECIFICATION);
		}
		return timeSpent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getYear() {
		if (year != null && year.eIsProxy()) {
			InternalEObject oldYear = (InternalEObject)year;
			year = (Year)eResolveProxy(oldYear);
			if (year != oldYear) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RememberPackage.INVOICE_SPECIFICATION__YEAR, oldYear, year));
			}
		}
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year basicGetYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(Year newYear, NotificationChain msgs) {
		Year oldYear = year;
		year = newYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RememberPackage.INVOICE_SPECIFICATION__YEAR, oldYear, newYear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(Year newYear) {
		if (newYear != year) {
			NotificationChain msgs = null;
			if (year != null)
				msgs = ((InternalEObject)year).eInverseRemove(this, RememberPackage.YEAR__INVOICE_SPECIFICATIONS, Year.class, msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, RememberPackage.YEAR__INVOICE_SPECIFICATIONS, Year.class, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RememberPackage.INVOICE_SPECIFICATION__YEAR, newYear, newYear));
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
			case RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeSpent()).basicAdd(otherEnd, msgs);
			case RememberPackage.INVOICE_SPECIFICATION__YEAR:
				if (year != null)
					msgs = ((InternalEObject)year).eInverseRemove(this, RememberPackage.YEAR__INVOICE_SPECIFICATIONS, Year.class, msgs);
				return basicSetYear((Year)otherEnd, msgs);
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
			case RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT:
				return ((InternalEList<?>)getTimeSpent()).basicRemove(otherEnd, msgs);
			case RememberPackage.INVOICE_SPECIFICATION__YEAR:
				return basicSetYear(null, msgs);
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
			case RememberPackage.INVOICE_SPECIFICATION__MONTH:
				return getMonth();
			case RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT:
				return getTimeSpent();
			case RememberPackage.INVOICE_SPECIFICATION__YEAR:
				if (resolve) return getYear();
				return basicGetYear();
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
			case RememberPackage.INVOICE_SPECIFICATION__MONTH:
				setMonth((Integer)newValue);
				return;
			case RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT:
				getTimeSpent().clear();
				getTimeSpent().addAll((Collection<? extends TimeSpent>)newValue);
				return;
			case RememberPackage.INVOICE_SPECIFICATION__YEAR:
				setYear((Year)newValue);
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
			case RememberPackage.INVOICE_SPECIFICATION__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT:
				getTimeSpent().clear();
				return;
			case RememberPackage.INVOICE_SPECIFICATION__YEAR:
				setYear((Year)null);
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
			case RememberPackage.INVOICE_SPECIFICATION__MONTH:
				return month != MONTH_EDEFAULT;
			case RememberPackage.INVOICE_SPECIFICATION__TIME_SPENT:
				return timeSpent != null && !timeSpent.isEmpty();
			case RememberPackage.INVOICE_SPECIFICATION__YEAR:
				return year != null;
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
		result.append(" (month: ");
		result.append(month);
		result.append(')');
		return result.toString();
	}

} //InvoiceSpecificationImpl
