package com.raza.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raza.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findById(long id);
	
	public List<User> findAll();
	
}