import org.testng.annotations.Test;
import tester.com.service.TinhToanService;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class TestSoAm {
    TinhToanService service=new TinhToanService();
    @Test
    public void testCoSoAm1() {
        assertTrue(TinhToanService.coSoAm(new int[]{-5, 6, -7, -9, 0, -1}));
    }

    @Test
    public void testCoSoAm2() {
        assertFalse(TinhToanService.coSoAm(new int[]{1, 2, 3}));
    }

    @Test
    public void testCoSoAm3() {
        assertFalse(TinhToanService.coSoAm(new int[]{}));
    }

    @Test
    public void testCoSoAm4() {
        assertTrue(TinhToanService.coSoAm(new int[]{0, -1}));
    }

    @Test
    public void testCoSoAm5() {
        assertTrue(TinhToanService.coSoAm(new int[]{-100}));
    }

}
