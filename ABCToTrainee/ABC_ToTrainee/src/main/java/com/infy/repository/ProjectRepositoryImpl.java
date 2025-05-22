package com.infy.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infy.dto.ProjectDTO;
import com.infy.dto.TeamMemberDTO;
import com.infy.exception.AbcException;

@Repository(value = "projectRepository")
public class ProjectRepositoryImpl implements ProjectRepository {

	public List<ProjectDTO> projectList = new ArrayList<>();
	public static Integer projectId = 5004;

	public ProjectRepositoryImpl() {
		projectId++;

		ProjectDTO project = new ProjectDTO();
		project.setProjectId(5001);
		project.setCost(200000);
		project.setProjectName("FSADM1");
		project.setTeamSize(20);
		project.setTechnologyUsed("Java");

		List<TeamMemberDTO> listofMembers = new ArrayList<>();
		TeamMemberDTO member1 = new TeamMemberDTO();
		member1.setEmployeeId(722666);
		member1.setEmployeeName("Ron");
		member1.setSkills("Java,BI");
		member1.setDesignation("SC");

		TeamMemberDTO member2 = new TeamMemberDTO();
		member2.setEmployeeId(722667);
		member2.setEmployeeName("Jack");
		member2.setSkills("Java,BI");
		member2.setDesignation("SC");

		listofMembers.add(member1);
		listofMembers.add(member2);

		project.setMemberList(listofMembers);

		ProjectDTO project1 = new ProjectDTO();
		project1.setProjectId(5002);
		project1.setCost(200000);
		project1.setProjectName("FSADM2");
		project1.setTeamSize(15);
		project1.setTechnologyUsed("BI");

		List<TeamMemberDTO> listofMembers1 = new ArrayList<>();
		TeamMemberDTO member3 = new TeamMemberDTO();
		member3.setEmployeeId(722668);
		member3.setEmployeeName("Andrews");
		member3.setSkills("BI");
		member3.setDesignation("SC");
		TeamMemberDTO member4 = new TeamMemberDTO();
		member4.setEmployeeId(722669);
		member4.setEmployeeName("John");
		member4.setSkills("BI");
		member4.setDesignation("SC");
		TeamMemberDTO member5 = new TeamMemberDTO();
		member5.setEmployeeId(722670);
		member5.setEmployeeName("Steve");
		member5.setSkills("BI");
		member5.setDesignation("SC");

		listofMembers1.add(member3);
		listofMembers1.add(member4);
		listofMembers1.add(member5);

		project1.setMemberList(listofMembers1);

		projectList.add(project);
		projectList.add(project1);

	}

	public Integer addProject(ProjectDTO project) throws AbcException {
		project.setProjectId(projectId);
		projectList.add(project);
		return project.getProjectId();
	}

	public List<ProjectDTO> getProjectDetails() throws AbcException {

		return projectList;
	}

}
