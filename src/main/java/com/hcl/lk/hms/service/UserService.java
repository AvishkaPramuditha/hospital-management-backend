package com.hcl.lk.hms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.lk.hms.exception.ResourceNotFoundException;
import com.hcl.lk.hms.model.Patient;
import com.hcl.lk.hms.model.User;
import com.hcl.lk.hms.repository.PatientRepository;
import com.hcl.lk.hms.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User login(User user) {
		User u = null;
		try {
			u = repository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}
	
	public User signup(User user) {
		User u = null;
		try {
			u = repository.findByUsernameOrEmail(user.getUsername(), user.getEmail());
		} catch (Exception e) {
			System.out.println(e);
		}
		if(u == null) {
			repository.save(user);
			return null;
		} else {
			return u;
		}
	}
}
