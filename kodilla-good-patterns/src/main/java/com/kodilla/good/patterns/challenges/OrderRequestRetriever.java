package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jonh", "Canmalantsky");

        ProductRepository toy = new ToyOrderRepository();
        ProductRepository quantity = new ToyOrderRepository();

        return new OrderRequest(user, toy, quantity);
    }
}
