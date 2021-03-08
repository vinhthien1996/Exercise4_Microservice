package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackMethodController {

	@GetMapping("/userFallBack")
	public Mono<String> userFallBackMethod() {
		return Mono.just("Order Service is talking too long to respond or is down. Please try again later.");
	}
	
	@GetMapping("/categoryFallBack")
	public Mono<String> categoryFallBackMethod() {
		return Mono.just("Order Service is talking too long to respond or is down. Please try again later.");
	}
	
	@GetMapping("/productFallBack")
	public Mono<String> productFallBackMethod() {
		return Mono.just("Product Service is talking too long to respond or is down. Please try again later.");
	}
	
	@GetMapping("/paymentFallBack")
	public Mono<String> paymentFallBackMethod() {
		return Mono.just("Payment Service is talking too long to respond or is down. Please try again later.");
	}
}
