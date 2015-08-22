/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.remember.*;
import se.remember.Customer;
import se.remember.Customers;
import se.remember.Folder;
import se.remember.KeyIdPair;
import se.remember.KeyManager;
import se.remember.Project;
import se.remember.RememberFactory;
import se.remember.RememberPackage;
import se.remember.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RememberFactoryImpl extends EFactoryImpl implements RememberFactory {
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RememberFactory init() {
		try {
			RememberFactory theRememberFactory = (RememberFactory)EPackage.Registry.INSTANCE.getEFactory("http://remember/1.0"); 
			if (theRememberFactory != null) {
				return theRememberFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RememberFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RememberFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RememberPackage.FOLDER: return createFolder();
			case RememberPackage.TASK: return createTask();
			case RememberPackage.KEY_MANAGER: return createKeyManager();
			case RememberPackage.CUSTOMER: return createCustomer();
			case RememberPackage.PROJECT: return createProject();
			case RememberPackage.CUSTOMERS: return createCustomers();
			case RememberPackage.KEY_ID_PAIR: return createKeyIdPair();
			case RememberPackage.TIME_SPENT: return createTimeSpent();
			case RememberPackage.YEAR: return createYear();
			case RememberPackage.INVOICE_SPECIFICATION: return createInvoiceSpecification();
			case RememberPackage.YEARS: return createYears();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RememberPackage.GREGORIAN_CALENDAR:
				return creategregorianCalendarFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RememberPackage.GREGORIAN_CALENDAR:
				return convertgregorianCalendarToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyManager createKeyManager() {
		KeyManagerImpl keyManager = new KeyManagerImpl();
		return keyManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customers createCustomers() {
		CustomersImpl customers = new CustomersImpl();
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyIdPair createKeyIdPair() {
		KeyIdPairImpl keyIdPair = new KeyIdPairImpl();
		return keyIdPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSpent createTimeSpent() {
		TimeSpentImpl timeSpent = new TimeSpentImpl();
		return timeSpent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceSpecification createInvoiceSpecification() {
		InvoiceSpecificationImpl invoiceSpecification = new InvoiceSpecificationImpl();
		return invoiceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Years createYears() {
		YearsImpl years = new YearsImpl();
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GregorianCalendar creategregorianCalendarFromString(EDataType eDataType, String initialValue) {
	//yyyy-MM-dd hh:mm:ss
	//0123456789012345678
		int year		= Integer.parseInt(initialValue.substring( 0,  4));
		int month		= Integer.parseInt(initialValue.substring( 5,  7));
		int dayOfMonth	= Integer.parseInt(initialValue.substring( 8, 10));
		int hourOfDay	= Integer.parseInt(initialValue.substring(11, 13));
		int minute		= Integer.parseInt(initialValue.substring(14, 16));
		int second		= Integer.parseInt(initialValue.substring(17, 19));
		
		GregorianCalendar gc = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
		gc.setMinimalDaysInFirstWeek(4);
		gc.setFirstDayOfWeek(Calendar.MONDAY);
		return gc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertgregorianCalendarToString(EDataType eDataType, Object instanceValue) {
		Calendar calendar = (Calendar)instanceValue;
		dateFormat.setCalendar(calendar);
		return dateFormat.format(calendar.getTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RememberPackage getRememberPackage() {
		return (RememberPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RememberPackage getPackage() {
		return RememberPackage.eINSTANCE;
	}

} //RememberFactoryImpl
