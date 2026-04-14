package com.aman.ecommerce.backend.controller;

import com.aman.ecommerce.backend.model.Category;
import com.aman.ecommerce.backend.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category) {
        return service.save(category);
    }

    @GetMapping
    public List<Category> getAll() {
        return service.getAll();
    }
}