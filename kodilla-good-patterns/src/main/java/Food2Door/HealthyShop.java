package Food2Door;

public class HealthyShop implements Producer{
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order for HealthyShop");
        return true;
    }
}
