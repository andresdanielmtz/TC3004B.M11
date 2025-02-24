package com.example.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    @GetMapping("/")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World, Order");
    }
    
}
