import org.testng.annotations.Test;
import tester.com.service.Array;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    //Bai 4
    Array array = new Array();
    int[] arr = {10, 20, 30, 40};

    @Test
    void testValidIndex1() { assertEquals(10, array.getElementAtIndex(arr, 0)); }
    @Test void testValidIndex2() { assertEquals(40, array.getElementAtIndex(arr, 3)); }

    @Test void testNegativeIndex() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.getElementAtIndex(arr, -1));
    }

    @Test void testIndexOutOfBounds() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.getElementAtIndex(arr, 4));
    }
    //Bai 6
    Array utils = new Array();

    @Test
    void testMinInArray() {
        assertEquals(1, utils.findMin(new int[]{4, 2, 5, 1, 9}));
    }

    @Test
    void testMinWithNegatives() {
        assertEquals(-10, utils.findMin(new int[]{-3, -1, -10, 0}));
    }

    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> utils.findMin(new int[]{}));
    }

    @Test
    void testNullArray() {
        assertThrows(IllegalArgumentException.class, () -> utils.findMin(null));
    }

    @Test
    void testSingleElementArray() {
        assertEquals(7, utils.findMin(new int[]{7}));
    }
}
