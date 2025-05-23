package com.infy;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.dto.MovieDTO;
import com.infy.service.MovieService;

@SpringBootApplication
public class InfyMovieJPQLApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(InfyMovieJPQLApplication.class);

	@Autowired
	private MovieService movieService;

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(InfyMovieJPQLApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	getMovieByName();
	getMovieByImdbRating();
	getMoviesNameAndYear();
	}

	public void getMovieByName() {

		try {
			String movieName = "Deadpool";
			MovieDTO movieDTO = movieService.getMovieByName(movieName);
			LOGGER.info(movieDTO);
			LOGGER.info("\n");
		} catch (Exception e) {
			LOGGER.info(environment.getProperty(e.getMessage(),"Some exception occured.Please check log file."));
			LOGGER.info("\n");
		}
	}

	public void getMovieByImdbRating() {
		try {
			Double fromRating = 0.0d;
			Double toRating = 7.8d;
			List<MovieDTO> movieDTOs = movieService.getMoviesByImdbRating(fromRating,toRating);
			for (MovieDTO movieDTO : movieDTOs) {
				LOGGER.info(movieDTO);		
			}
			LOGGER.info("\n");
		} catch (Exception e) {
			LOGGER.info(environment.getProperty(e.getMessage(), "Some exception occured.Please check log file."));
			LOGGER.info("\n");
		}
	}

	public void getMoviesNameAndYear() {

		try {
			String directorName = "Joss Whedon";
			List<Object[]> objects = movieService.getMoviesNameAndYear(directorName);
			for (Object[] object : objects) {
				LOGGER.info(object[0] + "\t" + object[1]);
			}
			LOGGER.info("\n");
		} catch (Exception e) {
			LOGGER.info(environment.getProperty(e.getMessage(), "Some exception occured.Please check log file."));
			LOGGER.info("\n");
		}
	}
}
