package com.kodilla.good.patterns.challenges;

public interface ProductRepository {
    void createOrder(User user, ProductRepository product, ProductRepository quantity);
}
