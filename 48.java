
import java.util.HashSet;

class Main {
    public static void main(String[] args) {

        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println("Languages: " + languages);

        System.out.println("Contains Java: " +
                           languages.contains("Java"));

        languages.remove("Python");

        System.out.println("After Removing: " + languages);

        System.out.println("Total Languages: " + languages.size());
    }
}
