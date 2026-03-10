package org.example.Cau3;

import org.example.Cau1.Generic.StudentManager;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static double calculateAverageGpa(List<Student> students) {
        if (students == null || students.isEmpty()) {
            throw new IllegalArgumentException("Danh sách sinh viên rỗng");
        }
        double sum = 0.0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }
    public static void main(String[] args) {
        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("BIT", "Nhat Minh Quang", 3.6));
        manager.add(new Student("BIT-GM", "Trieu Hong Quan", 3.8));
        manager.add(new Student("BCS-GM", "Nghiem Gia Bao", 3.9));
        manager.add(new Student("BCS", "Nguyen Thanh An", 3.1));

        //in sinh vien
        manager.getAll()
                .stream()
                .forEach(System.out::println);
        System.out.println("-------------------------------");
        System.out.println("Danh sách sinh viên có GPA >= 3.2 (sắp xếp giảm dần):");
        manager.getAll()
                .stream()
                .filter(s -> s.getGpa() >= 3.2)
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .forEach(System.out::println);
    }
}