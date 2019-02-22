/**
 */
package spotify_Requetor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.CommandManager#getCommandmanager <em>Commandmanager</em>}</li>
 * </ul>
 *
 * @see spotify_Requetor.Spotify_RequetorPackage#getCommandManager()
 * @model
 * @generated
 */
public interface CommandManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Commandmanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commandmanager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commandmanager</em>' containment reference.
	 * @see #setCommandmanager(Command)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getCommandManager_Commandmanager()
	 * @model containment="true"
	 * @generated
	 */
	Command getCommandmanager();

	/**
	 * Sets the value of the '{@link spotify_Requetor.CommandManager#getCommandmanager <em>Commandmanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commandmanager</em>' containment reference.
	 * @see #getCommandmanager()
	 * @generated
	 */
	void setCommandmanager(Command value);

} // CommandManager
