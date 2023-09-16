package com.learn.models;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private long id;
	private  String name;
	private String username;
	private String password;
	private Long mnumber;
	private String email;
	private String Gender;
	private String city;
	private String state;
	
	

	public User(long id, String name, String username, String password, Long mnumber, String email, String gender,
			String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.mnumber = mnumber;
		this.email = email;
		this.Gender = gender;
		this.city = city;
		this.state = state;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMnumber() {
		return mnumber;
	}

	public void setMnumber(Long mnumber) {
		this.mnumber = mnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}



	
	}



	
	
	
	
	


