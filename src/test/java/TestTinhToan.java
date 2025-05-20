import org.testng.annotations.Test;
import tester.com.service.TinhToanService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestTinhToan {
    TinhToanService service =new TinhToanService();
    @Test
    public void tinhTong1(){

        assertEquals(15, service.tinhTong(5, 10));
    }
    @Test
    public void tinhTong2() {
        assertEquals(14, service.tinhTong(4, 10));
    }

    @Test
    public void tinhTong3() {
        assertEquals(16, service.tinhTong(6, 10));
    }

    @Test
    public void tinhTong4() {
        assertEquals(19, service.tinhTong(9, 10));
    }

    @Test
    public void tinhTong5() {
        assertEquals(20, service.tinhTong(10, 10));
    }
    @Test
    public void testHieu1() {
        assertEquals(5, service.tinhHieu(10, 5));
    }

    @Test
    public void testHieu2() {
        assertEquals(0, service.tinhHieu(5, 5));
    }

    @Test
    public void testHieu3() {
        assertEquals(-5, service.tinhHieu(5, 10));
    }

    @Test
    public void testHieu4() {
        assertEquals(10, service.tinhHieu(-5, -15));
    }

    @Test
    public void testHieu5() {
        assertEquals(-5, service.tinhHieu(0, 5));
    }

    // ==== Test TÍCH ====
    @Test
    public void testTich1() {
        assertEquals(50, service.tinhTich(5, 10));
    }

    @Test
    public void testTich2() {
        assertEquals(0, service.tinhTich(0, 10));
    }

    @Test
    public void testTich3() {
        assertEquals(-50, service.tinhTich(-5, 10));
    }

    @Test
    public void testTich4() {
        assertEquals(25, service.tinhTich(-5, -5));
    }

    @Test
    public void testTich5() {
        assertEquals(100, service.tinhTich(10, 10));
    }

    // ==== Test THƯƠNG ====
    @Test
    public void testThuong1() {
        assertEquals(2, service.tinhThuong(10, 5));
    }

    @Test
    public void testThuong2() {
        assertEquals(0, service.tinhThuong(0, 5));
    }

    @Test
    public void testThuong3() {
        assertEquals(-2, service.tinhThuong(-10, 5));
    }

    @Test
    public void testThuong4() {
        assertEquals(5, service.tinhThuong(25, 5));
    }

    @Test
    public void testThuong5() {
        assertThrows(ArithmeticException.class, () -> {
            service.tinhThuong(5, 0);
        });
    }
    @Test
    void testTrungBinh1() {
        assertEquals(5.0, TinhToanService.tinhTrungBinh(new int[]{5}));
    }

    @Test
    void testTrungBinh2() {
        assertEquals(3.0, TinhToanService.tinhTrungBinh(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testTrungBinh3() {
        assertEquals(-2.0, TinhToanService.tinhTrungBinh(new int[]{-1, -2, -3}));
    }

    @Test
    void testTrungBinh4() {
        assertEquals(0.0, TinhToanService.tinhTrungBinh(new int[]{0, 0, 0}));
    }

    @Test
    void testTrungBinh5() {
        assertEquals(0.0, TinhToanService.tinhTrungBinh(new int[]{}));
    }


}
