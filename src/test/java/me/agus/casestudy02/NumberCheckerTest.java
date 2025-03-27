package me.agus.casestudy02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberCheckerTest {
    NumberChecker checker =  new NumberChecker();

    @Test
    void testIsEven(){
        assertTrue(checker.isEven(2));
        assertFalse(checker.isEven(3));
        assertTrue(checker.isEven(0));
        assertFalse(checker.isEven(-1));
        assertTrue(checker.isEven(-2));
    }

    @Test
    void testSumRange() {
        assertEquals(15, checker.sumRange(1, 5)); // 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(0, checker.sumRange(0, 0));
        assertEquals(5, checker.sumRange(2, 3)); // 2 + 3 = 5
        assertEquals(-5, checker.sumRange(-3, -2)); // -3 + -2 = -5
    }
}
