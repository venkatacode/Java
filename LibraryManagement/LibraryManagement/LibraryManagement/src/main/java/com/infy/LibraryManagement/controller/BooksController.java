package com.infy.LibraryManagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.LibraryManagement.dto.BooksDTO;
import com.infy.LibraryManagement.entity.Books;
//import com.infy.LibraryManagement.exception.LibraryException;
import com.infy.LibraryManagement.service.BooksService;

@RestController
public class BooksController {
	@Autowired
	private BooksService bookservice;
	
	//@Autowired
	//LibraryException libraryException;
	
	@PostMapping("/books")
	public String addNewBook(@RequestBody BooksDTO bookDTO) {
		
		return bookservice.addNewBooks(bookDTO);
	
	}

	@GetMapping("/books")
	public ResponseEntity <List<Books>> viewBooks() {
	   HttpHeaders responseHeaders=new HttpHeaders();
	   responseHeaders.set("api owner", "satya");
		return  new ResponseEntity <>(bookservice.viewBooks(),responseHeaders,HttpStatus.OK);
		
	}
	@PutMapping("/books")
	public String updateBooks(@RequestBody BooksDTO bookDTO ) {
	return bookservice.updateBooks(bookDTO);
	}
	
	@DeleteMapping("/books/{Id}")
	public String delete(@PathVariable("Id") int id) {
	//	try {
			return bookservice.deleteId(id);
		//}catch(LibraryException e) {
			//System.out.println("dfghjklkjhgbvfc-09876543");
		//	throw new LibraryException(e.getMsg(), e.getStatus_code(), e.getCode());
		//}
		
	}
}
