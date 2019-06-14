/**
 */
package spotify_Requetor.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import spotify_Requetor.Album;
import spotify_Requetor.Artist;
import spotify_Requetor.Spotify_RequetorPackage;
import spotify_Requetor.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.impl.ArtistImpl#getAlbums <em>Albums</em>}</li>
 *   <li>{@link spotify_Requetor.impl.ArtistImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link spotify_Requetor.impl.ArtistImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link spotify_Requetor.impl.ArtistImpl#getPopularity <em>Popularity</em>}</li>
 *   <li>{@link spotify_Requetor.impl.ArtistImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtistImpl extends RequestImpl implements Artist {
	/**
	 * The cached value of the '{@link #getAlbums() <em>Albums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbums()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> albums;
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;
	/**
	 * The default value of the '{@link #getFollowers() <em>Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLLOWERS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected String followers = FOLLOWERS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPopularity() <em>Popularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopularity()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULARITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPopularity() <em>Popularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopularity()
	 * @generated
	 * @ordered
	 */
	protected String popularity = POPULARITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Spotify_RequetorPackage.Literals.ARTIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Album> getAlbums() {
		if (albums == null) {
			albums = new EObjectContainmentEList<Album>(Album.class, this, Spotify_RequetorPackage.ARTIST__ALBUMS);
		}
		return albums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<Track>(Track.class, this, Spotify_RequetorPackage.ARTIST__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFollowers() {
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowers(String newFollowers) {
		String oldFollowers = followers;
		followers = newFollowers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.ARTIST__FOLLOWERS,
					oldFollowers, followers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopularity() {
		return popularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopularity(String newPopularity) {
		String oldPopularity = popularity;
		popularity = newPopularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.ARTIST__POPULARITY,
					oldPopularity, popularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.ARTIST__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Spotify_RequetorPackage.ARTIST__ALBUMS:
			return ((InternalEList<?>) getAlbums()).basicRemove(otherEnd, msgs);
		case Spotify_RequetorPackage.ARTIST__TRACKS:
			return ((InternalEList<?>) getTracks()).basicRemove(otherEnd, msgs);
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
		case Spotify_RequetorPackage.ARTIST__ALBUMS:
			return getAlbums();
		case Spotify_RequetorPackage.ARTIST__TRACKS:
			return getTracks();
		case Spotify_RequetorPackage.ARTIST__FOLLOWERS:
			return getFollowers();
		case Spotify_RequetorPackage.ARTIST__POPULARITY:
			return getPopularity();
		case Spotify_RequetorPackage.ARTIST__IMAGE:
			return getImage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Spotify_RequetorPackage.ARTIST__ALBUMS:
			getAlbums().clear();
			getAlbums().addAll((Collection<? extends Album>) newValue);
			return;
		case Spotify_RequetorPackage.ARTIST__TRACKS:
			getTracks().clear();
			getTracks().addAll((Collection<? extends Track>) newValue);
			return;
		case Spotify_RequetorPackage.ARTIST__FOLLOWERS:
			setFollowers((String) newValue);
			return;
		case Spotify_RequetorPackage.ARTIST__POPULARITY:
			setPopularity((String) newValue);
			return;
		case Spotify_RequetorPackage.ARTIST__IMAGE:
			setImage((String) newValue);
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
		case Spotify_RequetorPackage.ARTIST__ALBUMS:
			getAlbums().clear();
			return;
		case Spotify_RequetorPackage.ARTIST__TRACKS:
			getTracks().clear();
			return;
		case Spotify_RequetorPackage.ARTIST__FOLLOWERS:
			setFollowers(FOLLOWERS_EDEFAULT);
			return;
		case Spotify_RequetorPackage.ARTIST__POPULARITY:
			setPopularity(POPULARITY_EDEFAULT);
			return;
		case Spotify_RequetorPackage.ARTIST__IMAGE:
			setImage(IMAGE_EDEFAULT);
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
		case Spotify_RequetorPackage.ARTIST__ALBUMS:
			return albums != null && !albums.isEmpty();
		case Spotify_RequetorPackage.ARTIST__TRACKS:
			return tracks != null && !tracks.isEmpty();
		case Spotify_RequetorPackage.ARTIST__FOLLOWERS:
			return FOLLOWERS_EDEFAULT == null ? followers != null : !FOLLOWERS_EDEFAULT.equals(followers);
		case Spotify_RequetorPackage.ARTIST__POPULARITY:
			return POPULARITY_EDEFAULT == null ? popularity != null : !POPULARITY_EDEFAULT.equals(popularity);
		case Spotify_RequetorPackage.ARTIST__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (followers: ");
		result.append(followers);
		result.append(", popularity: ");
		result.append(popularity);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //ArtistImpl
