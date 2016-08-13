package com.raza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raza.model.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
	
	public Equipment findById(Long id);
	
}
