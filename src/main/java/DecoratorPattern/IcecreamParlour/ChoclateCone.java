package DecoratorPattern.IcecreamParlour;

public class ChoclateCone implements Icecream {
    private Icecream icecream;

    public ChoclateCone(){

    }

    public ChoclateCone(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream==null)
        return 15;
        else return 15+icecream.getCost();
    }

    @Override
    public String getDescription() {
        if(icecream==null)
        return "ChocolateCone";
        else return icecream.getDescription() + ", ChocolateCone";
    }
}
