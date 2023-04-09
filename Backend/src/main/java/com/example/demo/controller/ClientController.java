package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class ClientController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String helloworld() {
		return "Hello World!!!";
	}
	
	@PostMapping("/add")
	public User createUser(@RequestBody User user) {
		User user1 = userService.createUser(user);
		return user1;
	}
	
	@GetMapping("/users")
	public List<User> getUser(){
		return userService.getUsers();
	}
	
	@PutMapping("/update/{id}")
	public User updateUserById(@RequestBody User user, @PathVariable("id") long id) {
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/delete/{id}")
		public String deleteUser(@PathVariable("id") long id) {
			userService.deleteUser(id);
			return "User Deleted Successfully";
		
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") long id) {
		return userService.getUserById(id);
		
	}
}
