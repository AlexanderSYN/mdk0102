package ru.zelmex.katin;

public class mainCode {
   public static int[] a = {1, 5, 3, 7, 2, 8, 3, 9, 2, 10, 4, 2, 7, 3, 5};
   public static double[] b = {7.0, 4.0, 2.0, 8.0, 4.0, 2.0, 9.0, 6.0, 3.0,
            1.0, 4.0, 6.0, 8.0, 3.0, 2.0};
   public static int c = 12;
    public static int proizvEl = 1;

    public static void outputArrA(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + (i + 1) + "] = " + a[i]);
        }
    }

    public static int multiplyElArrALessC(int[] a, int c,
                                          int proizvEl) {
        int countProizvEl = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < c) {
                proizvEl *= a[i];
                countProizvEl++;
            }
        }

        return countProizvEl;
    }

    public static double[] getArrBAndFill(double[] b, int[] a) {
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i] / 15.0 + 2;
            System.out.printf("b[%d] = %.3f\n", (i+1), b[i]);
        }

        return b;
    }

    public static double getSummElemArr(double[] b) {
        double summElemArrB = 0;

        for (int i = 1; i < b.length; i+=2)
            summElemArrB += b[i];

        return summElemArrB;
    }
}
