package org.example.lesson1.zadanie_9.Task_9_5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Securities> securities = new ArrayList<>();
        securities.add(new Debenture(BigDecimal.valueOf(200),2, BigDecimal.valueOf(0.6)));
        securities.add(new Stock(BigDecimal.valueOf(150), 3));

        Portfolio portfolio = new Portfolio(securities);
        System.out.println("Total value after initialization: " + portfolio.getTotalValue());
        portfolio.step();
        System.out.println("Total value after firs step: " + portfolio.getTotalValue());
    }
}
