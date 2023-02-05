package DecoratorPattern.IcecreamParlour;

public class VanillaScoop implements Icecream {
    private Icecream icecream;

    public  VanillaScoop(Icecream icecream){
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", VanillaScoop";
    }
}
