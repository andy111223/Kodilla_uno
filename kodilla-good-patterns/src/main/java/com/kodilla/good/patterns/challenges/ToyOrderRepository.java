package com.kodilla.good.patterns.challenges;

public class ToyOrderRepository implements ProductRepository {


    @Override
    public void createOrder(User user, ProductRepository product, ProductRepository quantity) {
        System.out.println("A transaction for Mr./Mrs. " + user.getSurname() + " has been successful. Thank you for your business!");
    }
}
