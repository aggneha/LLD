package FactoryPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SilverCardFactory implements CardFactory {
    @Override
    public Card createCard(String holderName) {
        int cvv = getRandomCvv();
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        return new SilverCard(holderName, String.valueOf(cvv) , date);
    }


    private int getRandomCvv(){
        return 123;
    }
}
