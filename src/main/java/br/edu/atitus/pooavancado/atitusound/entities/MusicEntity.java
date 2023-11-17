package br.edu.atitus.pooavancado.atitusound.entities;

import java.time.Duration;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MusicEntity extends GenericEntity {
	
	private Duration duration;
	private int likesCount;
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "artist_uuid")
	private ArtistEntity artist;

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
