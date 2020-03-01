package com.yp.patterns.strategy.step5.model;

import com.yp.patterns.strategy.step5.behaviour.IProcessCreditCard;
import com.yp.patterns.strategy.step5.behaviour.ProcessServerOneCreditCardImpl;
import lombok.Setter;

public class MasterCardCreditCard extends CreditCard {

    @Setter
    private IProcessCreditCard processCreditCard;

    public MasterCardCreditCard(String number) {
        super(number);
        processCreditCard = new ProcessServerOneCreditCardImpl();
    }

    public String process() {
        return processCreditCard.process();
    }
}
