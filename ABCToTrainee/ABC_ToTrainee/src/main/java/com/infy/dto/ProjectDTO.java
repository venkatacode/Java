package com.infy.dto;

import java.util.List;

public class ProjectDTO {

	private Integer projectId;
	private String projectName;
	private String technologyUsed;
	private Integer teamSize;
	private Integer cost;
	private List<TeamMemberDTO> memberList;

	public List<TeamMemberDTO> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<TeamMemberDTO> memberList) {
		this.memberList = memberList;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTechnologyUsed() {
		return technologyUsed;
	}

	public void setTechnologyUsed(String technologyUsed) {
		this.technologyUsed = technologyUsed;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProjectDTO [projectId=" + projectId + ", projectName=" + projectName + ", technologyUsed="
				+ technologyUsed + ", teamSize=" + teamSize + ", cost=" + cost + ", memberList=" + memberList + "]";
	}

}
