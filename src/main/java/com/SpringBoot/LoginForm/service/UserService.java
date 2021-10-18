package com.SpringBoot.LoginForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.LoginForm.domain.User;
import com.SpringBoot.LoginForm.repository.UserRepository;

@Service  
public class UserService {
	@Autowired
	private UserRepository repo;
	  
	  public User login(String username, String password) {
	  User user = repo.findByUsernameAndPassword(username, password);
	   return user;
	  }
}
 