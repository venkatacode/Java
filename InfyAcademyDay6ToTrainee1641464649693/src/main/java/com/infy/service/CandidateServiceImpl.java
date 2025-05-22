package com.infy.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.logging.LogFactory;

import com.infy.dao.CandidateDAO;
import com.infy.dao.CandidateDAOImpl;
import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;
import com.infy.validator.Validator;
//There are bugs in this class.
//Please rectify those bugs according to the requirement.
public class CandidateServiceImpl implements CandidateService {

	private CandidateDAO candidateDAO = new CandidateDAOImpl();

	// can have status as 'P' only if all 3 marks are 50 and above
	public String addCandidate(Candidate candidate) throws InfyAcademyException {
		Validator validator = new Validator();
		try {
			validator.validate(candidate);
			Character tempResult = 'P';
			if (candidate.getMark1() < 50 || candidate.getMark2() < 50 || candidate.getMark3() < 50) {
				tempResult = 'F';
			}
			if (!candidate.getResult().equals(tempResult)) {
				throw new InfyAcademyException("Service.INCORRECT_RESULT");
			}
			return candidateDAO.addCandidate(candidate);
		} catch (InfyAcademyException exception) {
			if (exception.getMessage().contains("Service")) {
				LogFactory.getLog(getClass()).error(exception.getMessage(), exception);
			}
			throw exception;
		}
	}

	// calculating grade for candidate based on his marks and result
	public String calculateGrade(CandidateReport candidateReportTO) {
		String grade = null;
		if (candidateReportTO.getResult() == 'F') {
			grade = "NA";
		} else {
			float average = (candidateReportTO.getMark1() + candidateReportTO.getMark2() + candidateReportTO.getMark3())
					/ 3f;
			if(average >= 85.0) {
				grade="A";
			}
			else if((average >= 75.0 && average < 85.0)){
				grade="B";
			}
			else {
				grade="C";
			}
			
		}
		return grade;
	}

	// populating map<CandidateId, Grade> by calling
	// calculateGrade(candidateReportTO) and returning the same.
	public Map<Integer, String> getGradesForAllCandidates() throws InfyAcademyException {

		List<CandidateReport> allCandidates = candidateDAO.getAllCandidates();
		Map<Integer, String> finalList = new TreeMap<>();

		allCandidates.stream().forEach(candidate -> finalList.put(candidate.getCandidateId(), calculateGrade(candidate)));
		
		return finalList;
	}
}
