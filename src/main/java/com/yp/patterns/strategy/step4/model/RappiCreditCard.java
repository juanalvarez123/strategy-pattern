package com.yp.patterns.strategy.step4.model;

import com.yp.patterns.strategy.step4.behaviour.IProcessCreditCard;

public class RappiCreditCard extends CreditCard implements IProcessCreditCard {

    public RappiCreditCard(String number) {
        super(number);
    }

    /**
     * RappiCreditCard bin number is the 4 first numbers
     */
    @Override
    public String getBin() {
        return getNumber().substring(0, 4);
    }

    @Override
    public String process() {
        return "The process for RappiCreditCard goes by Server 1";
    }
}
