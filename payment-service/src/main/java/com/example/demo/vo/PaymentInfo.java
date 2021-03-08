package com.example.demo.vo;

import com.example.demo.entity.Payment;

public class PaymentInfo {

	private Payment payment;
	private UserVO user;
	private ProductVO product;

	public PaymentInfo() {
		super();
	}

	public PaymentInfo(Payment payment, UserVO user, ProductVO product) {
		super();
		this.payment = payment;
		this.user = user;
		this.product = product;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public ProductVO getProduct() {
		return product;
	}

	public void setProduct(ProductVO product) {
		this.product = product;
	}
}
