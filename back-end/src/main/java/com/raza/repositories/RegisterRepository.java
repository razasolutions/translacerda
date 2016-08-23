package com.raza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raza.model.Register;

public interface RegisterRepository extends JpaRepository<Register, Long>{
	
	public Register findById(Long id);

}