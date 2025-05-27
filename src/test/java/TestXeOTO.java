import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import tester.com.entity.XeOTO;
import tester.com.service.XeOTOService;

public class TestXeOTO {
    XeOTOService service;

    @BeforeEach
    public void setup() {
        service = new XeOTOService();
    }

    // ===== ADD TEST CASES =====

    @Test // 1
    public void testAdd_ValidData() {
        XeOTO xe = new XeOTO(1, "Toyota", 500.0f, "Xe mới");
        service.addXeOTO(xe);
        Assert.assertEquals(service.getAll().size(), 1);
    }

    @Test // 2
    public void testAdd_DuplicateId() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        service.addXeOTO(new XeOTO(1, "BMW", 1000.0f, "Trùng mã"));
        Assert.assertEquals(service.getAll().size(), 2); // Cho phép trùng mã (nếu không cấm)
    }

    @Test // 3
    public void testAdd_NullName() {
        XeOTO xe = new XeOTO(2, null, 700.0f, "Không có tên");
        service.addXeOTO(xe);
        Assert.assertEquals(service.getAll().get(0).getTen(), null);
    }

    // ===== UPDATE TEST CASES =====

    @Test // 4
    public void testUpdate_ValidId() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        XeOTO updated = new XeOTO(1, "Toyota Hybrid", 800.0f, "Đã update");
        service.updateXeOTO(updated, 1);
        Assert.assertEquals(service.getAll().get(0).getTen(), "Toyota Hybrid");
    }

    @Test // 5
    public void testUpdate_InvalidId() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        XeOTO updated = new XeOTO(2, "Honda", 600.0f, "Xe khác");
        service.updateXeOTO(updated, 2); // Không có id = 2
        Assert.assertEquals(service.getAll().size(), 1);
    }

    @Test // 6
    public void testUpdate_GhiChuNull() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        XeOTO updated = new XeOTO(1, "Toyota", 500.0f, null);
        service.updateXeOTO(updated, 1);
        Assert.assertNull(service.getAll().get(0).getGhiChu());
    }

    // ===== DELETE TEST CASES =====

    @Test // 7
    public void testDelete_ValidId() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        service.deleteXeOTO(1);
        Assert.assertEquals(service.getAll().size(), 0);
    }

    @Test // 8
    public void testDelete_InvalidId() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        service.deleteXeOTO(2);
        Assert.assertEquals(service.getAll().size(), 1);
    }

    @Test // 9
    public void testDelete_FromEmptyList() {
        service.deleteXeOTO(1);
        Assert.assertEquals(service.getAll().size(), 0);
    }

    // ===== SEARCH TEST CASES =====

    @Test // 10
    public void testSearch_ValidId() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        XeOTO xe = service.searchXeOTO(1);
        Assert.assertNotNull(xe);
        Assert.assertEquals(xe.getTen(), "Toyota");
    }

    @Test // 11
    public void testSearch_InvalidId() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "Xe mới"));
        XeOTO xe = service.searchXeOTO(2);
        Assert.assertNull(xe);
    }

    @Test // 12
    public void testSearch_MultipleObjects() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "A"));
        service.addXeOTO(new XeOTO(2, "Honda", 600.0f, "B"));
        XeOTO xe = service.searchXeOTO(2);
        Assert.assertEquals(xe.getTen(), "Honda");
    }

    // ===== EDGE/OTHER CASES =====

    @Test // 13
    public void testAdd_NegativePrice() {
        XeOTO xe = new XeOTO(3, "Vinfast", -100.0f, "Giá âm");
        service.addXeOTO(xe);
        Assert.assertTrue(service.getAll().get(0).getGia() < 0);
    }

    @Test // 14
    public void testUpdate_PriceZero() {
        service.addXeOTO(new XeOTO(4, "Mazda", 600.0f, "Xe chuẩn"));
        XeOTO xe = new XeOTO(4, "Mazda", 0.0f, "Giá 0");
        service.updateXeOTO(xe, 4);
        Assert.assertEquals(service.getAll().get(0).getGia(), 0.0f);
    }

    @Test // 15
    public void testAdd_MultipleObjects() {
        service.addXeOTO(new XeOTO(1, "Toyota", 500.0f, "A"));
        service.addXeOTO(new XeOTO(2, "Honda", 600.0f, "B"));
        service.addXeOTO(new XeOTO(3, "BMW", 700.0f, "C"));
        Assert.assertEquals(service.getAll().size(), 3);
    }
}
