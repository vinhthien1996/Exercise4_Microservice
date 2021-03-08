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

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import com.example.demo.vo.ProductCategory;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/category/{id}")
	public ProductCategory getProductCategory(@PathVariable int id) {
		return service.getProductCategory(id);
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
		System.out.println("Product: " + product.getName());
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
		JSONObject message = new JSONObject();
		message.put("message", "Product deleted successfully");
		return ResponseEntity.status(200).body(message);
	}
	
	

}
