package FactoryPattern;

public class SilverCard extends Card {
    protected int maintenanceCharge;


    public SilverCard(String holderName, String cvv, String issueDate){
        this.holderName = holderName;
        this.cvv = cvv;
        this.issueDate = issueDate;
        this.maintenanceCharge = 200;
        this.transactionCharge = 5;
        this.category = "Silver";
    }
}
