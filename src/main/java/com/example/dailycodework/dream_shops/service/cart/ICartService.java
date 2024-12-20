package com.example.dailycodework.dream_shops.service.cart;

import com.example.dailycodework.dream_shops.exceptions.ResourceNotFoundException;
import com.example.dailycodework.dream_shops.model.Cart;
import com.example.dailycodework.dream_shops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCartById(Long cartId) throws ResourceNotFoundException;
    Cart getCartByUserId(Long userId) throws ResourceNotFoundException;
    void clearAndDeleteCart(Long cartId) throws ResourceNotFoundException;
    BigDecimal getTotalPrice(Long cartId) throws ResourceNotFoundException;
    Cart initializeNewCart(User user) throws ResourceNotFoundException;
}
