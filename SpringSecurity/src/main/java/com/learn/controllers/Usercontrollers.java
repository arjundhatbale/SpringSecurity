package com.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.models.User;
import com.learn.services.UserServices;

@RestController
@RequestMapping("/users")
public class Usercontrollers {

	@Autowired
	private UserServices userServices;
	
	// all user
	@GetMapping("/")
	public List<User> getAllUser(){
		return userServices.getAllUsers();
	}
	
	// return single user
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userServices.getUser(username);
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		return this.userServices.addUser(user);
	}
	
	
	
	
}
