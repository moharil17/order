package com.order.it.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.order.it.bean.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

	//public User findUserBymobileNo();
	
}
