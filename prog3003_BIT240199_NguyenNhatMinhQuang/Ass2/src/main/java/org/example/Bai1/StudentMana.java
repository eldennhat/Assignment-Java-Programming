package org.example.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | GPA: " + gpa;
    }
}

public class StudentMana {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n------------------------");
            System.out.println("STUDENT MANAGEMENT");
            System.out.println("1. Add new student");
            System.out.println("2. Display list");
            System.out.println("3. Searching by name");
            System.out.println("4. Delete (ID)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");


            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Please enter a number");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = Double.parseDouble(scanner.nextLine());
                    students.add(new Student(id, name, gpa));
                    System.out.println("Complete!");
                    break;
                case 2:
                    System.out.println("Student List:");
                    if (students.isEmpty()) System.out.println("Empty!");
                    for (Student s : students) System.out.println(s);
                    break;
                case 3:
                    System.out.print("Enter your name: ");
                    String searchName = scanner.nextLine().toLowerCase();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getName().toLowerCase().contains(searchName)) {
                            System.out.println(s);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Can not find student with name: " + searchName);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = scanner.nextLine();
                    boolean removed = students.removeIf(s -> s.getId().equals(deleteId));
                    if (removed) System.out.println("Deleted student with ID: " + deleteId);
                    else System.out.println("Can not find ID");
                    break;
                case 0:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid!");
            }
        }
        scanner.close();
    }
}
