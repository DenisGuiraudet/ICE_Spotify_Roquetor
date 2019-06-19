/**
 */
package spotify_Requetor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.Album#getTracks <em>Tracks</em>}</li>
 *   <li>{@link spotify_Requetor.Album#getImage <em>Image</em>}</li>
 *   <li>{@link spotify_Requetor.Album#getRelease_date <em>Release date</em>}</li>
 *   <li>{@link spotify_Requetor.Album#getPopularity <em>Popularity</em>}</li>
 * </ul>
 *
 * @see spotify_Requetor.Spotify_RequetorPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends Request {

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link spotify_Requetor.Track}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see spotify_Requetor.Spotify_RequetorPackage#getAlbum_Tracks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Track> getTracks();

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
	 * @see spotify_Requetor.Spotify_RequetorPackage#getAlbum_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Album#getImage <em>Image</em>}' attribute.
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
	 * @see spotify_Requetor.Spotify_RequetorPackage#getAlbum_Release_date()
	 * @model
	 * @generated
	 */
	String getRelease_date();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Album#getRelease_date <em>Release date</em>}' attribute.
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
	 * @see spotify_Requetor.Spotify_RequetorPackage#getAlbum_Popularity()
	 * @model
	 * @generated
	 */
	String getPopularity();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Album#getPopularity <em>Popularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popularity</em>' attribute.
	 * @see #getPopularity()
	 * @generated
	 */
	void setPopularity(String value);
} // Album
