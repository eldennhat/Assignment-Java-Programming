package org.example.Bai1;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("John");
        name.add("Alice");
        name.add("Zack");
        name.add("Bob");

        System.out.println("Danh sach ten trong TreeSet: " + name);

        // lay phan tu dau tien va cuoi cung
        String getFirst = name.first();
        String getLast = name.last();

        System.out.println("Phan tu dau tien: " + getFirst);
        System.out.println("Phan tu cuoi cung: " + getLast);
    }
}
