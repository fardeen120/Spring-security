package com.learn2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn2.entities.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
	public Employee findbyEmail(String emial);

}
