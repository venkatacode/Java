package com.infy.LibraryManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class author {
	@Id
	int id;
	
	String name;
	public author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public author() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
