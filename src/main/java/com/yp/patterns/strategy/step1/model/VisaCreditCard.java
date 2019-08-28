package com.yp.patterns.strategy.step1.model;

public class VisaCreditCard extends CreditCard {

    public VisaCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return "The process for VisaCreditCard goes by Server 2";
    }
}
