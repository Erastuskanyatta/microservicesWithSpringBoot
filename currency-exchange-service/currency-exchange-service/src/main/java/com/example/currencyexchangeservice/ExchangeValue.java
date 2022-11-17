package com.example.currencyexchangeservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
@NoArgsConstructor

@AllArgsConstructor
@Data
@Entity
@Table(name = "exchangevalue")
public class ExchangeValue {
    @Id
    @SequenceGenerator(
            name = "sequence-name"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    public  long Id;
    @Column(name="currency_from")
    public  String from;
    @Column(name="currency_to")
    public String to;
    @Column(name="port")
    public int port;
    @Column(name="conversion_multiple")
    public BigDecimal conversion_multiple;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
