/**
 */
package spotify_Requetor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spotify_Requetor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Spotify_RequetorFactoryImpl extends EFactoryImpl implements Spotify_RequetorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Spotify_RequetorFactory init() {
		try {
			Spotify_RequetorFactory theSpotify_RequetorFactory = (Spotify_RequetorFactory) EPackage.Registry.INSTANCE
					.getEFactory(Spotify_RequetorPackage.eNS_URI);
			if (theSpotify_RequetorFactory != null) {
				return theSpotify_RequetorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Spotify_RequetorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spotify_RequetorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Spotify_RequetorPackage.COMMAND_MANAGER:
			return createCommandManager();
		case Spotify_RequetorPackage.ARTIST:
			return createArtist();
		case Spotify_RequetorPackage.ALBUM:
			return createAlbum();
		case Spotify_RequetorPackage.TRACK:
			return createTrack();
		case Spotify_RequetorPackage.PLAYLIST:
			return createPlaylist();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandManager createCommandManager() {
		CommandManagerImpl commandManager = new CommandManagerImpl();
		return commandManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist createArtist() {
		ArtistImpl artist = new ArtistImpl();
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Album createAlbum() {
		AlbumImpl album = new AlbumImpl();
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track createTrack() {
		TrackImpl track = new TrackImpl();
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Playlist createPlaylist() {
		PlaylistImpl playlist = new PlaylistImpl();
		return playlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spotify_RequetorPackage getSpotify_RequetorPackage() {
		return (Spotify_RequetorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Spotify_RequetorPackage getPackage() {
		return Spotify_RequetorPackage.eINSTANCE;
	}

} //Spotify_RequetorFactoryImpl
