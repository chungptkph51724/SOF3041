import org.testng.annotations.Test;
import tester.com.service.TinhToanService;

import static org.testng.AssertJUnit.assertEquals;

public class TestAmDuong {
    TinhToanService service=new TinhToanService();
    @Test
    public void testAmDuong1() {
        assertEquals("Dương", TinhToanService.kiemTraAmDuong(10));
    }

    @Test
    public void testAmDuong2() {
        assertEquals("Âm", TinhToanService.kiemTraAmDuong(-5));
    }

    @Test
    public void testAmDuong3() {
        assertEquals("Không âm không dương", TinhToanService.kiemTraAmDuong(0));
    }

    @Test
    public void testAmDuong4() {
        assertEquals("Âm", TinhToanService.kiemTraAmDuong(Integer.MIN_VALUE));
    }

    @Test
    public void testAmDuong5() {
        assertEquals("Dương", TinhToanService.kiemTraAmDuong(Integer.MAX_VALUE));
    }

}
