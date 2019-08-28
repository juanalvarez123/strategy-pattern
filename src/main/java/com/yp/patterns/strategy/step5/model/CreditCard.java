package com.yp.patterns.strategy.step5.model;

import lombok.Getter;

public abstract class CreditCard {

    @Getter
    private String number;

    public CreditCard(String number) {
        this.number = number;
    }

    /**
     * Default bin numbr is the first 6 numbers
     */
    public String getBin() {
        return number.substring(0, 6);
    }
}
