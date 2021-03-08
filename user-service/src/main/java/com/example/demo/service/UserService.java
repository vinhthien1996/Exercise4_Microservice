package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User getUserById(int id);
	
	public User saveUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(int id);
}
