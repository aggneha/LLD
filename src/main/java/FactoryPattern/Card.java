package FactoryPattern;

public abstract class Card {

    protected String category;
    protected String holderName;
    protected String cvv;
    protected String issueDate;
    protected int transactionCharge;


    public boolean makeTransaction(String fromAccountNo, String toAccountNo, int amount){
        System.out.println("Transaction successful with transactionCharge " + this.transactionCharge);
        return true;
    }
}
