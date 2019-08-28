package com.yp.patterns.strategy.step3.model;

public class AmexCreditCard extends CreditCard {

    public AmexCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return "The process for AmexCreditCard goes by Server 1";
    }
}
