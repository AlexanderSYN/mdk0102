import java.util.Arrays;

public class Matrix {

    static double[][] matrix = {
            {1, 3, 6, 0, 6},
            {5, 4, 2, 6, 0},
            {1, 0, 0, 4, 6},
            {0, 3, 3, 0, 6},
            {6, 5, 4, 3, 4},
            {1, 3, 6, 0, 6},
    };

    static int countRowsWithZero(double[][] matrix) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    static double[] mediansPerRow(double[][] matrix) {
        double[] medians = new double[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length == 0) {
                medians[i] = 0.0;
                continue;
            }

            double[] rowCopy = matrix[i].clone();

            Arrays.sort(rowCopy);

            int len = rowCopy.length;
            int mid = len / 2;

            if (len % 2 != 0) {
                medians[i] = rowCopy[mid];
            } else {
               medians[i] = (rowCopy[mid - 1] + rowCopy[mid]) / 2.0;
            }
        }

        return medians;
    }

    static int columnWithMaxProduct(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxColIndex = 0;
        double maxProduct = Double.NEGATIVE_INFINITY;

        for (int j = 0; j < cols; j++) {
            double currentProduct = 1.0;
            for (int i = 0; i < rows; i++) {
                currentProduct *= matrix[i][j];
            }

            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
                maxColIndex = j;
            }
        }
        return maxColIndex;
    }

}
