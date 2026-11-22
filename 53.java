import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("notes.txt");

            writer.write("Hello! Welcome to Java File Handling.");
            writer.write("\nThis is my first file.");

            writer.close();

            System.out.println("File created and data written successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
