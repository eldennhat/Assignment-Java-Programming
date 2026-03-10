package org.example.chapter04.Bai2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainB2 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
        System.out.println("Original list: " + cities);

        Collections.sort(cities, (s1, s2) -> s1.length() - s2.length());

        System.out.println("After sorted: " + cities);
    }
}
