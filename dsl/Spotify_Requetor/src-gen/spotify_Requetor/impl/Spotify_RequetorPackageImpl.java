/**
 */
package spotify_Requetor.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import spotify_Requetor.Album;
import spotify_Requetor.Artist;
import spotify_Requetor.CommandManager;
import spotify_Requetor.Playlist;
import spotify_Requetor.Request;
import spotify_Requetor.Spotify_RequetorFactory;
import spotify_Requetor.Spotify_RequetorPackage;
import spotify_Requetor.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Spotify_RequetorPackageImpl extends EPackageImpl implements Spotify_RequetorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass albumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spotify_Requetor.Spotify_RequetorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Spotify_RequetorPackageImpl() {
		super(eNS_URI, Spotify_RequetorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Spotify_RequetorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Spotify_RequetorPackage init() {
		if (isInited)
			return (Spotify_RequetorPackage) EPackage.Registry.INSTANCE.getEPackage(Spotify_RequetorPackage.eNS_URI);

		// Obtain or create and register package
		Spotify_RequetorPackageImpl theSpotify_RequetorPackage = (Spotify_RequetorPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Spotify_RequetorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Spotify_RequetorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSpotify_RequetorPackage.createPackageContents();

		// Initialize created meta-data
		theSpotify_RequetorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpotify_RequetorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Spotify_RequetorPackage.eNS_URI, theSpotify_RequetorPackage);
		return theSpotify_RequetorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandManager() {
		return commandManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandManager_Request() {
		return (EReference) commandManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandManager_Token() {
		return (EAttribute) commandManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtist() {
		return artistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtist_Albums() {
		return (EReference) artistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtist_Tracks() {
		return (EReference) artistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtist_Followers() {
		return (EAttribute) artistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtist_Popularity() {
		return (EAttribute) artistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtist_Image() {
		return (EAttribute) artistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlbum() {
		return albumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlbum_Tracks() {
		return (EReference) albumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_Image() {
		return (EAttribute) albumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_Release_date() {
		return (EAttribute) albumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_Popularity() {
		return (EAttribute) albumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrack() {
		return trackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrack_Duree() {
		return (EAttribute) trackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrack_Image() {
		return (EAttribute) trackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrack_Release_date() {
		return (EAttribute) trackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrack_Popularity() {
		return (EAttribute) trackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaylist() {
		return playlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaylist_Tracks() {
		return (EReference) playlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaylist_Description() {
		return (EAttribute) playlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaylist_Image() {
		return (EAttribute) playlistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaylist_Followers() {
		return (EAttribute) playlistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Name() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Id() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Danceability() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Instrumentalness() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Tempo() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Speechiness() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Acousticness() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Valence() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Loudness() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Liveness() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Energy() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Duration_ms() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequest__Search__String() {
		return requestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spotify_RequetorFactory getSpotify_RequetorFactory() {
		return (Spotify_RequetorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		commandManagerEClass = createEClass(COMMAND_MANAGER);
		createEReference(commandManagerEClass, COMMAND_MANAGER__REQUEST);
		createEAttribute(commandManagerEClass, COMMAND_MANAGER__TOKEN);

		artistEClass = createEClass(ARTIST);
		createEReference(artistEClass, ARTIST__ALBUMS);
		createEReference(artistEClass, ARTIST__TRACKS);
		createEAttribute(artistEClass, ARTIST__FOLLOWERS);
		createEAttribute(artistEClass, ARTIST__POPULARITY);
		createEAttribute(artistEClass, ARTIST__IMAGE);

		albumEClass = createEClass(ALBUM);
		createEReference(albumEClass, ALBUM__TRACKS);
		createEAttribute(albumEClass, ALBUM__IMAGE);
		createEAttribute(albumEClass, ALBUM__RELEASE_DATE);
		createEAttribute(albumEClass, ALBUM__POPULARITY);

		trackEClass = createEClass(TRACK);
		createEAttribute(trackEClass, TRACK__DUREE);
		createEAttribute(trackEClass, TRACK__IMAGE);
		createEAttribute(trackEClass, TRACK__RELEASE_DATE);
		createEAttribute(trackEClass, TRACK__POPULARITY);

		playlistEClass = createEClass(PLAYLIST);
		createEReference(playlistEClass, PLAYLIST__TRACKS);
		createEAttribute(playlistEClass, PLAYLIST__DESCRIPTION);
		createEAttribute(playlistEClass, PLAYLIST__IMAGE);
		createEAttribute(playlistEClass, PLAYLIST__FOLLOWERS);

		requestEClass = createEClass(REQUEST);
		createEAttribute(requestEClass, REQUEST__NAME);
		createEAttribute(requestEClass, REQUEST__ID);
		createEAttribute(requestEClass, REQUEST__DANCEABILITY);
		createEAttribute(requestEClass, REQUEST__INSTRUMENTALNESS);
		createEAttribute(requestEClass, REQUEST__TEMPO);
		createEAttribute(requestEClass, REQUEST__SPEECHINESS);
		createEAttribute(requestEClass, REQUEST__ACOUSTICNESS);
		createEAttribute(requestEClass, REQUEST__VALENCE);
		createEAttribute(requestEClass, REQUEST__LOUDNESS);
		createEAttribute(requestEClass, REQUEST__LIVENESS);
		createEAttribute(requestEClass, REQUEST__ENERGY);
		createEAttribute(requestEClass, REQUEST__DURATION_MS);
		createEOperation(requestEClass, REQUEST___SEARCH__STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		artistEClass.getESuperTypes().add(this.getRequest());
		albumEClass.getESuperTypes().add(this.getRequest());
		trackEClass.getESuperTypes().add(this.getRequest());
		playlistEClass.getESuperTypes().add(this.getRequest());

		// Initialize classes, features, and operations; add parameters
		initEClass(commandManagerEClass, CommandManager.class, "CommandManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandManager_Request(), this.getRequest(), null, "request", null, 0, -1,
				CommandManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandManager_Token(), ecorePackage.getEString(), "token", null, 0, 1, CommandManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artistEClass, Artist.class, "Artist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtist_Albums(), this.getAlbum(), null, "albums", null, 0, -1, Artist.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getArtist_Tracks(), this.getTrack(), null, "tracks", null, 0, -1, Artist.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getArtist_Followers(), ecorePackage.getEString(), "followers", null, 0, 1, Artist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtist_Popularity(), ecorePackage.getEString(), "popularity", null, 0, 1, Artist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtist_Image(), ecorePackage.getEString(), "image", null, 0, 1, Artist.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(albumEClass, Album.class, "Album", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlbum_Tracks(), this.getTrack(), null, "tracks", null, 1, -1, Album.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAlbum_Image(), ecorePackage.getEString(), "image", null, 0, 1, Album.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Release_date(), ecorePackage.getEString(), "release_date", null, 0, 1, Album.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Popularity(), ecorePackage.getEString(), "popularity", null, 0, 1, Album.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrack_Duree(), ecorePackage.getEString(), "duree", null, 0, 1, Track.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrack_Image(), ecorePackage.getEString(), "image", null, 0, 1, Track.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrack_Release_date(), ecorePackage.getEString(), "release_date", null, 0, 1, Track.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrack_Popularity(), ecorePackage.getEString(), "popularity", null, 0, 1, Track.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playlistEClass, Playlist.class, "Playlist", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaylist_Tracks(), this.getTrack(), null, "tracks", null, 1, -1, Playlist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Description(), ecorePackage.getEString(), "description", null, 0, 1, Playlist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Image(), ecorePackage.getEString(), "image", null, 0, 1, Playlist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Followers(), ecorePackage.getEString(), "followers", null, 0, 1, Playlist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequest_Name(), ecorePackage.getEString(), "name", null, 0, 1, Request.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, Request.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Danceability(), ecorePackage.getEString(), "danceability", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Instrumentalness(), ecorePackage.getEString(), "instrumentalness", null, 0, 1,
				Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Tempo(), ecorePackage.getEString(), "tempo", null, 0, 1, Request.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Speechiness(), ecorePackage.getEString(), "speechiness", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Acousticness(), ecorePackage.getEString(), "acousticness", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Valence(), ecorePackage.getEString(), "valence", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Loudness(), ecorePackage.getEString(), "loudness", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Liveness(), ecorePackage.getEString(), "liveness", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Energy(), ecorePackage.getEString(), "energy", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Duration_ms(), ecorePackage.getEString(), "duration_ms", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRequest__Search__String(), ecorePackage.getEString(), "search", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Spotify_RequetorPackageImpl
