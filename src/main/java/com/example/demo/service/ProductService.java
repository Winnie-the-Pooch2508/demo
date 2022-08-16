package com.example.demo.service;

import com.example.demo.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProducts();

    Product getProductById(Long id);

    Product updateProduct(Product product, Long id);

    void deleteProduct(Long id);

    Product createNewProduct(Product product);
}

