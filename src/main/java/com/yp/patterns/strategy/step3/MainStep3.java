package com.yp.patterns.strategy.step3;

import com.yp.patterns.strategy.step3.model.AmexCreditCard;
import com.yp.patterns.strategy.step3.model.DinersCreditCard;
import com.yp.patterns.strategy.step3.model.FalabelaCreditCard;
import com.yp.patterns.strategy.step3.model.MasterCardCreditCard;
import com.yp.patterns.strategy.step3.model.RappiCreditCard;
import com.yp.patterns.strategy.step3.model.VisaCreditCard;
import org.apache.commons.lang3.StringUtils;

public class MainStep3 {

    public static void main(String... args) {
        VisaCreditCard visaCreditCard = new VisaCreditCard("4485611988760765");
        System.out.println("VisaCreditCard bin: " + visaCreditCard.getBin());
        System.out.println("VisaCreditCard process: " + visaCreditCard.process());

        System.out.println("");
        MasterCardCreditCard masterCardCreditCard = new MasterCardCreditCard("5468608290740657");
        System.out.println("MasterCardCreditCard bin: " + masterCardCreditCard.getBin());
        System.out.println("MasterCardCreditCard process: " + masterCardCreditCard.process());

        System.out.println("");
        DinersCreditCard dinersCreditCard = new DinersCreditCard("30130162174618");
        System.out.println("DinersCreditCard bin: " + dinersCreditCard.getBin());
        System.out.println("Is DinersCreditCard process active?: " + StringUtils.isNoneBlank(dinersCreditCard.process()));

        System.out.println("");
        AmexCreditCard amexCreditCard = new AmexCreditCard("344305786002236");
        System.out.println("AmexCreditCard bin: " + amexCreditCard.getBin());
        System.out.println("AmexCreditCard process: " + amexCreditCard.process());

        System.out.println("");
        FalabelaCreditCard falabelaCreditCard = new FalabelaCreditCard("344305786002236");
        System.out.println("FalabelaCreditCard bin: " + falabelaCreditCard.getBin());
        System.out.println("Is FalabelaCreditCard process active?: " + StringUtils.isNoneBlank(falabelaCreditCard.process()));

        System.out.println("");
        RappiCreditCard rappiCreditCard = new RappiCreditCard("6011437197180449");
        System.out.println("RappiCreditCard bin: " + rappiCreditCard.getBin());
        System.out.println("RappiCreditCard process: " + rappiCreditCard.process());
    }
}
