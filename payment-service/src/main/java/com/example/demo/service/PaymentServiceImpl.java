package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.vo.PaymentInfo;
import com.example.demo.vo.ProductVO;
import com.example.demo.vo.UserVO;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepository repository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<Payment> getPayments() {
		return repository.findAll();
	}

	@Override
	public Payment getPaymentById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Payment savePayment(Payment payment) {
		return repository.save(payment);
	}

	@Override
	public Payment updatePayment(Payment payment) {
		return repository.save(payment);
	}

	@Override
	public void deletePayment(int id) {
		repository.deleteById(id);
	}

	@Override
	public PaymentInfo getFullPayment(int id) {
		
		Payment payment = repository.findById(id).get();
		UserVO userVO = restTemplate.getForObject("http://USER-SERVICE/users/" + payment.getUserId(), UserVO.class);
		ProductVO productVO = restTemplate.getForObject("http://PRODUCT-SERVICE/products/" + payment.getProductId(), ProductVO.class);
		
		PaymentInfo paymentInfo = new PaymentInfo(payment, userVO, productVO);
		return paymentInfo;
	}

}
