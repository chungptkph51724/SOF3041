import org.testng.annotations.Test;
import tester.com.service.Calculator;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {
    //Bai 3
   Calculator calc=new Calculator();

    @Test
    void testAverage1() {
        assertEquals(3.0, calc.calculateAverage(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test void testAverage2() {
        assertEquals(-3.0, calc.calculateAverage(Arrays.asList(-1, -2, -3, -4, -5)));
    }

    @Test void testEmptyList() {
        assertThrows(ArithmeticException.class, () -> calc.calculateAverage(new ArrayList<>()));
    }
}
