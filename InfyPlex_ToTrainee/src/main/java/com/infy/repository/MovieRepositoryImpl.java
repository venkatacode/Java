package com.infy.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import com.infy.dto.MovieDTO;
import com.infy.entity.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<MovieDTO> getMovieByRating(Double fromRating) {

		String querystring = "SELECT m FROM Movie m where m.imdbRating>=7.6 order by m.imdbRating ASC";
		Query query = entityManager.createQuery(querystring);
		List<Movie> result = query.getResultList();
		List<MovieDTO> movieDTOList = new ArrayList<MovieDTO>();
		if (!result.isEmpty()) {
			for (Movie movie : result) {
				MovieDTO movieDto = new MovieDTO(movie.getMovieId(), movie.getMovieName(), movie.getDirectorName(),
						movie.getImdbRating(), movie.getYear());
				movieDTOList.add(movieDto);
			}
		}
		return movieDTOList;
	}

	@Override
	public List<MovieDTO> getHighestRatedMovie(String directorName) {

		String queryString = "SELECT m FROM Movie m where m.directorName='Joss Whedon'"
				+ " AND m.imdbRating=(SELECT MAX(m1.imdbRating) FROM Movie m1 where m1.directorName='Joss Whedon')";
		Query query = entityManager.createQuery(queryString);
		List<Movie> result = query.getResultList();
		List<MovieDTO> movieDTOLIST = new ArrayList<MovieDTO>();
		if (!result.isEmpty()) {
			for (Movie movie : result) {
				MovieDTO movieDto = new MovieDTO(movie.getMovieId(), movie.getMovieName(), movie.getDirectorName(),
						movie.getImdbRating(), movie.getYear());
				movieDTOLIST.add(movieDto);
			}
		}
		return movieDTOLIST;
	}

	@Override
	public Float getAverageDirectorRating(String directorName) {

		String queryString = "SELECT AVG(m.imdbRating) FROM Movie m where m.directorName='Tim Miller' group by m.directorName";
		Query query = entityManager.createQuery(queryString);
		return Float.valueOf(query.getSingleResult().toString());
	}

	@Override
	public Long getNumberOfMoviesReleased(Integer fromYear, Integer toYear) {

		String queryString = "SELECT COUNT(m.year) FROM Movie m where m.year BETWEEN 2012 AND 2016";
		Query query = entityManager.createQuery(queryString);
		return (Long) query.getSingleResult();
	}

}
