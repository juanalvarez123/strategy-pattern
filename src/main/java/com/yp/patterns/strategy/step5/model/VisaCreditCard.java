package com.yp.patterns.strategy.step5.model;

import com.yp.patterns.strategy.step5.behaviour.IProcessCreditCard;
import com.yp.patterns.strategy.step5.behaviour.ProcessServerTwoCreditCardImpl;
import lombok.Setter;

public class VisaCreditCard extends CreditCard {

    @Setter
    private IProcessCreditCard processCreditCard;

    public VisaCreditCard(String number) {
        super(number);
        processCreditCard = new ProcessServerTwoCreditCardImpl();
    }

    public String process() {
        return processCreditCard.process();
    }
}
