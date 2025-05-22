package com.infy.service;

import java.util.Map;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public interface CandidateService {
	String addCandidate(Candidate candidate) throws InfyAcademyException;
	String calculateGrade(CandidateReport candidateReportTO);
	Map<Integer, String> getGradesForAllCandidates() throws InfyAcademyException;
}
