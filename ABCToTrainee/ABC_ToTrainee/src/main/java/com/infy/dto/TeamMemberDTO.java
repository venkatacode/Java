package com.infy.dto;

public class TeamMemberDTO {

	private Integer employeeId;
	private String employeeName;
	private String skills;
	private String designation;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "TeamMemberDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", skills=" + skills
				+ ", designation=" + designation + "]";
	}

}
