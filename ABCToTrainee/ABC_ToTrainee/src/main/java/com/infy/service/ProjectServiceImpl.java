package com.infy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.ProjectDTO;
import com.infy.dto.TeamMemberDTO;
import com.infy.exception.AbcException;
import com.infy.repository.ProjectRepository;
import com.infy.validator.Validator;

@Service(value = "projectservice")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	public ProjectRepository repository;

	@Override
	public Integer addProject(ProjectDTO project) throws AbcException {
		for (TeamMemberDTO teamMember : project.getMemberList()) {
			Validator.validate(teamMember);
		}
		return repository.addProject(project);
	}

	@Override
	public List<ProjectDTO> getProjectDetails(String technology) throws AbcException {
		List<ProjectDTO> project = repository.getProjectDetails();
		List<ProjectDTO> projectDTOs = new ArrayList<>();
		for (ProjectDTO projects : project) {
			if (projects.getTechnologyUsed().equals(technology)) {
				ProjectDTO projectdto = new ProjectDTO();
				projectDTOs.add(projects);
			}
		}
		if (projectDTOs.isEmpty()) {
			throw new AbcException("Service.PROJECTS_NOT_FOUND");
		}
		return projectDTOs;
	}

}
