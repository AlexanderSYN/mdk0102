package com.zelmex.katin;

import java.util.Random;
import java.util.Scanner;

public class mainCode {
    public static double[] createArrayX() {
        return new double[]{1.2, 1.3, 5.4, 7.4, 3.6, 6.6, 2.1, 7.6, 6.5, 7.5,
                5.8, 6.7, 3.6, 7.6, 4.7};
    }

    public static double[] createArrayY() {
       return new double[]{2.1, 7.6, 6.5, 7.5,
               5.8, 6.7, 3.6, 7.6, 4.7, 1.2, 1.3, 5.4, 7.4, 3.6, 6.6};
    }

    public static double[] createArrayA() {
        return new double[]{1.2, 1.3, 5.4, 7.4, 5.8, 6.7, 3.6, 7.6, 4.7,
                3.6, 6.6, 2.1, 7.6, 6.5, 7.5};
    }

    public static double[] createArrayB() {
        return new double[]{1.2, 6.7, 5.4, 7.4, 3.6, 6.6, 8.9, 7.6, 6.5, 7.5,
                5.8, 6.7, 3.6, 4.3, 4.7};
    }

    public static double getF() {
        double F = (sumPowers(createArrayX(), createArrayY(), 7) - fact(7 + 3)) /
                (sumPowers(createArrayA(), createArrayB(), 7) - fact(7));

        return F;
    }

    public static double sumPowers(double[] firstArr, double[] secondArr, int powers) {
        double sum = 0;

        for (int i = 0; i < firstArr.length; i++)
            sum += pow(firstArr[i] - secondArr[i], powers);

        return sum;
    }

    public static double pow(double num, int power) {
        double answer = 1;

        long absM = Math.abs((long) power);

        while (absM >= 1) {
            answer *= num;
            absM--;
        }

        return power < 0 ? 1 / answer : answer;
    }

    public static long fact(int n) {
        long res = 1;

        for (int i = 2; i <= n; i++)
            res *= i;

        return res;
    }


    public static void main(String[] args) {
        System.out.printf("%.3f", sumPowers(createArrayX(), createArrayY(), 7));
    }
}