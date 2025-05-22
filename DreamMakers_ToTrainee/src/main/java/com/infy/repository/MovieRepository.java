package com.infy.repository;

import java.util.List;

import com.infy.dto.MovieDTO;
import com.infy.exception.DreamMakersException;

public interface MovieRepository {

	public String addMovie(MovieDTO movie) throws DreamMakersException;
	
	public List<MovieDTO> getAllMovies() throws DreamMakersException;
}
