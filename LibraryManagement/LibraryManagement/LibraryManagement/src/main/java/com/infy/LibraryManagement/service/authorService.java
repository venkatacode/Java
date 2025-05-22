package com.infy.LibraryManagement.service;

import java.util.List;

import com.infy.LibraryManagement.dto.authorDTO;
import com.infy.LibraryManagement.entity.author;

public interface authorService {

	

	public String addAuthor(authorDTO authorDTO);

	public List<author> viewAuthor();
    public String delete(int id);
}
