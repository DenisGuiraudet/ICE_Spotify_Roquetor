/**
 */
package spotify_Requetor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.Artist#getAlbums <em>Albums</em>}</li>
 *   <li>{@link spotify_Requetor.Artist#getTracks <em>Tracks</em>}</li>
 *   <li>{@link spotify_Requetor.Artist#getFollowers <em>Followers</em>}</li>
 *   <li>{@link spotify_Requetor.Artist#getPopularity <em>Popularity</em>}</li>
 *   <li>{@link spotify_Requetor.Artist#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see spotify_Requetor.Spotify_RequetorPackage#getArtist()
 * @model
 * @generated
 */
public interface Artist extends Request {

	/**
	 * Returns the value of the '<em><b>Albums</b></em>' containment reference list.
	 * The list contents are of type {@link spotify_Requetor.Album}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Albums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albums</em>' containment reference list.
	 * @see spotify_Requetor.Spotify_RequetorPackage#getArtist_Albums()
	 * @model containment="true"
	 * @generated
	 */
	EList<Album> getAlbums();

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
	 * @see spotify_Requetor.Spotify_RequetorPackage#getArtist_Tracks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Track> getTracks();

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Followers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' attribute.
	 * @see #setFollowers(String)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getArtist_Followers()
	 * @model
	 * @generated
	 */
	String getFollowers();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Artist#getFollowers <em>Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Followers</em>' attribute.
	 * @see #getFollowers()
	 * @generated
	 */
	void setFollowers(String value);

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
	 * @see spotify_Requetor.Spotify_RequetorPackage#getArtist_Popularity()
	 * @model
	 * @generated
	 */
	String getPopularity();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Artist#getPopularity <em>Popularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popularity</em>' attribute.
	 * @see #getPopularity()
	 * @generated
	 */
	void setPopularity(String value);

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
	 * @see spotify_Requetor.Spotify_RequetorPackage#getArtist_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Artist#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);
} // Artist
