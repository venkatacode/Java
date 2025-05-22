package com.infy.service;

import java.util.List;


import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.MovieDTO;
import com.infy.exception.InfyMovieException;
import com.infy.repository.MovieRepository;


@Service(value="movieServiceImpl")
@Transactional
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	public List<MovieDTO> getMovieByRating(Double fromRating)
			throws InfyMovieException {
		List<MovieDTO> movieDTOs = movieRepository.getMovieByRating(fromRating);
		if(movieDTOs.isEmpty()){
			throw new InfyMovieException("Service.MOVIE_NOT_FOUND_FOR_RATING");
		}
		return movieDTOs;
	}

	public List<MovieDTO> getHighestRatedMovie(String directorName)
			throws InfyMovieException {
		 List<MovieDTO>  movieDTOs = movieRepository.getHighestRatedMovie(directorName);
		if(movieDTOs.isEmpty()){
			throw new InfyMovieException("Service.NO_DIRECTOR_FOUND");
		}
		return movieDTOs;
	}

	public Float getAverageDirectorRating(String directorName)
			throws InfyMovieException {
		Float avgRating = movieRepository.getAverageDirectorRating(directorName);
		if(avgRating==null){
			throw new InfyMovieException("Service.NO_DIRECTOR_FOUND");
		}
		return avgRating;
	}

	public Long getNumberOfMoviesReleased(Integer fromYear,
			Integer toYear) throws InfyMovieException {
		Long countOfMovies = movieRepository.getNumberOfMoviesReleased(fromYear, toYear);
		if(countOfMovies==0){
			throw new InfyMovieException("Service.NO_MOVIE_RELEASED_IN_YEAR");
		}
		return countOfMovies;
	}

}
