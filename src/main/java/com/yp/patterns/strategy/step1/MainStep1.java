package com.yp.patterns.strategy.step1;

import com.yp.patterns.strategy.step1.model.MasterCardCreditCard;
import com.yp.patterns.strategy.step1.model.VisaCreditCard;

public class MainStep1 {

    public static void main(String... args) {
        VisaCreditCard visaCreditCard = new VisaCreditCard("4485611988760765");
        System.out.println("VisaCreditCard BIN: " + visaCreditCard.getBin());
        System.out.println("VisaCreditCard process: " + visaCreditCard.process());

        System.out.println("");
        MasterCardCreditCard masterCardCreditCard = new MasterCardCreditCard("5468608290740657");
        System.out.println("MasterCardCreditCard BIN: " + masterCardCreditCard.getBin());
        System.out.println("MasterCardCreditCard process: " + masterCardCreditCard.process());
    }
}
