package Food2Door;

public class Order {
    private String product;
    private int quantity;
    private Producer producer;

    public Order(String product, int quantity, Producer producer) {
        this.product = product;
        this.quantity = quantity;
        this.producer = producer;
    }

    public boolean processOrder() {
        return this.producer.process(this);
    }
}
