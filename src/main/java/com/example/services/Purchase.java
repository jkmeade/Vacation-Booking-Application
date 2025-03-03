package com.example.services;

import com.example.entities.Cart;
import com.example.entities.CartItem;
import com.example.entities.Customer;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    public Cart cart;
    public Set<CartItem> cartItems;
    public Customer customer;
}
