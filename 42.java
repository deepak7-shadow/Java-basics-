class Student {

    public String name = "Deepak";
    private int age = 20;
    protected String college = "SVCE";
    String course = "Computer Science";

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
    }
}

class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();

        System.out.println("Public Name: " + s.name);
        System.out.println("Protected College: " + s.college);
        System.out.println("Default Course: " + s.course);

        // System.out.println(s.age); // Error: age is private
    }
}
