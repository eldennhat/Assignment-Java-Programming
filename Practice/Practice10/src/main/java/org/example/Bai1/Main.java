package org.example.Bai1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        System.out.println("Danh sách ban đầu: " + employees);

        String emp102 = employees.get(102);
        System.out.println("Nhân viên có ID 102 là: " + emp102);

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("Đã thêm ID 105 vào danh sách.");
        } else {
            System.out.println("ID 105 đã tồn tại.");
        }

        System.out.println("Danh sách cập nhật: " + employees);
    }
}
