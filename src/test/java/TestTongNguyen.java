import org.testng.annotations.Test;
import tester.com.service.TinhToanService;

import static org.testng.AssertJUnit.assertEquals;

public class TestTongNguyen {
    TinhToanService service =new TinhToanService();
    @Test
    void testTong1() {
        assertEquals(10, service.tinhTongNguyen(new int[]{2, 3, 5}));
    }

    @Test
    void testTong2() {
        assertEquals(0, service.tinhTongNguyen(new int[]{-2, -3, 5}));
    }

    @Test
    void testTong3() {
        assertEquals(0, service.tinhTongNguyen(new int[]{0, 0, 0}));
    }

    @Test
    void testTong4() {
        assertEquals(0, service.tinhTongNguyen(new int[]{}));
    }

    @Test
    void testTong5() {
        assertEquals(7, service.tinhTongNguyen(new int[]{7}));
    }

}
