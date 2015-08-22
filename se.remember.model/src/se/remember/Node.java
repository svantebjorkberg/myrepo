/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.Node#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link se.remember.Node#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link se.remember.Node#getParentNodeId <em>Parent Node Id</em>}</li>
 *   <li>{@link se.remember.Node#getParentNodeType <em>Parent Node Type</em>}</li>
 *   <li>{@link se.remember.Node#getSequence <em>Sequence</em>}</li>
 *   <li>{@link se.remember.Node#getName <em>Name</em>}</li>
 *   <li>{@link se.remember.Node#getDescription <em>Description</em>}</li>
 *   <li>{@link se.remember.Node#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link se.remember.Node#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link se.remember.Node#isMarkedForDeletion <em>Marked For Deletion</em>}</li>
 *   <li>{@link se.remember.Node#getCustomer <em>Customer</em>}</li>
 *   <li>{@link se.remember.Node#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(long)
	 * @see se.remember.RememberPackage#getNode_NodeId()
	 * @model unique="false" required="true"
	 * @generated
	 */
	long getNodeId();

	/**
	 * Sets the value of the '{@link se.remember.Node#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(long value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see #setNodeType(String)
	 * @see se.remember.RememberPackage#getNode_NodeType()
	 * @model required="true"
	 * @generated
	 */
	String getNodeType();

	/**
	 * Sets the value of the '{@link se.remember.Node#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(String value);

	/**
	 * Returns the value of the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node Id</em>' attribute.
	 * @see #setParentNodeId(long)
	 * @see se.remember.RememberPackage#getNode_ParentNodeId()
	 * @model required="true"
	 * @generated
	 */
	long getParentNodeId();

	/**
	 * Sets the value of the '{@link se.remember.Node#getParentNodeId <em>Parent Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node Id</em>' attribute.
	 * @see #getParentNodeId()
	 * @generated
	 */
	void setParentNodeId(long value);

	/**
	 * Returns the value of the '<em><b>Parent Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node Type</em>' attribute.
	 * @see #setParentNodeType(String)
	 * @see se.remember.RememberPackage#getNode_ParentNodeType()
	 * @model required="true"
	 * @generated
	 */
	String getParentNodeType();

	/**
	 * Sets the value of the '{@link se.remember.Node#getParentNodeType <em>Parent Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node Type</em>' attribute.
	 * @see #getParentNodeType()
	 * @generated
	 */
	void setParentNodeType(String value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(int)
	 * @see se.remember.RememberPackage#getNode_Sequence()
	 * @model
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '{@link se.remember.Node#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

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
	 * @see se.remember.RememberPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.remember.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see se.remember.RememberPackage#getNode_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link se.remember.Node#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(Date)
	 * @see se.remember.RememberPackage#getNode_DateCreated()
	 * @model required="true"
	 * @generated
	 */
	Date getDateCreated();

	/**
	 * Sets the value of the '{@link se.remember.Node#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Date Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Modified</em>' attribute.
	 * @see #setDateModified(Date)
	 * @see se.remember.RememberPackage#getNode_DateModified()
	 * @model required="true"
	 * @generated
	 */
	Date getDateModified();

	/**
	 * Sets the value of the '{@link se.remember.Node#getDateModified <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Modified</em>' attribute.
	 * @see #getDateModified()
	 * @generated
	 */
	void setDateModified(Date value);

	/**
	 * Returns the value of the '<em><b>Marked For Deletion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marked For Deletion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marked For Deletion</em>' attribute.
	 * @see #setMarkedForDeletion(boolean)
	 * @see se.remember.RememberPackage#getNode_MarkedForDeletion()
	 * @model
	 * @generated
	 */
	boolean isMarkedForDeletion();

	/**
	 * Sets the value of the '{@link se.remember.Node#isMarkedForDeletion <em>Marked For Deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marked For Deletion</em>' attribute.
	 * @see #isMarkedForDeletion()
	 * @generated
	 */
	void setMarkedForDeletion(boolean value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Customer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see se.remember.RememberPackage#getNode_Customer()
	 * @see se.remember.Customer#getNodes
	 * @model opposite="nodes"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link se.remember.Node#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.remember.Project#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see se.remember.RememberPackage#getNode_Project()
	 * @see se.remember.Project#getNodes
	 * @model opposite="nodes"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link se.remember.Node#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // Node
