package Bai8;
import java.util.HashMap;

public class Test8 {
    public static void main(String[] args) {
        //1.
        HashMap<Integer, String> employees = new HashMap<>();
        //2. add employees
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        System.out.println("Original list: " + employees);
        //3.
        String name102 = employees.get(102);
        System.out.println("Employee ID 102 is: " + name102);
        //4.
        int idCheck = 105;
        if (!employees.containsKey(idCheck)) {
            System.out.println("ID " + idCheck + " does not exist. Adding a new one...");
        } else {
            System.out.println("ID " + idCheck + " already exists.");
        }
        System.out.println("Final list: " + employees);
    }
}
