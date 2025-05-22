package com.infy.userinterface;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.service.CandidateService;
import com.infy.service.CandidateServiceImpl;

/**
 * Creates the user object and calls the methods in the service class. This is a
 * temporary class and will be replaced once the client tier is developed
 * 
 * @author ETA
 */

public class CandidateTester {

	private static final Log LOGGER = LogFactory.getLog(CandidateTester.class);
	
	public static void main(String[] args) throws Exception {
		 addCandidates();
		getGradesForAllCandidates();
	}

	public static void addCandidates() throws ConfigurationException {
		PropertiesConfiguration config = new Configurations().properties("configuration.properties");
		String message = null;
		try {
			CandidateService candidateService = new CandidateServiceImpl();
			
			LocalDate examDate = LocalDate.of(2014, 5, 29);
			Candidate candidate = new Candidate(
					80001, "Sam", 80, 88, 99, 'P', "ECE", examDate);
			
			message = candidateService.addCandidate(candidate);
	
			LOGGER.info(config.getProperty(message));
		} catch (InfyAcademyException e) {
			LOGGER.info(config.getProperty(e.getMessage()));
		}
	}

	public static void getGradesForAllCandidates() throws ConfigurationException{
		PropertiesConfiguration config = new Configurations().properties("configuration.properties");
		try {
			CandidateService candidateService = new CandidateServiceImpl();
			Map<Integer, String> allCandidatesMap = candidateService
					.getGradesForAllCandidates(); 
			LOGGER.info("\tCandidate ID\t\tResult");
			LOGGER.info("\t************\t\t******");
			Set<Integer> set = allCandidatesMap.keySet();
			for (Integer candidateId : set) {
				LOGGER.info("\t"+candidateId + "\t\t\t"
						+ allCandidatesMap.get(candidateId));
			}

		} catch (InfyAcademyException e) {
			LOGGER.info("\t\t"+config.getProperty(e.getMessage()));
		}
	}

}
