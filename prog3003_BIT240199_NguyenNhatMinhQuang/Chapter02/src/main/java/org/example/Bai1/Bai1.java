package org.example.Bai1;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("The first time");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM users");

        System.out.println("The second time");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM products");

        System.out.println("Checking...");
        if (db1 == db2) {
            System.out.println("Thanh cong: db1 va db2 cung mot instance duy nhat");
            System.out.println("Hashcode db1: " + db1.hashCode());
            System.out.println("Hashcode db2:" + db2.hashCode());
        } else {
            System.out.println("That bai: co qua nhieu instanc duoc tao ra");
        }
    }
}
