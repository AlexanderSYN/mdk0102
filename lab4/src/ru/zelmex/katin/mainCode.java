package ru.zelmex.katin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mainCode {
   public static int[] a = {1, 5, 3, 7, 2, 8, 3, 9, 2, 10, 4, 2, 7, 3, 5};
   public static double[] b = {7.0, 4.0, 2.0, 8.0, 4.0, 2.0, 9.0, 6.0, 3.0,
            1.0, 4.0, 6.0, 8.0, 3.0, 2.0};
   public static int c = 12;
   public static int proizvElem = 1;

    public static void outputArr(int[] arr, String nameArr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(nameArr + "[" + (i + 1) + "] = " + arr[i]);

    }

    public static int processElementsLessThanC(int[] a, int c) {
        int count = 0;

        for (int value : a) {
            if (value < c) {
                proizvElem *= value;
                count++;
            }
        }

        return count;
    }

    public static double[] createArrayB() {
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i] / 15.0 + 2;
            System.out.printf("b[%d] = %.3f\n", (i+1), b[i]);
        }

        return b;
    }
    public static double[] forTestCreateArrayB() {
        for (int i = 0; i < b.length; i++)
            b[i] = a[i] / 15.0 + 2;

        return b;
    }

    public static double sumArrayB() {
        double sum = 0;

        for (int i = 1; i < b.length; i+=2)
            sum += b[i];

        return sum;
    }
}
