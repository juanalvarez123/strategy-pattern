package com.yp.patterns.strategy.step3.model;

public class FalabellaCreditCard extends CreditCard {

    public FalabellaCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return null; // Do nothing
    }
}
