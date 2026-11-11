import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Deepak");
        names.add("Rahul");
        names.add("Arun");
        names.add("Kiran");

        System.out.println("Student Names: " + names);

        names.remove("Arun");

        System.out.println("After Removing: " + names);

        System.out.println("First Student: " + names.get(0));

        System.out.println("Total Students: " + names.size());
    }
}
