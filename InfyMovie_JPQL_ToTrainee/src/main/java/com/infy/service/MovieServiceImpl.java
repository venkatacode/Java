package com.infy.service;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.MovieDTO;
import com.infy.exception.InfyMovieException;
import com.infy.repository.MovieRepository;

@Service(value="movieService")
@Transactional
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public MovieDTO getMovieByName(String movieName) throws InfyMovieException {
		if(movieRepository.getMovieByName(movieName)==null){
			throw new InfyMovieException("Service.NO_MOVIE_FOUND");
		}
		return movieRepository.getMovieByName(movieName);	
	}

	@Override
	public List<MovieDTO> getMoviesByImdbRating(Double fromRating, Double toRating)
			throws InfyMovieException {
		if(movieRepository.getMoviesByImdbRating(fromRating, toRating).isEmpty()){
			throw new InfyMovieException("Service.NO_MOVIES_FOUND_FOR_RATING");
		}		
		return movieRepository.getMoviesByImdbRating(fromRating, toRating);
	}

	@Override
	public List<Object[]> getMoviesNameAndYear(String directorName) throws InfyMovieException {	
		List<Object[]> objects =  movieRepository.getMoviesNameAndYear(directorName);
		if (objects.isEmpty())
			throw new InfyMovieException("Service.MOVIE_NOT_FOUND_FOR_DIRECTOR");
		return objects;
	}

	

}
