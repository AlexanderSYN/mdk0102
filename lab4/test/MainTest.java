import org.junit.jupiter.api.Test;
import ru.zelmex.katin.mainCode;

import static org.junit.jupiter.api.Assertions.*;

import static ru.zelmex.katin.mainCode.*;

class MainTest {

    @Test
    void TestOutputArrA() {
        int[] expectedArray = {1, 5, 3, 7, 2, 8, 3, 9, 2, 10, 4, 2, 7, 3, 5};
        int[] actualArray = a;

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void TestMultiplyElArrALessC() {
        double expected = 1;
        double actual = multiplyElArrALessC(a, c, proizvEl);
        assertEquals(expected, actual);
    }

    @Test
    void TestGetArrBAndFill() {
        double[] expected = {2.067, 2.333, 2.200, 2.467, 2.133, 2.533,
                2.200, 2.600, 2.133, 2.667, 2.267, 2.133, 2.467, 2.200, 2.33};
        double[] actual = getArrBAndFill(b, a);

        assertArrayEquals(expected, actual);
    }

    @Test
    void TestGetSummElemArr() {
    }
}