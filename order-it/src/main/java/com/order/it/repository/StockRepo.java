package com.order.it.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.order.it.entity.Stock;

@Repository
public interface StockRepo extends CrudRepository<Stock, Integer>{

	
}
