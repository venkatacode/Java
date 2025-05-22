package com.dataentry.uploadcsv.model;



public class StudyDtoNames {

	private String fname;
	private String lname;

	
	public StudyDtoNames() {
		super();
	}
	
	public StudyDtoNames(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}


	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "StudyDto [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
}
