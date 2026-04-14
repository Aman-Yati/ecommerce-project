package com.aman.ecommerce.backend.repository;

import com.aman.ecommerce.backend.model.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariantRepository extends JpaRepository<ProductVariant, Long> {
}