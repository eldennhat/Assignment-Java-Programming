package org.example.chapter04.Bai5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainB5 {
    public static void main(String[] args) {
        // supplier: khong nhan tham so, chi tra ve mot so thuc ngau nhien 0 - 100
        Supplier<Double> randomNum = () -> Math.random() * 100;
        // consumer: nhan mot so thuc va in ra theo dung dinh dang yeu cau
        Consumer<Double> printNum = num -> System.out.printf("Random number: %.2f%n", num);
        // lay so tu Supplier dua vao Consumer
        Double luckyNum = randomNum.get();
        printNum.accept(luckyNum);
    }
}
