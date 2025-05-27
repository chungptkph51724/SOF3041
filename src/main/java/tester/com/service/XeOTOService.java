package tester.com.service;

import tester.com.entity.XeOTO;

import java.util.ArrayList;
import java.util.List;

public class XeOTOService {
    private List<XeOTO> listXeOTO = new ArrayList<>();

    // Thêm xe vào danh sách
    public void addXeOTO(XeOTO xe) {
        listXeOTO.add(xe);
    }

    // Cập nhật xe theo id
    public void updateXeOTO(XeOTO newXe, int id) {
        for (int i = 0; i < listXeOTO.size(); i++) {
            if (listXeOTO.get(i).getId() == id) {
                listXeOTO.set(i, newXe);
                return;
            }
        }
    }

    // Xoá xe theo id
    public void deleteXeOTO(int id) {
        listXeOTO.removeIf(xe -> xe.getId() == id);
    }

    // Tìm xe theo id
    public XeOTO searchXeOTO(int id) {
        for (XeOTO xe : listXeOTO) {
            if (xe.getId() == id) {
                return xe;
            }
        }
        return null;
    }

    // Trả về toàn bộ danh sách xe
    public List<XeOTO> getAll() {
        return listXeOTO;
    }
}
