package com.yp.patterns.strategy.step4.model;

import com.yp.patterns.strategy.step4.behaviour.IProcessCreditCard;

public class MasterCardCreditCard extends CreditCard implements IProcessCreditCard {

    public MasterCardCreditCard(String number) {
        super(number);
    }

    @Override
    public String process() {
        return "The process for MasterCardCreditCard goes by Server 1";
    }
}
