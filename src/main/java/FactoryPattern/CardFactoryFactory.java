package FactoryPattern;

public class CardFactoryFactory {
    public static CardFactory getCardFactory(int creditScore){
        if(creditScore > 1000) return new GoldCardFactory();
        else return new SilverCardFactory();
    }
}
