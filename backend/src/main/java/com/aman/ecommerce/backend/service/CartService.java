package com.aman.ecommerce.backend.service;

import com.aman.ecommerce.backend.model.Cart;
import com.aman.ecommerce.backend.model.CartItem;
import com.aman.ecommerce.backend.model.ProductVariant;
import com.aman.ecommerce.backend.repository.CartItemRepository;
import com.aman.ecommerce.backend.repository.CartRepository;
import com.aman.ecommerce.backend.repository.ProductVariantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepo;
    private final CartItemRepository itemRepo;
    private final ProductVariantRepository variantRepo;

    public CartService(CartRepository cartRepo,
                       CartItemRepository itemRepo,
                       ProductVariantRepository variantRepo) {
        this.cartRepo = cartRepo;
        this.itemRepo = itemRepo;
        this.variantRepo = variantRepo;
    }

    public CartItem addToCart(Long userId, Long variantId, int quantity) {

        Cart cart = cartRepo.findByUserId(userId);
        if (cart == null) {
            cart = new Cart();
            cart.setUserId(userId);
            cart = cartRepo.save(cart);
        }

        ProductVariant variant = variantRepo.findById(variantId)
                .orElseThrow(() -> new RuntimeException("Variant not found"));
        if (variant.getStock() < quantity) {
            throw new RuntimeException("Not enough stock");
        }
        CartItem existing = itemRepo.findByCartIdAndVariantId(cart.getId(), variantId);

        if (existing != null) {
            existing.setQuantity(existing.getQuantity() + quantity);
            return itemRepo.save(existing);
        }

        CartItem item = new CartItem();
        item.setCart(cart);
        item.setVariant(variant);
        item.setQuantity(quantity);
        return itemRepo.save(item);
    }

    public List<CartItem> getCart(Long userId) {
        Cart cart = cartRepo.findByUserId(userId);
        return itemRepo.findByCartId(cart.getId());
    }
}
