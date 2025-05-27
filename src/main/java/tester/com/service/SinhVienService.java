package tester.com.service;

import tester.com.entity.SinhVien;
import tester.com.entity.XeOTO;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> list = new ArrayList<>();


    public void add(SinhVien sv) {
        list.add(sv);
    }

    public void update(SinhVien newSv, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.set(i, newSv);
                return;
            }
        }
    }


    public void delete(int id) {
        list.removeIf(sv -> sv.getId() == id);
    }


    public SinhVien search(int id) {
        for (SinhVien sv : list) {
            if (sv.getId() == id) {
                return sv;
            }
        }
        return null;
    }


    public List<SinhVien> getAll() {
        return list;
    }
}
