package com.example.demo.service;

import com.example.demo.domain.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> listAllProducts();

    ProductEntity getProductById(Long id);

    ProductEntity updateProduct(ProductEntity product, Long id);

    void deleteProduct(Long id);

    ProductEntity createNewProduct(ProductEntity product);
}

