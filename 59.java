import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("notes.txt", true);

            writer.write("\nThis line is added using append mode.");

            writer.close();

            System.out.println("Data appended successfully.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
