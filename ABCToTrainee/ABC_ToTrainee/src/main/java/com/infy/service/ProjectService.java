package com.infy.service;

import java.util.List;

import com.infy.dto.ProjectDTO;
import com.infy.exception.AbcException;



public interface ProjectService {
	
	public Integer addProject(ProjectDTO project) throws AbcException;	
	public List<ProjectDTO> getProjectDetails(String technology) throws AbcException;
}
