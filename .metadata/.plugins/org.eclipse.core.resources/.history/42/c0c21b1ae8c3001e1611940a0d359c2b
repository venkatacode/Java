package com.data.dataentry.productController;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.dataentry.service.DataEntryService;



@RestController
public class ProductController {

	@Autowired
	private DataEntryService service;
	
	@RequestMapping(path="/excel") 
	public ResponseEntity<Resource> save() throws IOException{
		String filename="products.xlsx";
		ByteArrayInputStream original=service.getdata();
		InputStreamResource file=new InputStreamResource(original);
		ResponseEntity<Resource> body=ResponseEntity.ok().header("ContentDisposition", "attachment; filename="+filename)
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
                .body(file);

		return body ;
		
	}
	
}
