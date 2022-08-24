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
import javax.persistence.Version;
import java.util.Set;


@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;


    @Version
    @Column(name = "version")
    private long version;

    @OneToOne(cascade =  CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="id", referencedColumnName="product_id")
    private MediaEntity picture;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name="product_id", referencedColumnName="id")
    private Set<PricesEntity> prices;

    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }

    public Set<PricesEntity> getPrices() {
        return prices;
    }
    public void setPrices(Set<PricesEntity> prices) {
        if (this.prices == null) {
            this.prices = prices;
        } else {
            this.prices.clear();
            this.prices.addAll(prices);
        }
    }

    public MediaEntity getPicture() {
        return picture;
    }
    public void setPicture(MediaEntity picture) {
        this.picture = picture;
    }


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
}
