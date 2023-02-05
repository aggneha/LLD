package DecoratorPattern.IcecreamParlour;

public class VanilaCone implements Icecream {
    private  Icecream icecream;

    public VanilaCone(){

    }

    public VanilaCone(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream==null)
            return 10;
        else return  icecream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        if(icecream==null)
        return "VanilaCone";
        else return icecream.getDescription() + ", VanilaCone";
    }
}
