package tester.com.service;

public class User {
    //Bai 5
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException("Tên người dùng chưa được cấu hình");
        }
        return name;
    }
}
