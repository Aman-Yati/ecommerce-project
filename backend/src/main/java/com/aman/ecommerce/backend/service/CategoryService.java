package com.aman.ecommerce.backend.service;

import com.aman.ecommerce.backend.model.Category;
import com.aman.ecommerce.backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repo;

    //Constructor injection
    public CategoryService(CategoryRepository repo) {
        this.repo = repo;
    }

    public Category save(Category category) {
        return repo.save(category);
    }

    public List<Category> getAll() {
        return repo.findAll();
    }
}