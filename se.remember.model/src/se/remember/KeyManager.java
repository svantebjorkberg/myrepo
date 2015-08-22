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
 * A representation of the model object '<em><b>Key Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.remember.KeyManager#getKeyIdPairs <em>Key Id Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.remember.RememberPackage#getKeyManager()
 * @model
 * @generated
 */
public interface KeyManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Id Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link se.remember.KeyIdPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Id Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Id Pairs</em>' containment reference list.
	 * @see se.remember.RememberPackage#getKeyManager_KeyIdPairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyIdPair> getKeyIdPairs();
	
} // KeyManager
