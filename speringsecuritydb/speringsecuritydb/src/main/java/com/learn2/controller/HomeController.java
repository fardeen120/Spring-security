package com.learn2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class HomeController {
//	
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
	
	@GetMapping("/home")
	public String home() {
		return "index";
		
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
		
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "profile";
		
	}

}
