/**
 */
package spotify_Requetor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.Track#getDuree <em>Duree</em>}</li>
 *   <li>{@link spotify_Requetor.Track#getImage <em>Image</em>}</li>
 *   <li>{@link spotify_Requetor.Track#getRelease_date <em>Release date</em>}</li>
 *   <li>{@link spotify_Requetor.Track#getPopularity <em>Popularity</em>}</li>
 * </ul>
 *
 * @see spotify_Requetor.Spotify_RequetorPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends Request {

	/**
	 * Returns the value of the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' attribute.
	 * @see #setDuree(String)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getTrack_Duree()
	 * @model
	 * @generated
	 */
	String getDuree();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Track#getDuree <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' attribute.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getTrack_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Track#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Release date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release date</em>' attribute.
	 * @see #setRelease_date(String)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getTrack_Release_date()
	 * @model
	 * @generated
	 */
	String getRelease_date();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Track#getRelease_date <em>Release date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release date</em>' attribute.
	 * @see #getRelease_date()
	 * @generated
	 */
	void setRelease_date(String value);

	/**
	 * Returns the value of the '<em><b>Popularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Popularity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popularity</em>' attribute.
	 * @see #setPopularity(String)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getTrack_Popularity()
	 * @model
	 * @generated
	 */
	String getPopularity();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Track#getPopularity <em>Popularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popularity</em>' attribute.
	 * @see #getPopularity()
	 * @generated
	 */
	void setPopularity(String value);
} // Track
