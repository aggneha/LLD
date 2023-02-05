package DecoratorPattern.PizzaMaker;

public class BBQChicken implements Pizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "BBQChicken";
    }
}
