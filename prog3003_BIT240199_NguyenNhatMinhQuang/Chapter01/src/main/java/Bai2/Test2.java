package Bai2;

public class Test2 {
    public static <E> void printArray(E[] inputArray) {
        //3.
        for (E element : inputArray) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
    //4.
    public static void main(String[] args) {
        //Integer array
        Integer[] intArray = {1, 2, 1, 0, 2, 6};
        System.out.println("Integer array: ");
        printArray(intArray);
        //String array
        String[] strArray = {"Bonjour!", "Je", "m'appelle", "ELDENNHAT"};
        System.out.println("String array: ");
        printArray(strArray);

    }
}
