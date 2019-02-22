/**
 */
package spotify_Requetor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.Show#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see spotify_Requetor.Spotify_RequetorPackage#getShow()
 * @model
 * @generated
 */
public interface Show extends Command {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getShow_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Show#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void show(String target);

} // Show
