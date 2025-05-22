package com.infy.LibraryManagement.dto;

import com.infy.LibraryManagement.entity.Books;

public class BooksDTO {

	int id;
	String isbn;
	String name;
	String description;
	public BooksDTO(int id, String isbn, String name, String description) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.description = description;
	}
	public BooksDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static Books prepareBooksEntity(BooksDTO booksDTO)
	{
		Books booksEntity=new Books();
		booksEntity.setId(booksDTO.getId());
		booksEntity.setIsbn(booksDTO.getIsbn());
		booksEntity.setName(booksDTO.getName());
		booksEntity.setDescription(booksDTO.getDescription());
		return booksEntity;
		
		
		
	}
	
}
