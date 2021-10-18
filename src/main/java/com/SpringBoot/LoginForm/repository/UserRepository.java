package com.SpringBoot.LoginForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.LoginForm.domain.User;

@Repository 
public interface UserRepository extends JpaRepository<User , Long>{
 User findByUsernameAndPassword(String username, String Password);
}
