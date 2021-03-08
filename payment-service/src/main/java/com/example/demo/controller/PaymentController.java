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

import com.example.demo.entity.Payment;
import com.example.demo.service.PaymentService;
import com.example.demo.vo.PaymentInfo;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	PaymentService service;
	
	@GetMapping
	public List<Payment> getPayments() {
		return service.getPayments();
	}
	
	@GetMapping("/{id}")
	public Payment getPaymentById(@PathVariable int id) {
		return service.getPaymentById(id);
	}
	
	@GetMapping("/full/{id}")
	public PaymentInfo getPaymentInfo(@PathVariable int id) {
		return service.getFullPayment(id);
	}
	
	@PostMapping
	public Payment savePayment(@RequestBody Payment payment) {
		return service.savePayment(payment);
	}
	
	@PutMapping("/{id}")
	public Payment updatePayment(@PathVariable int id, @RequestBody Payment payment) {
		payment.setId(id);
		return service.updatePayment(payment);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deletePayment(@PathVariable int id) {
		service.deletePayment(id);
		JSONObject message = new JSONObject();
		message.put("message", "Payment deleted successfully");
		return ResponseEntity.status(200).body(message);
	}
}