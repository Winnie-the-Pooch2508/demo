package com.example.demo.rest.dtos;

import java.util.Set;

public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private PictureDto picture;
    private  Set<PriceDto> prices;


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

    public PictureDto getPicture() {
        return picture;
    }

    public void setPicture(PictureDto picture) {
        this.picture = picture;
    }

    public Set<PriceDto> getPrices() {
        return prices;
    }
    public void setPrices(Set<PriceDto> prices) {
        this.prices = prices;
    }
}
