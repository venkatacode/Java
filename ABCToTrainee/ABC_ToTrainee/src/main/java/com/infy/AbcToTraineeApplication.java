package com.infy;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.core.env.Environment;

import com.infy.dto.ProjectDTO;
import com.infy.dto.TeamMemberDTO;
import com.infy.exception.AbcException;

import com.infy.service.ProjectService;

@SpringBootApplication
public class AbcToTraineeApplication implements CommandLineRunner {

	@Autowired
	public Environment env;
	@Autowired
	public ProjectService projectservice;
	Logger log = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(AbcToTraineeApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		addProject();
		getProjectDetails();
	}

	public void addProject() throws AbcException {

		ProjectDTO project = new ProjectDTO();
		project.setCost(200000);
		project.setProjectName("FSADM8");
		project.setTeamSize(20);
		project.setTechnologyUsed("Java");

		List<TeamMemberDTO> listofMembers = new ArrayList<>();
		TeamMemberDTO member1 = new TeamMemberDTO();
		member1.setEmployeeId(722009);
		member1.setEmployeeName("Robin");
		member1.setSkills("Java , Oracle");
		member1.setDesignation("SSC");

		TeamMemberDTO member2 = new TeamMemberDTO();
		member2.setEmployeeId(722019);
		member2.setEmployeeName("Monica");
		member2.setSkills("Python,Java");
		member2.setDesignation("SSC");

		listofMembers.add(member1);
		listofMembers.add(member2);

		project.setMemberList(listofMembers);

		try {
			Integer projectId = projectservice.addProject(project);

			log.info(env.getProperty("UserInterface.PROJECT_ADDED_SUCCESS") + projectId);
		} catch (AbcException e) {
			log.info(env.getProperty(e.getMessage()));
		}

	}

	public void getProjectDetails() throws AbcException {
		try {
			for (ProjectDTO project : projectservice.getProjectDetails("Angular")) {
				log.info(project.toString());

			}
		} catch (AbcException e) {
			log.info(env.getProperty(e.getMessage()));
		}

	}

}