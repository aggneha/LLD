package DecoratorPattern.IcecreamParlour;

public class IcecreamParlour {
    public static void main(String[] args) {
        Icecream icecream = new VanillaScoop(new ChoclateCone((new ChocholateSyrup(new VanilaCone()))));
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}
