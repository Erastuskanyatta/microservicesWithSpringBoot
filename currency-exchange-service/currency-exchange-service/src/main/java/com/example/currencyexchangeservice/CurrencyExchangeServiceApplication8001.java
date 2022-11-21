package com.example.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServiceApplication8001 {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication8001.class, args);
	}

}
