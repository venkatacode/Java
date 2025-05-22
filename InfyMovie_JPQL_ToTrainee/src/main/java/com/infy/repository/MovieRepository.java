package com.infy.repository;

import java.util.List;

import com.infy.dto.MovieDTO;

public interface MovieRepository {
	public MovieDTO getMovieByName(String movieName);
	
	public List<MovieDTO> getMoviesByImdbRating(Double fromRating, Double toRating);

	public List<Object[]> getMoviesNameAndYear(String directorName);	
}
