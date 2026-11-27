import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "your_password";

        String query = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 1);
            ps.setString(2, "Deepak");
            ps.setInt(3, 20);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted successfully!");

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
