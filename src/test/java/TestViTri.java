import org.testng.annotations.Test;
import tester.com.service.TinhToanService;

import static org.testng.AssertJUnit.assertEquals;

public class TestViTri {
    TinhToanService service =new TinhToanService();
    @Test
    void testTimViTri1() {
        assertEquals(0, service.timViTri(new int[]{5, 10, 15}, 5));
    }

    @Test
    void testTimViTri2() {
        assertEquals(2, service.timViTri(new int[]{5, 10, 15}, 15));
    }

    @Test
    void testTimViTri3() {
        assertEquals(-1, service.timViTri(new int[]{1, 2, 3}, 4));
    }

    @Test
    void testTimViTri4() {
        assertEquals(1, service.timViTri(new int[]{1, 4, 7}, 4));
    }

    @Test
    void testTimViTri5() {
        assertEquals(-1, service.timViTri(new int[]{}, 5));
    }

}
