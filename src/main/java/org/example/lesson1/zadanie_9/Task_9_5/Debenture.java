package org.example.lesson1.zadanie_9.Task_9_5;

import java.math.BigDecimal;

public class Debenture extends Securities {

    private BigDecimal interestRate;

    public Debenture(BigDecimal value, int id, BigDecimal interestRate) {
        super(value, id);
        this.interestRate = interestRate;
    }

    @Override
    public void step() {
        BigDecimal interest = super.getValue().multiply(interestRate);
        setValue(getValue().add(interest));
    }
}
