/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.remember.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.remember.KeyIdPair;
import se.remember.KeyManager;
import se.remember.RememberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.remember.impl.KeyManagerImpl#getKeyIdPairs <em>Key Id Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyManagerImpl extends EObjectImpl implements KeyManager {
	/**
	 * The cached value of the '{@link #getKeyIdPairs() <em>Key Id Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyIdPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyIdPair> keyIdPairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RememberPackage.Literals.KEY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyIdPair> getKeyIdPairs() {
		if (keyIdPairs == null) {
			keyIdPairs = new EObjectContainmentEList<KeyIdPair>(KeyIdPair.class, this, RememberPackage.KEY_MANAGER__KEY_ID_PAIRS);
		}
		return keyIdPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RememberPackage.KEY_MANAGER__KEY_ID_PAIRS:
				return ((InternalEList<?>)getKeyIdPairs()).basicRemove(otherEnd, msgs);
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
			case RememberPackage.KEY_MANAGER__KEY_ID_PAIRS:
				return getKeyIdPairs();
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
			case RememberPackage.KEY_MANAGER__KEY_ID_PAIRS:
				getKeyIdPairs().clear();
				getKeyIdPairs().addAll((Collection<? extends KeyIdPair>)newValue);
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
			case RememberPackage.KEY_MANAGER__KEY_ID_PAIRS:
				getKeyIdPairs().clear();
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
			case RememberPackage.KEY_MANAGER__KEY_ID_PAIRS:
				return keyIdPairs != null && !keyIdPairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
} //KeyManagerImpl
