package org.example.Bai2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Delete {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Eldennhat0207";

    public static void main(String[] args) {
        int idToDelete = 5;
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            String sql = "DELETE FROM users WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, idToDelete);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Đã xóa thành công user có ID: " + idToDelete);
                } else {
                    System.out.println("Không tìm thấy user để xóa");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
