package com.hcl.lk.hms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.lk.hms.model.User;
import com.hcl.lk.hms.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User user) {
		User u =  service.login(user);
		ResponseEntity<User> response = new ResponseEntity<User>(u, HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/sign-up")
	public ResponseEntity<User> signup(@RequestBody User user) {
		User u =  service.signup(user);
		ResponseEntity<User> response = new ResponseEntity<User>(u, HttpStatus.OK);
		return response;
	}
}
