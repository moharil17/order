package com.order.it.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.multipart.MultipartFile;

import com.order.it.entity.Products;

public interface ProductRepository extends CrudRepository<Products, Integer> {

	
}
