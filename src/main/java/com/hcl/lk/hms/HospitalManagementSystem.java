package com.hcl.lk.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.lk.hms.model.User;
import com.hcl.lk.hms.repository.UserRepository;

@SpringBootApplication
public class HospitalManagementSystem implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystem.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User(0, "admin", "admin@hcl.com", "123456");
		repository.save(user);
	}

}
