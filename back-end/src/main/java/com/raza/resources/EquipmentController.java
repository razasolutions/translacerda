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
	
	@RequestMapping("/addEquipment")
	public Equipment addEquipment(Equipment equipment){
		return equipmentService.save(equipment);
	}
	
	@RequestMapping("/readEquipment")
	public Equipment readEquipment(Long id){
		return equipmentService.findById(id);
	}

	@RequestMapping("updateEquipment")
	public Equipment updateEquipment(Equipment equipment){
		return equipmentService.save(equipment);
	}
	
	@RequestMapping("/deleteEquipment")
	public void deleteEquipment(Equipment equipment){
		equipmentService.delete(equipment);
	}
}
