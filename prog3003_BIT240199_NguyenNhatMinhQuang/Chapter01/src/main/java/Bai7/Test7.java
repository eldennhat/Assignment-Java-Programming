package Bai7;
import java.util.TreeSet;

public class Test7 {
    public static void main(String[] args) {
        //1.
        TreeSet<String> name = new TreeSet<>();
        name.add("John");
        name.add("Alice");
        name.add("Zack");
        name.add("Bob");
        //2.
        System.out.println("TreeSet list: " + name);
        //3.
        String firstItem = name.first();
        String lastItem = name.last();
        System.out.println("The first element: " + firstItem);
        System.out.println("The last element: " + lastItem);
    }
}
