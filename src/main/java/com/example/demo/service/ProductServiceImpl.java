package com.example.demo.service;

import com.example.demo.domain.Product;
import com.example.demo.repos.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listAllProducts() {
        final List<Product> product = productRepository.findAll();
        return product;
    }

    @Override
    public Product getProductById(Long id) {
        final Product product = productRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Some error message"));
        return product;
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        return productRepository.findById(id)
                .map(existingProduct -> {
                    existingProduct.setName(product.getName());
                    existingProduct.setDescription(product.getDescription());
                    existingProduct.setPicture(product.getPicture());
                    existingProduct.setPrice(product.getPrice());

                    return productRepository.save(existingProduct);
                })
                .orElseGet(() -> productRepository.save(product));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product createNewProduct(Product product) {
        return productRepository.save(product);
    }
}