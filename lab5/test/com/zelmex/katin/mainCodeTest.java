package com.zelmex.katin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.zelmex.katin.mainCode.*;

class mainCodeTest {

    private double[] testArrayX = {1.2, 1.3, 5.4, 7.4, 3.6, 6.6, 2.1, 7.6, 6.5, 7.5,
            5.8, 6.7, 3.6, 7.6, 4.7};
    private double[] testArrayY = {2.1, 7.6, 6.5, 7.5,
            5.8, 6.7, 3.6, 7.6, 4.7, 1.2, 1.3, 5.4, 7.4, 3.6, 6.6};
    private double[] testArrayA = {1.2, 1.3, 5.4, 7.4, 5.8, 6.7, 3.6, 7.6, 4.7,
            3.6, 6.6, 2.1, 7.6, 6.5, 7.5};
    private double[] testArrayB = {1.2, 6.7, 5.4, 7.4, 3.6, 6.6, 8.9, 7.6, 6.5, 7.5,
            5.8, 6.7, 3.6, 4.3, 4.7};

    @Test
    @DisplayName("Тест: проверка массива X")
    void createArrayX() {
        double[] expected = testArrayX;
        double[] actual = mainCode.createArrayX();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест: проверка массива Y")
    void createArrayY() {
        double[] expected = testArrayY;
        double[] actual = mainCode.createArrayY();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест: проверка массива A")
    void createArrayA() {
        double[] expected = testArrayA;
        double[] actual = mainCode.createArrayA();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест: проверка массива B")
    void createArrayB() {
        double[] expected = testArrayB;
        double[] actual = mainCode.createArrayB();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест: проверка на получение значение F")
    void getF() {
        double expected = 12.136;
        double actual = mainCode.getF();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    @DisplayName("проверка суммы массива")
    void sumPowers() {
        double expected = 42018.548;
        double actual = mainCode.sumPowers(testArrayX, testArrayY, 7);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    @DisplayName("Тест: проверка функции степени 2^3 -> 8")
    void testPow() {
        double expected = 8;
        double actual = mainCode.pow(2, 3);

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Тест: проверка функции факториала 5->120")
    void fact() {
        int expected = 120;
        long actual = mainCode.fact(5);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест: проверка функции степени 2^3 != 5")
    void testPowNeg() {
        double expected = 5;
        double actual = mainCode.pow(2, 3);

        assertNotEquals(expected, actual);
    }
    @Test
    @DisplayName("Тест: проверка функции факториала 3 != 120")
    void factNeg() {
        int expected = 120;
        long actual = mainCode.fact(3);

        assertNotEquals(expected, actual);
    }
}