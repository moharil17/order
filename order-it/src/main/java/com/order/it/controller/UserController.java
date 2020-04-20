package com.order.it.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.it.bean.User;
import com.order.it.repository.UserRepository;
import com.order.it.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService us;
	
	@Autowired
	private UserRepository ur;
	
	@PostMapping("/createUser")
	public ResponseEntity<String> signup(User user) {
		
		User savedUser = us.save(user);
		return new ResponseEntity<String>("user created.", HttpStatus.CREATED);
	}
	
	@GetMapping("/findUserByMobNo/{mobileNo}")
	public Optional<User> getUserByMobileNo(@PathVariable("mobileNo") String mobNo) {
		
		return us.findById(mobNo);
	}
	@GetMapping("/hello")
	public String greeting() {
		return "Hello World";
	}
}
