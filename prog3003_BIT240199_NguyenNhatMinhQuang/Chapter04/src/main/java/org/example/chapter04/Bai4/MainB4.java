package org.example.chapter04.Bai4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainB4 {
    public static void main(String[] args) {
        List<String> usd = Arrays.asList("$10", "$20", "$50");
        Function<String, Integer> convertToInt = s -> Integer.parseInt(s.replace("$", ""));
        List<Integer> amounts = new ArrayList<>();
        for (String money : usd) {
            amounts.add(convertToInt.apply(money));
        }

        System.out.println("Original list: " + usd);
        System.out.println("Integer list: " + amounts);
    }
}
