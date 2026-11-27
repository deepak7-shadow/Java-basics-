import java.sql.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "your_password";

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            while (true) {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    String query =
                        "INSERT INTO students VALUES (?, ?, ?)";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setInt(3, age);

                    ps.executeUpdate();

                    System.out.println("Student Added!");
                    ps.close();

                } else if (choice == 2) {
                    String query = "SELECT * FROM students";

                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);

                    while (rs.next()) {
                        System.out.println(
                            rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getInt("age")
                        );
                    }

                    rs.close();
                    st.close();

                } else if (choice == 3) {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter New Age: ");
                    int age = sc.nextInt();

                    String query =
                        "UPDATE students SET age = ? WHERE id = ?";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, age);
                    ps.setInt(2, id);

                    int rows = ps.executeUpdate();

                    System.out.println(rows + " student(s) updated.");
                    ps.close();

                } else if (choice == 4) {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    String query =
                        "DELETE FROM students WHERE id = ?";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, id);

                    int rows = ps.executeUpdate();

                    System.out.println(rows + " student(s) deleted.");
                    ps.close();

                } else if (choice == 5) {
                    con.close();
                    sc.close();

                    System.out.println("Application Closed!");
                    break;

                } else {
                    System.out.println("Invalid Choice!");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
