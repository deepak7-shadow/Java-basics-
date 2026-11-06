class Student {
    int id;
    String name;

    static String college = "SVCE";

    Student(int i, String n) {
        id = i;
        name = n;
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Deepak");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();

        Student.displayCollege();
    }
}
