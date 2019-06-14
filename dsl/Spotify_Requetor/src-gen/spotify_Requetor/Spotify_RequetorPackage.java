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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ID = 1;

	/**
	 * The feature id for the '<em><b>Danceability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DANCEABILITY = 2;

	/**
	 * The feature id for the '<em><b>Instrumentalness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__INSTRUMENTALNESS = 3;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TEMPO = 4;

	/**
	 * The feature id for the '<em><b>Speechiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SPEECHINESS = 5;

	/**
	 * The feature id for the '<em><b>Acousticness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ACOUSTICNESS = 6;

	/**
	 * The feature id for the '<em><b>Valence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__VALENCE = 7;

	/**
	 * The feature id for the '<em><b>Loudness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__LOUDNESS = 8;

	/**
	 * The feature id for the '<em><b>Liveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__LIVENESS = 9;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ENERGY = 10;

	/**
	 * The feature id for the '<em><b>Duration ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DURATION_MS = 11;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___SEARCH__STRING = 0;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 1;

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
	int ARTIST__NAME = REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__ID = REQUEST__ID;

	/**
	 * The feature id for the '<em><b>Danceability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__DANCEABILITY = REQUEST__DANCEABILITY;

	/**
	 * The feature id for the '<em><b>Instrumentalness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__INSTRUMENTALNESS = REQUEST__INSTRUMENTALNESS;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__TEMPO = REQUEST__TEMPO;

	/**
	 * The feature id for the '<em><b>Speechiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__SPEECHINESS = REQUEST__SPEECHINESS;

	/**
	 * The feature id for the '<em><b>Acousticness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__ACOUSTICNESS = REQUEST__ACOUSTICNESS;

	/**
	 * The feature id for the '<em><b>Valence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__VALENCE = REQUEST__VALENCE;

	/**
	 * The feature id for the '<em><b>Loudness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__LOUDNESS = REQUEST__LOUDNESS;

	/**
	 * The feature id for the '<em><b>Liveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__LIVENESS = REQUEST__LIVENESS;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__ENERGY = REQUEST__ENERGY;

	/**
	 * The feature id for the '<em><b>Duration ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__DURATION_MS = REQUEST__DURATION_MS;

	/**
	 * The feature id for the '<em><b>Albums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__ALBUMS = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__TRACKS = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__FOLLOWERS = REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Popularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__POPULARITY = REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__IMAGE = REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST___SEARCH__STRING = REQUEST___SEARCH__STRING;

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
	int ALBUM__NAME = REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ID = REQUEST__ID;

	/**
	 * The feature id for the '<em><b>Danceability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__DANCEABILITY = REQUEST__DANCEABILITY;

	/**
	 * The feature id for the '<em><b>Instrumentalness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__INSTRUMENTALNESS = REQUEST__INSTRUMENTALNESS;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TEMPO = REQUEST__TEMPO;

	/**
	 * The feature id for the '<em><b>Speechiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__SPEECHINESS = REQUEST__SPEECHINESS;

	/**
	 * The feature id for the '<em><b>Acousticness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ACOUSTICNESS = REQUEST__ACOUSTICNESS;

	/**
	 * The feature id for the '<em><b>Valence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__VALENCE = REQUEST__VALENCE;

	/**
	 * The feature id for the '<em><b>Loudness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__LOUDNESS = REQUEST__LOUDNESS;

	/**
	 * The feature id for the '<em><b>Liveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__LIVENESS = REQUEST__LIVENESS;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ENERGY = REQUEST__ENERGY;

	/**
	 * The feature id for the '<em><b>Duration ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__DURATION_MS = REQUEST__DURATION_MS;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TRACKS = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__IMAGE = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Release date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__RELEASE_DATE = REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Popularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__POPULARITY = REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM___SEARCH__STRING = REQUEST___SEARCH__STRING;

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
	int TRACK__NAME = REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ID = REQUEST__ID;

	/**
	 * The feature id for the '<em><b>Danceability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DANCEABILITY = REQUEST__DANCEABILITY;

	/**
	 * The feature id for the '<em><b>Instrumentalness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__INSTRUMENTALNESS = REQUEST__INSTRUMENTALNESS;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__TEMPO = REQUEST__TEMPO;

	/**
	 * The feature id for the '<em><b>Speechiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SPEECHINESS = REQUEST__SPEECHINESS;

	/**
	 * The feature id for the '<em><b>Acousticness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ACOUSTICNESS = REQUEST__ACOUSTICNESS;

	/**
	 * The feature id for the '<em><b>Valence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__VALENCE = REQUEST__VALENCE;

	/**
	 * The feature id for the '<em><b>Loudness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__LOUDNESS = REQUEST__LOUDNESS;

	/**
	 * The feature id for the '<em><b>Liveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__LIVENESS = REQUEST__LIVENESS;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ENERGY = REQUEST__ENERGY;

	/**
	 * The feature id for the '<em><b>Duration ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DURATION_MS = REQUEST__DURATION_MS;

	/**
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DUREE = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__IMAGE = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Release date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__RELEASE_DATE = REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Popularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__POPULARITY = REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK___SEARCH__STRING = REQUEST___SEARCH__STRING;

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
	int PLAYLIST__NAME = REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__ID = REQUEST__ID;

	/**
	 * The feature id for the '<em><b>Danceability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__DANCEABILITY = REQUEST__DANCEABILITY;

	/**
	 * The feature id for the '<em><b>Instrumentalness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__INSTRUMENTALNESS = REQUEST__INSTRUMENTALNESS;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__TEMPO = REQUEST__TEMPO;

	/**
	 * The feature id for the '<em><b>Speechiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__SPEECHINESS = REQUEST__SPEECHINESS;

	/**
	 * The feature id for the '<em><b>Acousticness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__ACOUSTICNESS = REQUEST__ACOUSTICNESS;

	/**
	 * The feature id for the '<em><b>Valence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__VALENCE = REQUEST__VALENCE;

	/**
	 * The feature id for the '<em><b>Loudness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__LOUDNESS = REQUEST__LOUDNESS;

	/**
	 * The feature id for the '<em><b>Liveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__LIVENESS = REQUEST__LIVENESS;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__ENERGY = REQUEST__ENERGY;

	/**
	 * The feature id for the '<em><b>Duration ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__DURATION_MS = REQUEST__DURATION_MS;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__TRACKS = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__DESCRIPTION = REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__IMAGE = REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__FOLLOWERS = REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST___SEARCH__STRING = REQUEST___SEARCH__STRING;

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
	 * Returns the meta object for the containment reference list '{@link spotify_Requetor.Artist#getAlbums <em>Albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Albums</em>'.
	 * @see spotify_Requetor.Artist#getAlbums()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Albums();

	/**
	 * Returns the meta object for the containment reference list '{@link spotify_Requetor.Artist#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see spotify_Requetor.Artist#getTracks()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Tracks();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Artist#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Followers</em>'.
	 * @see spotify_Requetor.Artist#getFollowers()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Followers();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Artist#getPopularity <em>Popularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popularity</em>'.
	 * @see spotify_Requetor.Artist#getPopularity()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Popularity();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Artist#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see spotify_Requetor.Artist#getImage()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Image();

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
	 * Returns the meta object for the containment reference list '{@link spotify_Requetor.Album#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see spotify_Requetor.Album#getTracks()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Tracks();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Album#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see spotify_Requetor.Album#getImage()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Image();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Album#getRelease_date <em>Release date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release date</em>'.
	 * @see spotify_Requetor.Album#getRelease_date()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Release_date();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Album#getPopularity <em>Popularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popularity</em>'.
	 * @see spotify_Requetor.Album#getPopularity()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Popularity();

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
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Track#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see spotify_Requetor.Track#getDuree()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Duree();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Track#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see spotify_Requetor.Track#getImage()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Image();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Track#getRelease_date <em>Release date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release date</em>'.
	 * @see spotify_Requetor.Track#getRelease_date()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Release_date();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Track#getPopularity <em>Popularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popularity</em>'.
	 * @see spotify_Requetor.Track#getPopularity()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Popularity();

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
	 * Returns the meta object for the containment reference list '{@link spotify_Requetor.Playlist#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see spotify_Requetor.Playlist#getTracks()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Tracks();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Playlist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see spotify_Requetor.Playlist#getDescription()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Description();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Playlist#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see spotify_Requetor.Playlist#getImage()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Image();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Playlist#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Followers</em>'.
	 * @see spotify_Requetor.Playlist#getFollowers()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Followers();

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
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify_Requetor.Request#getName()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see spotify_Requetor.Request#getId()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getDanceability <em>Danceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Danceability</em>'.
	 * @see spotify_Requetor.Request#getDanceability()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Danceability();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getInstrumentalness <em>Instrumentalness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrumentalness</em>'.
	 * @see spotify_Requetor.Request#getInstrumentalness()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Instrumentalness();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo</em>'.
	 * @see spotify_Requetor.Request#getTempo()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getSpeechiness <em>Speechiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speechiness</em>'.
	 * @see spotify_Requetor.Request#getSpeechiness()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Speechiness();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getAcousticness <em>Acousticness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acousticness</em>'.
	 * @see spotify_Requetor.Request#getAcousticness()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Acousticness();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getValence <em>Valence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valence</em>'.
	 * @see spotify_Requetor.Request#getValence()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Valence();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getLoudness <em>Loudness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loudness</em>'.
	 * @see spotify_Requetor.Request#getLoudness()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Loudness();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getLiveness <em>Liveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liveness</em>'.
	 * @see spotify_Requetor.Request#getLiveness()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Liveness();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getEnergy <em>Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy</em>'.
	 * @see spotify_Requetor.Request#getEnergy()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Energy();

	/**
	 * Returns the meta object for the attribute '{@link spotify_Requetor.Request#getDuration_ms <em>Duration ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration ms</em>'.
	 * @see spotify_Requetor.Request#getDuration_ms()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Duration_ms();

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
		 * The meta object literal for the '<em><b>Albums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__ALBUMS = eINSTANCE.getArtist_Albums();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__TRACKS = eINSTANCE.getArtist_Tracks();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__FOLLOWERS = eINSTANCE.getArtist_Followers();

		/**
		 * The meta object literal for the '<em><b>Popularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__POPULARITY = eINSTANCE.getArtist_Popularity();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__IMAGE = eINSTANCE.getArtist_Image();

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
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__TRACKS = eINSTANCE.getAlbum_Tracks();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__IMAGE = eINSTANCE.getAlbum_Image();

		/**
		 * The meta object literal for the '<em><b>Release date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__RELEASE_DATE = eINSTANCE.getAlbum_Release_date();

		/**
		 * The meta object literal for the '<em><b>Popularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__POPULARITY = eINSTANCE.getAlbum_Popularity();

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
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__DUREE = eINSTANCE.getTrack_Duree();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__IMAGE = eINSTANCE.getTrack_Image();

		/**
		 * The meta object literal for the '<em><b>Release date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__RELEASE_DATE = eINSTANCE.getTrack_Release_date();

		/**
		 * The meta object literal for the '<em><b>Popularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__POPULARITY = eINSTANCE.getTrack_Popularity();

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
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__TRACKS = eINSTANCE.getPlaylist_Tracks();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__DESCRIPTION = eINSTANCE.getPlaylist_Description();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__IMAGE = eINSTANCE.getPlaylist_Image();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__FOLLOWERS = eINSTANCE.getPlaylist_Followers();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__NAME = eINSTANCE.getRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ID = eINSTANCE.getRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Danceability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__DANCEABILITY = eINSTANCE.getRequest_Danceability();

		/**
		 * The meta object literal for the '<em><b>Instrumentalness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__INSTRUMENTALNESS = eINSTANCE.getRequest_Instrumentalness();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__TEMPO = eINSTANCE.getRequest_Tempo();

		/**
		 * The meta object literal for the '<em><b>Speechiness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__SPEECHINESS = eINSTANCE.getRequest_Speechiness();

		/**
		 * The meta object literal for the '<em><b>Acousticness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ACOUSTICNESS = eINSTANCE.getRequest_Acousticness();

		/**
		 * The meta object literal for the '<em><b>Valence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__VALENCE = eINSTANCE.getRequest_Valence();

		/**
		 * The meta object literal for the '<em><b>Loudness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__LOUDNESS = eINSTANCE.getRequest_Loudness();

		/**
		 * The meta object literal for the '<em><b>Liveness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__LIVENESS = eINSTANCE.getRequest_Liveness();

		/**
		 * The meta object literal for the '<em><b>Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ENERGY = eINSTANCE.getRequest_Energy();

		/**
		 * The meta object literal for the '<em><b>Duration ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__DURATION_MS = eINSTANCE.getRequest_Duration_ms();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___SEARCH__STRING = eINSTANCE.getRequest__Search__String();

	}

} //Spotify_RequetorPackage
