package com.example.demo.repos;

import com.example.demo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>  {
}
