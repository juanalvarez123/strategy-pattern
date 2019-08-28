package com.yp.patterns.strategy.step4.model;

import com.yp.patterns.strategy.step4.behaviour.IProcessCreditCard;

public class AmexCreditCard extends CreditCard implements IProcessCreditCard {

    public AmexCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return "The process for AmexCreditCard goes by Server 1";
    }
}
