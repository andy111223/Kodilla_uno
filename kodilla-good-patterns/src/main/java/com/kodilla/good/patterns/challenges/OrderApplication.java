package com.kodilla.good.patterns.challenges;

public class OrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ToyOrderService(), new ToyOrderRepository());
        productOrderService.process(orderRequest);
    }
}
