package com.raza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository(Register, Long){
	
	public Register findById(Long id);

}
