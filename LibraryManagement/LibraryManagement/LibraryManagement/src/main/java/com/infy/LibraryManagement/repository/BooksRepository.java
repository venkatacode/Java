package com.infy.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.LibraryManagement.dto.BooksDTO;
import com.infy.LibraryManagement.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

	

	

}
