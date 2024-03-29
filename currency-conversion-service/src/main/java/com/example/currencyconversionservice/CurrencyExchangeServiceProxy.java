package com.example.currencyconversionservice;


import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient( name ="currency-exchange-service",url ="localhost:8001")
@FeignClient(name ="currency-exchange-service")
@LoadBalancerClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
        @GetMapping("/currency-exchange/from/{from}/to/{to}")
        public currencyConversion retrieveExchangeValue
        (@PathVariable("from") String from, @PathVariable("to") String to);
}
