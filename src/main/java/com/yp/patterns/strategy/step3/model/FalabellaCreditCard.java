package com.yp.patterns.strategy.step3.model;

public class FalabelaCreditCard extends CreditCard {

    public FalabelaCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return null; // Do nothing
    }
}
