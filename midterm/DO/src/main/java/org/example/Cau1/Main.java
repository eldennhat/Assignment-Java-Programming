package org.example.Cau1;

import org.example.Cau1.Generic.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("BIT", "Nhat Minh Quang", 3.6));
        manager.add(new Student("BIT-GM", "Trieu Hong Quan", 3.8));
        manager.add(new Student("BCS-GM", "Nghiem Gia Bao", 3.9));
        manager.add(new Student("BCS", "Nguyen Thanh An", 3.2));
        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}