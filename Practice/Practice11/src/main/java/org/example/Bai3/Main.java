package org.example.Bai3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "An", 900),
                new Employee(2, "Quan", 1500),
                new Employee(3, "Quyen", 1200),
                new Employee(4, "Binh", 800)
        );

        List<String> highSalaryNames = employees.stream()
                .filter(emp -> emp.getSalary() > 1000)
                .map(Employee::getName)
                .sorted()
                .toList();

        System.out.println("Nhân viên có lương > 1000 (đã sắp xếp): " + highSalaryNames);
    }
}
