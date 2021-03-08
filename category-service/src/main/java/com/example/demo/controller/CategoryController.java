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

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	CategoryService service;

	@GetMapping
	public List<Category> getCategories() {
		return service.getCategory();
	}
	
	@GetMapping("/{id}")
	public Category getCategory(@PathVariable int id) {
		return service.getCategoryById(id);
	}
	
	@PostMapping
	public Category saveCategories(@RequestBody Category category) {
		return service.saveCategory(category);
	}
	
	@PutMapping("/{id}")
	public Category updateCategory(@PathVariable int id, @RequestBody Category cate) {
		cate.setId(id);
		return service.updateCategory(cate);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteCategory(@PathVariable int id) {
		service.deleteCategory(id);
		JSONObject message = new JSONObject();
		message.put("message", "Category deleted successfully");
		return ResponseEntity.status(200).body(message);
	}
}
