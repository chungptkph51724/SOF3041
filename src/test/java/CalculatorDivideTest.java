import org.testng.annotations.Test;
import tester.com.service.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorDivideTest {
    //Bai 2
    Calculator calc = new Calculator();

    @Test
    void test1() { assertEquals(2, calc.divide(10, 5)); }
    @Test void test2() { assertEquals(0, calc.divide(0, 5)); }
    @Test void test3() { assertEquals(-2, calc.divide(-10, 5)); }
    @Test void test4() { assertEquals(-2, calc.divide(10, -5)); }
    @Test void test5() { assertEquals(2, calc.divide(-10, -5)); }
    @Test void test6() { assertEquals(0, calc.divide(1, 5)); }
    @Test void test7() { assertEquals(1, calc.divide(5, 3)); }
    @Test void test8() { assertThrows(ArithmeticException.class, () -> calc.divide(5, 0)); }
    @Test void test9() { assertThrows(ArithmeticException.class, () -> calc.divide(0, 0)); }
    @Test void test10() { assertEquals(1, calc.divide(Integer.MAX_VALUE, Integer.MAX_VALUE)); }

}
