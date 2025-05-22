package com.infy.service;

import java.util.List;

import com.infy.dto.MovieDTO;
import com.infy.exception.DreamMakersException;

public interface MovieService {
	public String addMovie(MovieDTO movie) throws DreamMakersException;

	public List<MovieDTO> getMovies(String directorName) throws DreamMakersException;
}
