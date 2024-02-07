package org.example.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DzCalculatorTest {

    @Test
    void calculateDiscount() {
        DzCalculator calculator = new DzCalculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.calculateDiscount(4, 5000000);
        });
    }
}