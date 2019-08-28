package com.yp.patterns.strategy.step2.model;

import lombok.Getter;

public abstract class CreditCard {

    @Getter
    private String number;

    public CreditCard(String number) {
        this.number = number;
    }

    public String getBin() {
        return number.substring(0, 6);
    }

    public abstract String process();
}
