package org.example.Bai1;

public class Main {
    public static void main(String[] args) {
        // Phép cộng
        MathOperation addition = (a, b) -> a + b;
        // Phép trừ
        MathOperation subtraction = (a, b) -> a - b;
        // Phép nhân
        MathOperation multiplication = (a, b) -> a * b;
        // Phép chia
        MathOperation division = (a, b) -> {
            if (b == 0) {
                System.out.println("Không thể chia cho 0!");
                return 0;
            }
            return a / b;
        };
        int x = 12;
        int y = 10;
        System.out.println("KẾT QUẢ");
        System.out.println(x + " + " + y + " = " + addition.compute(x, y));
        System.out.println(x + " - " + y + " = " + subtraction.compute(x, y));
        System.out.println(x + " * " + y + " = " + multiplication.compute(x, y));
        System.out.println(x + " / " + y + " = " + division.compute(x, y));
    }
}
