package tester.com.service;

public class TinhToanService {
    public static int tinhTong(int a, int b){
        return a+b;
    }
    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static int tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }
    public static double tinhTrungBinh(int[] arr) {
        if (arr.length == 0) return 0;
        int tong = 0;
        for (int i : arr) tong += i;
        return (double) tong / arr.length;
    }
    public static int timViTri(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
    public static int tinhTongNguyen(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
    public static int tongSoLe(int[] arr) {
        int tong = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                tong += num;
            }
        }
        return tong;
    }
    public static boolean coSoAm(int[] arr) {
        for (int num : arr) {
            if (num < 0) return true;
        }
        return false;
    }
    public static String kiemTraAmDuong(int n) {
        if (n > 0) return "Dương";
        else if (n < 0) return "Âm";
        else return "Không âm không dương";
    }

}
