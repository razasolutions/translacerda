package com.raza.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raza.model.Register;
import com.raza.services.RegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping("/registers")
	public List<Register> listRegisters(){
		return registerService.findAll();
	}
	
	@RequestMapping("/add-register")
	public Register addRegister(Register register){
		return registerService.save(register);
	}
	
	@RequestMapping("/view-register")
	public Register readRegister(Long id){
		return registerService.findById(id);
	}

	@RequestMapping("/edit-register")
	public Register updateRegister(Register register){
		return registerService.edit(register);
	}
	
	@RequestMapping("/delete-register")
	public void deleteRegister(Register register){
		registerService.delete(register);
	}
	
}
