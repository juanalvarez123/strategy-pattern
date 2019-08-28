package com.yp.patterns.strategy.step4;

import com.yp.patterns.strategy.step4.model.AmexCreditCard;
import com.yp.patterns.strategy.step4.model.DinersCreditCard;
import com.yp.patterns.strategy.step4.model.FalabelaCreditCard;
import com.yp.patterns.strategy.step4.model.MasterCardCreditCard;
import com.yp.patterns.strategy.step4.model.RappiCreditCard;
import com.yp.patterns.strategy.step4.model.VisaCreditCard;

public class MainStep4 {

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
        System.out.println("DinersCreditCard has no process");

        System.out.println("");
        AmexCreditCard amexCreditCard = new AmexCreditCard("344305786002236");
        System.out.println("AmexCreditCard bin: " + amexCreditCard.getBin());
        System.out.println("AmexCreditCard process: " + amexCreditCard.process());

        System.out.println("");
        FalabelaCreditCard falabelaCreditCard = new FalabelaCreditCard("344305786002236");
        System.out.println("FalabelaCreditCard bin: " + falabelaCreditCard.getBin());
        System.out.println("FalabelaCreditCard has no process");

        System.out.println("");
        RappiCreditCard rappiCreditCard = new RappiCreditCard("6011437197180449");
        System.out.println("RappiCreditCard bin: " + rappiCreditCard.getBin());
        System.out.println("RappiCreditCard process: " + rappiCreditCard.process());
    }
}
