package com.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.learn.models.User;

public interface UserService {
	
	public List<User> getallusers();

	public Optional<User> getoneuser(Long userid);

	public User adduser(User user);

	public User updateuser(User user);

	public void deleteuser(long parseLong);

	
	



	

	

}
