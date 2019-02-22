/**
 */
package spotify_Requetor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import spotify_Requetor.Command;
import spotify_Requetor.CommandManager;
import spotify_Requetor.Spotify_RequetorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.impl.CommandManagerImpl#getCommandmanager <em>Commandmanager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandManagerImpl extends MinimalEObjectImpl.Container implements CommandManager {
	/**
	 * The cached value of the '{@link #getCommandmanager() <em>Commandmanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandmanager()
	 * @generated
	 * @ordered
	 */
	protected Command commandmanager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Spotify_RequetorPackage.Literals.COMMAND_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCommandmanager() {
		return commandmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandmanager(Command newCommandmanager, NotificationChain msgs) {
		Command oldCommandmanager = commandmanager;
		commandmanager = newCommandmanager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER, oldCommandmanager, newCommandmanager);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandmanager(Command newCommandmanager) {
		if (newCommandmanager != commandmanager) {
			NotificationChain msgs = null;
			if (commandmanager != null)
				msgs = ((InternalEObject) commandmanager).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER, null, msgs);
			if (newCommandmanager != null)
				msgs = ((InternalEObject) newCommandmanager).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER, null, msgs);
			msgs = basicSetCommandmanager(newCommandmanager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER, newCommandmanager, newCommandmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER:
			return basicSetCommandmanager(null, msgs);
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
		case Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER:
			return getCommandmanager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER:
			setCommandmanager((Command) newValue);
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
		case Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER:
			setCommandmanager((Command) null);
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
		case Spotify_RequetorPackage.COMMAND_MANAGER__COMMANDMANAGER:
			return commandmanager != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandManagerImpl
