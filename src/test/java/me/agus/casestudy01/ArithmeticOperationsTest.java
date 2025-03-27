package me.agus.casestudy01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {
    ArithmeticOperations operations = new ArithmeticOperations();

    @Test
    void testAdd(){
        assertEquals(5, operations.add(2,3));
        assertEquals(-1, operations.add(2,-3));
        assertEquals(0, operations.add(0,0));
    }

    @Test
    void testSubtract() {
        assertEquals(-1, operations.subtract(2, 3));
        assertEquals(5, operations.subtract(2, -3));
        assertEquals(0, operations.subtract(0, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(6, operations.multiply(2, 3));
        assertEquals(-6, operations.multiply(2, -3));
        assertEquals(0, operations.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, operations.divide(6, 3));
        assertEquals(-2, operations.divide(6, -3));
        assertEquals(0, operations.divide(0, 5));
    }

}
