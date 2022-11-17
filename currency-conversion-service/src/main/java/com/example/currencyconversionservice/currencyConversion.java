package com.example.currencyconversionservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class currencyConversion {
    public  Long id;
    public  String from;
    public  String to;
    public BigDecimal conversion_multiple;
    public BigDecimal quantity;
    public BigDecimal totalCalculatedAmount;
    public  int port;

}
