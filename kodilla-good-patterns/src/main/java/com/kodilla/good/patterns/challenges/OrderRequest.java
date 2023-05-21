package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private ProductRepository product;
    private ProductRepository quantity;

    public OrderRequest(User user, ProductRepository product, ProductRepository quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public ProductRepository getProduct() {
        return product;
    }

    public ProductRepository getQuantity() {
        return quantity;
    }
}
