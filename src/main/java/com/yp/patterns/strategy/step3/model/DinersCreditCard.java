package com.yp.patterns.strategy.step3.model;

public class DinersCreditCard extends CreditCard {

    public DinersCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return null; // Do nothing
    }
}
