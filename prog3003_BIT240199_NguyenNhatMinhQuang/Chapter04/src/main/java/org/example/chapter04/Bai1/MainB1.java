package org.example.chapter04.Bai1;

public class MainB1 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation multi = (a, b) -> a * b;
        MathOperation div = (a, b) -> {
            if (b == 0) {
                System.out.println("Loi! Khong the chia cho 0.");
                return 0;
            } return a / b;
        };
        MathOperation mod = (a, b) -> {
            if (b == 0) {
                System.out.println("Loi! Khong the chia du cho 0.");
                return 0;
            } return a % b;
        };
        // VD
        int x = 12, y = 10;

        System.out.println("Ket qua cua x = " + x + ", y = " + y + " la: ");
        System.out.println("Addition: " + x + " + " + y + " = " + add.compute(x, y));
        System.out.println("Subtraction: " + x + " - " + y + " = " + sub.compute(x, y));
        System.out.println("Multiplication: " + x + " * " + y + " = " + multi.compute(x, y));
        System.out.println("Divison: " + x + " : " + y + " = " + div.compute(x, y));
        System.out.println("Modulo: " + x + " % " + y + " = " + mod.compute(x, y));
    }
}
