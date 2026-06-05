import static java.lang.Math.pow;

public class Matrix {

    public static int[][] createFirstMatrix(int n, int m) {
        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            a[i][0] = 9 * i;
        }

        return a;
    }

    public static double[][] createSecondMatrix(int n, int m) {
        double[][] r = new double[n][m];

        for (int i = 0; i < r.length; i++)
            for (int j = 0; j < r.length; j++)
                r[i][j] = pow(i, j) + pow(j, i);

        return r;
    }


    public static double[][] createThirdMatrix(int n, int m) {
        double[][] s = new double[n][m];

        for (int i = 0; i < s.length; i++)
            for (int j = 0; j < s.length; j++)
                s[i][j] = pow(i, j) * pow(j, i);

        return s;
    }
}
