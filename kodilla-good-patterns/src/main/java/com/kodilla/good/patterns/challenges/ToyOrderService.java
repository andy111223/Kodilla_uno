package com.kodilla.good.patterns.challenges;

public class ToyOrderService implements OrderService{
    @Override
    public boolean order(final User user, final ProductRepository product, final ProductRepository quantity) {
        System.out.println("Ordering a toy for: " + user.getFirstName() + " " + user.getSurname());
        return true;
    }
}
