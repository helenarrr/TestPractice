package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SampleTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each test");
    }

    @Test
    @DisplayName("Test addition")
    void testAddition() {
        int number = 3;
        int result = number + 3;
        assertEquals(6, result, "Addition result is incorrect");
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtraction() {
        int number = 3;
        int result = number - 2;
        assertEquals(1, result, "Subtraction result is incorrect");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests");
    }

    @Test
    @Disabled("This test is disabled for demonstration purpose")
    @DisplayName("Disabled test")
    void disableTest() {
        fail("This test should not be executed");
    }


}

