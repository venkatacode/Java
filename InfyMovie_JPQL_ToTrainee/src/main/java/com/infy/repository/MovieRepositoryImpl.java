package com.infy.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import com.infy.dto.MovieDTO;
import com.infy.entity.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public MovieDTO getMovieByName(String movieName) {
		String queryString="SELECT m From Movie m where m.movieName='Deadpool'";
		Query query=entityManager.createQuery(queryString);
		List<Movie> movie=query.getResultList();
		MovieDTO resultDto=new MovieDTO();
		if(!movie.isEmpty()) {
			{
				
				resultDto.setMovieName(movie.get(0).getMovieName());
				resultDto.setMovieId(movie.get(0).getMovieId());
				resultDto.setDirectorName(movie.get(0).getDirectorName());
				resultDto.setImdbRating(movie.get(0).getImdbRating());
				resultDto.setYear(movie.get(0).getYear());
			}
		}
		return resultDto;
				}

	@Override
	public List<MovieDTO> getMoviesByImdbRating(Double fromRating, Double toRating) {
		String queryString1 = "SELECT  m FROM Movie m  where m.imdbRating BETWEEN 0.0 and 7.8";

		Query query=entityManager.createQuery(queryString1);
		
		List<Movie> movieList=query.getResultList();
		List<MovieDTO> movieDTOList = new ArrayList<MovieDTO>();
		if(!movieList.isEmpty()) {
			for(Movie movie: movieList) {
				MovieDTO movieDto =new MovieDTO();
				movieDto.setMovieName(movie.getMovieName());
				movieDto.setMovieId(movie.getMovieId());
				movieDto.setDirectorName(movie.getDirectorName());
				movieDto.setImdbRating(movie.getImdbRating());
				movieDto.setYear(movie.getYear());
				movieDTOList.add(movieDto);
			}
			
		}
		return movieDTOList;
	}

	@Override
	public List<Object[]> getMoviesNameAndYear(String directorName) {
		String queryString="SELECT m.movieName,m.year FROM Movie m where m.directorName='Joss Whedon'";
		Query query=entityManager.createQuery(queryString);
		
		List<Object[]> result=query.getResultList();
		List<Object[]> movieDTOList=new ArrayList<>();
		for(Object[] movie:result) {
			Object[] obj = new Object[2];
			obj[0] = (String) movie[0];
			obj[1] = (Integer) movie[1];
			movieDTOList.add(obj);
		}
		
		return movieDTOList;
	}
}
