class Student {
    private String name;
    private int age;

    public void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setDetails("Deepak", 20);
        s.display();
    }
}
