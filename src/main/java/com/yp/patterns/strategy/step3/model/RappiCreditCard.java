package com.yp.patterns.strategy.step3.model;

public class RappiCreditCard extends CreditCard {

    public RappiCreditCard(String number) {
        super(number);
    }

    /**
     * RappiCreditCard BIN number is the 4 first numbers
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
