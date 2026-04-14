package com.aman.ecommerce.backend.service;

import com.aman.ecommerce.backend.model.*;
import com.aman.ecommerce.backend.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final CartRepository cartRepo;
    private final CartItemRepository itemRepo;
    private final ProductVariantRepository variantRepo;
    private final OrderRepository orderRepo;
    private final OrderItemRepository orderItemRepo;

    public OrderService(CartRepository cartRepo,
                        CartItemRepository itemRepo,
                        ProductVariantRepository variantRepo,
                        OrderRepository orderRepo,
                        OrderItemRepository orderItemRepo) {
        this.cartRepo = cartRepo;
        this.itemRepo = itemRepo;
        this.variantRepo = variantRepo;
        this.orderRepo = orderRepo;
        this.orderItemRepo = orderItemRepo;
    }

    public Order placeOrder(Long userId) {

        // 1. Get cart
        Cart cart = cartRepo.findByUserId(userId);
        if (cart == null) {
            throw new RuntimeException("Cart is empty");
        }

        List<CartItem> items = itemRepo.findByCartId(cart.getId());

        if (items.isEmpty()) {
            throw new RuntimeException("Cart is empty");
        }

        // 2. Create order
        Order order = new Order();
        order.setUserId(userId);
        order.setStatus("CREATED");

        double total = 0;

        order = orderRepo.save(order);

        // 3. Process each item
        for (CartItem cartItem : items) {

            ProductVariant variant = cartItem.getVariant();

            // 🔥 Check stock again
            if (variant.getStock() < cartItem.getQuantity()) {
                throw new RuntimeException("Stock issue for variant id: " + variant.getId());
            }

            // 🔥 Reduce stock
            variant.setStock(variant.getStock() - cartItem.getQuantity());
            variantRepo.save(variant);

            // 🔥 Create OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            orderItem.setVariant(variant);
            orderItem.setQuantity(cartItem.getQuantity());

            // IMPORTANT: snapshot price
            double price = variant.getProduct().getPrice();
            orderItem.setPrice(price);

            total += price * cartItem.getQuantity();

            orderItemRepo.save(orderItem);
        }

        // 4. Set total
        order.setTotalAmount(total);
        orderRepo.save(order);

        // 5. Clear cart
        itemRepo.deleteAll(items);

        return order;
    }
}