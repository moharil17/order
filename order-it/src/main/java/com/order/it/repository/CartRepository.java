package com.order.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.order.it.entity.Cart;
import com.order.it.entity.comppk.CartPK;

public interface CartRepository extends CrudRepository<Cart, CartPK> {

	List<Cart> findByIdMobileNo(String mobileNo);
	
	@Modifying
	@Query("update Cart set qty =:quantity,amount =:productAmount where id =:id")
	int updateCart(@Param("quantity") int quantity, @Param("productAmount") double productAmount,@Param("id") CartPK id);
}
