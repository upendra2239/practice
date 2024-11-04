package com.example.microservices.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Udemy course - Java Spring Boot Microservices 5-in-1 - Spring Boot, Spring Cloud, Docker, Kubernetes and REST API (REST Web Services)
//currency-exchange-service, limits-service, currency-calculation-service, Spring-Cloud-Config-Server


@SpringBootApplication
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

}
