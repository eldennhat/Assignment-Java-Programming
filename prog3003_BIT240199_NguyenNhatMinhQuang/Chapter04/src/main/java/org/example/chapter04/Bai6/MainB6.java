package org.example.chapter04.Bai6;
import java.util.Arrays;
import java.util.List;

public class MainB6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int total = numbers.stream()
                .filter(n -> n % 2 == 0) // filter all of even number
                .map(n -> n * n) // square
                .mapToInt(Integer::intValue)
                .sum(); // sum: 4 + 16 + 36 = 56
        System.out.println("Result: " + total);
    }
}
