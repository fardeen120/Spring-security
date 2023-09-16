package com.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.models.User;
import com.learn.service.UserService;





@RestController
@RequestMapping("/user")
public class MyController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/home")
	public String home() {
		return "welcome to login";
		
	}
	
	
	@GetMapping("/users")
	public List<User> getallusers(){
		return this.userservice.getallusers();
		
	}
	
	@GetMapping("/users/{userid}")
	public Optional<User> getoneuser (@PathVariable String userid) {
		return this.userservice.getoneuser(Long.parseLong(userid));
	}
	
	@PostMapping("/add")
	public  User adduser(@RequestBody User user) {
		return this.userservice.adduser(user);
		
		
		
	}
	
	@PutMapping("/update")
	public User updateuser(@RequestBody User user){
		return this.userservice.updateuser(user);
		
		
		 
		
	}
	
	@DeleteMapping("/delete/{userid}")
	public ResponseEntity<HttpStatus>deleteuser(@PathVariable String userid){
		try {
			
			this.userservice.deleteuser(Long.parseLong(userid));
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	
}
