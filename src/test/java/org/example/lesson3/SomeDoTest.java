package org.example.lesson3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SomeDoTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 6, 70, 900, 6, 7 })
    void evenOddNumber(int num) {
        SomeDo doing = new SomeDo();
        assertTrue(doing.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 5, 26, 250 })
    void numberInInterval(int num) {
        SomeDo doing = new SomeDo();
        assertTrue(doing.numberInInterval(num));
    }
}
