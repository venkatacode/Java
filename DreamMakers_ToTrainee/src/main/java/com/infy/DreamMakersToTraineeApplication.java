package com.infy;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.dto.DirectorDTO;
import com.infy.dto.MovieDTO;
import com.infy.exception.DreamMakersException;
import com.infy.service.MovieService;

@SpringBootApplication
public class DreamMakersToTraineeApplication implements CommandLineRunner {

	@Autowired
	MovieService movieService;

	@Autowired
	Environment environment;

	private static final Log LOGGER = LogFactory.getLog(DreamMakersToTraineeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DreamMakersToTraineeApplication.class, args);
	}

	@Override
	public void run(String... args) throws DreamMakersException {
		addMovie();
		getMovies();
	}

	public void addMovie() {
		try {
			MovieDTO movieDTO = new MovieDTO();
			movieDTO.setMovieId("M1001");
			movieDTO.setMovieName("Home Alone");
			movieDTO.setReleasedIn(LocalDate.of(1990, 05, 24));
			movieDTO.setLanguage("English");
			movieDTO.setRevenueInDollars(1990);

			DirectorDTO directorDTO = new DirectorDTO();
			
			directorDTO.setDirectorId("D101");
			directorDTO.setDirectorName("Chris Columbus");
			directorDTO.setBornIn(1958);
			movieDTO.setDirector(directorDTO);

			String id = movieService.addMovie(movieDTO);
			LOGGER.info("\n"+environment.getProperty("UserInterface.MOVIE_ADDED_SUCCESS") + id);
		} catch (Exception e) {
			LOGGER.info("\n"+environment.getProperty(e.getMessage()));
		}
	}

	public void getMovies() {
		try {
			String directorName = "Aamir Khan";
			List<MovieDTO> movieList = movieService.getMovies(directorName);
			LOGGER.info("\nMovies of the director "+directorName);
			for (MovieDTO movie : movieList) {
				LOGGER.info(movie);
			}
		} catch (Exception e) {
			LOGGER.info("\n"+environment.getProperty(e.getMessage()));
		}
	}

}