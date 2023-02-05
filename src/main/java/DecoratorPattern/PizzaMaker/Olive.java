package DecoratorPattern.PizzaMaker;

public class Olive implements Pizza {

    Pizza pizza;
    public Olive(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost()+20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Olive";
    }
}
