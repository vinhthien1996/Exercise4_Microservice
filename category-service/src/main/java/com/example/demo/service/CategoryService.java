package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Category;

public interface CategoryService {

	List<Category> getCategory();

	Category getCategoryById(int id);
	
	Category saveCategory(Category user);
	
	Category updateCategory(Category cate);

	void deleteCategory(int id);

}
