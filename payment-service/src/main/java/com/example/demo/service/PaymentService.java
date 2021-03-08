package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Payment;
import com.example.demo.vo.PaymentInfo;

public interface PaymentService {

	public List<Payment> getPayments();

	public Payment getPaymentById(int id);

	public Payment savePayment(Payment payment);

	public Payment updatePayment(Payment payment);

	public void deletePayment(int id);
	
	public PaymentInfo getFullPayment(int id);
}
