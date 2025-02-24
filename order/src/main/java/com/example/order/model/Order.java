package com.example.order.model;

public class Order {
    private Long id;
    private Long userId;
    private String product;
    private int quantity;
    private String status;
    private User user;
    // Constructor
    public Order(Long id, Long userId, String product, int quantity, String status,
                 User user) {
        this.id = id;
        this.userId = userId;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
        this.user = user;
    }
    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}