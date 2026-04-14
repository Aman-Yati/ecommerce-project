package com.aman.ecommerce.backend.service;

import com.aman.ecommerce.backend.model.Product;
import com.aman.ecommerce.backend.model.ProductVariant;
import com.aman.ecommerce.backend.repository.ProductRepository;
import com.aman.ecommerce.backend.repository.ProductVariantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductVariantService {

    private final ProductVariantRepository repo;
    private final ProductRepository productRepo;

    public ProductVariantService(ProductVariantRepository repo, ProductRepository productRepo) {
        this.repo = repo;
        this.productRepo = productRepo;
    }

    public ProductVariant save(ProductVariant variant) {

        Long productId = variant.getProduct().getId();
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        variant.setProduct(product);
        return repo.save(variant);
    }

    public List<ProductVariant> getAll() {

        return repo.findAll();
    }
}