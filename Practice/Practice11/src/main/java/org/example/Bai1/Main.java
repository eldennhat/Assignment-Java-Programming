package org.example.Bai1;

public class Main {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Generic", "Method"};
        System.out.print("Mảng Integer: ");
        printArray(intArray);
        System.out.print("Mảng String: ");
        printArray(stringArray);
    }
}
