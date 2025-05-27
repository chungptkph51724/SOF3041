package tester.com.service;

public class Array {
    //Bai 4
    public int getElementAtIndex(int[] arr, int index) {
        return arr[index];
    }
    //Bai 6
    public int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng rỗng");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
