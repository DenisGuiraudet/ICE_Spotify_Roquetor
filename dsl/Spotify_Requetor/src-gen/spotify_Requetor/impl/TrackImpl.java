/**
 */
package spotify_Requetor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import spotify_Requetor.Spotify_RequetorPackage;
import spotify_Requetor.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.impl.TrackImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link spotify_Requetor.impl.TrackImpl#getImage <em>Image</em>}</li>
 *   <li>{@link spotify_Requetor.impl.TrackImpl#getRelease_date <em>Release date</em>}</li>
 *   <li>{@link spotify_Requetor.impl.TrackImpl#getPopularity <em>Popularity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackImpl extends RequestImpl implements Track {
	/**
	 * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected static final String DUREE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected String duree = DUREE_EDEFAULT;
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
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Spotify_RequetorPackage.Literals.TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(String newDuree) {
		String oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.TRACK__DUREE, oldDuree,
					duree));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.TRACK__IMAGE, oldImage,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.TRACK__RELEASE_DATE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.TRACK__POPULARITY,
					oldPopularity, popularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Spotify_RequetorPackage.TRACK__DUREE:
			return getDuree();
		case Spotify_RequetorPackage.TRACK__IMAGE:
			return getImage();
		case Spotify_RequetorPackage.TRACK__RELEASE_DATE:
			return getRelease_date();
		case Spotify_RequetorPackage.TRACK__POPULARITY:
			return getPopularity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Spotify_RequetorPackage.TRACK__DUREE:
			setDuree((String) newValue);
			return;
		case Spotify_RequetorPackage.TRACK__IMAGE:
			setImage((String) newValue);
			return;
		case Spotify_RequetorPackage.TRACK__RELEASE_DATE:
			setRelease_date((String) newValue);
			return;
		case Spotify_RequetorPackage.TRACK__POPULARITY:
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
		case Spotify_RequetorPackage.TRACK__DUREE:
			setDuree(DUREE_EDEFAULT);
			return;
		case Spotify_RequetorPackage.TRACK__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case Spotify_RequetorPackage.TRACK__RELEASE_DATE:
			setRelease_date(RELEASE_DATE_EDEFAULT);
			return;
		case Spotify_RequetorPackage.TRACK__POPULARITY:
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
		case Spotify_RequetorPackage.TRACK__DUREE:
			return DUREE_EDEFAULT == null ? duree != null : !DUREE_EDEFAULT.equals(duree);
		case Spotify_RequetorPackage.TRACK__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case Spotify_RequetorPackage.TRACK__RELEASE_DATE:
			return RELEASE_DATE_EDEFAULT == null ? release_date != null : !RELEASE_DATE_EDEFAULT.equals(release_date);
		case Spotify_RequetorPackage.TRACK__POPULARITY:
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
		result.append(" (duree: ");
		result.append(duree);
		result.append(", image: ");
		result.append(image);
		result.append(", release_date: ");
		result.append(release_date);
		result.append(", popularity: ");
		result.append(popularity);
		result.append(')');
		return result.toString();
	}

} //TrackImpl
