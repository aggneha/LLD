package DecoratorPattern.IcecreamParlour;

public class ChocholateSyrup implements Icecream {
    private Icecream icecream;

    public ChocholateSyrup(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", ChocholateSyrup";
    }
}
