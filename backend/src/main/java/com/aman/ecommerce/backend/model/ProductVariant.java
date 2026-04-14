package com.aman.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductVariant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String size;
    private String color;
    private int stock;
    private String imageUrl;

    @ManyToOne
    private Product product;
}