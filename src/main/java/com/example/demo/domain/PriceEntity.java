package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "price")
public class PriceEntity extends AbstractEntity{
    @Column(name = "value")
    private String value;

    @Column(name = "currencyIsoCode")
    private String currencyIsoCode;

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }
    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }
}
