package com.yp.patterns.strategy.step4.model;

import com.yp.patterns.strategy.step4.behaviour.IProcessCreditCard;

public class VisaCreditCard extends CreditCard implements IProcessCreditCard {

    public VisaCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return "The process for VisaCreditCard goes by Server 2";
    }
}
