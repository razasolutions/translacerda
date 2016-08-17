package com.raza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raza.model.User;
import com.raza.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user){
		return userRepository.save(user);
	}
	
	public User edit(User user){
		return userRepository.save(user);
	}
	
	public User findById(Long id){
		return userRepository.findById(id);
	}
	
	public void delete(User user){
		userRepository.delete(user);
	}
}