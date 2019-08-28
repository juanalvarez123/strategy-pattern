package com.yp.patterns.strategy.step1.model;

public class MasterCardCreditCard extends CreditCard {

    public MasterCardCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return "The process for MasterCardCreditCard goes by Server 1";
    }
}
