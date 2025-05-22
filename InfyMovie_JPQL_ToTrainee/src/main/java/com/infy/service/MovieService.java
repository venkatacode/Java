package com.infy.service;

import java.util.List;

import com.infy.dto.MovieDTO;
import com.infy.exception.InfyMovieException;

public interface MovieService {	
	public MovieDTO getMovieByName(String movieName) throws InfyMovieException;

	public List<MovieDTO> getMoviesByImdbRating(Double fromRating, Double toRating) throws InfyMovieException;

	public List<Object[]> getMoviesNameAndYear(String directorName) throws InfyMovieException;
}
