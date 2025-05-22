package com.infy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.MovieDTO;

import com.infy.exception.DreamMakersException;
import com.infy.repository.MovieRepository;
import com.infy.validator.Validator;

@Service(value = "movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public String addMovie(MovieDTO movieDTO) throws DreamMakersException {
		if (Validator.validateMovie(movieDTO)) {
			movieRepository.addMovie(movieDTO);
		throw new DreamMakersException("Validator.INVALID_NAMES");
		
		}
		return movieDTO.getMovieId();
	}

	public List<MovieDTO> getMovies(String directorName) throws DreamMakersException {
		List<MovieDTO> movie = movieRepository.getAllMovies();
		List<MovieDTO> movieDTOs = new ArrayList<>();
		MovieDTO movieDTO=new MovieDTO();
		for (MovieDTO movieList : movie) {
			if (movieList.getDirector().getDirectorName().equals(directorName)) {
				movieDTOs.add(movieList);
			}
		
	}
		 if (movieDTOs.isEmpty()) {
				throw new DreamMakersException("Service.MOVIE_NOT_FOUND");
				}
		return movieDTOs;
	}
}