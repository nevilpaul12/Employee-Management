package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public User updateUser(User user, long id) {
		// TODO Auto-generated method stub
		User user1 = userRepository.findById(id).get();
		user1.setEmail(user.getEmail());
		user1.setpNo(user.getpNo());
		user1.setAddress(user.getAddress());
		return userRepository.save(user1);
	}

}
