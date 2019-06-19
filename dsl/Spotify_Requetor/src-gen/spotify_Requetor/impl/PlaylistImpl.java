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
import spotify_Requetor.Playlist;
import spotify_Requetor.Spotify_RequetorPackage;
import spotify_Requetor.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.impl.PlaylistImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link spotify_Requetor.impl.PlaylistImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link spotify_Requetor.impl.PlaylistImpl#getImage <em>Image</em>}</li>
 *   <li>{@link spotify_Requetor.impl.PlaylistImpl#getFollowers <em>Followers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaylistImpl extends RequestImpl implements Playlist {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaylistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Spotify_RequetorPackage.Literals.PLAYLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<Track>(Track.class, this, Spotify_RequetorPackage.PLAYLIST__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.PLAYLIST__DESCRIPTION,
					oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.PLAYLIST__IMAGE, oldImage,
					image));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.PLAYLIST__FOLLOWERS,
					oldFollowers, followers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Spotify_RequetorPackage.PLAYLIST__TRACKS:
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
		case Spotify_RequetorPackage.PLAYLIST__TRACKS:
			return getTracks();
		case Spotify_RequetorPackage.PLAYLIST__DESCRIPTION:
			return getDescription();
		case Spotify_RequetorPackage.PLAYLIST__IMAGE:
			return getImage();
		case Spotify_RequetorPackage.PLAYLIST__FOLLOWERS:
			return getFollowers();
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
		case Spotify_RequetorPackage.PLAYLIST__TRACKS:
			getTracks().clear();
			getTracks().addAll((Collection<? extends Track>) newValue);
			return;
		case Spotify_RequetorPackage.PLAYLIST__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Spotify_RequetorPackage.PLAYLIST__IMAGE:
			setImage((String) newValue);
			return;
		case Spotify_RequetorPackage.PLAYLIST__FOLLOWERS:
			setFollowers((String) newValue);
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
		case Spotify_RequetorPackage.PLAYLIST__TRACKS:
			getTracks().clear();
			return;
		case Spotify_RequetorPackage.PLAYLIST__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Spotify_RequetorPackage.PLAYLIST__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case Spotify_RequetorPackage.PLAYLIST__FOLLOWERS:
			setFollowers(FOLLOWERS_EDEFAULT);
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
		case Spotify_RequetorPackage.PLAYLIST__TRACKS:
			return tracks != null && !tracks.isEmpty();
		case Spotify_RequetorPackage.PLAYLIST__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Spotify_RequetorPackage.PLAYLIST__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case Spotify_RequetorPackage.PLAYLIST__FOLLOWERS:
			return FOLLOWERS_EDEFAULT == null ? followers != null : !FOLLOWERS_EDEFAULT.equals(followers);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", image: ");
		result.append(image);
		result.append(", followers: ");
		result.append(followers);
		result.append(')');
		return result.toString();
	}

} //PlaylistImpl
