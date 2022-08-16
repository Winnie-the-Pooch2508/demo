package com.example.demo.rest.dtos;

public class PricesDto {
    private Long id;
    private String value;
    private String currencyIsoCode;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
