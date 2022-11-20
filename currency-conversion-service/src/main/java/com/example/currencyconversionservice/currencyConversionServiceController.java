package com.example.currencyconversionservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class currencyConversionServiceController {
 @Autowired
 private Environment environment;

 @Autowired
 public  CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public currencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable BigDecimal quantity) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        ResponseEntity<currencyConversion> responseEntity = new RestTemplate().
                getForEntity("http://localhost:8001/currency-exchange/from/{from}/to/{to}", currencyConversion.class,
                uriVariables);
        currencyConversion response = responseEntity.getBody();
//        System.out.println("This is the : " + responseEntity.getBody());
        return new currencyConversion(response.getId(), from, to, response.getConversion_multiple(), quantity,
                quantity.multiply(response.getConversion_multiple()), response.getPort());
    }
    // new version of the above API using Feign
    @GetMapping("/currency-converter-Feign/from/{from}/to/{to}/quantity/{quantity}")
    public currencyConversion convertCurrencyFeign(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity) {
        currencyConversion response = currencyExchangeServiceProxy.retrieveExchangeValue(from, to);
      System.out.println("feign application  : "  + response);
        return new currencyConversion(response.getId(), from, to, response.getConversion_multiple(), quantity,
                quantity.multiply(response.getConversion_multiple()), response.getPort());

    }


}
