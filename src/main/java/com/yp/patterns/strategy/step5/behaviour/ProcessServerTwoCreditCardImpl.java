package com.yp.patterns.strategy.step5.behaviour;

public class ProcessServerTwoCreditCardImpl implements IProcessCreditCard {

    @Override
    public String process() {
        return "The process for the credit card goes by Server 2";
    }
}
