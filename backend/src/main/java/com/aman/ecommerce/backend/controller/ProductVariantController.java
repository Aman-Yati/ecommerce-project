package com.aman.ecommerce.backend.controller;

import com.aman.ecommerce.backend.model.ProductVariant;
import com.aman.ecommerce.backend.service.ProductVariantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/variants")
public class ProductVariantController {

    private final ProductVariantService service;

    public ProductVariantController(ProductVariantService service) {
        this.service = service;
    }

    @PostMapping
    public ProductVariant addVariant(@RequestBody ProductVariant variant) {
        return service.save(variant);
    }

    @GetMapping
    public List<ProductVariant> getAll() {
        return service.getAll();
    }
}