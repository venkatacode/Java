package com.infy.repository;

import java.util.List;

import com.infy.dto.MovieDTO;

public interface MovieRepository {
	public List<MovieDTO> getMovieByRating(Double fromRating);

	public List<MovieDTO> getHighestRatedMovie(String directorName);

	public Float getAverageDirectorRating(String directorName);

	public Long getNumberOfMoviesReleased(Integer fromYear, Integer toYear);

}
