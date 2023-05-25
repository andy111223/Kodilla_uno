package Food2Door;

public class Food2DoorMain {
    public static void main(String[] args) {
        Order order1 = new Order("Apple", 10, new ExtraFoodShop());
        order1.processOrder();

        Order order2 = new Order("Banana", 20, new HealthyShop());
        order2.processOrder();
    }
}
