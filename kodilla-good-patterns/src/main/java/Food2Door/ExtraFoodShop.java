package Food2Door;

public class ExtraFoodShop implements Producer{
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order for ExtraFoodShop");
        return true;
    }
}
