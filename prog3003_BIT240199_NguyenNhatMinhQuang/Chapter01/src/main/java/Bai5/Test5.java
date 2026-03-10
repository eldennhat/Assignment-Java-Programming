package Bai5;
import java.util.LinkedList;

public class Test5 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        //2.
        numbers.add(12);
        numbers.add(10);
        numbers.add(52);
        System.out.println("Original list: " + numbers);
        //3.
        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println("After adding beginning/ending: " + numbers);
        //4.
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing beginning/ending: " + numbers);
        System.out.println("Final list: " + numbers);
    }
}
