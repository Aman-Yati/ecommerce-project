package com.aman.ecommerce.backend.repository;

import com.aman.ecommerce.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}