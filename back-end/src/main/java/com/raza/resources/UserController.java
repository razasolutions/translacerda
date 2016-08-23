package com.raza.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raza.model.User;
import com.raza.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

    @RequestMapping("/users")
    public List<User> listUsers() {
        return userService.findAll();
    }
    
    @RequestMapping("/add-user")
    public User addUser(User user){
    	return userService.save(user);
    }
    
    @RequestMapping("/view-user")
    public User viewUser(Long id){
    	return userService.findById(id);
    }
    
    @RequestMapping("/edit-user")
    public User editUser(User user){
    	return userService.edit(user);
    }
    
    @RequestMapping("/delete-user")
    public void deleteUser(User user){
    	userService.delete(user);
    }
    
}
