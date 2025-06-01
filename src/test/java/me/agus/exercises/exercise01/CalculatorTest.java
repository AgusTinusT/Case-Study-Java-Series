package me.agus.exercises.exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddPositiveNumbers() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testAddWithNegativeNumber() {
        assertEquals(-4, calculator.add(-7, 3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(5, calculator.add(5, 0));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void testAddTwoNegativeNumbers() {
        assertEquals(-10, calculator.add(-3, -7));
    }

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testSubtractWithNegativeNumber() {
        assertEquals(-10, calculator.subtract(-7, 3));
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(5, calculator.subtract(5, 0));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    void testSubtractTwoNegativeNumbers() {
        assertEquals(4, calculator.subtract(-3, -7));
    }

}