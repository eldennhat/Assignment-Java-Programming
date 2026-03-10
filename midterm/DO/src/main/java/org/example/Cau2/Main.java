package org.example.Cau2;

import org.example.Cau1.Generic.StudentManager;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static double calculateAverageGpa(List<Student> students) {
        if (students == null || students.isEmpty()) {
            throw new IllegalArgumentException("Danh sách sinh viên rỗng!");
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
        manager.add(new Student("BCS", "Nguyen Thanh An", 3.2));

        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
        ExecutorService executor = Executors.newFixedThreadPool(1);

        CompletableFuture
                .supplyAsync(() -> {
                    try {
                        Thread.sleep(1000); // giả lập độ trễ
                        return calculateAverageGpa(manager.getAll());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException("Tác vụ bị gián đoạn", e);
                    }
                }, executor)
                .thenAccept(avg ->
                        System.out.println("Điểm trung bình GPA của hệ thống là: " + avg)
                )
                .exceptionally(ex -> {
                    System.out.println("Có lỗi khi tính GPA trung bình: " + ex.getMessage());
                    return null;
                })
                .whenComplete((r, ex) -> executor.shutdown());
    }
}
