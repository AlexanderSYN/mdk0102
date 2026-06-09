import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    @Test
    void countRowsWithZeroTest() {
        int expected = 5;
        int actual = Matrix.countRowsWithZero(Matrix.matrix);

        assertEquals(expected, actual);
    }

    @Test
    void mediansPerRowTest() {

        double[] expected = {3.0, 4.0, 1.0, 3.0, 4.0, 3.0};
        double[] actual = Matrix.mediansPerRow(Matrix.matrix);

        assertArrayEquals(expected, actual);
    }

    @Test
    void columnWithMaxProductTest() {
        int expected = 0;
        int actual = Matrix.columnWithMaxProduct(Matrix.matrix);

        assertEquals(expected, actual);
    }

}
