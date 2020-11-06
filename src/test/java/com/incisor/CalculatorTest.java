package com.incisor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        final int result01 = Calculator.add(4, 2);
        final int result02 = Calculator.add(5, 2);
        final int result03 = Calculator.add(6, 2);
        assertAll("计算结果校验",
                () -> assertEquals(6, result01),
                () -> assertEquals(6, result02),
                () -> assertEquals(7, result03)
                );
    }

    @Test
    void count() throws InterruptedException {
        // Calculator的result是static的，仅一份，所以在累加前先拿到旧值
        int old_result = Calculator.getResult();
        int count_result = Calculator.count(1,2,3,4);
        assertEquals(10, count_result - old_result);
    }

    @Test
    void subtract() {
        int result = Calculator.subtract(4, 2);
        assertEquals(2, result);
    }

    @Test
    void multiply() {
        int result = Calculator.multiply(4, 2);
        assertEquals(8, result);
    }

    @Test
    void divide() {
        int result = Calculator.divide(4, 2);
        assertEquals(2, result);
    }
}