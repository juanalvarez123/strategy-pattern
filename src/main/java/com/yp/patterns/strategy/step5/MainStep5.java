package com.yp.patterns.strategy.step5;

import com.yp.patterns.strategy.step5.model.MasterCardCreditCard;
import com.yp.patterns.strategy.step5.behaviour.ProcessServerOneCreditCardImpl;
import com.yp.patterns.strategy.step5.model.VisaCreditCard;

public class MainStep5 {

    public static void main(String... args) {
        MasterCardCreditCard masterCardCreditCard = new MasterCardCreditCard("5468608290740657");
        System.out.println("MasterCardCreditCard bin: " + masterCardCreditCard.getBin());
        System.out.println("MasterCardCreditCard process: " + masterCardCreditCard.process());

        System.out.println("");

        VisaCreditCard visaCreditCard = new VisaCreditCard("4485611988760765");
        System.out.println("VisaCreditCard bin: " + visaCreditCard.getBin());
        // Server 2
        System.out.println("VisaCreditCard process: " + visaCreditCard.process());

        // Server 1
        visaCreditCard.setProcessCreditCard(new ProcessServerOneCreditCardImpl());
        System.out.println("VisaCreditCard process is updated now !!!");
        System.out.println("VisaCreditCard process: " + visaCreditCard.process());
    }
}
