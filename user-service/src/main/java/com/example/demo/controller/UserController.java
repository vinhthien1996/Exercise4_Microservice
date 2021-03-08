package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping
	public List<User> getUsers() {
		return service.getUsers();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		user.setId(id);
		return service.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteUser(@PathVariable int id) {
		service.deleteUser(id);
		JSONObject message = new JSONObject();
		message.put("message", "User deleted successfully");
		return ResponseEntity.status(200).body(message);
	}
}
