package ru.zelmex.katin;

import java.util.Scanner;
import java.util.Random;

import static ru.zelmex.katin.mainCode.*;

public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        outputArr(a, "a");

        //=================
        // задание 1
        //=================
        System.out.println("Вывод произведение элементов массива a, которые меньше числа C, и колич таких элементов");
        System.out.println("Произведение элементов: " + proizvElem + "\n");
        System.out.println("Количество: " + processElementsLessThanC(a, c) + "\n");

        //=================
        // задание 2
        //=================
        createArrayB();

        //=================
        // задание 3
        //=================
        System.out.printf("сумма элементов массива b = %.3f\n", sumArrayB());
    }


}