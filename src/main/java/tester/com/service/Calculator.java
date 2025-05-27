package tester.com.service;

import java.util.List;

public class Calculator {
//    Bai 1
    public int multiply(int a, int b) {
        return a * b;
    }
    //Bai 2
    public int divide(int a, int b) {
        return a / b;
    }
    //Bai 3
    public double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new ArithmeticException("Danh sách rỗng");
        }
        return numbers.stream().mapToInt(i -> i).average().orElse(0);
    }
}
