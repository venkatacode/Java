package com.infy.repository;

import java.util.List;

import com.infy.dto.ProjectDTO;
import com.infy.exception.AbcException;

public interface ProjectRepository {

	
	public Integer addProject(ProjectDTO project) throws AbcException;
	public List<ProjectDTO>  getProjectDetails() throws AbcException;
	
}
