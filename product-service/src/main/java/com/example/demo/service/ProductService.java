package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;
import com.example.demo.vo.ProductCategory;

public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getProducts();
	
	public Product getProductById(int id);
	
	public ProductCategory getProductCategory(int id);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(int id);

}
