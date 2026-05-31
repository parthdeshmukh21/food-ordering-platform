package com.foodordering.notification.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    public String sendNotification() {
        return "Notification Sent";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
