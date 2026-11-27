import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "your_password";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            // Update student age
            String updateQuery =
                "UPDATE students SET age = ? WHERE id = ?";

            PreparedStatement update = con.prepareStatement(updateQuery);

            update.setInt(1, 21);
            update.setInt(2, 1);

            int updated = update.executeUpdate();

            System.out.println(updated + " record(s) updated.");

            // Delete student
            String deleteQuery =
                "DELETE FROM students WHERE id = ?";

            PreparedStatement delete = con.prepareStatement(deleteQuery);

            delete.setInt(1, 1);

            int deleted = delete.executeUpdate();

            System.out.println(deleted + " record(s) deleted.");

            update.close();
            delete.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
