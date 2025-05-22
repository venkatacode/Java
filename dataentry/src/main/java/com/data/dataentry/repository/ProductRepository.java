package com.data.dataentry.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.data.dataentry.bin.Products;
import com.data.dataentry.dto.ProductsDto;

public interface ProductRepository extends CrudRepository<Products, Integer> {


}
