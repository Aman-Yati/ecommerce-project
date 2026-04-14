package com.aman.ecommerce.backend.controller;

import com.aman.ecommerce.backend.model.CartItem;
import com.aman.ecommerce.backend.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping
    public CartItem addToCart(@RequestParam Long userId,
                              @RequestParam Long variantId,
                              @RequestParam int quantity) {

        return service.addToCart(userId, variantId, quantity);
    }

    @GetMapping
    public List<CartItem> getCart(@RequestParam Long userId) {
        return service.getCart(userId);
    }
}
