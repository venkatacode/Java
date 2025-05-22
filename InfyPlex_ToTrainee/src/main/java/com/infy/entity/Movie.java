package com.infy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Movie", schema = "InfyPlex_db", uniqueConstraints = {
		@UniqueConstraint(name = "movie_name", columnNames = "movie_name"), })
public class Movie {

	@Id
	@Column(name = "movie_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;

	@Column(name = "movie_name", nullable = false)
	private String movieName;

	@Column(name = "director_name", nullable = false)
	private String directorName;

	@Column(name = "imdb_rating")
	private Float imdbRating;

	@Column(name = "release_year")
	private Integer year;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Float getImdbRating() {
		return imdbRating;
	}

	public void setImbdRating(Float imbdRating) {
		this.imdbRating = imbdRating;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
