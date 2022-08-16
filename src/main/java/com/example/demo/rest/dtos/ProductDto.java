package com.example.demo.rest.dtos;

import java.util.Set;

public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private MediaDto picture;
    private  Set<PricesDto> prices;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public MediaDto getPicture() {
        return picture;
    }

    public void setPicture(MediaDto picture) {
        this.picture = picture;
    }

    public Set<PricesDto> getPrices() {
        return prices;
    }
    public void setPrices(Set<PricesDto> prices) {
        this.prices = prices;
    }
}
