package com.yp.patterns.strategy.step2;

import com.yp.patterns.strategy.step2.model.DinersCreditCard;
import com.yp.patterns.strategy.step2.model.MasterCardCreditCard;
import com.yp.patterns.strategy.step2.model.VisaCreditCard;
import org.apache.commons.lang3.StringUtils;

public class MainStep2 {

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
    }
}
