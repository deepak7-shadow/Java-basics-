class Student {
    String name = "Deepak";
    int age = 19;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.display();
    }
}
