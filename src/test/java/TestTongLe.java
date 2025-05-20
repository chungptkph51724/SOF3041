import org.testng.annotations.Test;
import tester.com.service.TinhToanService;

import static org.testng.AssertJUnit.assertEquals;

public class TestTongLe {
    TinhToanService service=new TinhToanService();
    @Test
    public void testTongSoLe1() {
        assertEquals(9, service.tongSoLe(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testTongSoLe2() {
        assertEquals(0, service.tongSoLe(new int[]{2, 4, 6}));
    }

    @Test
    public void testTongSoLe3() {
        assertEquals(0, service.tongSoLe(new int[]{}));
    }

    @Test
    public void testTongSoLe4() {
        assertEquals(-9, service.tongSoLe(new int[]{-1, -3, -5}));
    }

    @Test
    public void testTongSoLe5() {
        assertEquals(1, service.tongSoLe(new int[]{0, 1}));
    }

}
