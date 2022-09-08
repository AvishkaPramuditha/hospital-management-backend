package com.hcl.lk.hms.repository;


import org.springframework.data.repository.CrudRepository;
import com.hcl.lk.hms.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	User findByUsernameAndPassword(String username, String password);
	
	User findByUsernameOrEmail(String username, String email);
}
