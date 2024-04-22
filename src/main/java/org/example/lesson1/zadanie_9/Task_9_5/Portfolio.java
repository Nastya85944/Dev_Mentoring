package org.example.lesson1.zadanie_9.Task_9_5;

import java.math.BigDecimal;
import java.util.List;

public class Portfolio {

    private List<Securities> securities;

    public Portfolio(List<Securities> securities) {
        this.securities = securities;
    }

    public List<Securities> getSecurities() {
        return securities;
    }

    public void step() {
        for (Securities security : securities) {
            security.step();
        }
    }

    public BigDecimal getTotalValue() {
        BigDecimal totalValue = BigDecimal.ZERO;
        for (Securities security : securities) {
            totalValue = totalValue.add(security.getValue());
        }
        return totalValue;
    }
}
