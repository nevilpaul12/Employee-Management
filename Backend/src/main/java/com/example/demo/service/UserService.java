package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public interface UserService {

	 public User createUser(User user);
	 
	 public List<User> getUsers();
	 
	 public User getUserById(long id);
	 
	 public void deleteUser(long id);
	 
	 public User updateUser(long id,User user);
}
