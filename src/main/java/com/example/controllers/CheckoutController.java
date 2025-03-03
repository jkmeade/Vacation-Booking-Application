package com.example.controllers;

import com.example.services.Purchase;
import org.springframework.web.bind.annotation.*;
import com.example.services.CheckoutService;
import com.example.services.PurchaseResponse;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;
    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }
    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = this.checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }

}

