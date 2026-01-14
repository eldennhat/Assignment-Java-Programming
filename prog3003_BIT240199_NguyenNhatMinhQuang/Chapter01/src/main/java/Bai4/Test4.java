package Bai4;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original list: " + fruits);
        //2. add Mango
        fruits.add(1, "Mango");
        System.out.println("The list after add Mango: " + fruits);
        //3. replace "Banana" with "Grapes"
        int indexBanana = fruits.indexOf("Banana");
        if (indexBanana != -1) {
            fruits.set(indexBanana, "Grapes");
        }
        System.out.println("After replace: " + fruits);
        //4. check Apple
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Checking");
        if (hasApple) {
            System.out.println("'Apple' was found in the list.");
        }else {
            System.out.println("'Apple' was not found in the list.");
        }
    }
}
