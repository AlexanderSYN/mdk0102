import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void createFirstMatrixTest() {
        int[][] expected = {
                {0, 0, 0},
                {9, 0, 0},
                {18, 0, 0}
        };

        assertArrayEquals(expected, Matrix.createFirstMatrix(3, 3));
    }

    @Test
    void createSecondMatrixTest() {
        double[][] expected = {
                {2.0, 1.0, 1.0},
                {1.0, 2.0, 3.0},
                {1.0, 3.0, 8.0}
        };

        assertArrayEquals(expected, Matrix.createSecondMatrix(3, 3));
    }

    @Test
    void createThirdMatrixTest() {
        double[][] expected = {
                {1.0, 0.0, 0.0},
                {0.0, 1.0, 2.0},
                {0.0, 2.0, 16.0}
        };

        assertArrayEquals(expected, Matrix.createThirdMatrix(3, 3));
    }
}