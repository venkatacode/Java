
package com.dataentry.uploadcsv.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name="details_data",schema="Products")
public class Study {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="firstname")
	private String fname;
	@Column(name="lastname")
	private String lname;
	private String title;
	@Column(name="Description")
	private String desc;
	private boolean published;
	public Study() {
		super();
	}
	public Study(int id, String fname, String lname, String title, String desc, boolean published) {
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
	

	

}
