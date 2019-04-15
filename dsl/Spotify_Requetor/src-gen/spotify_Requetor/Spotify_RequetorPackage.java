/**
 */
package spotify_Requetor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spotify_Requetor.Spotify_RequetorFactory
 * @model kind="package"
 * @generated
 */
public interface Spotify_RequetorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spotify_Requetor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/spotify_Requetor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spotify_Requetor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Spotify_RequetorPackage eINSTANCE = spotify_Requetor.impl.Spotify_RequetorPackageImpl.init();

	/**
	 * The meta object id for the '{@link spotify_Requetor.impl.CommandManagerImpl <em>Command Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify_Requetor.impl.CommandManagerImpl
	 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getCommandManager()
	 * @generated
	 */
	int COMMAND_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER__TOKEN = 1;

	/**
	 * The number of structural features of the '<em>Command Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spotify_Requetor.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify_Requetor.impl.RequestImpl
	 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 5;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___SEARCH__STRING = 0;

	/**
	 * The operation id for the '<em>Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___SHOW = 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link spotify_Requetor.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify_Requetor.impl.ArtistImpl
	 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NAME = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST___SEARCH__STRING = REQUEST___SEARCH__STRING;

	/**
	 * The operation id for the '<em>Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST___SHOW = REQUEST___SHOW;

	/**
	 * The number of operations of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spotify_Requetor.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify_Requetor.impl.AlbumImpl
	 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM___SEARCH__STRING = REQUEST___SEARCH__STRING;

	/**
	 * The operation id for the '<em>Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM___SHOW = REQUEST___SHOW;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spotify_Requetor.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify_Requetor.impl.TrackImpl
	 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK___SEARCH__STRING = REQUEST___SEARCH__STRING;

	/**
	 * The operation id for the '<em>Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK___SHOW = REQUEST___SHOW;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spotify_Requetor.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify_Requetor.impl.PlaylistImpl
	 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NAME = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST___SEARCH__STRING = REQUEST___SEARCH__STRING;

	/**
	 * The operation id for the '<em>Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST___SHOW = REQUEST___SHOW;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link spotify_Requetor.CommandManager <em>Command Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Manager</em>'.
	 * @see spotify_Requetor.CommandManager
	 * @generated
	 */
	EClass getCommandManager();

	/**
	 * Returns the meta object for the containment reference list '{@link spotify_Requetor.CommandManager#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request</em>'.
	 * @see spotify_Requetor.CommandManager#getRequest()
	 * @see #getCommandManager()
	 * @generated
	 */
	EReference getCommandManager_Request();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.CommandManager#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see spotify_Requetor.CommandManager#getToken()
	 * @see #getCommandManager()
	 * @generated
	 */
	EAttribute getCommandManager_Token();

	/**
	 * Returns the meta object for class '{@link spotify_Requetor.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see spotify_Requetor.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Artist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify_Requetor.Artist#getName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Name();

	/**
	 * Returns the meta object for class '{@link spotify_Requetor.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see spotify_Requetor.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Album#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify_Requetor.Album#getName()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Name();

	/**
	 * Returns the meta object for class '{@link spotify_Requetor.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see spotify_Requetor.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Track#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify_Requetor.Track#getName()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Name();

	/**
	 * Returns the meta object for class '{@link spotify_Requetor.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see spotify_Requetor.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Playlist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify_Requetor.Playlist#getName()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Name();

	/**
	 * Returns the meta object for class '{@link spotify_Requetor.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see spotify_Requetor.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the '{@link spotify_Requetor.Request#search(java.lang.String) <em>Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search</em>' operation.
	 * @see spotify_Requetor.Request#search(java.lang.String)
	 * @generated
	 */
	EOperation getRequest__Search__String();

	/**
	 * Returns the meta object for the '{@link spotify_Requetor.Request#show() <em>Show</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show</em>' operation.
	 * @see spotify_Requetor.Request#show()
	 * @generated
	 */
	EOperation getRequest__Show();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Spotify_RequetorFactory getSpotify_RequetorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spotify_Requetor.impl.CommandManagerImpl <em>Command Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify_Requetor.impl.CommandManagerImpl
		 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getCommandManager()
		 * @generated
		 */
		EClass COMMAND_MANAGER = eINSTANCE.getCommandManager();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_MANAGER__REQUEST = eINSTANCE.getCommandManager_Request();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_MANAGER__TOKEN = eINSTANCE.getCommandManager_Token();

		/**
		 * The meta object literal for the '{@link spotify_Requetor.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify_Requetor.impl.ArtistImpl
		 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__NAME = eINSTANCE.getArtist_Name();

		/**
		 * The meta object literal for the '{@link spotify_Requetor.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify_Requetor.impl.AlbumImpl
		 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__NAME = eINSTANCE.getAlbum_Name();

		/**
		 * The meta object literal for the '{@link spotify_Requetor.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify_Requetor.impl.TrackImpl
		 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__NAME = eINSTANCE.getTrack_Name();

		/**
		 * The meta object literal for the '{@link spotify_Requetor.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify_Requetor.impl.PlaylistImpl
		 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__NAME = eINSTANCE.getPlaylist_Name();

		/**
		 * The meta object literal for the '{@link spotify_Requetor.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify_Requetor.impl.RequestImpl
		 * @see spotify_Requetor.impl.Spotify_RequetorPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___SEARCH__STRING = eINSTANCE.getRequest__Search__String();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___SHOW = eINSTANCE.getRequest__Show();

	}

} //Spotify_RequetorPackage
