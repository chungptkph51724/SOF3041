import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import tester.com.entity.SinhVien;
import tester.com.service.SinhVienService;

public class TestSinhVien {
    SinhVienService service;

    @BeforeEach
    public void setup() {
        service = new SinhVienService();
    }

    @Test
    public void testAddValid() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void testUpdateValid() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        SinhVien svMoi = new SinhVien(1, "SV01", "Lop1", "Khoa 2024", "Java");
        service.update(svMoi, 1);
        Assert.assertEquals("Khoa 2024", service.getAll().get(0).getKhoaHoc());
    }

    @Test
    public void testDeleteValid() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        int sizeBefore = service.getAll().size();
        service.delete(1);
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void testDeleteInvalid() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        int sizeBefore = service.getAll().size();
        service.delete(2); // ID không tồn tại
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore, sizeAfter);
    }

    @Test
    public void testSearchValid() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        SinhVien found = service.search(1);
        Assert.assertNotNull(found);
        Assert.assertEquals("SV01", found.getMa());
    }

    @Test
    public void testSearchInvalid() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        SinhVien found = service.search(2); // ID không tồn tại
        Assert.assertNull(found);
    }
    @Test
    public void testAddDuplicateId() {
        SinhVien sv1 = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        SinhVien sv2 = new SinhVien(1, "SV02", "Lop2", "Khoa 2023", "C#");
        service.add(sv1);
        service.add(sv2); // Trùng id
        Assert.assertEquals(2, service.getAll().size()); // Nếu không kiểm tra trùng mã
    }

    @Test
    public void testAddNullFields() {
        SinhVien sv = new SinhVien(2, null, null, null, null);
        service.add(sv);
        SinhVien added = service.search(2);
        Assert.assertNull(added.getMa());
    }

    @Test
    public void testUpdateInvalidId() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        SinhVien update = new SinhVien(2, "SV02", "Lop2", "Khoa 2023", "C#");
        service.update(update, 2); // Không có id = 2
        Assert.assertNull(service.search(2));
    }

    @Test
    public void testUpdateToNullValues() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        SinhVien update = new SinhVien(1, null, null, null, null);
        service.update(update, 1);
        Assert.assertNull(service.getAll().get(0).getMa());
    }

    @Test
    public void testDeleteEmptyList() {
        service.delete(10); // Không có sinh viên nào
        Assert.assertEquals(0, service.getAll().size());
    }

    @Test
    public void testSearchEmptyList() {
        SinhVien result = service.search(1);
        Assert.assertNull(result);
    }

    @Test
    public void testAddMultipleStudents() {
        service.add(new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java"));
        service.add(new SinhVien(2, "SV02", "Lop2", "Khoa 2023", "C#"));
        service.add(new SinhVien(3, "SV03", "Lop3", "Khoa 2024", "Python"));
        Assert.assertEquals(3, service.getAll().size());
    }

    @Test
    public void testSearchAfterDelete() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        service.delete(1);
        SinhVien found = service.search(1);
        Assert.assertNull(found);
    }

    @Test
    public void testUpdateMultipleTimes() {
        SinhVien sv = new SinhVien(1, "SV01", "Lop1", "Khoa 2022", "Java");
        service.add(sv);
        service.update(new SinhVien(1, "SV01", "Lop2", "Khoa 2023", "C#"), 1);
        service.update(new SinhVien(1, "SV01", "Lop3", "Khoa 2024", "Python"), 1);
        Assert.assertEquals("Lop3", service.getAll().get(0).getLop());
    }

}

