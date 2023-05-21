package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private ProductRepository productRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, ProductRepository productRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.productRepository = productRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            productRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
