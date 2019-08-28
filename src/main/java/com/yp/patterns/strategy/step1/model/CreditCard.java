package com.yp.patterns.strategy.step1.model;

import lombok.Getter;

public abstract class CreditCard {

    @Getter
    private String number;

    public CreditCard(String number) {
        this.number = number;
    }

    /**
     * Gets the last 6 numbers.
     */
    public String getBin() {
        return number.substring(0, 6);
    }

    public abstract String process();
}
