package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository repository;

	@Override
	public List<Category> getCategory() {
		return repository.findAll();
	}

	@Override
	public Category getCategoryById(int id) {
		return repository.findById(id).get();
	}
	
	@Override
	public Category saveCategory(Category user) {
		return repository.save(user);
	}
	
	@Override
	public Category updateCategory(Category cate) {
		return repository.save(cate);
	}

	@Override
	public void deleteCategory(int id) {
		repository.deleteById(id);
	}



}
