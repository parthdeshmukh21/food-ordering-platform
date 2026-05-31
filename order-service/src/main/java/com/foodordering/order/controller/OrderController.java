package com.foodordering.order.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @PostMapping("/orders")
    public String createOrder() {
        return "Order Created";
    }

    @GetMapping("/orders/{id}")
    public String getOrder(@PathVariable String id) {
        return "Order Details : " + id;
    }

    @PutMapping("/orders/{id}/status")
    public String updateOrderStatus(@PathVariable String id) {
        return "Order " + id + " Updated";
    }
}
