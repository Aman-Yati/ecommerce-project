package com.aman.ecommerce.backend.repository;

import com.aman.ecommerce.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}