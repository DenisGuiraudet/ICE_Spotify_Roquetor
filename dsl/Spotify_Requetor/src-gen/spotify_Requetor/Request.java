/**
 */
package spotify_Requetor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify_Requetor.Request#getDataCollected <em>Data Collected</em>}</li>
 * </ul>
 *
 * @see spotify_Requetor.Spotify_RequetorPackage#getRequest()
 * @model abstract="true"
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Collected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Collected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Collected</em>' attribute.
	 * @see #setDataCollected(String)
	 * @see spotify_Requetor.Spotify_RequetorPackage#getRequest_DataCollected()
	 * @model
	 * @generated
	 */
	String getDataCollected();

	/**
	 * Sets the value of the '{@link spotify_Requetor.Request#getDataCollected <em>Data Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Collected</em>' attribute.
	 * @see #getDataCollected()
	 * @generated
	 */
	void setDataCollected(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String search(String target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String show();

} // Request
