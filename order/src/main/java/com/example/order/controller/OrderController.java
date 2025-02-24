package com.example.order.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.order.model.Order;
import com.example.order.model.User;



@RestController
@RequestMapping("/orders")
public class OrderController {
    private static final String USER_SERVICE_URL = "http://localhost:8081/users/";

    @GetMapping("/")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World, Order (OrderController)");
    }
    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
// Fetch user details from User Service
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(USER_SERVICE_URL + order.getUserId(),
                User.class);
        if (user == null) {
            return ResponseEntity.status(404).body(null); // User not found
        }
// Set user data in the order
        order.setUser(user);
// Process the order (e.g., check inventory, process payment)
        order.setStatus("Order Created");
        return ResponseEntity.status(201).body(order);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
// Simulate fetching order from a database
        Order order = new Order(id, 123L, "Product A", 2, "Pending", null);
        return ResponseEntity.ok(order);
    }

}
