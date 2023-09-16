package com.learn2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.learn2.entities.Employee;
import com.learn2.repository.EmpRepo;

@Component
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private EmpRepo emprepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Employee emp = emprepo.findbyEmail(email);
		
		if(emp==null) {
			throw new UsernameNotFoundException("user name not found");
		}
		else {
		return new CustomUser(emp);
	}
	}

}
