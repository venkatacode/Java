package com.infy.LibraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.LibraryManagement.dto.authorDTO;
import com.infy.LibraryManagement.entity.author;

@RestController
public class authorController {
	
	@Autowired 
	private com.infy.LibraryManagement.service.authorService authorService;
	@PostMapping("/authors")
	public String addNewAuthor(@RequestBody authorDTO authorDTO) {
		return authorService.addAuthor(authorDTO);
		
	}
	
	@GetMapping("/authors")
	public List<author> viewAuthor(){
		return authorService.viewAuthor();
		}
	
	@DeleteMapping("/authors/{Id}")
	public String deleteAuthor(@PathVariable("Id") int id){
		return authorService.delete(id);
		
		
		
	}
	

}
