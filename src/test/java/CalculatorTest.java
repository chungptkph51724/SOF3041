import org.testng.annotations.Test;
import tester.com.service.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    //bai 1
    Calculator calc = new Calculator();

    @Test
    void test1() { assertEquals(0, calc.multiply(0, 0)); }
    @Test
    void test2() { assertEquals(0, calc.multiply(0, 5)); }
    @Test
    void test3() { assertEquals(0, calc.multiply(5, 0)); }
    @Test
    void test4() { assertEquals(25, calc.multiply(5, 5)); }
    @Test
    void test5() { assertEquals(-25, calc.multiply(-5, 5)); }
    @Test
    void test6() { assertEquals(-25, calc.multiply(5, -5)); }
    @Test
    void test7() { assertEquals(25, calc.multiply(-5, -5)); }
    @Test
    void test8() { assertEquals(1000000, calc.multiply(1000, 1000)); } // Biên lớn
    @Test
    void test9() { assertEquals(Integer.MIN_VALUE, calc.multiply(Integer.MIN_VALUE, 1)); } // Biên nhỏ
    @Test
    void test10() { assertEquals(0, calc.multiply(Integer.MAX_VALUE, 0)); }

}
