/**
 */
package spotify_Requetor.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import spotify_Requetor.Request;
import spotify_Requetor.Spotify_RequetorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getDanceability <em>Danceability</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getInstrumentalness <em>Instrumentalness</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getSpeechiness <em>Speechiness</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getAcousticness <em>Acousticness</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getValence <em>Valence</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getLoudness <em>Loudness</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getLiveness <em>Liveness</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link spotify_Requetor.impl.RequestImpl#getDuration_ms <em>Duration ms</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequestImpl extends MinimalEObjectImpl.Container implements Request {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDanceability() <em>Danceability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDanceability()
	 * @generated
	 * @ordered
	 */
	protected static final String DANCEABILITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDanceability() <em>Danceability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDanceability()
	 * @generated
	 * @ordered
	 */
	protected String danceability = DANCEABILITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getInstrumentalness() <em>Instrumentalness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentalness()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUMENTALNESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInstrumentalness() <em>Instrumentalness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentalness()
	 * @generated
	 * @ordered
	 */
	protected String instrumentalness = INSTRUMENTALNESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected String tempo = TEMPO_EDEFAULT;
	/**
	 * The default value of the '{@link #getSpeechiness() <em>Speechiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechiness()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEECHINESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSpeechiness() <em>Speechiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechiness()
	 * @generated
	 * @ordered
	 */
	protected String speechiness = SPEECHINESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getAcousticness() <em>Acousticness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcousticness()
	 * @generated
	 * @ordered
	 */
	protected static final String ACOUSTICNESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAcousticness() <em>Acousticness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcousticness()
	 * @generated
	 * @ordered
	 */
	protected String acousticness = ACOUSTICNESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getValence() <em>Valence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValence()
	 * @generated
	 * @ordered
	 */
	protected static final String VALENCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValence() <em>Valence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValence()
	 * @generated
	 * @ordered
	 */
	protected String valence = VALENCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLoudness() <em>Loudness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoudness()
	 * @generated
	 * @ordered
	 */
	protected static final String LOUDNESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLoudness() <em>Loudness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoudness()
	 * @generated
	 * @ordered
	 */
	protected String loudness = LOUDNESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getLiveness() <em>Liveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiveness()
	 * @generated
	 * @ordered
	 */
	protected static final String LIVENESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLiveness() <em>Liveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiveness()
	 * @generated
	 * @ordered
	 */
	protected String liveness = LIVENESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final String ENERGY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected String energy = ENERGY_EDEFAULT;
	/**
	 * The default value of the '{@link #getDuration_ms() <em>Duration ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_ms()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_MS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDuration_ms() <em>Duration ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_ms()
	 * @generated
	 * @ordered
	 */
	protected String duration_ms = DURATION_MS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Spotify_RequetorPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDanceability() {
		return danceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDanceability(String newDanceability) {
		String oldDanceability = danceability;
		danceability = newDanceability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__DANCEABILITY,
					oldDanceability, danceability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstrumentalness() {
		return instrumentalness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstrumentalness(String newInstrumentalness) {
		String oldInstrumentalness = instrumentalness;
		instrumentalness = newInstrumentalness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__INSTRUMENTALNESS,
					oldInstrumentalness, instrumentalness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTempo() {
		return tempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(String newTempo) {
		String oldTempo = tempo;
		tempo = newTempo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__TEMPO, oldTempo,
					tempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpeechiness() {
		return speechiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeechiness(String newSpeechiness) {
		String oldSpeechiness = speechiness;
		speechiness = newSpeechiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__SPEECHINESS,
					oldSpeechiness, speechiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcousticness() {
		return acousticness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcousticness(String newAcousticness) {
		String oldAcousticness = acousticness;
		acousticness = newAcousticness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__ACOUSTICNESS,
					oldAcousticness, acousticness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValence() {
		return valence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValence(String newValence) {
		String oldValence = valence;
		valence = newValence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__VALENCE, oldValence,
					valence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoudness() {
		return loudness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoudness(String newLoudness) {
		String oldLoudness = loudness;
		loudness = newLoudness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__LOUDNESS,
					oldLoudness, loudness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiveness() {
		return liveness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiveness(String newLiveness) {
		String oldLiveness = liveness;
		liveness = newLiveness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__LIVENESS,
					oldLiveness, liveness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnergy() {
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergy(String newEnergy) {
		String oldEnergy = energy;
		energy = newEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__ENERGY, oldEnergy,
					energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration_ms() {
		return duration_ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration_ms(String newDuration_ms) {
		String oldDuration_ms = duration_ms;
		duration_ms = newDuration_ms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spotify_RequetorPackage.REQUEST__DURATION_MS,
					oldDuration_ms, duration_ms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String search(String target) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Spotify_RequetorPackage.REQUEST__NAME:
			return getName();
		case Spotify_RequetorPackage.REQUEST__ID:
			return getId();
		case Spotify_RequetorPackage.REQUEST__DANCEABILITY:
			return getDanceability();
		case Spotify_RequetorPackage.REQUEST__INSTRUMENTALNESS:
			return getInstrumentalness();
		case Spotify_RequetorPackage.REQUEST__TEMPO:
			return getTempo();
		case Spotify_RequetorPackage.REQUEST__SPEECHINESS:
			return getSpeechiness();
		case Spotify_RequetorPackage.REQUEST__ACOUSTICNESS:
			return getAcousticness();
		case Spotify_RequetorPackage.REQUEST__VALENCE:
			return getValence();
		case Spotify_RequetorPackage.REQUEST__LOUDNESS:
			return getLoudness();
		case Spotify_RequetorPackage.REQUEST__LIVENESS:
			return getLiveness();
		case Spotify_RequetorPackage.REQUEST__ENERGY:
			return getEnergy();
		case Spotify_RequetorPackage.REQUEST__DURATION_MS:
			return getDuration_ms();
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
		case Spotify_RequetorPackage.REQUEST__NAME:
			setName((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__ID:
			setId((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__DANCEABILITY:
			setDanceability((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__INSTRUMENTALNESS:
			setInstrumentalness((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__TEMPO:
			setTempo((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__SPEECHINESS:
			setSpeechiness((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__ACOUSTICNESS:
			setAcousticness((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__VALENCE:
			setValence((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__LOUDNESS:
			setLoudness((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__LIVENESS:
			setLiveness((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__ENERGY:
			setEnergy((String) newValue);
			return;
		case Spotify_RequetorPackage.REQUEST__DURATION_MS:
			setDuration_ms((String) newValue);
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
		case Spotify_RequetorPackage.REQUEST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__ID:
			setId(ID_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__DANCEABILITY:
			setDanceability(DANCEABILITY_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__INSTRUMENTALNESS:
			setInstrumentalness(INSTRUMENTALNESS_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__TEMPO:
			setTempo(TEMPO_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__SPEECHINESS:
			setSpeechiness(SPEECHINESS_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__ACOUSTICNESS:
			setAcousticness(ACOUSTICNESS_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__VALENCE:
			setValence(VALENCE_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__LOUDNESS:
			setLoudness(LOUDNESS_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__LIVENESS:
			setLiveness(LIVENESS_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__ENERGY:
			setEnergy(ENERGY_EDEFAULT);
			return;
		case Spotify_RequetorPackage.REQUEST__DURATION_MS:
			setDuration_ms(DURATION_MS_EDEFAULT);
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
		case Spotify_RequetorPackage.REQUEST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Spotify_RequetorPackage.REQUEST__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Spotify_RequetorPackage.REQUEST__DANCEABILITY:
			return DANCEABILITY_EDEFAULT == null ? danceability != null : !DANCEABILITY_EDEFAULT.equals(danceability);
		case Spotify_RequetorPackage.REQUEST__INSTRUMENTALNESS:
			return INSTRUMENTALNESS_EDEFAULT == null ? instrumentalness != null
					: !INSTRUMENTALNESS_EDEFAULT.equals(instrumentalness);
		case Spotify_RequetorPackage.REQUEST__TEMPO:
			return TEMPO_EDEFAULT == null ? tempo != null : !TEMPO_EDEFAULT.equals(tempo);
		case Spotify_RequetorPackage.REQUEST__SPEECHINESS:
			return SPEECHINESS_EDEFAULT == null ? speechiness != null : !SPEECHINESS_EDEFAULT.equals(speechiness);
		case Spotify_RequetorPackage.REQUEST__ACOUSTICNESS:
			return ACOUSTICNESS_EDEFAULT == null ? acousticness != null : !ACOUSTICNESS_EDEFAULT.equals(acousticness);
		case Spotify_RequetorPackage.REQUEST__VALENCE:
			return VALENCE_EDEFAULT == null ? valence != null : !VALENCE_EDEFAULT.equals(valence);
		case Spotify_RequetorPackage.REQUEST__LOUDNESS:
			return LOUDNESS_EDEFAULT == null ? loudness != null : !LOUDNESS_EDEFAULT.equals(loudness);
		case Spotify_RequetorPackage.REQUEST__LIVENESS:
			return LIVENESS_EDEFAULT == null ? liveness != null : !LIVENESS_EDEFAULT.equals(liveness);
		case Spotify_RequetorPackage.REQUEST__ENERGY:
			return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
		case Spotify_RequetorPackage.REQUEST__DURATION_MS:
			return DURATION_MS_EDEFAULT == null ? duration_ms != null : !DURATION_MS_EDEFAULT.equals(duration_ms);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Spotify_RequetorPackage.REQUEST___SEARCH__STRING:
			return search((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", danceability: ");
		result.append(danceability);
		result.append(", instrumentalness: ");
		result.append(instrumentalness);
		result.append(", tempo: ");
		result.append(tempo);
		result.append(", speechiness: ");
		result.append(speechiness);
		result.append(", acousticness: ");
		result.append(acousticness);
		result.append(", valence: ");
		result.append(valence);
		result.append(", loudness: ");
		result.append(loudness);
		result.append(", liveness: ");
		result.append(liveness);
		result.append(", energy: ");
		result.append(energy);
		result.append(", duration_ms: ");
		result.append(duration_ms);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
