package com.infy.LibraryManagement.dto;


import com.infy.LibraryManagement.entity.author;

public class authorDTO {

	int id;
	String name;
	public authorDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public static author prepareauthorEntity(authorDTO authorDTO)
	{
		author authorEntity=new author();
		authorEntity.setId(authorDTO.getId());
	    authorEntity.setName(authorDTO.getName());
		
		return authorEntity;
		
		
		
	}
	
}
