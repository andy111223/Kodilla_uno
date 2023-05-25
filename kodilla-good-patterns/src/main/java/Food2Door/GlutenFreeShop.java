package Food2Door;

public class GlutenFreeShop implements Producer{
    @Override
    public boolean process(Order order) {

        System.out.println("Processing order for GlutenFreeShop");
        return true;
    }
}
