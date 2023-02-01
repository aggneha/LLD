package FactoryPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GoldCardFactory implements CardFactory {
    @Override
    public Card createCard(String holderName) {
        int cvv = getCvv();
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        return new GoldCard(holderName, String.valueOf(cvv) , date);
    }

    private int getCvv(){
        return 987;
    }
}
