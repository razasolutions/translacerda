package com.raza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.raza.model.User;
import com.raza.repositories.UserRepository;

public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user){
		return userRepository.save(user);
	}
}