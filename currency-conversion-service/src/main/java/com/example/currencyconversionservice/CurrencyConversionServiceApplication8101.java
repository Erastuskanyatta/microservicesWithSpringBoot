package com.example.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients("com.example.currencyconversionservice")
@EnableDiscoveryClient
public class CurrencyConversionServiceApplication8101 {
	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication8101.class, args);
	}

}
