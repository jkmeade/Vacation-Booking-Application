package com.example.services;


import com.example.dao.CartItemRepository;
import com.example.dao.CartRepository;
import com.example.dao.CustomerRepository;
import com.example.entities.*;
import com.example.entities.StatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    @Transactional
   public PurchaseResponse placeOrder(Purchase purchase ) {

    Cart cart = purchase.cart;

    String orderTrackingNmbr = generateOrderTrackingNumber();
     Set<CartItem> cartItems = purchase.getCartItems();
     cartItems.forEach(item -> cart.add(item));

    cart.setOrderTrackingNumber(orderTrackingNmbr);
    cart.setStatus(StatusType.ordered);
    cartRepository.save(cart);



    return new PurchaseResponse(orderTrackingNmbr);


   }
   private String generateOrderTrackingNumber(){
       return UUID.randomUUID().toString();
   }


}
