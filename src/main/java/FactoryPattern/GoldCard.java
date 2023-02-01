package FactoryPattern;

public class GoldCard extends Card {
    protected int maintenanceCharge;

    public GoldCard(String holderName, String cvv, String issueDate){
        this.holderName = holderName;
        this.cvv = cvv;
        this.issueDate = issueDate;
        this.maintenanceCharge = 500;
        this.transactionCharge = 10;
        this.category = "Gold";
    }

}
