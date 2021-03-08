package com.example.demo.vo;


public class ProductVO {

	private int id;
	private String name;
	private String des;
	private int price;
	private int idCategory;

	public ProductVO() {
		super();
	}

	public ProductVO(int id, String name, String des, int price, int idCategory) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
		this.price = price;
		this.idCategory = idCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

}
