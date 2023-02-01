package FactoryPattern;

public class Client {
    public static void main(String[] args) {
        Card myCard = CardFactoryFactory.getCardFactory(900).createCard("Neha");
        myCard.makeTransaction("", "", 4000);
    }
}
