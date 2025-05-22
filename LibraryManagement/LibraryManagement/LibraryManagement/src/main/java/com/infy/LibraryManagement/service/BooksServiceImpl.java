package com.infy.LibraryManagement.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.infy.LibraryManagement.dto.BooksDTO;
import com.infy.LibraryManagement.entity.Books;
//import com.infy.LibraryManagement.entity.Books;
import com.infy.LibraryManagement.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService {
	@Autowired
	private BooksRepository booksrepository;
  
	
	@Override
	public List<Books> viewBooks() {
		// TODO Auto-generated method stub
		return booksrepository.findAll();
	}

	@Override
	public String deleteId(int id) {
		// TODO Auto-generated method stub
		//try {
			Books books = booksrepository.findById(id).get();
			booksrepository.deleteById(id);
			return "deleted successfully ---";
		//}
		
//		catch(Exception e) {
//			System.out.println("#$%^&*()OIUJHGVBGHJK");
//			throw new LibraryException("Id Not Found", HttpStatus.NOT_FOUND, "ER_001");			
//		}
	}

	@Override
	public String updateBooks(BooksDTO bookDTO) {
		// TODO Auto-generated method stub
		
		Books books=booksrepository.findById(bookDTO.getId()).get();
		if(bookDTO.getIsbn()!=null)
			books.setIsbn(bookDTO.getIsbn());
		if(bookDTO.getName()!=null)
			books.setName(bookDTO.getName());
		if(bookDTO.getDescription()!=null)
			books.setDescription(bookDTO.getDescription());
		booksrepository.save(books);
			
		
		//booksrepository.saveAndFlush(BooksDTO.prepareBooksEntity(bookDTO));
		
		return "updated";
	}

	@Override
	public String addNewBooks(BooksDTO bookDTO) {
		// TODO Auto-generated method stub
		booksrepository.save(BooksDTO.prepareBooksEntity(bookDTO));
		return "books added";

	}

}
