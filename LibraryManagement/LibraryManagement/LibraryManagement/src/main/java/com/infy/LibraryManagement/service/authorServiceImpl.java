package com.infy.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.LibraryManagement.dto.authorDTO;
import com.infy.LibraryManagement.entity.author;
import com.infy.LibraryManagement.repository.authorRepository;

@Service
public class authorServiceImpl implements authorService{
	@Autowired
	private authorRepository authorRepository;

	@Override
	public String addAuthor(authorDTO authorDTO) {
		// TODO Auto-generated method stub
		  authorRepository.save(authorDTO.prepareauthorEntity(authorDTO));
		return "author added";
	}

	@Override
	public List<author> viewAuthor() {
		// TODO Auto-generated method stub
		return authorRepository.findAll() ;
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		authorRepository.deleteById(id);
		return "auhtor deleted";
	}

}
