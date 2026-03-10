import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Eldennhat0207";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            System.out.println("Kết nối CSDL thành công!");

            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Danh sách người dùng");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                System.out.println(id + " - " + username + " - " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}