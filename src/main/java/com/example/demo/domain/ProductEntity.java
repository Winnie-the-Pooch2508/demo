package com.example.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Set;


@Entity
@Table(name = "product")
public class ProductEntity extends AbstractEntity {



    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToOne(fetch= FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "product")
    private PictureEntity picture;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name="product_id", referencedColumnName="id")
    private Set<PriceEntity> prices;

    public Set<PriceEntity> getPrices() {
        return prices;
    }
    public void setPrices(Set<PriceEntity> prices) {
        if (this.prices == null) {
            this.prices = prices;
        } else {
            this.prices.clear();
            this.prices.addAll(prices);
        }
    }

    public PictureEntity getPicture() {
        return picture;
    }
    public void setPicture(PictureEntity picture) {
        this.picture = picture;
        this.picture.setProduct(this);
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

}
