package com.infy.LibraryManagement.service;

import java.util.List;


import com.infy.LibraryManagement.dto.BooksDTO;
import com.infy.LibraryManagement.entity.Books;
//import com.infy.LibraryManagement.exception.LibraryException;

public interface BooksService {

	
	public  List<Books> viewBooks();
	
	
	public String deleteId(int id);
	public String updateBooks(BooksDTO bookDTO);
	public String addNewBooks(BooksDTO bookDTO);
	
	

}
