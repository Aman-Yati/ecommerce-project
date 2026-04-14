package com.aman.ecommerce.backend.repository;

import com.aman.ecommerce.backend.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    CartItem findByCartIdAndVariantId(Long cartId, Long variantId);
    List<CartItem> findByCartId(Long cartId);
}
