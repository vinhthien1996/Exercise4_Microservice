package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.vo.CategoryVO;
import com.example.demo.vo.ProductCategory;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repository;
	
	@Autowired
	RestTemplate restTemplate;

//	SAVE PRODUCT
	@Override
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

//	GET PRODUCT
	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
//	GET PRODUCT BY ID
	@Override
	public Product getProductById(int id) {
		return repository.findById(id).get();
	}

	
//	GET PRODUCT AND CATEGORY
	@Override
	public ProductCategory getProductCategory(int id) {
		ProductCategory productCategory = new ProductCategory();
		Product prd = getProductById(id);
		
		CategoryVO cate = restTemplate.getForObject("http://CATEGORY-SERVICE/categories/" + prd.getIdCategory(), CategoryVO.class);
		
		productCategory.setProduct(prd);
		productCategory.setCategory(cate);
		return productCategory;
	}

//	UPDATE PRODUCT
	@Override
	public Product updateProduct(Product product) {
		return repository.save(product);
	}

//	DELETE PRODUCT
	@Override
	public void deleteProduct(int id) {
		repository.deleteById(id);
		
	}
	
}
