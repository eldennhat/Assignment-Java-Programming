package org.example.Bai1;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Dang khoi tao Database connection...");
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void query(String sql) {
        System.out.println("Dang thuc thi lenh SQL: " + sql);
    }
}
