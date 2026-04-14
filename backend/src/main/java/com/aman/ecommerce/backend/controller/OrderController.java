package com.aman.ecommerce.backend.controller;

import com.aman.ecommerce.backend.model.Order;
import com.aman.ecommerce.backend.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order placeOrder(@RequestParam Long userId) {
        return service.placeOrder(userId);
    }
}