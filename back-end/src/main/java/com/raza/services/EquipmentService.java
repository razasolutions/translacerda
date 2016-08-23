package com.raza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raza.model.Equipment;
import com.raza.repositories.EquipmentRepository;

@Service
public class EquipmentService {

	@Autowired
	EquipmentRepository equipmentRepository;
	
	public List<Equipment> findAll(){
		return equipmentRepository.findAll();
	}

	public Equipment save(Equipment equipment){
		return equipmentRepository.save(equipment);
	}
	
	public Equipment edit(Equipment equipment){
		return equipmentRepository.save(equipment);
	}

	public Equipment findById(Long id){
		return equipmentRepository.findById(id);
	}

	public void delete(Equipment equipment){
		equipmentRepository.delete(equipment);
	}
	
}


