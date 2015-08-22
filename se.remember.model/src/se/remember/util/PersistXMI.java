package se.remember.util;

import java.io.IOException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import se.remember.Customer;
import se.remember.Customers;
import se.remember.Folder;
import se.remember.InvoiceSpecification;
import se.remember.KeyManager;
import se.remember.Node;
import se.remember.Project;
import se.remember.RememberFactory;
import se.remember.RememberPackage;
import se.remember.TimeSpent;
import se.remember.Year;
import se.remember.Years;

public class PersistXMI {
	private static ResourceSet resourceSet;
	private static Folder workspace;
	private static Customers customers;
	private static Years years;
	private static KeyManager keyManager;
	
	public static Folder getAgendaTopNode() {
		if (workspace != null) return workspace; 
		workspace = RememberFactory.eINSTANCE.createFolder();
		workspace.setNodeId(-1);
		workspace = (Folder)load(workspace);
		return workspace;
	}
	
	public static Customers getCustomers() {
		if (customers != null) return customers; 
		customers = RememberFactory.eINSTANCE.createCustomers();
		customers = (Customers)load(customers);
		return customers;
	}
	
	public static Years getYears() {
		if (years != null) return years; 
		years = RememberFactory.eINSTANCE.createYears();
		years = (Years)load(years);
		return years;
	}
	
	public static KeyManager getKeyManager() {
		if (keyManager != null) return keyManager; 
		keyManager = RememberFactory.eINSTANCE.createKeyManager();
		keyManager = (KeyManager)load(keyManager);
		return keyManager;
	}

	/**
	 * loads the eObject from persistance layer. If eObject doesn't exist in the persitance layer the input eObject is saved in the percistance layer and the eObject is returned.   
	 * @param eObject
	 * @return
	 */
	public static EObject load(EObject eObject) {
		URI uri = getURI(eObject);
		Resource resource = getResourceSet().getResource(uri, false);

		if (resource == null) {
			resource = getResourceSet().createResource(uri);
		}

		boolean resourceExists = true;

		try {
			resource.load(null);
		} catch (IOException e) {
			resourceExists = false;
		}
		
		if (resourceExists) {
			eObject = resource.getContents().get(0);
		} else {
			try {
				resource.getContents().add(eObject);
				resource.save(null);
			} catch (IOException e) {
				throw new RuntimeException("Unable to save resource to disk, uri="+getURIString(eObject), e);
			}
		}
		
		return eObject;
	}
	
	public static void save(EObject eObject) {
		Resource resource = null;

		if (eObject.eResource() == null) {
			URI uri = getURI(eObject);
			resource = getResourceSet().createResource(uri);
		} else {
			resource = eObject.eResource();
			resource.getContents().clear();
		}
		
		resource.getContents().add(eObject);
		
		try {
			resource.save(null);
		} catch (IOException e) {
			throw new RuntimeException("Unable to save resource to disk, uri="+getURIString(eObject), e);
		}
		
		reloadRootLevelObjects(eObject);
	}
	
	public static void reloadRootLevelObjects(EObject eObject) {
		if (!(eObject instanceof EClass)) return;
		EClass eClass = (EClass)eObject;
		
		switch (eClass.getClassifierID()) {
		case RememberPackage.CUSTOMERS:
			customers = null;
			break;
		case RememberPackage.YEARS:
			years = null;
			break;
		case RememberPackage.KEY_MANAGER:
			keyManager = null;
			break;
		case RememberPackage.FOLDER:
			Folder folder = (Folder)eClass;
			if (folder.getParent() == null) return;
			if (folder.getParent().getNodeId() == -1) {
				workspace = null;
			}
			break;

		default:
			break;
		}
	}
	
	public static void delete(EObject eObject) {
		Resource resource = null;

		if (eObject.eResource() == null) return;

		resource = eObject.eResource();
		resource.getContents().clear();
		
		resource.getContents().add(eObject);
		
		try {
			resource.delete(null);
		} catch (IOException e) {
			throw new RuntimeException("Unable to delete resource from disk, uri="+getURIString(eObject), e);
		}
	}
	
	private static URI getURI(EObject eObject) {
		return URI.createFileURI(getURIString(eObject));
	}
	
	private static String getURIString(EObject eObject) {
		EClass eClass = eObject.eClass();
		StringBuilder uri = new StringBuilder();
		uri.append(Platform.getInstanceLocation().getURL().getPath());
		
		switch (eClass.getClassifierID()) {
			case RememberPackage.FOLDER:
			case RememberPackage.TASK:
				Node node = (Node)eObject;
				uri.append("Agenda/node_" + String.valueOf(node.getNodeId()));
				break;
			case RememberPackage.KEY_MANAGER:
				uri.append("keymanager");
				break;
			case RememberPackage.CUSTOMERS:
				uri.append("Customers/customers");
				break;
			case RememberPackage.CUSTOMER:
				Customer customer = (Customer)eObject;
				uri.append("Customers/customer" + String.valueOf(customer.getCustomerId()));
				break;
			case RememberPackage.YEARS:
				Years years = (Years)eObject;
				uri.append("Years/years");
				break;
			case RememberPackage.YEAR:
				Year year = (Year)eObject;
				uri.append("Years/year" + String.valueOf(year.getYear()));
				break;
			case RememberPackage.INVOICE_SPECIFICATION:
				InvoiceSpecification is = (InvoiceSpecification)eObject;
				uri.append("Years/year" + String.valueOf(is.getYear().getYear()) + "/invoiceSpecification" + String.valueOf(is.getMonth()));
				break;
			case RememberPackage.PROJECT:
				Project project = (Project)eObject;
				uri.append("Customers/project" + String.valueOf(project.getProjectId()));
				break;
			case RememberPackage.TIME_SPENT:
				TimeSpent timeSpent = (TimeSpent)eObject;
				StringBuilder sb = new StringBuilder();
				sb.append(timeSpent.getTask().getNodeId());
				sb.append("_");
				sb.append(timeSpent.getTimeSpentId());
				uri.append("Agenda/timespent_" + String.valueOf(sb.toString()));
				break;
			default:
				throw new IllegalArgumentException("Unknown classifier, the class '" + eClass.getName() + "' can not be persisted.");
		}

		uri.append(".epo2");
		return uri.toString();
	}
	
	private static ResourceSet getResourceSet() {
		if (resourceSet == null) resourceSet = new ResourceSetImpl();
		return resourceSet;
	}
}
