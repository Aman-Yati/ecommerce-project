package com.aman.ecommerce.backend.repository;

import com.aman.ecommerce.backend.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}