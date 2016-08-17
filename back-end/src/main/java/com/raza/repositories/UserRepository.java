package com.raza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raza.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findById(Long id);
	
}