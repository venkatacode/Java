package com.infy.LibraryManagement.entity;

import com.infy.LibraryManagement.dto.BooksDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	int id;

	String isbn;
	String name;
	String description;

	public Books() {
		// TODO Auto-generated constructor stub
	}


	public Books(int id, String isbn, String name, String description) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.description = description;
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

	public int getId() {
		return id;
	}
	
	public static BooksDTO prepareBooksDTO(Books books)
	{
		BooksDTO booksDTO=new BooksDTO();
		booksDTO.setId(books.getId());
		booksDTO.setIsbn(books.getIsbn());
		booksDTO.setName(books.getName());
		booksDTO.setDescription(books.getDescription());
		return booksDTO;
		
		
		
	}
	
}
