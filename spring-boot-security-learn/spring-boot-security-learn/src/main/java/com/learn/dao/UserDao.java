package com.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.models.User;

public interface UserDao extends JpaRepository<User, Long> {

}
