package org.example.calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Test addition")
    void testAddition() {
        int result = calculator.addSum(5, 3);
        assertEquals(8, result, "Addition result is incorrect");
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtraction() {
        int result = calculator.subtract(7, 2);
        assertEquals(5, result, "Subtraction result is incorrect");
    }
}