package com.example.demo.rest.dtos;

public class PriceDto extends  AbstractDto{
    private String value;
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
