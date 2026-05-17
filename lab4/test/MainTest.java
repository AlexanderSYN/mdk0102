import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.zelmex.katin.mainCode.*;

class MainTest {
    private final double[] testArrayB = {7.0, 4.0, 2.0, 8.0, 4.0, 2.0, 9.0, 6.0, 3.0,
            1.0, 4.0, 6.0, 8.0, 3.0, 2.0};

    @Test
    @DisplayName("Тест: умножение элементов массива A меньше чем C")
    void testProcessElementsLessThanC() {
        int expected = 1;
        int actual = proizvElem;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест: создания массива B")
    void testCreateArrayB() {
        double[] expected = expectedCreateArrayB();
        double[] actual = forTestCreateArrayB();

        assertArrayEquals(expected, actual);
    }
    double[] expectedCreateArrayB() {
        double[] expected = new double[15];

        for (int i = 0; i < expected.length; i++)
            expected[i] = a[i] / 15.0 + 2;

        return expected;
    }

    @Test
    @DisplayName("Тест: проверка суммы массива B")
    void testSumArrayB() {
        double expected = expectedSumArrayB();
        double actual = sumArrayB();

        assertEquals(expected, actual);
    }
    double expectedSumArrayB() {
        double sum = 0;

        for (int i = 1; i < testArrayB.length; i+=2)
            sum += testArrayB[i];

        return sum;
    }
}