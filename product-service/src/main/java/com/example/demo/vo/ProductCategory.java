package com.example.demo.vo;

import com.example.demo.entity.Product;

public class ProductCategory {
	private Product product;
	private CategoryVO category;

	public ProductCategory() {
		super();
	}

	public ProductCategory(Product product, CategoryVO category) {
		super();
		this.product = product;
		this.category = category;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CategoryVO getCategory() {
		return category;
	}

	public void setCategory(CategoryVO category) {
		this.category = category;
	}

}
