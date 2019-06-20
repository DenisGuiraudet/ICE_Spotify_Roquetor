package dsl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StatsBean {

	private String danceability;
	private String instrumentalness;
	private String tempo;
	private String speechiness;
	private String acousticness;
	private String valence;
	private String loudness;
	private String liveness;
	private String energy;
	private String duration_ms;
	
	
	public StatsBean() {
		this.danceability = "0";
		this.instrumentalness = "0";
		this.tempo = "0";
		this.speechiness = "0";
		this.acousticness = "0";
		this.valence = "0";
		this.loudness = "0";
		this.liveness = "0";
		this.energy = "0";
		this.duration_ms = "0";
	}


	public String getDanceability() {
		return danceability;
	}
	
	public void addDanceability(String newDanceability) {
		this.danceability = String.valueOf(Integer.parseInt(this.danceability) + Integer.parseInt(newDanceability));
	}

	public String getInstrumentalness() {
		return instrumentalness;
	}

	public void addInstrumentalness(String newInstrumentalness) {
		this.instrumentalness = String.valueOf(Integer.parseInt(this.instrumentalness) + Integer.parseInt(newInstrumentalness));
	}
	
	public String getTempo() {
		return tempo;
	}
	
	public void addTempo(String newTempo) {
		this.tempo = String.valueOf(Integer.parseInt(this.tempo) + Integer.parseInt(newTempo));
	}

	public String getSpeechiness() {
		return speechiness;
	}

	public void addSpeechiness(String newSpeechiness) {
		this.speechiness = String.valueOf(Integer.parseInt(this.speechiness) + Integer.parseInt(newSpeechiness));
	}
	
	public String getAcousticness() {
		return acousticness;
	}

	public void addAcousticness(String newAcousticness) {
		this.acousticness = String.valueOf(Integer.parseInt(this.acousticness) + Integer.parseInt(newAcousticness));
	}
	
	public String getValence() {
		return valence;
	}

	public void addValence(String newValence) {
		this.valence = String.valueOf(Integer.parseInt(this.valence) + Integer.parseInt(newValence));
	}
	
	public String getLoudness() {
		return loudness;
	}

	public void addLoudness(String newLoudness) {
		this.loudness = String.valueOf(Integer.parseInt(this.loudness) + Integer.parseInt(newLoudness));
	}
	
	public String getLiveness() {
		return liveness;
	}

	public void addLiveness(String newLiveness) {
		this.liveness = String.valueOf(Integer.parseInt(this.liveness) + Integer.parseInt(newLiveness));
	}
	
	public String getEnergy() {
		return energy;
	}
	
	public void addEnergy(String newEnergy) {
		this.energy = String.valueOf(Integer.parseInt(this.energy) + Integer.parseInt(newEnergy));
	}

	public String getDuration_ms() {
		return duration_ms;
	}
	
	public void addDuration_ms(String newDuration_ms) {
		this.duration_ms = String.valueOf(Integer.parseInt(this.duration_ms) + Integer.parseInt(newDuration_ms));
	}


	public void setDanceability(String danceability) {
		this.danceability = danceability;
	}


	public void setInstrumentalness(String instrumentalness) {
		this.instrumentalness = instrumentalness;
	}


	public void setTempo(String tempo) {
		this.tempo = tempo;
	}


	public void setSpeechiness(String speechiness) {
		this.speechiness = speechiness;
	}


	public void setAcousticness(String acousticness) {
		this.acousticness = acousticness;
	}


	public void setValence(String valence) {
		this.valence = valence;
	}


	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}


	public void setLiveness(String liveness) {
		this.liveness = liveness;
	}


	public void setEnergy(String energy) {
		this.energy = energy;
	}


	public void setDuration_ms(String duration_ms) {
		this.duration_ms = duration_ms;
	}


	public void makeStats(JSONArray dataTrack) throws JSONException {
		for(int i=0; i < dataTrack.length(); i++) {//for currentTrack
			this.addDanceability(((JSONObject)dataTrack.getJSONObject(i)).get("danceability").toString());
			this.addInstrumentalness(((JSONObject)dataTrack.getJSONObject(i)).get("instrumentalness").toString());
			this.addTempo(((JSONObject)dataTrack.getJSONObject(i)).get("tempo").toString());
			this.addSpeechiness(((JSONObject)dataTrack.getJSONObject(i)).get("speechiness").toString());
			this.addAcousticness(((JSONObject)dataTrack.getJSONObject(i)).get("acoustincness").toString());
			this.addValence(((JSONObject)dataTrack.getJSONObject(i)).get("valence").toString());
			this.addLoudness(((JSONObject)dataTrack.getJSONObject(i)).get("loudness").toString());
			this.addLiveness(((JSONObject)dataTrack.getJSONObject(i)).get("liveness").toString());
			this.addEnergy(((JSONObject)dataTrack.getJSONObject(i)).get("energy").toString());
			this.addDuration_ms(((JSONObject)dataTrack.getJSONObject(i)).get("duration_ms").toString());
		}
		

		this.setDanceability(String.valueOf(Integer.parseInt(this.danceability) / dataTrack.length()));
		this.setInstrumentalness(String.valueOf(Integer.parseInt(this.instrumentalness) / dataTrack.length()));
		this.setTempo(String.valueOf(Integer.parseInt(this.tempo) / dataTrack.length()));
		this.setSpeechiness(String.valueOf(Integer.parseInt(this.speechiness) / dataTrack.length()));
		this.setAcousticness(String.valueOf(Integer.parseInt(this.acousticness) / dataTrack.length()));
		this.setValence(String.valueOf(Integer.parseInt(this.valence) / dataTrack.length()));
		this.setLoudness(String.valueOf(Integer.parseInt(this.loudness) / dataTrack.length()));
		this.setLiveness(String.valueOf(Integer.parseInt(this.liveness) / dataTrack.length()));
		this.setEnergy(String.valueOf(Integer.parseInt(this.energy) / dataTrack.length()));
		this.setDuration_ms(String.valueOf(Integer.parseInt(this.duration_ms) / dataTrack.length()));
	}
}
