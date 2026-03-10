package org.example.chapter04.Bai3;
import java.util.function.Predicate;

public class MainB3 {
    public static void main(String[] args) {
        //su dung Lamda de dinh nghia Predicate
        // n % 2 == 0 return true if even, and false if odd
        Predicate<Integer> isEven = n -> n % 2 == 0;
        //vd
        int num1 = 12;
        int num2 = 11;

        System.out.println("Is " + num1 + " an even number? " + isEven.test(num1));
        System.out.println("Is " + num2 + " an even number? " + isEven.test(num2));
        if (isEven.test(2026)) {
            System.out.println("2026 is an even number.");
        }
    }
}
