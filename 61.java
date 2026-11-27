import java.sql.Connection;
import java.sql.DriverManager;

class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "your_password";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            System.out.println("Database Connected Successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println("Connection Failed!");
            System.out.println(e.getMessage());
        }
    }
}
