package com.raza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raza.model.Register;
import com.raza.repositories.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	RegisterRepository registerRepository;
	
	public List<Register> findAll(){
		return registerRepository.findAll();
	}
	
	public User save(Register register){
		return registerRepository.save(register);
	}
	
	public User findById(Long id){
		return registerRepository.findById(id);
	}
	
	public void delete(Register register){
		registerRepository.delete(register);
	}

}
