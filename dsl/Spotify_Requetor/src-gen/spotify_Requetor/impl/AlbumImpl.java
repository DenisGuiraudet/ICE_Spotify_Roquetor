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
import spotify_Requetor.Spotify_RequetorPackage;
import spotify_Requetor.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.impl.AlbumImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link spotify_Requetor.impl.AlbumImpl#getImage <em>Image</em>}</li>
 *   <li>{@link spotify_Requetor.impl.AlbumImpl#getRelease_date <em>Release date</em>}</li>
 *   <li>{@link spotify_Requetor.impl.AlbumImpl#getPopularity <em>Popularity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlbumImpl extends RequestImpl implements Album {
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
	 * The default value of the '{@link #getRelease_date() <em>Release date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_date()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRelease_date() <em>Release date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_date()
	 * @generated
	 * @ordered
	 */
	protected String release_date = RELEASE_DATE_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Spotify_RequetorPackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<Track>(Track.class, this, Spotify_RequetorPackage.ALBUM__TRACKS);
		}
		return tracks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.ALBUM__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelease_date() {
		return release_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease_date(String newRelease_date) {
		String oldRelease_date = release_date;
		release_date = newRelease_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.ALBUM__RELEASE_DATE,
					oldRelease_date, release_date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.ALBUM__POPULARITY,
					oldPopularity, popularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Spotify_RequetorPackage.ALBUM__TRACKS:
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
		case Spotify_RequetorPackage.ALBUM__TRACKS:
			return getTracks();
		case Spotify_RequetorPackage.ALBUM__IMAGE:
			return getImage();
		case Spotify_RequetorPackage.ALBUM__RELEASE_DATE:
			return getRelease_date();
		case Spotify_RequetorPackage.ALBUM__POPULARITY:
			return getPopularity();
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
		case Spotify_RequetorPackage.ALBUM__TRACKS:
			getTracks().clear();
			getTracks().addAll((Collection<? extends Track>) newValue);
			return;
		case Spotify_RequetorPackage.ALBUM__IMAGE:
			setImage((String) newValue);
			return;
		case Spotify_RequetorPackage.ALBUM__RELEASE_DATE:
			setRelease_date((String) newValue);
			return;
		case Spotify_RequetorPackage.ALBUM__POPULARITY:
			setPopularity((String) newValue);
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
		case Spotify_RequetorPackage.ALBUM__TRACKS:
			getTracks().clear();
			return;
		case Spotify_RequetorPackage.ALBUM__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case Spotify_RequetorPackage.ALBUM__RELEASE_DATE:
			setRelease_date(RELEASE_DATE_EDEFAULT);
			return;
		case Spotify_RequetorPackage.ALBUM__POPULARITY:
			setPopularity(POPULARITY_EDEFAULT);
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
		case Spotify_RequetorPackage.ALBUM__TRACKS:
			return tracks != null && !tracks.isEmpty();
		case Spotify_RequetorPackage.ALBUM__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case Spotify_RequetorPackage.ALBUM__RELEASE_DATE:
			return RELEASE_DATE_EDEFAULT == null ? release_date != null : !RELEASE_DATE_EDEFAULT.equals(release_date);
		case Spotify_RequetorPackage.ALBUM__POPULARITY:
			return POPULARITY_EDEFAULT == null ? popularity != null : !POPULARITY_EDEFAULT.equals(popularity);
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
		result.append(" (image: ");
		result.append(image);
		result.append(", release_date: ");
		result.append(release_date);
		result.append(", popularity: ");
		result.append(popularity);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
