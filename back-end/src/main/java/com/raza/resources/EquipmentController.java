package com.raza.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raza.model.Equipment;
import com.raza.services.EquipmentService;

@RestController
public class EquipmentController {
	
	@Autowired
	EquipmentService equipmentService;
	
	@RequestMapping("/equipments")
	public List<Equipment> listEquipments(){
		return equipmentService.findAll();
	}
	
	@RequestMapping("/add-equipment")
	public Equipment addEquipment(Equipment equipment){
		return equipmentService.save(equipment);
	}
	
	@RequestMapping("/view-equipment")
	public Equipment readEquipment(Long id){
		return equipmentService.findById(id);
	}

	@RequestMapping("/edit-equipment")
	public Equipment updateEquipment(Equipment equipment){
		return equipmentService.edit(equipment);
	}
	
	@RequestMapping("/delete-equipment")
	public void deleteEquipment(Equipment equipment){
		equipmentService.delete(equipment);
	}
	
}
