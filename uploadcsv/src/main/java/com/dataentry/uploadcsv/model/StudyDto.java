package com.dataentry.uploadcsv.model;

public class StudyDto {
	private int id;
	private String fname;
	private String lname;
	private String title;
	private String desc;
	private boolean published;
	
	public StudyDto() {
		super();
	}
	
	public StudyDto(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public StudyDto(int id, String fname, String lname, String title, String desc, boolean published) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.title = title;
		this.desc = desc;
		this.published = published;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean published) {
		this.published = published;
	}
	@Override
	public String toString() {
		return "StudyDto [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
}
