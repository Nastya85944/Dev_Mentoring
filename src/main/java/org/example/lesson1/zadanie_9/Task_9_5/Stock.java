package org.example.lesson1.zadanie_9.Task_9_5;

import java.math.BigDecimal;
import java.util.Random;

public class Stock extends Securities {

    private static final double INCREASING_PRICE = 0.10;
    private Random random;

    public Stock(BigDecimal value, int id) {
        super(value, id);
        this.random = new Random();
    }

    @Override
    public void step() {
        double randomNumber = random.nextDouble();
        if (randomNumber < 0.5) {
            BigDecimal increaseAmount = super.getValue().multiply(BigDecimal.valueOf(INCREASING_PRICE));
            setValue(getValue().add(increaseAmount));
        } else {
            BigDecimal decreaseAmount = super.getValue().multiply(BigDecimal.valueOf(INCREASING_PRICE));
            setValue(getValue().subtract(decreaseAmount));
        }
    }
}
