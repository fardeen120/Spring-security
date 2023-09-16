package com.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.learn.dao.UserDao;
import com.learn.models.User;

@Service
public class UserServiceimpl implements UserService {
	
	@Autowired
	private UserDao userdao;

	@Override
	public List<User> getallusers() {
		
		return userdao.findAll();
	}

	@Override
	public Optional<User> getoneuser(Long userid) {
		// TODO Auto-generated method stub
		return userdao.findById(userid);
	}

	@Override
	public User adduser(User user) {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

	@Override
	public User updateuser(User user) {
		
		return userdao.save(user);
	}

	@Override
	public void deleteuser(long parseLong) {
		User entity=userdao.getOne(parseLong);
		userdao.delete(entity);;
		
	}

	

	

	
	
	



	



	

}
