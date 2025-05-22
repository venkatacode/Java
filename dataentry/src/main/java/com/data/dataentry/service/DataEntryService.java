package com.data.dataentry.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.dataentry.bin.Products;
import com.data.dataentry.dto.ProductsDto;
import com.data.dataentry.excel.Excel;
import com.data.dataentry.repository.ProductRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
public class DataEntryService {
	@Autowired
	public ProductRepository productrepo;
	
	@PersistenceContext
	private EntityManager entityManager;
	public List<ProductsDto> getProducts(){
		String querystring = "SELECT p FROM Products p";
		Query query=entityManager.createQuery(querystring);
		List<Products> result=query.getResultList();
		List<ProductsDto> productdtolist=new ArrayList();
		if(!result.isEmpty()) {
			for(Products product: result){
				ProductsDto productdto=new ProductsDto();
				productdto.setProductid(product.getProductid());
				productdto.setProductname(product.getProductname());
				productdto.setProductdesc(product.getProductdesc());
				productdtolist.add(productdto);
			}
		}
		return productdtolist;
	}
	public ByteArrayInputStream getdata() throws IOException {
		List<Products> products=(List<Products>) productrepo.findAll();
		ByteArrayInputStream bytearray=Excel.dataToexcel(products);
		return bytearray;
	}
}
