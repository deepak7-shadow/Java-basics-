import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Deepak");
        students.put(102, "Rahul");
        students.put(103, "Arun");

        System.out.println("Student Details: " + students);

        System.out.println("Student 101: " +
                           students.get(101));

        students.put(102, "Kiran");

        System.out.println("After Updating: " + students);

        students.remove(103);

        System.out.println("After Removing: " + students);

        System.out.println("Total Students: " + students.size());
    }
}
