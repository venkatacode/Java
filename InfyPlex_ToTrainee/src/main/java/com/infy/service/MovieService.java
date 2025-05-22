package com.infy.service;

import java.util.List;

import com.infy.dto.MovieDTO;
import com.infy.exception.InfyMovieException;

public interface MovieService {

	public List<MovieDTO> getMovieByRating(Double fromRating) throws InfyMovieException;

	public List<MovieDTO> getHighestRatedMovie(String directorName) throws InfyMovieException;

	public Float getAverageDirectorRating(String directorName) throws InfyMovieException;

	public Long getNumberOfMoviesReleased(Integer fromYear, Integer toYear) throws InfyMovieException;
}
