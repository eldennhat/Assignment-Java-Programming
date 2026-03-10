package Bai9;
import java.util.TreeMap;
import java.util.SortedMap;

public class Test9 {
    public static void main(String[] args) {
        //1.
        TreeMap<String, Double> item = new TreeMap<>();
        //2.
        item.put("Laptop", 1500.0);
        item.put("Mouse", 25.0);
        item.put("Keyboard", 50.0);
        //3.
        System.out.println("Products list (sorted): " + item);
        //4.subMap(fromKey, toKey): lay tu fromKey (bao gom key) den toKey (khong bao gom key)
        SortedMap<String, Double> getItem = item.subMap("K", "N");
        System.out.println("The products from 'K' to 'M': " + getItem);

    }
}
