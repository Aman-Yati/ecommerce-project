package com.aman.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CartItem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private int quantity;

        @ManyToOne
        @JoinColumn(name = "cart_id")
        private Cart cart;

        @ManyToOne
        @JoinColumn(name = "variant_id")
        private ProductVariant variant;
}
